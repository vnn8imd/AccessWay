# 05. Estudio Tecnológico

**Proyecto:** AccessWay  
**Última actualización:** 23/09/2026  
**Estado:** Documento en evolución

---

## 1. Objetivo

El objetivo de este estudio es analizar, seleccionar y justificar las tecnologías que se utilizarán para desarrollar AccessWay.

AccessWay es una aplicación orientada a facilitar la movilidad de personas que utilizan silla de ruedas o presentan otras dificultades de movilidad.

El proyecto contempla la consulta de rutas accesibles y la comunicación colaborativa de incidencias que puedan dificultar los desplazamientos.

La selección tecnológica debe permitir desarrollar un proyecto realista dentro del contexto del ciclo de Desarrollo de Aplicaciones Multiplataforma (DAM), aprovechar los conocimientos adquiridos y profundizar en tecnologías relevantes para el desarrollo profesional.

También se tendrán en cuenta las siguientes restricciones:

- Dedicación inicial aproximada de 10 horas semanales.
- Coste objetivo de 0 €.
- Desarrollo progresivo de un producto mínimo viable (MVP).
- Necesidad de mantener una arquitectura organizada.
- Posibilidad de ampliar el proyecto posteriormente.
- Importancia de la accesibilidad y la experiencia de usuario.

Este documento distingue entre las tecnologías ya utilizadas, las seleccionadas para fases posteriores y aquellas cuya elección continúa pendiente.

---

## 2. Conocimientos tecnológicos previos

Durante el ciclo de DAM se han trabajado diferentes tecnologías y herramientas que constituyen la base de conocimientos para desarrollar AccessWay.

### 2.1. Desarrollo backend

- Java.
- Programación orientada a objetos.
- Arquitectura por capas.
- Spring Boot.
- APIs REST.
- Maven.

### 2.2. Desarrollo web

- HTML5.
- CSS3.
- JavaScript.
- Manipulación del DOM.
- AJAX.
- JSON.
- XML.

### 2.3. Bases de datos

- SQL.
- MySQL y MariaDB.
- PostgreSQL.
- SQLite.
- pgAdmin.

### 2.4. Desarrollo móvil

- Android Studio.
- Desarrollo de aplicaciones Android.
- Persistencia local mediante SQLite.

### 2.5. Herramientas de desarrollo

- IntelliJ IDEA.
- NetBeans.
- Visual Studio Code.
- Git.
- GitHub.

### 2.6. Otros conocimientos

- Odoo.
- PostgreSQL aplicado a entornos ERP.
- Conceptos de accesibilidad y experiencia de usuario.

Estos conocimientos servirán como punto de partida, aunque algunas tecnologías requerirán investigación y práctica adicional.

---

## 3. Criterios de selección tecnológica

La selección de tecnologías no dependerá únicamente de los conocimientos previos.

Se tendrán en cuenta los siguientes criterios:

1. Adecuación a las necesidades funcionales de AccessWay.
2. Viabilidad dentro del tiempo disponible.
3. Compatibilidad con los conocimientos adquiridos en DAM.
4. Posibilidad de profundizar en nuevas tecnologías.
5. Utilidad para el desarrollo profesional.
6. Facilidad de mantenimiento y evolución.
7. Integración entre los distintos componentes.
8. Disponibilidad de documentación.
9. Seguridad.
10. Coste económico.

No se incorporarán tecnologías únicamente por su popularidad.

Cada nueva herramienta deberá responder a una necesidad real del proyecto.

---

# 4. Arquitectura tecnológica general

AccessWay se desarrollará como una aplicación web responsive, accesible mediante un navegador.

Se pretende que pueda utilizarse desde teléfonos móviles, tablets y ordenadores, sin exigir inicialmente la instalación de una aplicación nativa.

La arquitectura prevista separa el frontend, el backend y la base de datos.

```text
                  USUARIO
                     |
                     v
             APLICACIÓN WEB
                     |
                     v
                  FRONTEND
                     |
                     v
                  API REST
                     |
                     v
              BACKEND JAVA
                SPRING BOOT
                     |
                     v
                 SERVICE
                     |
                     v
                REPOSITORY
                     |
                     v
                POSTGRESQL
```

