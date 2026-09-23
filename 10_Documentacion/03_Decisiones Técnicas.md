# Decisiones Técnicas — AccessWay

Este documento recoge las principales decisiones técnicas y de diseño tomadas durante el desarrollo de AccessWay, junto con el motivo de cada decisión.

Las decisiones podrán revisarse o ampliarse a medida que avance el proyecto.

**Última actualización:** 23/09/2026

---

## 1. Base de datos

### PostgreSQL

#### Decisión

Se ha seleccionado PostgreSQL como sistema gestor de base de datos para AccessWay.

La aplicación utilizará PostgreSQL para almacenar la información persistente del sistema.

La conexión desde el backend se realiza mediante Spring Data JPA y el driver de PostgreSQL incluido como dependencia del proyecto.

La base de datos inicial se ha creado con el nombre:

`accessway`

La conexión desde el backend se realiza mediante Spring Boot, utilizando la configuración definida en `application.properties`.

#### Motivo

PostgreSQL permite utilizar una base de datos relacional para almacenar y relacionar la información de AccessWay.

Además, es una tecnología gratuita y compatible con las herramientas seleccionadas para el backend.

Su utilización permitirá aplicar los conocimientos de bases de datos adquiridos durante el ciclo de Desarrollo de Aplicaciones Multiplataforma.

#### Estado actual

- Sistema gestor: PostgreSQL 18.1.
    
- Base de datos: `accessway`.
    
- Puerto: `5432`.
    
- Codificación: UTF-8.
    
- Conexión desde Spring Boot comprobada.
    

La aplicación dispone de la configuración necesaria para conectarse a PostgreSQL.

Todavía está pendiente comprobar la persistencia de las primeras entidades propias de AccessWay.

---

## 2. Gestión de credenciales y configuración sensible

### Decisión

Las credenciales y otros datos sensibles necesarios para conectar AccessWay con servicios externos no se almacenarán directamente en el repositorio Git ni en el código fuente.

Para el desarrollo local se utilizarán variables de entorno referenciadas desde la configuración de Spring Boot.

Actualmente, las credenciales necesarias para conectar el backend con PostgreSQL se han configurado como variables de usuario permanentes de Windows.

Las variables utilizadas son:

- `DB_URL`
    
- `DB_USERNAME`
    
- `DB_PASSWORD`
    

El archivo `application.properties` obtiene los valores necesarios mediante referencias a estas variables.

