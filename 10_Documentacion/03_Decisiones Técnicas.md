# Decisiones Técnicas — AccessWay

Este documento recoge las principales decisiones técnicas y de diseño tomadas durante el desarrollo de AccessWay, junto con el motivo de cada decisión.

Las decisiones podrán revisarse o ampliarse a medida que avance el proyecto.

---

## Base de datos

### PostgreSQL

#### Decisión

Se ha seleccionado PostgreSQL como sistema gestor de base de datos para AccessWay.

La aplicación utilizará PostgreSQL para almacenar la información persistente del sistema.

La conexión desde el backend se realizará mediante Spring Data JPA y el driver de PostgreSQL incluido como dependencia del proyecto.

La base de datos inicial del proyecto se ha creado con el nombre:

`accessway`

La conexión desde el backend se realiza mediante Spring Boot utilizando la configuración definida en `application.properties`.

#### Estado actual

- Sistema gestor de base de datos: PostgreSQL 18.1
- Base de datos: `accessway`
- Puerto: 5432
- Codificación: UTF-8

---

## Gestión de credenciales y configuración sensible

### Decisión

Las credenciales y otros datos sensibles necesarios para conectar AccessWay con servicios externos no se almacenarán directamente en el repositorio Git ni en el código fuente.

Para el desarrollo local se utilizarán variables de entorno, referenciadas desde la configuración de Spring Boot.

Actualmente, las credenciales necesarias para conectar el backend con PostgreSQL se han configurado como variables de usuario permanentes de Windows.

Las variables utilizadas son:

- `DB_URL`
- `DB_USERNAME`
- `DB_PASSWORD`

El archivo `application.properties` obtiene los valores necesarios mediante referencias a estas variables de entorno.

Ejemplo:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

### Motivo

Esta decisión permite separar la configuración sensible del código fuente y evita almacenar las credenciales de acceso a la base de datos en Git y GitHub.

Al utilizar variables de usuario permanentes de Windows tampoco es necesario introducir nuevamente las credenciales cada vez que se reinicia el equipo o se abre una nueva terminal.

En otros entornos de ejecución será necesario adaptar la gestión de estas variables a las características del entorno correspondiente.

---

## Primer endpoint REST

### Decisión

Se crea un primer endpoint REST sencillo para comprobar el funcionamiento del backend antes de comenzar con las funcionalidades propias de AccessWay.

El endpoint utilizado es:

`GET /api/health`

La implementación se realiza mediante un controlador REST (`HealthController`) utilizando Spring Boot.

### Motivo

Antes de desarrollar funcionalidades relacionadas con usuarios, rutas o incidencias, se considera conveniente comprobar que la infraestructura básica del backend funciona correctamente.

Este endpoint permite realizar una primera comprobación independiente de la lógica de negocio principal de AccessWay.

### Alcance

El endpoint tiene únicamente una finalidad de comprobación durante esta fase inicial del desarrollo.

No representa una funcionalidad principal de AccessWay.

En fases posteriores se complementará con endpoints relacionados con las funcionalidades reales de la aplicación.

---

## Respuestas estructuradas mediante DTO

### Decisión

El endpoint `GET /api/health`, que inicialmente devolvía una cadena de texto, se ha modificado para devolver una respuesta estructurada mediante un DTO.

Se ha creado para ello la clase:

`HealthResponse`

dentro del paquete:

`com.accessway.backend.dto`

Actualmente, la respuesta contiene:

- `status`
- `message`

La respuesta obtenida por el cliente se representa en formato JSON:

```json
{
  "status": "UP",
  "message": "AccessWay backend funcionando correctamente"
}
```

### Motivo

El uso de DTOs permite definir de forma explícita la estructura de los datos que la API intercambia con sus clientes.

Esta solución resulta más adecuada que devolver directamente cadenas de texto y prepara la estructura del backend para los futuros endpoints de AccessWay.

---

## Modelo inicial de incidencias de accesibilidad

### Decisión

La primera funcionalidad del MVP que se desarrollará en el backend estará relacionada con el registro y gestión de incidencias de accesibilidad.

Una incidencia representa un obstáculo o problema que puede afectar al desplazamiento de una persona con movilidad reducida.

El modelo conceptual inicial incluirá:

- Identificador.
- Tipo de incidencia.
- Descripción.
- Ubicación.
- Fotografía.
- Fecha de creación.
- Estado.

La ubicación deberá permitir identificar dónde se encuentra el obstáculo. Inicialmente se contempla almacenar:

- Dirección.
- Latitud.
- Longitud.

Este modelo podrá evolucionar a medida que avance el desarrollo.

---

## Tipos de incidencia

### Decisión

El tipo de incidencia no se introducirá como texto completamente libre.

Se utilizará un conjunto controlado de categorías para evitar que un mismo tipo de problema se registre con diferentes nombres.

Las categorías iniciales previstas para el MVP son:

- `BLOQUEO_ACCESO`
- `OBRAS`
- `ESCALON_DESNIVEL`
- `ACERA_MAL_ESTADO`
- `FALTA_RAMPA`
- `ASCENSOR_FUERA_SERVICIO`
- `OTRO`

En el frontend estas categorías podrán mostrarse al usuario mediante un elemento de selección, como un desplegable.

En el backend se estudiará su representación mediante un tipo enumerado (`enum`) de Java.

### Motivo

Utilizar categorías controladas facilitará la clasificación, búsqueda y tratamiento posterior de las incidencias.

La descripción seguirá siendo un campo independiente que permitirá al usuario explicar las características concretas del problema.

Por ejemplo:

- Tipo: `BLOQUEO_ACCESO`
- Descripción: `Una furgoneta ocupa completamente la acera.`

---

## Estado de las incidencias

### Decisión

Para el MVP se utilizarán inicialmente dos estados:

- `ACTIVA`
- `RESUELTA`

Una incidencia activa representa un obstáculo que continúa afectando a la accesibilidad.

Una incidencia resuelta representa un problema que ya no debería considerarse activo.

### Motivo

Los obstáculos de accesibilidad pueden ser temporales.

Por ejemplo, unas obras pueden bloquear una acera durante varios días y desaparecer posteriormente.

El estado permitirá diferenciar las incidencias que siguen siendo relevantes de aquellas que ya han sido solucionadas.

---

## Rutas alternativas e incidencias

### Decisión

La ruta alternativa no se almacenará inicialmente como un atributo propio de una incidencia.

Las incidencias proporcionarán información sobre los obstáculos y su ubicación.

En una fase posterior, el sistema encargado de calcular las rutas podrá utilizar las incidencias activas para intentar evitar zonas con problemas de accesibilidad.

Conceptualmente:

```text
Incidencias activas
        ↓
Ubicación de los obstáculos
        ↓
Sistema de cálculo de rutas
        ↓
Ruta accesible / alternativa
```

### Motivo

Una incidencia describe un problema existente en una ubicación concreta, mientras que una ruta alternativa depende del origen, destino, preferencias del usuario y otros factores relacionados con el cálculo de rutas.

Separar ambos conceptos evita asignar a la incidencia responsabilidades que pertenecen al futuro sistema de rutas.

---

## Estado del diseño

Las decisiones relacionadas con las incidencias representan actualmente un modelo conceptual inicial.

Todavía no se ha implementado la entidad de persistencia correspondiente ni se han creado las tablas, repositorios, servicios o endpoints REST asociados a esta funcionalidad.

Estas decisiones servirán como base para diseñar progresivamente la primera funcionalidad real del backend de AccessWay.