Esta representación muestra la arquitectura prevista para las funcionalidades que necesitan acceder a datos.

Actualmente no todas las capas están implementadas.

El backend ya dispone de un controlador funcional, un DTO y una primera entidad JPA en desarrollo.

Las capas `Service` y `Repository` específicas de incidencias todavía no se han creado.

---

# 5. Investigación y selección del backend

## 5.1. Java

### ¿Qué es Java?

Java es un lenguaje de programación orientado a objetos que se utilizará para desarrollar el backend de AccessWay.

El backend será responsable de:

- Recibir peticiones.
- Procesar la información.
- Aplicar las reglas de negocio.
- Gestionar las incidencias.
- Comunicarse con la base de datos.
- Devolver respuestas a la aplicación web.

### Versiones estudiadas

Durante el estudio inicial se analizaron Java 21 y Java 25.

Ambas son versiones LTS, es decir, versiones con soporte a largo plazo.

Inicialmente se consideró Java 25 por tratarse de una versión LTS más reciente.

Sin embargo, al configurar el proyecto se estableció Java 21 como versión objetivo.

### Decisión actual

**AccessWay está configurado para utilizar Java 21.**

Esta decisión queda reflejada en el archivo `pom.xml`.

En el equipo de desarrollo también están instaladas otras versiones de Java.

Durante una ejecución anterior de las pruebas, el proceso mostró Java 23.0.1, aunque la compilación estaba configurada para Java 21.

Por tanto, queda pendiente revisar la configuración de Maven y del entorno de ejecución para comprobar que se utiliza la versión prevista.

No se considera cerrada esta comprobación hasta verificarla expresamente.

### Motivos para utilizar Java

Java permite aprovechar los conocimientos adquiridos durante DAM y profundizar en el desarrollo backend.

Además, dispone de un ecosistema que permite trabajar con Spring Boot, JPA y otras herramientas necesarias para AccessWay.

---

## 5.2. Spring Boot

### ¿Qué es Spring Boot?

Spring Boot es una tecnología del ecosistema Spring que facilita la creación, configuración y ejecución de aplicaciones Java.

Permite desarrollar aplicaciones backend sin tener que configurar manualmente toda su infraestructura.

### Motivos de selección

Se ha seleccionado Spring Boot para:

- Crear la API REST de AccessWay.
- Organizar el backend.
- Facilitar la conexión con PostgreSQL.
- Incorporar persistencia mediante JPA.
- Incorporar validaciones.
- Facilitar las pruebas.
- Permitir la integración posterior de mecanismos de seguridad.

### Estado actual

El proyecto backend se ha creado con Spring Boot 4.1.1.

Se ha comprobado que la aplicación puede arrancar y establecer conexión con PostgreSQL.

También se ha desarrollado y probado el primer endpoint REST.

---

## 5.3. API REST

### ¿Qué es una API REST?

REST es un estilo de arquitectura utilizado para diseñar servicios web.

En AccessWay se utilizará una API REST para comunicar la aplicación web con el backend.

La comunicación se realizará mediante peticiones HTTP.

### Métodos HTTP previstos

| Método | Utilización habitual |
|---|---|
| GET | Consultar información |
| POST | Crear información |
| PUT | Actualizar información |
| DELETE | Eliminar información |

Los endpoints concretos se definirán a medida que se implementen las funcionalidades.

### Primer endpoint implementado

El primer endpoint de AccessWay es:

`GET /api/health`

Su finalidad es comprobar que el backend puede recibir una petición HTTP y devolver una respuesta.

Actualmente devuelve:

```json
{
  "status": "UP",
  "message": "AccessWay backend funcionando correctamente"
}
```

Este endpoint se ha implementado y comprobado correctamente.

### Endpoints futuros

Entre los endpoints previstos se encuentran los relacionados con:

- Registro de incidencias.
- Consulta de incidencias.
- Actualización de incidencias.
- Gestión de usuarios.
- Consulta de rutas.

Estos endpoints todavía no están implementados.

---

## 5.4. JSON y DTO