```
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

### Motivo

Esta decisión permite separar la configuración sensible del código fuente y evita almacenar las credenciales de acceso a la base de datos en Git y GitHub.

Al utilizar variables de usuario permanentes de Windows, tampoco es necesario introducir nuevamente las credenciales cada vez que se reinicia el equipo o se abre una nueva terminal.

En otros entornos de ejecución será necesario adaptar la gestión de estas variables a las características del entorno correspondiente.

### Estado actual

Las variables de usuario permanentes están configuradas y se ha comprobado la conexión del backend con PostgreSQL.

---

## 3. Primer endpoint REST

### Decisión

Se ha creado un primer endpoint REST sencillo para comprobar el funcionamiento del backend antes de comenzar con las funcionalidades propias de AccessWay.

El endpoint utilizado es:

`GET /api/health`

La implementación se realiza mediante un controlador REST denominado `HealthController`.

### Motivo

Antes de desarrollar funcionalidades relacionadas con usuarios, rutas o incidencias, se considera conveniente comprobar que la infraestructura básica del backend funciona correctamente.

Este endpoint permite realizar una primera comprobación independiente de la lógica de negocio principal de AccessWay.

### Alcance

El endpoint tiene únicamente una finalidad de comprobación durante esta fase inicial del desarrollo.

No representa una funcionalidad principal de AccessWay.

En fases posteriores se complementará con endpoints relacionados con las funcionalidades reales de la aplicación.

### Estado actual

El endpoint está implementado y se ha comprobado su funcionamiento.

La aplicación responde correctamente a una petición HTTP realizada desde el navegador cuando el servidor Spring Boot está ejecutándose.

---

## 4. Respuestas estructuradas mediante DTO

### Decisión

El endpoint `GET /api/health`, que inicialmente devolvía una cadena de texto, se ha modificado para devolver una respuesta estructurada mediante un DTO.

Se ha creado la clase:

`HealthResponse.java`

Dentro del paquete:

`com.accessway.backend.dto`

Actualmente, la respuesta contiene dos atributos:

- `status`
    
- `message`
    

La respuesta obtenida por el cliente se representa en formato JSON:

```
{
  "status": "UP",
  "message": "AccessWay backend funcionando correctamente"
}
```

### Motivo

El uso de DTOs permite definir de forma explícita la estructura de los datos que la API intercambia con sus clientes.

Esta solución resulta más adecuada que devolver directamente cadenas de texto y prepara la estructura del backend para los futuros endpoints de AccessWay.

También permite separar los objetos utilizados para intercambiar información con los clientes de las entidades encargadas de representar los datos persistentes.

### Estado actual

El DTO `HealthResponse` está implementado.

Se ha comprobado que el endpoint devuelve correctamente la respuesta JSON esperada.

Este avance quedó registrado en el commit:

`453287e — feat: estructurar respuesta del endpoint health con DTO`

---

## 5. Modelo inicial de incidencias de accesibilidad

### Decisión

La primera funcionalidad del MVP que se desarrollará en el backend estará relacionada con el registro y la gestión de incidencias de accesibilidad.

Una incidencia representa un obstáculo o problema que puede afectar al desplazamiento de una persona con movilidad reducida.

El modelo inicial contempla los siguientes datos:

- Identificador.
    
- Tipo de incidencia.
    
- Descripción.
    
- Ubicación.
    
- Fotografía.
    
- Fecha de creación.
    
- Estado.
    

La ubicación deberá permitir identificar dónde se encuentra el obstáculo.

Para ello, se ha decidido almacenar inicialmente:

- Dirección.
    
- Latitud.
    
- Longitud.
    

Este modelo podrá evolucionar a medida que avance el desarrollo.

### Motivo

Las incidencias constituyen una parte fundamental de AccessWay.

Permitirán registrar obstáculos que pueden dificultar o impedir el desplazamiento de personas con movilidad reducida.

La información recopilada podrá utilizarse posteriormente para desarrollar funcionalidades relacionadas con la consulta y el cálculo de rutas accesibles.

### Estado actual

El modelo conceptual inicial está definido.

Se ha comenzado su implementación mediante una entidad JPA denominada `Incidencia`.

La entidad ya contiene los atributos básicos, a excepción de la fotografía, cuyo almacenamiento está pendiente de estudio.

---

## 6. Tipos de incidencia

### Decisión

El tipo de incidencia no se introducirá como texto completamente libre.

Se utilizará un conjunto controlado de categorías para evitar que un mismo tipo de problema se registre con diferentes nombres.

Las categorías iniciales del MVP son:

- `BLOQUEO_ACCESO`
    
- `OBRAS`
    
- `ESCALON_DESNIVEL`
    
- `ACERA_MAL_ESTADO`
    
- `FALTA_RAMPA`
    
- `ASCENSOR_FUERA_SERVICIO`
    
- `OTRO`
    

En el frontend, estas categorías podrán mostrarse al usuario mediante un elemento de selección, como un desplegable.

### Implementación

Se ha creado el tipo enumerado `TipoIncidencia` dentro del paquete:

`com.accessway.backend.entity`

Su implementación es la siguiente:

```
public enum TipoIncidencia {

    BLOQUEO_ACCESO,
    OBRAS,
    ESCALON_DESNIVEL,
    ACERA_MAL_ESTADO,
    FALTA_RAMPA,
    ASCENSOR_FUERA_SERVICIO,
    OTRO

}
```

En la entidad `Incidencia`, el atributo `tipo` se ha declarado de la siguiente manera:

```
@Enumerated(EnumType.STRING)
private TipoIncidencia tipo;
```

La anotación `@Enumerated(EnumType.STRING)` indica a JPA que los valores del enumerado deben almacenarse utilizando su nombre, en lugar de su posición numérica.

### Motivo

Utilizar categorías controladas facilitará la clasificación, búsqueda y tratamiento posterior de las incidencias.

La descripción seguirá siendo un campo independiente que permitirá al usuario explicar las características concretas del problema.

Por ejemplo:

- Tipo: `BLOQUEO_ACCESO`
    
- Descripción: `Una furgoneta ocupa completamente la acera.`
    

El almacenamiento de los enumerados como cadenas de texto permite conservar valores legibles y evita que un cambio en el orden de las constantes modifique la interpretación de los registros existentes.

### Estado actual

El enumerado `TipoIncidencia` está implementado y se ha incorporado a la entidad `Incidencia`.

Su persistencia en PostgreSQL todavía no se ha comprobado.

---

## 7. Estado de las incidencias

### Decisión

Para el MVP se utilizarán inicialmente dos estados:

- `ACTIVA`
    
- `RESUELTA`
    

Una incidencia activa representa un obstáculo que continúa afectando a la accesibilidad.

Una incidencia resuelta representa un problema que ya no debería considerarse activo.

Se ha decidido que todas las incidencias nuevas comiencen automáticamente con el estado `ACTIVA`.

### Implementación

Se ha creado el tipo enumerado `EstadoIncidencia` dentro del paquete:

`com.accessway.backend.entity`

Su implementación es la siguiente:

```
public enum EstadoIncidencia {

    ACTIVA,
    RESUELTA

}
```

En la entidad `Incidencia`, el atributo `estado` se representa mediante:

```
@Enumerated(EnumType.STRING)
private EstadoIncidencia estado;
```

Para asignar automáticamente el estado inicial, se ha incorporado un método anotado con `@PrePersist`:

```
@PrePersist
public void prePersist() {
    fechaCreacion = LocalDateTime.now();
    estado = EstadoIncidencia.ACTIVA;
}
```

Este método se ejecuta antes de que JPA inserte por primera vez la entidad en la base de datos.

### Motivo

Los obstáculos de accesibilidad pueden ser temporales.

Por ejemplo, unas obras pueden bloquear una acera durante varios días y desaparecer posteriormente.

El estado permitirá diferenciar las incidencias que siguen siendo relevantes de aquellas que ya han sido solucionadas.

La asignación automática de `ACTIVA` evita que el usuario tenga que seleccionar manualmente el estado inicial.

### Estado actual

El enumerado `EstadoIncidencia` está implementado.

La entidad `Incidencia` incorpora el método necesario para asignar automáticamente el estado inicial.

Todavía no se ha comprobado su funcionamiento mediante una prueba de persistencia.

---

## 8. Geolocalización de las incidencias

### Decisión

La entidad `Incidencia` almacenará inicialmente tres atributos relacionados con la ubicación:

```
private String direccion;
private Double latitud;
private Double longitud;
```

Las coordenadas geográficas permitirán identificar la posición de los obstáculos y podrán utilizarse posteriormente en el cálculo de rutas accesibles.

Sin embargo, el usuario no tendrá que introducir manualmente los valores de latitud y longitud.

Se contempla que AccessWay ofrezca dos posibilidades:

- Obtener automáticamente la ubicación actual del dispositivo, previa autorización del usuario.
    
- Seleccionar manualmente la ubicación del obstáculo sobre un mapa.
    

### Motivo

Solicitar al usuario que introduzca coordenadas geográficas supondría una dificultad innecesaria.

Además, la ubicación actual del dispositivo no siempre coincidirá con la del obstáculo, especialmente cuando se comunique una incidencia observada anteriormente.

Por ello, se ha decidido separar los datos técnicos que necesita el backend de la forma en que el usuario proporcionará la ubicación.

### Estado actual

Los tres atributos ya se han incorporado a la entidad `Incidencia`.

La obtención automática de coordenadas y la selección de ubicaciones mediante un mapa están pendientes de estudio e implementación.

Todavía no se ha seleccionado definitivamente la tecnología que se utilizará para estas funcionalidades.

---

## 9. Entidad de persistencia Incidencia

### Decisión

Se ha comenzado a implementar el modelo de incidencias mediante una entidad JPA.

Se ha creado la clase:

`Incidencia.java`

Dentro del paquete:

`com.accessway.backend.entity`

La clase está identificada mediante la anotación:

```
@Entity
public class Incidencia {
}
```

Esta anotación permite que JPA reconozca la clase como una entidad persistente.

### Identificador

Se ha definido un identificador único:

```
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```

La anotación `@Id` identifica la clave primaria.

La estrategia `GenerationType.IDENTITY` permite delegar la generación del identificador en la base de datos.

Se utiliza el tipo `Long`, que permite representar el identificador como `null` antes de que la entidad se haya guardado.

### Atributos implementados

Actualmente, la entidad contiene:

|Atributo|Tipo Java|Finalidad|
|---|---|---|
|id|Long|Identificador único|
|descripcion|String|Descripción del obstáculo|
|tipo|TipoIncidencia|Categoría del obstáculo|
|estado|EstadoIncidencia|Estado de la incidencia|
|direccion|String|Dirección del obstáculo|
|latitud|Double|Coordenada geográfica|
|longitud|Double|Coordenada geográfica|
|fechaCreacion|LocalDateTime|Fecha y hora de creación|

También se ha incorporado un constructor sin parámetros:

```
public Incidencia() {
}
```

Este constructor permite que JPA pueda crear instancias de la entidad.

### Motivo

La utilización de una entidad JPA permitirá representar las incidencias mediante objetos Java y establecer posteriormente su correspondencia con la información almacenada en PostgreSQL.

La entidad constituye el punto de partida para desarrollar el repositorio, la lógica de negocio y los endpoints REST relacionados con las incidencias.

### Estado actual

La clase y sus atributos están implementados.

También se han creado los enumerados `TipoIncidencia` y `EstadoIncidencia`.

Todavía no se ha comprobado la creación de la tabla correspondiente en PostgreSQL ni se han implementado el repositorio, el servicio o los endpoints REST de incidencias.

---

## 10. Asignación automática de la fecha de creación

### Decisión

La fecha de creación de una incidencia será generada automáticamente por el backend.

No se solicitará al usuario que introduzca manualmente este dato.

Para representar la fecha y la hora se ha seleccionado la clase `LocalDateTime` de Java.

```
private LocalDateTime fechaCreacion;
```

La asignación se realiza mediante un método anotado con `@PrePersist`:

```
@PrePersist
public void prePersist() {
    fechaCreacion = LocalDateTime.now();
    estado = EstadoIncidencia.ACTIVA;
}
```

### Motivo

La fecha de creación debe reflejar el momento en que el sistema registra una incidencia nueva.

Generarla automáticamente evita errores de introducción y permite mantener un criterio uniforme para todas las incidencias.

Se ha utilizado `@PrePersist` para agrupar la inicialización de la fecha de creación y del estado inicial en un mismo método.

### Estado actual

El método está implementado en `Incidencia.java`.

Todavía está pendiente comprobar su ejecución mediante una prueba de persistencia.

La estrategia de gestión de zonas horarias deberá revisarse antes de utilizar la aplicación en producción.

---

## 11. Rutas alternativas e incidencias

### Decisión

La ruta alternativa no se almacenará inicialmente como un atributo propio de una incidencia.

Las incidencias proporcionarán información sobre los obstáculos y su ubicación.

En una fase posterior, el sistema encargado de calcular las rutas podrá utilizar las incidencias activas para intentar evitar zonas con problemas de accesibilidad.

Conceptualmente:

```
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