### JSON

JSON es un formato utilizado para representar e intercambiar información.

Será el formato principal de comunicación entre el frontend y la API REST.

### DTO

DTO significa *Data Transfer Object*.

Un DTO es un objeto utilizado para transportar información entre diferentes partes de una aplicación.

Permite definir qué datos se enviarán al cliente sin necesidad de devolver directamente las entidades de persistencia.

### Primera implementación

Se ha creado el DTO:

`HealthResponse.java`

Contiene los atributos:

```java
private String status;
private String message;
```

El controlador `HealthController` devuelve una instancia de este DTO.

Spring Boot transforma el objeto en una respuesta JSON.

### Decisión

Se utilizarán DTOs cuando sea necesario definir las estructuras de entrada y salida de los endpoints.

Los DTOs específicos de incidencias todavía están pendientes de diseño e implementación.

---

## 5.5. Maven

### ¿Qué es Maven?

Maven es una herramienta utilizada para gestionar y construir proyectos Java.

Permite automatizar:

- La gestión de dependencias.
- La compilación.
- La ejecución de pruebas.
- El empaquetado.
- La ejecución de determinados plugins.

Su archivo principal de configuración es `pom.xml`.

### Maven Wrapper

AccessWay utiliza Maven Wrapper.

Esto permite ejecutar la versión de Maven configurada para el proyecto mediante los archivos incluidos en el repositorio.

### Comandos utilizados

Desde la raíz del repositorio:

```powershell
.\backend\mvnw.cmd -f .\backend\pom.xml test
```

Este comando permite compilar el proyecto y ejecutar sus pruebas.

Para iniciar el backend:

```powershell
.\backend\mvnw.cmd -f .\backend\pom.xml spring-boot:run
```

### Estado actual

Maven Wrapper se ha utilizado correctamente.

Las pruebas ejecutadas tras la implementación del DTO `HealthResponse` finalizaron con el resultado `BUILD SUCCESS`.

Todavía no se han ejecutado nuevas pruebas después de incorporar la entidad `Incidencia`.

---

# 6. Base de datos

## 6.1. PostgreSQL

### ¿Qué es PostgreSQL?

PostgreSQL es un sistema de gestión de bases de datos relacionales.

Se utilizará para almacenar la información persistente de AccessWay.

### Motivos de selección

- Permite trabajar con SQL.
- Se ha estudiado previamente durante DAM.
- Puede integrarse con Java y Spring Boot.
- Permite estructurar y relacionar los datos.
- Es una tecnología de código abierto.
- No requiere pagar una licencia para el desarrollo local.

### Configuración realizada

Se ha instalado y comprobado PostgreSQL 18.1.

Se ha creado la base de datos:

`accessway`

La base de datos utiliza codificación UTF-8.

El servidor PostgreSQL está configurado para aceptar conexiones en el puerto 5432.

### Estado actual

Se ha comprobado correctamente la conexión entre Spring Boot y PostgreSQL.

Todavía no se ha verificado la persistencia de la entidad `Incidencia`.

---

## 6.2. Configuración de la conexión

El archivo `application.properties` contiene:

```properties
spring.application.name=backend

spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Las credenciales se obtienen mediante variables de entorno de usuario permanentes de Windows.

Las variables utilizadas son:

- `DB_URL`
- `DB_USERNAME`
- `DB_PASSWORD`

No se almacena la contraseña directamente en el código fuente ni en el repositorio.

### Gestión del esquema

Durante el desarrollo local se utiliza:

```properties
spring.jpa.hibernate.ddl-auto=update
```

Esta configuración permite que Hibernate actualice el esquema de la base de datos a partir de las entidades detectadas.

Antes de iniciar la aplicación después de modificar las entidades, se revisará su estructura.

Esta configuración de desarrollo no se considera una estrategia definitiva de gestión de cambios para un futuro entorno de producción.

---

## 6.3. HikariCP

HikariCP es un pool de conexiones.

Permite gestionar las conexiones que la aplicación utiliza para comunicarse con PostgreSQL.

Durante las primeras ejecuciones de AccessWay se comprobó que HikariCP se inicializaba correctamente.

**No se realizó una configuración manual de HikariCP.**

Su inicialización se produjo automáticamente mediante la infraestructura utilizada por Spring Boot.

---

# 7. Persistencia mediante JPA

## 7.1. ¿Qué es JPA?

JPA es una especificación de Java para trabajar con persistencia de datos.

Permite representar mediante clases Java la información que se almacenará en una base de datos relacional.

Para ello utiliza entidades y anotaciones.

## 7.2. Primera entidad: Incidencia

La primera entidad del dominio de AccessWay es:

`Incidencia.java`

Está ubicada en:

```text
backend/src/main/java/com/accessway/backend/entity
```

La entidad representa un obstáculo o problema de accesibilidad comunicado por un usuario.

Actualmente contiene:

| Atributo | Tipo |
|---|---|
| id | Long |
| descripcion | String |
| tipo | TipoIncidencia |
| estado | EstadoIncidencia |
| direccion | String |
| latitud | Double |
| longitud | Double |
| fechaCreacion | LocalDateTime |

### Identificador

El identificador se ha definido mediante:

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```

### Enumerados

Se han creado dos enumerados:

- `TipoIncidencia`
- `EstadoIncidencia`

Ambos se almacenarán mediante sus nombres gracias a:

```java
@Enumerated(EnumType.STRING)
```

### Fecha y estado inicial

Se ha incorporado el siguiente método:

```java
@PrePersist
public void prePersist() {
    fechaCreacion = LocalDateTime.now();
    estado = EstadoIncidencia.ACTIVA;
}
```

Su finalidad es asignar automáticamente la fecha de creación y el estado inicial antes de insertar una nueva incidencia.

### Estado actual

La clase y los enumerados están creados.

Todavía quedan pendientes:

- Completar la entidad.
- Resolver el almacenamiento de fotografías.
- Incorporar los métodos de acceso necesarios.
- Ejecutar las pruebas correspondientes.
- Comprobar la persistencia real en PostgreSQL.
- Crear el repositorio de incidencias.

---

# 8. Arquitectura del backend

## 8.1. Arquitectura por capas

Se utilizará una arquitectura por capas para separar las responsabilidades del backend.

La estructura prevista es:

```text
Petición HTTP
      |
      v
  Controller
      |
      v
   Service
      |
      v
  Repository
      |
      v
 PostgreSQL
```

Las entidades representan los datos del dominio y participan en las operaciones de persistencia.

Los DTOs permiten definir la información intercambiada mediante la API.

## 8.2. Controller

Será responsable de recibir las peticiones HTTP, obtener los datos necesarios, delegar las operaciones y devolver las respuestas.

Actualmente está implementado:

`HealthController`

Los controladores específicos de las funcionalidades de AccessWay todavía están pendientes.

## 8.3. Service

Será responsable de aplicar la lógica de negocio.

Entre otras operaciones, podrá comprobar los datos de una incidencia y coordinar las acciones necesarias para registrarla o consultarla.

Esta capa todavía no está implementada para las incidencias.

## 8.4. Repository

Será responsable del acceso a los datos.

Permitirá realizar operaciones de consulta y persistencia.

El repositorio de incidencias todavía no está implementado.

## 8.5. Entity

Las entidades representan la información persistente del dominio.

Actualmente se ha creado la primera entidad:

`Incidencia`

Las entidades relacionadas con usuarios, rutas u otros elementos se diseñarán cuando se aborden sus funcionalidades.

---

# 9. Seguridad del backend

## 9.1. Objetivo

La seguridad deberá proteger los datos y controlar el acceso a las funcionalidades de AccessWay.

Se tendrán en cuenta:

- Autenticación.
- Autorización.
- Validación de entradas.
- Protección de contraseñas.
- Protección de credenciales.
- Comunicaciones seguras.
- Principio de mínimo privilegio.

## 9.2. Propuesta tecnológica

Durante el estudio inicial se propuso utilizar:

- Spring Security.
- JWT.
- BCrypt.
- HTTPS para el despliegue.

También se plantearon inicialmente dos roles:

- Usuario.
- Administrador.

Estas decisiones constituyen el diseño previsto, pero todavía no están implementadas.

## 9.3. Autenticación y autorización

La autenticación permitirá comprobar la identidad del usuario.

La autorización determinará qué operaciones podrá realizar.

Se estudiará cómo integrar ambas mediante Spring Security cuando se comience a desarrollar la gestión de usuarios.

## 9.4. Tokens

Se ha planteado utilizar JWT para gestionar la autenticación entre peticiones.

También se estudiará la necesidad de utilizar tokens de acceso y mecanismos de renovación.

Antes de implementarlos será necesario definir:

- La duración de los tokens.
- Su almacenamiento seguro.
- Su renovación.
- Su invalidación.
- La protección de los endpoints.

## 9.5. Contraseñas

Se ha propuesto utilizar BCrypt para proteger las contraseñas almacenadas.

Las contraseñas no deberán guardarse en texto plano.

## 9.6. Estado actual

La seguridad de usuarios continúa pendiente de implementación.

La medida de protección ya aplicada es la separación de las credenciales de PostgreSQL respecto al código fuente mediante variables de entorno.

La estrategia completa de autenticación y autorización se desarrollará progresivamente.

---

# 10. Investigación del frontend

## 10.1. Necesidades de la aplicación web

El frontend será la parte de AccessWay con la que interactuará directamente el usuario.

Deberá permitir, según el alcance que se implemente:

- Consultar información sobre accesibilidad.
- Visualizar mapas.
- Consultar incidencias.
- Registrar incidencias.
- Consultar rutas.
- Utilizar formularios.
- Gestionar las interfaces de usuario.
- Comunicarse con el backend.

También deberá adaptarse a diferentes tamaños de pantalla.

## 10.2. HTML, CSS y JavaScript

### HTML

HTML permitirá definir la estructura de las interfaces.

Se utilizará para representar formularios, botones, textos y otros elementos.

### CSS

CSS permitirá definir la presentación visual de la aplicación.

Será necesario para el diseño responsive y para aplicar los criterios de accesibilidad.

### JavaScript

JavaScript permitirá implementar la interacción con el usuario y la comunicación con la API REST.

Constituye la base tecnológica de las alternativas frontend estudiadas.

---

# 11. Comparación de alternativas frontend

Durante el estudio inicial se analizaron tres alternativas:

- React.
- Angular.
- Vue.

## 11.1. React

React es una biblioteca de JavaScript orientada a la construcción de interfaces mediante componentes.

Permite dividir una aplicación en elementos reutilizables.

Para AccessWay se contemplan componentes como:

- Navegación.
- Mapa.
- Formulario de incidencia.
- Listado de incidencias.
- Información de rutas.
- Perfil de usuario.

React ofrece flexibilidad, aunque algunas funcionalidades y decisiones de organización pueden requerir herramientas adicionales.

## 11.2. Angular

Angular es un framework basado en TypeScript.

Proporciona una estructura integrada para desarrollar aplicaciones web.

Incluye herramientas para organizar componentes, navegación, formularios y comunicación con servicios.

Su utilización implicaría incorporar los conceptos y convenciones propios del framework.

## 11.3. Vue

Vue es un framework progresivo orientado al desarrollo de interfaces.

Permite utilizar componentes y añadir funcionalidades a medida que aumentan las necesidades de la aplicación.

## 11.4. Comparación general

| Característica | React | Angular | Vue |
|---|---|---|---|
| Tipo | Biblioteca | Framework | Framework progresivo |
| Lenguaje habitual | JavaScript / TypeScript | TypeScript | JavaScript / TypeScript |
| Componentes | Sí | Sí | Sí |
| Comunicación con API REST | Sí | Sí | Sí |
| Integración con Spring Boot | Sí | Sí | Sí |
| Licencia gratuita | Sí | Sí | Sí |

Las tres alternativas permiten construir una aplicación web que se comunique con el backend de AccessWay.

La elección se realizó considerando las necesidades del proyecto, los conocimientos previos y el tiempo disponible.

---

# 12. Tecnología frontend seleccionada

## 12.1. React