### Estado actual

Esta decisión forma parte del diseño conceptual.

Todavía no se ha implementado el sistema de cálculo de rutas.

---

## 12. Almacenamiento de fotografías

### Situación actual

El modelo conceptual de incidencias contempla que el usuario pueda adjuntar una fotografía del obstáculo.

Sin embargo, todavía no se ha decidido cómo se almacenarán las imágenes.

Antes de continuar con la implementación, se estudiarán las diferentes alternativas y sus consecuencias para la arquitectura de AccessWay.

Entre las opciones que se analizarán se encuentran:

- Almacenar directamente el contenido de las imágenes en PostgreSQL.
    
- Almacenar las imágenes por separado y guardar únicamente una referencia en la base de datos.
    

También será necesario estudiar cómo se gestionarán la subida, recuperación y eliminación de las fotografías.

### Aspectos que deberán valorarse

- Facilidad de implementación.
    
- Coste de almacenamiento.
    
- Rendimiento.
    
- Seguridad.
    
- Mantenimiento.
    
- Posibilidad de utilizar servicios gratuitos.
    
- Adaptación a un futuro despliegue de la aplicación.
    

### Estado actual

**Decisión pendiente.**

No se ha incorporado todavía ningún atributo relacionado con la fotografía a la entidad `Incidencia`.

No se ha seleccionado ningún servicio de almacenamiento.

Esta decisión se tomará antes de continuar con la implementación de las fotografías.

---

## 13. Estado actual del desarrollo

**Fecha de actualización: 23/09/2026**

Se ha comenzado a implementar la primera funcionalidad real del backend de AccessWay: la gestión de incidencias de accesibilidad.

### Archivos creados

Se han creado los siguientes archivos:

```
backend/
└── src/
    └── main/
        └── java/
            └── com/
                └── accessway/
                    └── backend/
                        └── entity/
                            ├── Incidencia.java
                            ├── TipoIncidencia.java
                            └── EstadoIncidencia.java
```