Tras el estudio inicial se seleccionó React como tecnología principal para el frontend de AccessWay.

Los motivos documentados fueron:

- Organización mediante componentes.
- Reutilización de elementos de interfaz.
- Compatibilidad con la API REST.
- Aprovechamiento de los conocimientos de HTML, CSS y JavaScript.
- Posibilidad de desarrollar progresivamente las distintas pantallas.

## 12.2. JavaScript y TypeScript

El documento original contiene dos planteamientos distintos.

En algunos apartados se propone React con JavaScript y se deja TypeScript como una posible incorporación posterior.

En otro apartado se menciona React con TypeScript como tecnología seleccionada.

Para evitar presentar dos decisiones contradictorias, se establece el siguiente estado documental:

**React es la tecnología frontend seleccionada.**

**La elección definitiva entre JavaScript y TypeScript queda pendiente de confirmación antes de crear el proyecto frontend.**

Ambas alternativas son compatibles con React.

La decisión se documentará atendiendo al tiempo disponible, la curva de aprendizaje y las necesidades reales de AccessWay.

## 12.3. Estado actual

El frontend de AccessWay todavía no se ha implementado.

El desarrollo actual se está centrando en el backend.

---

# 13. Diseño responsive y accesibilidad

## 13.1. Diseño responsive

AccessWay se desarrollará como una aplicación web responsive.

La interfaz deberá adaptarse a:

- Teléfonos móviles.
- Tablets.
- Ordenadores.

## 13.2. Enfoque mobile-first

Se utilizará inicialmente un enfoque mobile-first.

Esto significa que se tendrá en cuenta desde el principio la experiencia de uso en teléfonos móviles.

Posteriormente, la interfaz se adaptará a pantallas de mayor tamaño.

Este enfoque responde a las situaciones de uso previstas, en las que una persona puede necesitar consultar información mientras se desplaza.

## 13.3. Accesibilidad

La accesibilidad de la propia aplicación será especialmente importante debido a la finalidad de AccessWay.

Durante el diseño y desarrollo se tendrán en cuenta:

- Contraste suficiente.
- Legibilidad.
- Tamaño de los elementos interactivos.
- Estructura clara.
- Navegación comprensible.
- Uso adecuado de HTML.
- Compatibilidad con diferentes tamaños de pantalla.
- No depender exclusivamente del color para transmitir información.

Estas medidas deberán comprobarse durante el desarrollo del frontend.

---

# 14. Mapas y geolocalización

## 14.1. Objetivos

Los mapas permitirán representar información geográfica relacionada con la accesibilidad.

Entre las funcionalidades previstas se encuentran:

- Mostrar mapas.
- Representar incidencias.
- Consultar ubicaciones.
- Mostrar rutas.
- Obtener la ubicación del dispositivo cuando el usuario lo autorice.
- Permitir seleccionar ubicaciones sobre el mapa.

## 14.2. Ubicación de las incidencias

La entidad `Incidencia` dispone actualmente de:

```java
private String direccion;
private Double latitud;
private Double longitud;
```

Estos atributos permitirán almacenar información sobre la ubicación de los obstáculos.

## 14.3. Experiencia de usuario

Se ha decidido que el usuario no tendrá que introducir manualmente la latitud y la longitud.

Se contemplan dos posibilidades:

1. Obtener la ubicación actual del dispositivo con permiso del usuario.
2. Seleccionar la ubicación del obstáculo sobre un mapa.

La selección manual sobre el mapa también permitirá comunicar una incidencia cuando el usuario ya no se encuentre en el lugar.

## 14.4. Tecnología pendiente

Todavía no se ha seleccionado definitivamente la tecnología que se utilizará para los mapas.

La decisión deberá tener en cuenta:

- Coste.
- Condiciones de utilización.
- Integración con React.
- Representación de incidencias.
- Representación de rutas.
- Geolocalización.
- Necesidades de accesibilidad.

La tecnología de mapas y el sistema de cálculo de rutas deberán estudiarse por separado cuando corresponda.

---

# 15. Almacenamiento de fotografías

## 15.1. Necesidad

AccessWay contempla que los usuarios puedan adjuntar fotografías para documentar las incidencias.

Las imágenes pueden facilitar la comprensión de un obstáculo.

## 15.2. Alternativas pendientes de estudio

Antes de implementar esta funcionalidad se estudiarán, entre otras, las siguientes alternativas:

### Almacenamiento en PostgreSQL

Consiste en guardar el contenido de las imágenes directamente en la base de datos.

Será necesario analizar sus implicaciones sobre el tamaño de la base de datos, las copias de seguridad y el rendimiento.

### Almacenamiento separado

Consiste en guardar las imágenes en un sistema de almacenamiento y conservar en PostgreSQL una referencia que permita recuperarlas.

Será necesario estudiar dónde se almacenarían las imágenes durante el desarrollo y cómo se gestionaría su almacenamiento en un futuro despliegue.

## 15.3. Criterios de decisión

Se tendrán en cuenta:

- Coste inicial de 0 €.
- Tamaño y número de fotografías.
- Formatos admitidos.
- Subida desde la cámara o la galería.
- Validación de archivos.
- Seguridad.
- Privacidad.
- Copias de seguridad.
- Posibilidades de despliegue.

## 15.4. Estado actual

**Todavía no se ha elegido una solución de almacenamiento de fotografías.**

Por este motivo, la entidad `Incidencia` aún no contiene atributos relacionados con imágenes.

La decisión se tomará antes de implementar esta funcionalidad.

---

# 16. Tecnologías y funcionalidades futuras

AccessWay podrá evolucionar después de completar el MVP.

Entre las posibilidades estudiadas se encuentran:

- Preferencias de rutas.
- Priorización de recorridos con menor pendiente.
- Preferencias relacionadas con la sombra.
- Identificación de obstáculos mediante fotografías.
- Validación comunitaria de incidencias.
- Incorporación de técnicas de inteligencia artificial.

Estas posibilidades no deben confundirse con funcionalidades implementadas.

Su incorporación dependerá del tiempo disponible, la viabilidad técnica y las necesidades reales del proyecto.

---

# 17. Resumen del estado tecnológico

**Fecha: 23/09/2026**

| Tecnología o componente | Estado |
|---|---|
| Java 21 | Configurado como versión objetivo |
| Spring Boot 4.1.1 | Implementado |
| Maven Wrapper | Configurado y utilizado |
| PostgreSQL 18.1 | Instalado y conectado |
| Base de datos `accessway` | Creada |
| Variables de entorno | Configuradas |
| API REST | Primer endpoint implementado |
| HealthController | Implementado y probado |
| HealthResponse | Implementado y probado |
| JPA | Incorporado al proyecto |
| Entidad Incidencia | En desarrollo |
| Enumerados de incidencias | Creados |
| Repository de incidencias | Pendiente |
| Service de incidencias | Pendiente |
| Endpoints de incidencias | Pendientes |
| Seguridad de usuarios | Pendiente |
| React | Seleccionado, no implementado |
| JavaScript / TypeScript | Decisión definitiva pendiente |
| Diseño responsive | Planificado |
| Tecnología de mapas | Pendiente de selección |
| Almacenamiento de fotografías | Pendiente de decisión |

---

# 18. Conclusión

El estudio tecnológico ha permitido definir una base para desarrollar AccessWay de manera progresiva.

El backend ya se ha iniciado mediante Java, Spring Boot, Maven y PostgreSQL.

Se ha comprobado el funcionamiento de la conexión con la base de datos y del primer endpoint REST.

También se ha comenzado a desarrollar la primera entidad del dominio: `Incidencia`.

Para el frontend se ha seleccionado React, aunque todavía queda por confirmar la utilización de JavaScript o TypeScript.

Las tecnologías de mapas, el almacenamiento de fotografías y los mecanismos concretos de seguridad se estudiarán antes de su implementación.

Las decisiones tecnológicas deberán mantenerse alineadas con el alcance real del proyecto, el tiempo disponible y el objetivo de coste de 0 €.

Este documento se actualizará cuando se adopten nuevas decisiones o se implementen tecnologías adicionales.