### Trabajo realizado

- Definición del modelo conceptual de incidencias.
    
- Creación de la entidad JPA `Incidencia`.
    
- Definición del identificador mediante `@Id`.
    
- Configuración de la generación del identificador mediante `GenerationType.IDENTITY`.
    
- Creación del enumerado `TipoIncidencia`.
    
- Creación del enumerado `EstadoIncidencia`.
    
- Configuración del almacenamiento de enumerados mediante `EnumType.STRING`.
    
- Incorporación de la descripción y los atributos de ubicación.
    
- Decisión de no solicitar manualmente las coordenadas al usuario.
    
- Incorporación del atributo `fechaCreacion` mediante `LocalDateTime`.
    
- Implementación del método `prePersist()`.
    
- Automatización de la fecha de creación y del estado inicial `ACTIVA`.
    

### Trabajo pendiente

- Estudiar y decidir cómo se almacenarán las fotografías.
    
- Completar la entidad según las decisiones adoptadas.
    
- Comprobar la compilación y realizar las pruebas correspondientes.
    
- Comprobar la creación de la tabla de incidencias en PostgreSQL.
    
- Implementar el repositorio de incidencias.
    
- Implementar la capa de servicio.
    
- Desarrollar los primeros endpoints REST para registrar y consultar incidencias.
    
- Implementar posteriormente la obtención y selección de ubicaciones.
    

Los cambios recientes de la entidad todavía no se han incorporado a un nuevo commit de Git.

### Próximo paso

Estudiar las alternativas de almacenamiento de fotografías antes de continuar con la implementación de la entidad `Incidencia`.

La elección deberá ser compatible con los objetivos del proyecto y con el presupuesto inicial de 0 €.

---

## 14. Decisiones tecnológicas y organizativas generales

**Fecha de actualización:** 23/09/2026

### 14.1. Java 21

**Decisión:** utilizar Java 21 como versión objetivo del backend.

**Estado:** el proyecto está configurado para compilar con Java 21. Queda pendiente comprobar que la versión de Java utilizada en todas las ejecuciones y pruebas sea coherente con esta configuración.

### 14.2. Spring Boot

**Decisión:** utilizar Spring Boot para desarrollar el backend y exponer la API REST de AccessWay.

**Estado:** Spring Boot 4.1.1 está incorporado al proyecto. El backend, la conexión con PostgreSQL y el endpoint de comprobación se han ejecutado correctamente. La gestión de incidencias sigue en desarrollo.

### 14.3. React

**Decisión:** utilizar React para desarrollar el frontend de AccessWay.

**Estado:** React está seleccionado, pero todavía no se ha creado el frontend. La elección entre JavaScript y TypeScript sigue pendiente.

### 14.4. Organización del desarrollo: Scrum y Kanban

**Enfoque previsto:** utilizar Scrum adaptado al desarrollo individual y Kanban para visualizar y organizar el trabajo.

**Estado:** el proceso de trabajo y la documentación se están organizando progresivamente. No se dará por implantado un tablero o un sistema de sprints concreto hasta confirmar su uso real.

### 14.5. Jira y tablero de tareas

**Situación documental:** en la revisión de la metodología se propuso prescindir de Jira durante esta fase y utilizar un tablero Kanban gratuito, con GitHub Issues si resulta útil.

**Pendiente de confirmación:** comprobar la decisión definitiva sobre Jira y seleccionar la herramienta concreta del tablero. Hasta entonces, no se considerará ninguna de ellas implantada.

### 14.6. Documentación en Obsidian

**Decisión:** utilizar Obsidian como herramienta principal de documentación y mantener coordinados los seis documentos principales del proyecto:

1. `01_Libro del Proyecto`
    
2. `02_Diario de Desarrollo`
    
3. `03_Decisiones Técnicas`
    
4. `04_Glosario`
    
5. `05_Estudio Tecnológico`
    
6. `06_Metodología y Herramientas`
    

**Procedimiento:** después de cada avance relevante se revisarán únicamente los documentos afectados. Se distinguirá siempre entre lo implementado y comprobado, lo que está en desarrollo y lo que continúa pendiente de decisión.

Las comparaciones tecnológicas y los detalles metodológicos se desarrollan, respectivamente, en `05_Estudio Tecnológico` y `06_Metodología y Herramientas`.