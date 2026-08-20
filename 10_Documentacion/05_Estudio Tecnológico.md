# Estudio tecnológico

## 1. Objetivo

Antes de comenzar el desarrollo de AccessWay se realiza un estudio de las tecnologías que se utilizarán en el proyecto.

El objetivo es seleccionar un conjunto de tecnologías que permita desarrollar el proyecto de forma realista dentro del contexto del ciclo de DAM, pero que al mismo tiempo resulte suficientemente actual y relevante para el desarrollo profesional.

También se tendrá en cuenta que el proyecto sirva como muestra práctica de las competencias adquiridas durante el ciclo y pueda formar parte del portfolio profesional.

## 2. Tecnologías y herramientas conocidas

Durante el ciclo de Desarrollo de Aplicaciones Multiplataforma (DAM) se han trabajado las siguientes tecnologías y herramientas:

### Desarrollo backend

- Java
- Programación Orientada a Objetos (POO)
- Arquitectura en capas
- Spring Boot
- APIs REST
- Maven

### Desarrollo web

- HTML5
- CSS3
- JavaScript
- Manipulación del DOM
- AJAX
- JSON
- XML

### Bases de datos

- SQL
- MySQL / MariaDB
- PostgreSQL
- SQLite
- pgAdmin

### Desarrollo móvil

- Android Studio
- Desarrollo de aplicaciones Android
- Persistencia local con SQLite

### Herramientas de desarrollo

- IntelliJ IDEA
- NetBeans
- Visual Studio Code
- Git
- GitHub

### Otros conocimientos

- Odoo
- PostgreSQL aplicado a entornos ERP
- Accesibilidad y UX

## 3. Tecnologías no trabajadas previamente

Durante el análisis tecnológico se podrán identificar tecnologías que no se hayan trabajado directamente durante el ciclo y que puedan resultar interesantes para el desarrollo profesional o para alguna necesidad concreta de AccessWay.

La incorporación de una tecnología nueva se valorará teniendo en cuenta:

- La dificultad de aprendizaje.
- El tiempo disponible para el desarrollo.
- La relación entre el esfuerzo de aprendizaje y el valor profesional aportado.
- La compatibilidad con los conocimientos adquiridos en DAM.
- La utilidad de la tecnología para el desarrollo profesional posterior.
- Su utilidad real para las necesidades de AccessWay.

No se incorporarán tecnologías nuevas únicamente por ser más modernas o populares, sino cuando exista una justificación relacionada con las necesidades del proyecto.

## 4. Valoración inicial

| Tecnología | Conocimientos previos | Utilidad para AccessWay | Valor profesional | Decisión inicial |
|---|---|---|---|---|
| Java | Alto | Alto | Alto | Mantener |
| JavaScript | Alto | Alto | Alto | Mantener |
| HTML/CSS | Alto | Alto | Alto | Mantener |
| SQL | Alto | Alto | Alto | Mantener |
| PostgreSQL | Medio/Alto | Alto | Alto | Mantener |
| Spring Boot | Medio | Alto | Alto | Mantener |
| APIs REST | Medio/Alto | Alto | Alto | Mantener |
| Maven | Medio | Alto | Alto | Mantener |
| Git | Medio | Alto | Muy alto | Mantener |
| GitHub | Medio | Alto | Muy alto | Mantener |

Esta valoración es inicial y podrá modificarse durante el estudio tecnológico si alguna decisión técnica cambia como consecuencia de las necesidades del proyecto.

## 5. Criterios de selección

La selección tecnológica de AccessWay no se realizará únicamente en función de los conocimientos previos.

Se tendrán en cuenta los siguientes criterios:

1. Viabilidad dentro del tiempo disponible para el proyecto.
2. Conocimientos adquiridos durante el ciclo de DAM.
3. Posibilidad de aprender nuevas tecnologías durante el desarrollo.
4. Relevancia de las tecnologías en el mercado laboral.
5. Capacidad para demostrar competencias técnicas en el portfolio.
6. Facilidad de mantenimiento y evolución del proyecto.
7. Posibilidad de integrar servicios externos mediante APIs.
8. Posibilidad de incorporar funcionalidades de inteligencia artificial.
9. Adecuación de las tecnologías al tipo de aplicación que se quiere desarrollar.

## 6. Conclusión inicial

AccessWay se plantea como una oportunidad para aplicar de forma conjunta los conocimientos adquiridos durante el ciclo de DAM y, al mismo tiempo, incorporar nuevas tecnologías que puedan mejorar el valor profesional del proyecto.

La aplicación se desarrollará como una **aplicación web**, accesible desde diferentes dispositivos mediante un navegador, sin necesidad de instalar una aplicación específica.

La tecnología definitiva todavía no se considera completamente cerrada. Antes de comenzar el desarrollo se realizará una investigación sobre las alternativas disponibles y se documentarán las decisiones adoptadas y sus motivos.

## 7. Investigación del backend

### 7.1 Java

#### ¿Qué es Java?

Java es el lenguaje de programación que se utilizará principalmente para desarrollar el backend de AccessWay.

El backend será la parte de la aplicación encargada de procesar las peticiones del usuario, aplicar la lógica de negocio, gestionar la información y comunicarse con la base de datos. Java será el lenguaje utilizado para implementar gran parte de esta lógica.

#### Versiones instaladas actualmente

En el entorno de desarrollo utilizado para el proyecto se encuentran instaladas actualmente las versiones Java 23.0.1 y Java 25.0.1.

La versión Java 23.0.1 es actualmente la utilizada por defecto en el sistema. Java 25.0.1 también está instalada y podrá utilizarse de forma independiente en aquellos proyectos que lo requieran.

La versión definitiva de Java para AccessWay se establecerá teniendo en cuenta las versiones LTS disponibles y su compatibilidad con Spring Boot y con el resto de tecnologías que formarán parte del proyecto.

#### ¿Qué significa LTS?

LTS significa Long-Term Support (soporte a largo plazo).

Java publica nuevas versiones periódicamente, pero no todas reciben el mismo nivel de soporte a largo plazo. Las versiones LTS están especialmente orientadas a proyectos que buscan estabilidad y mantenimiento durante un periodo prolongado.

Para un proyecto nuevo como AccessWay, utilizar una versión LTS permite disponer de una base estable sobre la que desarrollar y mantener la aplicación durante un periodo prolongado.

#### Comparación entre Java 21 y Java 25

Java 21 y Java 25 son versiones LTS de Java.

Java 21 es una versión LTS consolidada y ampliamente utilizada. Java 25 es la versión LTS más reciente actualmente disponible.

Ambas son candidatas adecuadas para el desarrollo de AccessWay. La elección entre ellas no se realizará únicamente en función de cuál sea más reciente, sino teniendo en cuenta también su compatibilidad con Spring Boot y con el resto de tecnologías que formarán parte del proyecto.

Teniendo en cuenta que AccessWay comenzará su desarrollo en 2026 y que Java 25 es la LTS más reciente, Java 25 se considera inicialmente la opción más adecuada para el proyecto.

La decisión definitiva se confirmará teniendo en cuenta la compatibilidad con Spring Boot y con el resto de tecnologías que formarán parte del proyecto.

#### Papel de Java en AccessWay

Java será el lenguaje utilizado para implementar la lógica del backend de AccessWay.

Entre sus responsabilidades estarán:

- Recibir y procesar las peticiones realizadas por la aplicación web.
- Aplicar las reglas de negocio de AccessWay.
- Consultar y utilizar información almacenada en la base de datos.
- Procesar dicha información según las condiciones solicitadas por el usuario.
- Generar la respuesta que posteriormente será enviada a la aplicación web.

#### ¿Por qué utilizar Java?

La elección de Java se debe principalmente a que es una tecnología que ya ha sido estudiada durante el ciclo de DAM y permite aprovechar los conocimientos adquiridos durante el curso.

Además, Java cuenta con un ecosistema maduro para el desarrollo backend y dispone de tecnologías ampliamente utilizadas en este ámbito, como Spring Boot.

Utilizar Java permitirá profundizar en conocimientos ya adquiridos y llevarlos a un entorno de desarrollo más cercano al profesional, en lugar de comenzar desde cero con un lenguaje diferente.

#### Relación entre Java y la base de datos

Java no almacena directamente toda la información de AccessWay.

La información persistente se almacenará en una base de datos. El backend desarrollado con Java será el encargado de solicitar la información necesaria, procesarla mediante la lógica de negocio y utilizarla para generar la respuesta correspondiente.

Por ejemplo, ante una petición de búsqueda de una ruta accesible, el backend podría consultar las incidencias y características de las rutas almacenadas y aplicar las condiciones indicadas por el usuario para determinar el resultado.

#### Flujo básico

Usuario
↓
Aplicación web
↓
API REST
↓
Backend desarrollado con Java
↓
Lógica de negocio
↓
Base de datos
↓
Backend
↓
API REST
↓
Aplicación web
↓
Usuario

### 7.2 Spring Boot

#### ¿Qué es Spring Boot?

Spring Boot es un framework basado en Spring que facilita la creación, configuración y ejecución de aplicaciones desarrolladas con Java, especialmente aplicaciones backend.

Proporciona una estructura y diferentes herramientas que permiten desarrollar una aplicación sin tener que configurar desde cero toda la infraestructura necesaria para su funcionamiento.

En AccessWay se utilizará Spring Boot como framework principal para desarrollar el backend de la aplicación.

#### ¿Por qué utilizar Spring Boot?

Para AccessWay se utilizará Spring Boot para facilitar el desarrollo del backend.

Sin un framework como Spring Boot, sería necesario realizar manualmente una mayor parte de la configuración e infraestructura necesaria para recibir y gestionar las peticiones de la aplicación.

Spring Boot permite disponer de una base preparada sobre la que desarrollar la lógica de negocio de AccessWay, evitando dedicar el proyecto a construir desde cero elementos de infraestructura que ya existen.

De esta forma, el desarrollo puede centrarse principalmente en las funcionalidades propias de AccessWay.

Además, Spring Boot facilita la creación de APIs REST y permite integrar diferentes tecnologías necesarias para el proyecto, como bases de datos, validación, seguridad y pruebas.

#### Spring Boot y Java

Spring Boot no sustituye a Java.

Java será el lenguaje de programación utilizado para desarrollar el código del backend, mientras que Spring Boot proporcionará una estructura y herramientas que facilitarán el desarrollo y configuración de dicha aplicación.

La relación puede representarse de la siguiente manera:

Java
↓
Lenguaje de programación

Spring Boot
↓
Framework para facilitar el desarrollo del backend

AccessWay
↓
Aplicación desarrollada utilizando ambas tecnologías

#### Papel de Spring Boot en AccessWay

Spring Boot proporcionará la estructura necesaria para implementar el backend de AccessWay.

A través de Spring Boot se desarrollará la API REST que permitirá la comunicación entre la aplicación web y el backend.

El backend se organizará mediante diferentes capas, separando las responsabilidades de cada una de ellas.

Aplicación web
↓
API REST
↓
Controller
↓
Service
↓
Repository
↓
Base de datos

Esta separación permitirá mantener una estructura organizada y facilitará el mantenimiento y evolución del proyecto.

### 7.3 API REST

#### ¿Qué es una API REST?

Una API REST es un mecanismo que permite que diferentes aplicaciones se comuniquen entre sí mediante peticiones HTTP.

REST (Representational State Transfer) es un estilo de arquitectura utilizado habitualmente para desarrollar servicios web.

En AccessWay, la API REST será el mecanismo de comunicación entre la aplicación web y el backend desarrollado con Spring Boot.

#### Papel de la API REST en AccessWay

La API REST actuará como punto de comunicación entre la aplicación web y el backend.

La aplicación web realizará peticiones HTTP para solicitar o enviar información, y el backend procesará dichas peticiones y devolverá una respuesta.

El flujo básico será:

Aplicación web
↓
API REST
↓
Backend Spring Boot
↓
Base de datos

Por ejemplo, cuando un usuario quiera registrar una nueva incidencia, la aplicación web enviará una petición al endpoint correspondiente de la API REST.

El backend recibirá la petición, procesará la información y devolverá una respuesta a la aplicación web.

#### Peticiones HTTP

La comunicación mediante la API REST se realizará utilizando diferentes métodos HTTP según la operación que se quiera realizar.

Los principales métodos que utilizaremos serán:

- **GET:** consultar información.
- **POST:** crear nueva información.
- **PUT:** modificar información existente.
- **DELETE:** eliminar información.

Por ejemplo:

| Método | Ejemplo | Utilización |
|---|---|---|
| GET | `/incidencias` | Obtener incidencias |
| POST | `/incidencias` | Registrar una incidencia |
| PUT | `/incidencias/15` | Modificar una incidencia |
| DELETE | `/incidencias/15` | Eliminar una incidencia |

Estos ejemplos son orientativos y los endpoints definitivos se establecerán durante el desarrollo.

#### JSON

La información intercambiada entre la aplicación web y la API REST se representará principalmente mediante JSON (JavaScript Object Notation).

Por ejemplo, una petición para registrar una incidencia podría contener información similar a:

```json
{
  "tipo": "obstaculo",
  "descripcion": "Acera bloqueada",
  "latitud": 40.4168,
  "longitud": -3.7038
}
```

### 7.4 Maven

#### ¿Qué es Maven?

Maven es una herramienta de gestión y construcción de proyectos Java.

Permite automatizar tareas habituales del desarrollo, como la gestión de dependencias, la compilación del código, la ejecución de pruebas y la generación del proyecto.

Maven utiliza un archivo de configuración denominado `pom.xml`, en el que se define la información principal del proyecto y sus dependencias.

#### ¿Por qué utilizar Maven?

Maven se utilizará en AccessWay para facilitar la gestión y construcción del backend desarrollado con Java y Spring Boot.

Una de sus principales ventajas es que permite gestionar automáticamente las librerías externas que necesita el proyecto.

En lugar de incorporar manualmente cada librería al proyecto, estas se declararán en el archivo `pom.xml` y Maven se encargará de obtenerlas y gestionarlas.

Esto facilita mantener el proyecto organizado y reproducible.

#### El archivo `pom.xml`

El archivo `pom.xml` (Project Object Model) es el archivo principal de configuración de Maven.

En él se definirá información como:

- Identificación del proyecto.
- Versión del proyecto.
- Versión de Java utilizada.
- Dependencias necesarias.
- Configuración de compilación.
- Configuración de pruebas.
- Plugins necesarios para determinadas tareas.

Por ejemplo, las dependencias de Spring Boot que necesite AccessWay se declararán en este archivo.

#### Maven en AccessWay

Maven será utilizado principalmente para gestionar el backend de AccessWay.

Su función dentro del proyecto será facilitar:

- La gestión de dependencias.
- La compilación del código.
- La ejecución de pruebas.
- La gestión de plugins.
- La construcción del proyecto.

De esta forma, Maven permitirá automatizar parte del proceso de desarrollo y evitar configuraciones manuales innecesarias.

#### Relación entre Java, Spring Boot y Maven

Estas tres tecnologías cumplen funciones diferentes dentro del proyecto:

- **Java:** lenguaje de programación utilizado para desarrollar el backend.
- **Spring Boot:** framework utilizado para estructurar y facilitar el desarrollo del backend.
- **Maven:** herramienta utilizada para gestionar las dependencias y automatizar la construcción del proyecto.

La relación puede resumirse de la siguiente manera:

Java
↓
Lenguaje de programación

Spring Boot
↓
Framework para desarrollar el backend

Maven
↓
Gestión de dependencias y construcción del proyecto

AccessWay
↓
Backend desarrollado utilizando estas tecnologías

#### Maven y el ciclo de desarrollo

Maven permitirá ejecutar diferentes fases del ciclo de construcción del proyecto.

Entre las más importantes se encuentran:

- **compile:** compila el código fuente.
- **test:** ejecuta las pruebas.
- **package:** empaqueta la aplicación.
- **install:** instala el artefacto generado en el repositorio local.

Estas fases podrán utilizarse durante el desarrollo de AccessWay para comprobar y construir el proyecto de forma automatizada.

#### Coste

Maven es una herramienta de código abierto y su utilización no supone un coste de licencia.

Por tanto, cumple con la restricción económica establecida para AccessWay:

> **Coste objetivo del proyecto: 0 €**

### 7.5 Arquitectura del backend

Para AccessWay se utilizará una arquitectura por capas con el objetivo de separar las diferentes responsabilidades del backend.

La estructura inicial será:

Aplicación web
↓
API REST
↓
Controller
↓
Service
↓
Repository
↓
Base de datos

Cada capa tendrá una responsabilidad concreta.

#### Controller

El Controller será el punto de entrada de las peticiones HTTP realizadas a través de la API REST.

Sus principales responsabilidades serán:

- Recibir las peticiones HTTP.
- Obtener los datos enviados por el cliente.
- Realizar las validaciones de entrada que correspondan.
- Delegar la operación al Service correspondiente.
- Construir y devolver la respuesta al cliente.

El Controller no contendrá la lógica de negocio principal.

#### Service

El Service será la capa responsable de implementar la lógica de negocio de AccessWay.

En esta capa se tomarán las decisiones relacionadas con el comportamiento de la aplicación y se aplicarán las reglas de negocio necesarias.

El Service podrá solicitar información al Repository cuando necesite consultar o modificar datos.

#### Repository

El Repository será la capa encargada del acceso a los datos almacenados en la base de datos.

Sus responsabilidades estarán relacionadas con operaciones como:

- Consultar información.
- Guardar información.
- Modificar información.
- Eliminar información.

El Repository no será responsable de aplicar las reglas de negocio.

#### Entity / Model

Las entidades representarán los principales objetos de información que manejará AccessWay.

Entre ellas podrían encontrarse:

- `Usuario`
- `Incidencia`
- `Ruta`

La estructura definitiva de estas entidades se establecerá durante el diseño de la base de datos y el desarrollo del backend.

#### Ejemplo de flujo: registro de una incidencia

Cuando un usuario registre una nueva incidencia, el flujo será aproximadamente el siguiente:

1. La aplicación web enviará una petición HTTP a la API REST.
2. El Controller recibirá la petición.
3. El Controller realizará las comprobaciones de entrada correspondientes y delegará la operación al Service.
4. El Service aplicará las reglas de negocio necesarias.
5. El Service solicitará al Repository el almacenamiento de la información.
6. El Repository realizará la operación correspondiente sobre la base de datos.
7. La respuesta realizará el recorrido inverso hasta llegar nuevamente a la aplicación web.

De forma resumida:

Aplicación web
↓
API REST
↓
Controller
↓
Service
↓
Repository
↓
Base de datos
↓
Repository
↓
Service
↓
Controller
↓
API REST
↓
Aplicación web

#### ¿Por qué utilizar una arquitectura por capas?

La separación de responsabilidades permitirá:

- Mantener el código organizado.
- Facilitar el mantenimiento.
- Reducir el acoplamiento entre componentes.
- Facilitar las pruebas.
- Permitir modificar una parte del sistema sin afectar innecesariamente a las demás.
- Facilitar la ampliación futura de AccessWay.

Además, esta arquitectura permite aplicar los conocimientos adquiridos durante el ciclo de DAM en un proyecto real.

#### Decisión para AccessWay

La arquitectura inicial del backend de AccessWay estará basada en la separación de responsabilidades mediante las capas:

**Controller → Service → Repository → Base de datos**

Las entidades del dominio se utilizarán para representar la información manejada por la aplicación.

La arquitectura podrá evolucionar durante el desarrollo si aparecen nuevas necesidades, pero no se incorporarán capas o componentes adicionales sin una justificación técnica.

### 7.6 Seguridad del backend

La seguridad será un aspecto fundamental de AccessWay, especialmente debido a que la aplicación gestionará información relacionada con usuarios, incidencias y otros datos asociados a la aplicación.

El objetivo será garantizar que únicamente los usuarios autorizados puedan acceder a las funcionalidades y recursos que correspondan.

#### Objetivos de seguridad

La seguridad del backend deberá contemplar principalmente:

- Identificación de los usuarios.
- Control de acceso a los recursos.
- Protección de los datos intercambiados entre la aplicación web y el backend.
- Validación de los datos recibidos.
- Protección frente a accesos no autorizados.
- Gestión segura de las credenciales de los usuarios.

#### Autenticación

La autenticación permitirá comprobar la identidad del usuario que intenta acceder a AccessWay.

El usuario proporcionará sus credenciales y el backend comprobará que sean válidas antes de permitir el acceso a las funcionalidades protegidas.

#### Autorización

La autorización permitirá determinar qué acciones puede realizar un usuario una vez que ha sido autenticado.

AccessWay contará inicialmente con dos roles:

- **Usuario:** podrá utilizar las funcionalidades normales de la aplicación, como consultar rutas y registrar o gestionar sus propias incidencias.
- **Administrador:** dispondrá de las funcionalidades de un usuario normal y, además, tendrá permisos adicionales para realizar tareas administrativas.

De esta forma:

**Administrador = permisos de usuario + permisos administrativos**

No se crearán roles adicionales salvo que aparezca una necesidad real durante el desarrollo.

#### Spring Security

Se utilizará **Spring Security** como solución para implementar los mecanismos de autenticación y autorización del backend.

Su integración con Spring Boot permitirá centralizar y estructurar los mecanismos de seguridad de la aplicación.

Spring Security procesará las peticiones antes de permitir el acceso a los Controllers que gestionan los recursos protegidos.

El flujo general será:

Petición HTTP
↓
Spring Security
↓
Autenticación
↓
Autorización
↓
Controller
↓
Service
↓
Repository

#### JWT

Para mantener la identidad del usuario entre las diferentes peticiones se utilizará **JSON Web Token (JWT)**.

Después de una autenticación correcta, el backend proporcionará al cliente un access token y un refresh token.

El access token tendrá una duración limitada y se utilizará para acceder a los recursos protegidos de la API.

Cuando el access token caduque, el refresh token permitirá solicitar un nuevo access token sin que el usuario tenga que introducir nuevamente sus credenciales.

Este mecanismo permitirá combinar seguridad con una experiencia de usuario adecuada.

#### Protección de contraseñas

Las contraseñas de los usuarios no se almacenarán directamente en la base de datos.

Se utilizará **BCrypt** para generar un hash seguro de las contraseñas antes de almacenarlas.

De esta forma, la contraseña original no quedará almacenada directamente.

El proceso será:

Contraseña
↓
BCrypt
↓
Hash
↓
Base de datos

Durante el inicio de sesión, la contraseña proporcionada por el usuario se comprobará frente al hash almacenado.

#### Almacenamiento de tokens

Los tokens utilizados por AccessWay deberán gestionarse y almacenarse de forma segura en la aplicación web.

No se almacenarán de forma que queden expuestos innecesariamente a otros mecanismos o componentes de la aplicación.

La estrategia concreta para el almacenamiento y gestión de los tokens se definirá durante el desarrollo del frontend, teniendo en cuenta las características de las aplicaciones web y las medidas de seguridad necesarias.

#### Comunicación mediante HTTPS

La comunicación entre la aplicación web y el backend se realizará mediante **HTTPS** cuando AccessWay esté desplegada.

HTTPS permitirá cifrar la información transmitida entre el cliente y el servidor y proteger especialmente datos sensibles como las credenciales y los tokens de autenticación.

El flujo será:

Aplicación web
↓
HTTPS
↓
Backend AccessWay

#### Protección de la API REST

Los endpoints que requieran autenticación estarán protegidos mediante Spring Security.

Antes de permitir el acceso a un recurso protegido se comprobará la validez del token y los permisos correspondientes al usuario.

Además, los datos recibidos deberán ser validados antes de ser procesados por la lógica de negocio.

La API no deberá exponer información sensible innecesariamente.

#### Principio de mínimo privilegio

AccessWay seguirá el principio de mínimo privilegio.

Cada usuario dispondrá únicamente de los permisos necesarios para realizar las operaciones que le correspondan.

Esto permitirá reducir el impacto de posibles accesos no autorizados y evitar que un usuario pueda realizar operaciones que no necesita para utilizar la aplicación.

#### Coste

Las soluciones de seguridad seleccionadas cumplen con la restricción económica establecida para el proyecto.

Se utilizarán tecnologías y mecanismos disponibles sin costes de licencia para mantener:

> **Coste objetivo del proyecto: 0 €**

#### Decisión de seguridad para AccessWay

La estrategia de seguridad inicial del backend estará basada en:

- **Spring Security** para la gestión de autenticación y autorización.
- **JWT** para la gestión de la identidad entre peticiones.
- **Access tokens** de duración limitada.
- **Refresh tokens** para renovar la autenticación.
- **BCrypt** para proteger las contraseñas almacenadas.
- **Mecanismos seguros de almacenamiento en la aplicación web** para proteger los tokens.
- **HTTPS** para proteger las comunicaciones entre cliente y servidor.
- **Dos roles iniciales:** Usuario y Administrador.

Esta estrategia proporciona una base de seguridad adecuada para el MVP de AccessWay sin introducir herramientas o servicios de pago innecesarios.

### 7.7 Conclusión provisional

Después de analizar las tecnologías y herramientas necesarias para el desarrollo del backend de AccessWay, se considera que la selección realizada es adecuada para las necesidades iniciales del proyecto.

### Lenguaje y framework

**Java** será el lenguaje utilizado para desarrollar el backend y **Spring Boot** proporcionará la estructura y herramientas necesarias para facilitar su desarrollo.

La combinación de ambas tecnologías permite desarrollar el backend utilizando tecnologías conocidas durante el ciclo de DAM y facilita la implementación de una API REST.

### Comunicación entre aplicación y backend

Se utilizará una **API REST** como mecanismo de comunicación entre la aplicación web y el backend.

Esta separación permitirá mantener diferenciadas la aplicación cliente y la lógica del servidor, facilitando además la evolución futura del proyecto.

### Gestión y construcción del proyecto

**Maven** será utilizado para gestionar las dependencias y facilitar la construcción del proyecto.

Su integración con el ecosistema Java y Spring Boot permitirá mantener una estructura organizada y reproducible.

### Arquitectura

El backend utilizará una **arquitectura por capas** basada inicialmente en:

**Controller → Service → Repository → Base de datos**

Esta separación permitirá distribuir las responsabilidades del sistema y facilitar el mantenimiento y evolución de AccessWay.

### Seguridad

La seguridad del backend se basará inicialmente en **Spring Security, JWT y BCrypt**.

Se utilizarán mecanismos de autenticación y autorización para controlar el acceso a los recursos protegidos.

Las contraseñas se protegerán mediante un mecanismo de hash seguro y los tokens se gestionarán mediante mecanismos adecuados de seguridad en la aplicación web.

La comunicación entre cliente y servidor utilizará **HTTPS** cuando la aplicación esté desplegada.

### Coste

Las tecnologías seleccionadas permiten mantener el objetivo económico establecido para el proyecto.

Se priorizarán herramientas y tecnologías gratuitas o de código abierto, manteniendo como referencia:

> **Coste objetivo: 0 €**

### Valoración provisional

Las decisiones tomadas hasta este momento proporcionan una base tecnológica adecuada para comenzar el desarrollo del backend de AccessWay.

La combinación de **Java, Spring Boot, API REST, Maven, una arquitectura por capas y los mecanismos de seguridad definidos** permite establecer una estructura de backend organizada, mantenible y suficientemente profesional para el alcance previsto del proyecto.

Estas conclusiones son provisionales y podrán revisarse durante las siguientes fases del proyecto si aparecen nuevas necesidades técnicas o si alguna decisión debe modificarse como consecuencia del desarrollo.

## 8. Investigación tecnológica de la aplicación web

### 8.1 Necesidades del frontend

El frontend será la parte de AccessWay con la que interactuará directamente el usuario.

Su función principal será proporcionar una interfaz que permita utilizar las diferentes funcionalidades de la aplicación y comunicarse con el backend mediante la API REST.

Para determinar las tecnologías necesarias para el frontend, primero se han identificado las principales necesidades que deberá cubrir.

#### Interfaz de usuario

El frontend deberá proporcionar una interfaz clara y sencilla que permita al usuario acceder a las diferentes funcionalidades de AccessWay.

Entre otras, deberá permitir:

- Registrarse e iniciar sesión.
- Consultar rutas.
- Visualizar información sobre accesibilidad.
- Consultar incidencias.
- Registrar nuevas incidencias.
- Consultar el perfil del usuario.
- Interactuar con mapas y elementos relacionados con la geolocalización.

La interfaz se desarrollará mediante componentes reutilizables para facilitar su organización y mantenimiento.

#### Comunicación con el backend

El frontend deberá comunicarse con el backend mediante la **API REST** definida en la arquitectura de AccessWay.

A través de esta comunicación podrá:

- Enviar información al backend.
- Recibir información procedente del backend.
- Crear, consultar, modificar o eliminar recursos cuando corresponda.
- Gestionar las respuestas y errores procedentes del servidor.

La lógica de negocio principal permanecerá en el backend y no se trasladará al frontend innecesariamente.

#### Gestión de usuarios

El frontend deberá proporcionar las interfaces necesarias para las funcionalidades relacionadas con los usuarios.

Inicialmente se contemplan:

- Registro de usuario.
- Inicio de sesión.
- Cierre de sesión.
- Consulta y modificación del perfil.
- Acceso a las funcionalidades disponibles según los permisos del usuario.

Las operaciones relacionadas con autenticación y autorización se gestionarán conjuntamente con los mecanismos de seguridad definidos para el backend.

#### Formularios

AccessWay necesitará diferentes formularios para introducir información.

Por ejemplo:

- Registro de usuario.
- Inicio de sesión.
- Registro de incidencias.
- Modificación de información del perfil.

Los formularios deberán validar los datos básicos introducidos por el usuario antes de enviarlos al backend.

La validación realizada en el frontend mejorará la experiencia de usuario, pero no sustituirá a la validación realizada por el backend.

#### Mapas y geolocalización

El frontend deberá permitir integrar mapas y funcionalidades relacionadas con la geolocalización.

Entre las funcionalidades previstas se encuentran:

- Mostrar la ubicación del usuario cuando este conceda permiso.
- Mostrar incidencias sobre un mapa.
- Consultar información relacionada con una ubicación.
- Representar rutas.
- Interactuar con elementos geográficos.

La tecnología concreta que se utilizará para los mapas se analizará posteriormente.

#### Diseño responsive

AccessWay se desarrollará como una aplicación web responsive.

El frontend deberá adaptarse a diferentes tamaños de pantalla para poder utilizarse desde:

- Ordenadores.
- Tablets.
- Teléfonos móviles.

Se tendrá especialmente en cuenta la utilización desde dispositivos móviles, ya que algunas funcionalidades de AccessWay estarán relacionadas con el uso de la aplicación mientras el usuario se desplaza.

#### Accesibilidad

La interfaz deberá tener en cuenta criterios básicos de accesibilidad.

Se prestará atención especialmente a:

- Legibilidad del contenido.
- Contraste adecuado.
- Tamaño de los elementos interactivos.
- Estructura clara de la información.
- Navegación comprensible.
- Uso adecuado de elementos HTML.
- No depender únicamente del color para transmitir información.

La accesibilidad de la propia interfaz será un aspecto especialmente importante debido a la finalidad de AccessWay.

#### Mantenibilidad

El frontend deberá organizarse de forma que las diferentes partes de la interfaz puedan mantenerse y modificarse sin afectar innecesariamente al resto de la aplicación.

Para ello se buscará:

- Utilizar componentes reutilizables.
- Mantener una estructura de proyecto organizada.
- Separar responsabilidades.
- Evitar duplicar código innecesariamente.
- Mantener separada la lógica de presentación de la comunicación con la API cuando resulte conveniente.

#### Compatibilidad con el proyecto

La tecnología seleccionada para el frontend deberá ser compatible con la arquitectura general de AccessWay.

Deberá permitir trabajar conjuntamente con:

- **Java + Spring Boot** en el backend.
- **API REST** como mecanismo de comunicación.
- **PostgreSQL** como base de datos.
- **Git y GitHub** para el control de versiones.
- Las herramientas de desarrollo disponibles para el proyecto.

#### Coste

La tecnología seleccionada deberá cumplir el objetivo económico establecido para AccessWay.

Se priorizarán tecnologías y herramientas que puedan utilizarse sin costes de licencia.

> **Coste objetivo del proyecto: 0 €**

#### Necesidades identificadas

A partir del análisis anterior, el frontend de AccessWay deberá ser capaz de:

- Proporcionar una interfaz web clara y sencilla.
- Comunicarse con el backend mediante una API REST.
- Gestionar las interfaces relacionadas con los usuarios.
- Trabajar con formularios.
- Integrar mapas y geolocalización.
- Mostrar rutas e incidencias.
- Adaptarse a diferentes dispositivos.
- Tener en cuenta criterios de accesibilidad.
- Mantener una estructura organizada y reutilizable.
- Integrarse con las tecnologías definidas para el backend.
- Mantener el objetivo de coste de **0 €**.

Estas necesidades servirán como base para analizar las tecnologías web que pueden utilizarse en el frontend de AccessWay.

### 8.2 HTML, CSS y JavaScript

Antes de analizar los frameworks frontend, es necesario conocer las tecnologías fundamentales sobre las que se construyen las aplicaciones web.

Las principales tecnologías utilizadas en el desarrollo frontend son **HTML, CSS y JavaScript**.

Cada una cumple una función diferente dentro de la aplicación.

#### HTML

**HTML (HyperText Markup Language)** es el lenguaje utilizado para definir la estructura y el contenido de una página web.

Mediante HTML se pueden definir elementos como:

- Títulos.
- Textos.
- Formularios.
- Botones.
- Enlaces.
- Imágenes.
- Listas.
- Secciones de una página.

En AccessWay, HTML formará parte de la estructura de las diferentes interfaces que se mostrarán al usuario.

Aunque posteriormente se utilizará React, los componentes de la aplicación web se basarán en elementos HTML.

#### CSS

**CSS (Cascading Style Sheets)** es el lenguaje utilizado para definir la presentación y el aspecto visual de una aplicación web.

Permite controlar aspectos como:

- Colores.
- Tipografías.
- Tamaños.
- Espaciado.
- Distribución de los elementos.
- Adaptación a diferentes tamaños de pantalla.
- Animaciones y transiciones.

En AccessWay, CSS se utilizará para construir una interfaz visual clara y responsive.

También permitirá adaptar la aplicación a teléfonos móviles, tablets y ordenadores.

#### JavaScript

**JavaScript** es un lenguaje de programación utilizado para añadir comportamiento e interacción a las páginas web.

Permite, entre otras cosas:

- Responder a las acciones del usuario.
- Modificar dinámicamente la interfaz.
- Validar información introducida en formularios.
- Realizar peticiones a servicios externos.
- Procesar información recibida desde una API.
- Gestionar diferentes estados de la aplicación.

JavaScript será especialmente relevante para AccessWay porque el frontend deberá comunicarse con el backend mediante la API REST.

#### Relación entre HTML, CSS y JavaScript

Estas tres tecnologías tienen responsabilidades diferentes:

```text
HTML
 ↓
Estructura y contenido

CSS
 ↓
Presentación y diseño

JavaScript
 ↓
Comportamiento e interacción
```

### 8.3 Frameworks frontend

A medida que las aplicaciones web aumentan su complejidad, utilizar únicamente HTML, CSS y JavaScript puede hacer que el código sea más difícil de organizar y mantener.

Para facilitar el desarrollo de interfaces más complejas existen diferentes herramientas y tecnologías frontend, entre ellas los frameworks y bibliotecas orientados a la construcción de interfaces de usuario.

Estas herramientas permiten establecer una estructura para organizar el código y facilitar el desarrollo de aplicaciones web.

#### ¿Qué es un framework frontend?

Un framework frontend proporciona una estructura y un conjunto de herramientas que facilitan el desarrollo de la parte visual e interactiva de una aplicación web.

Entre otras posibilidades, puede facilitar:

- La organización del código.
- La creación de componentes reutilizables.
- La gestión de la interfaz.
- La interacción con el usuario.
- La gestión del estado de la aplicación.
- La comunicación con APIs.
- El mantenimiento de aplicaciones de mayor tamaño.

El objetivo no es sustituir HTML, CSS y JavaScript, sino proporcionar una forma más estructurada de utilizarlos para construir aplicaciones web.

#### ¿Por qué utilizar una tecnología frontend en AccessWay?

AccessWay tendrá diferentes funcionalidades y pantallas que deberán interactuar entre sí.

Por ejemplo:

- Inicio de sesión.
- Registro de usuarios.
- Página principal.
- Mapa.
- Consulta de rutas.
- Registro de incidencias.
- Consulta de incidencias.
- Perfil del usuario.

Si cada una de estas funcionalidades se desarrollara directamente mediante código JavaScript independiente, podría resultar más difícil mantener una estructura organizada a medida que el proyecto creciera.

Una tecnología frontend basada en componentes permitirá organizar mejor estas partes de la aplicación.

#### Componentes reutilizables

Una de las características más importantes de las tecnologías frontend modernas es la posibilidad de trabajar con componentes reutilizables.

Por ejemplo, AccessWay podría tener componentes como:

```text
Aplicación
│
├── Barra de navegación
├── Mapa
├── Marcador de incidencia
├── Formulario de incidencia
├── Tarjeta de ruta
├── Perfil de usuario
└── Botones y elementos comunes
```
### 8.4 Alternativas de framework

   - #### 8.4.1 React

**React** es una biblioteca de JavaScript orientada a la creación de interfaces de usuario web mediante componentes reutilizables.

A diferencia de una página web tradicional, React permite dividir la interfaz en diferentes componentes que pueden recibir datos y actualizar su contenido cuando estos cambian.

Por ejemplo, en AccessWay podríamos tener componentes independientes para:

- Barra de navegación.
- Formulario de inicio de sesión.
- Mapa.
- Listado de incidencias.
- Formulario para registrar una incidencia.
- Información de una ruta.
- Perfil del usuario.

Estos componentes podrían combinarse para construir las diferentes pantallas de la aplicación.

#### Componentes

Uno de los conceptos fundamentales de React son los componentes.

Un componente representa una parte de la interfaz y puede reutilizarse en diferentes lugares de la aplicación.

De forma simplificada:

```text
AccessWay
│
├── Navegación
├── Mapa
├── Incidencias
│   ├── Lista de incidencias
│   └── Formulario de incidencia
└── Perfil
```

- #### 8.4.2 Angular

**Angular** es un framework de desarrollo web basado en TypeScript que permite crear aplicaciones web mediante una estructura organizada y basada en componentes.

A diferencia de React, que es una biblioteca centrada principalmente en la interfaz de usuario, Angular proporciona una estructura más completa para desarrollar aplicaciones web.

Angular incluye diferentes herramientas y funcionalidades integradas que permiten organizar aspectos habituales de una aplicación, como la navegación, los formularios, la comunicación con servicios y la gestión de diferentes partes de la aplicación.

#### Componentes

Al igual que React, Angular utiliza componentes para organizar la interfaz de usuario.

Cada componente puede representar una parte concreta de la aplicación y combinarse con otros componentes para construir interfaces más completas.

De forma simplificada, AccessWay podría organizarse de la siguiente manera:

```text
AccessWay
│
├── Navegación
├── Mapa
├── Incidencias
│   ├── Lista de incidencias
│   └── Formulario de incidencia
└── Perfil
```

- #### 8.4.3 Vue

**Vue** es un framework progresivo de JavaScript orientado al desarrollo de interfaces de usuario y aplicaciones web.

Al igual que React y Angular, Vue permite desarrollar aplicaciones mediante componentes reutilizables.

Su enfoque busca proporcionar una estructura sencilla para comenzar a desarrollar y, al mismo tiempo, permitir incorporar funcionalidades adicionales a medida que aumenta la complejidad de la aplicación.

#### Componentes

Vue utiliza componentes para dividir la interfaz en diferentes partes independientes y reutilizables.

De forma simplificada, AccessWay podría organizarse de la siguiente manera:

```text
AccessWay
│
├── Navegación
├── Mapa
├── Incidencias
│   ├── Lista de incidencias
│   └── Formulario de incidencia
└── Perfil
```
  
### 8.5 Comparación de alternativas frontend

Una vez analizadas las principales alternativas consideradas para el desarrollo del frontend de AccessWay, se realizará una comparación entre React, Angular y Vue.

La finalidad de esta comparación no será determinar cuál es la mejor tecnología en términos generales, sino identificar cuál se adapta mejor a las características y restricciones concretas de AccessWay.

Los principales criterios de decisión serán:

- Tiempo disponible para el desarrollo.
- Curva de aprendizaje.
- Experiencia previa con las tecnologías web.
- Facilidad de integración con Spring Boot y la API REST.
- Organización y mantenimiento del proyecto.
- Adecuación para una aplicación web responsive.
- Complejidad de la tecnología.
- Utilidad de los conocimientos adquiridos para el futuro profesional.
- Coste económico.

#### Comparación general

| Criterio | React | Angular | Vue |
|---|---|---|---|
| Tipo | Biblioteca de JavaScript | Framework | Framework progresivo |
| Lenguaje principal | JavaScript | TypeScript | JavaScript / TypeScript |
| Componentes | Sí | Sí | Sí |
| Reactividad | Sí | Sí | Sí |
| Integración con API REST | Sí | Sí | Sí |
| Integración con Spring Boot | Sí | Sí | Sí |
| Estructura integrada | Menor | Alta | Media |
| Flexibilidad | Alta | Media | Alta |
| Complejidad inicial | Media | Alta | Media |
| Coste de licencia | 0 € | 0 € | 0 € |

Esta comparación muestra que las tres alternativas son técnicamente compatibles con la arquitectura definida para AccessWay.

Por tanto, la decisión no dependerá de si una tecnología puede comunicarse con nuestro backend, ya que las tres pueden hacerlo.

La elección deberá centrarse principalmente en la adecuación de cada alternativa al proyecto y a los recursos disponibles.

#### React

React destaca por su flexibilidad y por su amplio ecosistema.

Su modelo basado en componentes resulta adecuado para construir las diferentes partes de la interfaz de AccessWay.

Sin embargo, al tratarse de una biblioteca y no de un framework completo, algunas decisiones relacionadas con la estructura de la aplicación y determinadas funcionalidades deberán realizarse utilizando herramientas adicionales.

Esto proporciona libertad, pero también puede aumentar el número de decisiones técnicas durante el desarrollo.

#### Angular

Angular proporciona una estructura más completa e integrada.

Esto puede facilitar la organización de una aplicación con diferentes funcionalidades y establece una forma más definida de desarrollar el proyecto.

Sin embargo, también incorpora una cantidad mayor de conceptos y herramientas que será necesario aprender.

Su utilización puede resultar especialmente interesante para proyectos empresariales de mayor tamaño, pero para AccessWay habrá que valorar si su nivel de estructura resulta necesario para el alcance previsto del MVP.

#### Vue

Vue presenta un enfoque progresivo y permite desarrollar interfaces mediante componentes.

Su sistema de reactividad y su integración con las tecnologías web habituales lo convierten en una alternativa adecuada para aplicaciones web dinámicas.

Además, permite comenzar con una estructura relativamente sencilla y aumentar la complejidad según las necesidades del proyecto.

#### Comparación según las necesidades de AccessWay

Teniendo en cuenta las características concretas del proyecto, la valoración inicial sería:

| Criterio | React | Angular | Vue |
|---|---|---|---|
| MVP en 3 meses | Buena | Buena | Buena |
| 10 h/semana | Buena | Media | Buena |
| Aprendizaje inicial | Medio | Alto | Medio |
| Integración con Spring Boot | Buena | Buena | Buena |
| Aplicación responsive | Buena | Buena | Buena |
| Complejidad para el MVP | Media | Alta | Media |
| Flexibilidad | Alta | Media | Alta |
| Coste | 0 € | 0 € | 0 € |
| Utilidad profesional | Alta | Alta | Buena |

Esta valoración es provisional y no pretende establecer una clasificación absoluta entre las tres tecnologías.

#### Consideración del tiempo disponible

El tiempo disponible es uno de los factores más importantes para AccessWay.

El proyecto contará inicialmente con aproximadamente **10 horas semanales**, por lo que será necesario evitar una tecnología que introduzca una complejidad innecesaria para alcanzar el MVP.

Esto no significa que deba elegirse necesariamente la tecnología más sencilla.

Será necesario encontrar un equilibrio entre:

**Facilidad de aprendizaje + capacidad técnica + utilidad profesional + tiempo disponible.**

#### Consideración profesional

Además de permitir finalizar AccessWay, el frontend seleccionado debe aportar conocimientos que puedan resultar útiles para la futura incorporación al mercado laboral.

Por este motivo, la demanda profesional de cada tecnología será considerada como uno de los criterios de decisión.

No obstante, este criterio no será el único determinante.

La prioridad seguirá siendo seleccionar una tecnología que permita desarrollar correctamente el proyecto dentro del tiempo disponible.

#### Coste

Las tres alternativas analizadas cumplen el requisito económico del proyecto.

No existen costes de licencia que hagan necesario descartar React, Angular o Vue.

Por tanto:

> **Coste de la tecnología frontend: 0 €**

El coste económico no será un factor diferenciador entre las tres alternativas.

### Valoración provisional

Después de realizar esta primera comparación, se considera que **React, Angular y Vue son opciones técnicamente válidas para AccessWay**.

La decisión definitiva se realizará teniendo en cuenta conjuntamente los criterios técnicos, el tiempo disponible para el desarrollo y la utilidad profesional de los conocimientos adquiridos.

La tecnología seleccionada deberá permitir desarrollar el MVP de AccessWay de forma realista con una dedicación aproximada de **10 horas semanales**, manteniendo al mismo tiempo una arquitectura organizada y preparada para futuras ampliaciones.

### 8.6 Tecnología frontend seleccionada

Después de analizar y comparar React, Angular y Vue, se selecciona **React** como tecnología principal para desarrollar el frontend de AccessWay.

La elección se realiza teniendo en cuenta las características concretas del proyecto y no únicamente las características generales de cada tecnología.

#### Motivos de la elección

React permite desarrollar interfaces web mediante componentes reutilizables, lo que encaja con la estructura prevista para AccessWay.

La aplicación podrá dividirse en diferentes componentes relacionados con las funcionalidades principales, como:

- Navegación.
- Mapa.
- Rutas.
- Incidencias.
- Formularios.
- Perfil de usuario.

Esta organización permitirá desarrollar cada parte de la interfaz de forma independiente y facilitará posteriormente su mantenimiento y evolución.

React utiliza JavaScript como base y permite utilizar JSX para combinar la lógica de los componentes con la estructura de la interfaz.

Esto resulta adecuado para AccessWay porque durante el ciclo de DAM ya se han trabajado tecnologías web como **HTML, CSS y JavaScript**.

#### Integración con el backend

React se integrará con el backend desarrollado mediante **Java y Spring Boot** utilizando la API REST definida en la arquitectura del proyecto.

La separación entre frontend y backend será:

```text
Usuario
   ↓
Interfaz web
   ↓
React
   ↓
API REST
   ↓
Spring Boot
   ↓
Service
   ↓
Repository
   ↓
Base de datos
```
### 8.7 Comunicación con la API REST

La aplicación web AccessWay necesitará comunicarse con el backend para enviar y recibir la información necesaria para el funcionamiento de sus diferentes funcionalidades.

La comunicación entre el frontend y el backend se realizará mediante una **API REST**, siguiendo la arquitectura definida anteriormente.

El frontend estará desarrollado inicialmente utilizando **React + JavaScript**, mientras que el backend utilizará **Java + Spring Boot**.

Durante el desarrollo se podrá valorar la incorporación de **TypeScript** si la evolución del proyecto hace recomendable su utilización.

El flujo general será:

```text
Usuario
   ↓
Frontend
React + JavaScript
   ↓
Petición HTTP
   ↓
API REST
   ↓
Spring Boot
   ↓
Service
   ↓
Repository
   ↓
Base de datos
```
### 8.8 Diseño responsive

AccessWay se desarrollará como una aplicación web responsive, de forma que pueda utilizarse desde diferentes dispositivos y tamaños de pantalla.

El objetivo será que la aplicación pueda utilizarse correctamente tanto desde un ordenador como desde un teléfono móvil o una tablet, adaptando la interfaz a las características de cada dispositivo.

Esto permitirá acceder a AccessWay desde un navegador web sin necesidad de instalar una aplicación específica en el dispositivo.

#### Objetivos del diseño responsive

El diseño responsive deberá permitir:

- Adaptar la interfaz a diferentes tamaños de pantalla.
- Mantener una navegación sencilla desde dispositivos móviles.
- Facilitar el uso de formularios y controles táctiles.
- Mantener una correcta visualización de mapas y rutas.
- Evitar desplazamientos horizontales innecesarios.
- Mantener una estructura visual clara en pantallas pequeñas.
- Aprovechar el espacio disponible en pantallas grandes.

#### Enfoque para AccessWay

La interfaz se diseñará inicialmente siguiendo un enfoque **mobile-first**.

Esto significa que se tendrá en cuenta desde el principio el uso de AccessWay en pantallas pequeñas y posteriormente se adaptará la interfaz a tamaños de pantalla mayores.

Este enfoque resulta especialmente adecuado para AccessWay debido a que una de las situaciones de uso previstas será acceder a la aplicación mientras el usuario se encuentra desplazándose por una ciudad.

Por ejemplo, un usuario podría utilizar AccessWay desde su teléfono móvil para:

- Consultar una ruta accesible.
- Consultar incidencias cercanas.
- Registrar una nueva incidencia.
- Consultar información sobre accesibilidad.

#### Adaptación de los componentes

Los componentes desarrollados con React deberán adaptarse al espacio disponible.

Por ejemplo, un elemento que pueda mostrarse horizontalmente en un ordenador podría organizarse verticalmente en un teléfono móvil.

De forma conceptual:

```text
ORDENADOR

[ Navegación ]

[ Mapa              ] [ Información ]
[                   ] [             ]


TELÉFONO

[ Navegación ]

[       Mapa        ]

[    Información    ]

[      Acciones     ]
```

#### Accesibilidad

El diseño responsive estará relacionado también con los objetivos de accesibilidad de AccessWay.

La interfaz deberá intentar facilitar su utilización por personas con diferentes necesidades.

Durante el desarrollo se tendrán en cuenta aspectos como:

- Tamaño adecuado de botones y elementos interactivos.
- Contraste suficiente entre texto y fondo.
- Legibilidad del contenido.
- Estructura clara de la información.
- Uso adecuado de etiquetas y elementos HTML.
- Navegación comprensible.
- Evitar depender exclusivamente del color para transmitir información.

Estas medidas se aplicarán de forma progresiva y se revisarán durante el desarrollo de la interfaz.

#### Pruebas en diferentes dispositivos

La aplicación deberá probarse en diferentes tamaños de pantalla para comprobar que la interfaz se adapta correctamente.

Inicialmente se tendrán en cuenta como mínimo:

- Ordenador.
- Tablet.
- Teléfono móvil.

Las pruebas podrán realizarse utilizando navegadores web y herramientas de desarrollo que permitan simular diferentes resoluciones de pantalla.

Durante el desarrollo se podrán incorporar dispositivos reales para comprobar el comportamiento de la aplicación en situaciones de uso más cercanas a las reales.

#### Decisión para AccessWay

AccessWay se desarrollará como una **aplicación web responsive**, utilizando:

- **React + TypeScript** para el frontend.
- **HTML y CSS** para la estructura y presentación.
- Diseño inicialmente orientado a dispositivos móviles.
- Adaptación posterior a tablet y ordenador.
- Pruebas en diferentes tamaños de pantalla.

El objetivo será conseguir una interfaz funcional, clara y adaptable sin introducir una complejidad innecesaria para el MVP.

La implementación concreta del diseño responsive se realizará durante los sprints de desarrollo del frontend.

### 8.9 Mapas y geolocalización

Los mapas y la geolocalización serán elementos importantes de AccessWay, ya que la aplicación estará orientada a facilitar la búsqueda y consulta de rutas accesibles y a permitir registrar incidencias asociadas a una ubicación concreta.

El sistema deberá permitir trabajar con información geográfica tanto para mostrarla al usuario como para utilizarla posteriormente en el cálculo y representación de rutas.

#### Objetivos

La funcionalidad de mapas y geolocalización deberá permitir inicialmente:

- Mostrar un mapa dentro de la aplicación web.
- Obtener la ubicación del usuario cuando este lo autorice.
- Mostrar la posición actual del usuario.
- Mostrar incidencias asociadas a determinadas ubicaciones.
- Representar puntos de interés o elementos relacionados con la accesibilidad.
- Mostrar rutas sobre el mapa.
- Permitir consultar información relacionada con una ubicación.
- Utilizar coordenadas geográficas para almacenar la posición de las incidencias.

#### Geolocalización del usuario

La aplicación web podrá solicitar al navegador acceso a la ubicación del dispositivo.

El usuario deberá conceder permiso para que AccessWay pueda utilizar su ubicación.

Cuando el permiso sea concedido, el navegador podrá proporcionar las coordenadas geográficas de la posición del dispositivo, que podrán utilizarse para mostrar la ubicación del usuario en el mapa y facilitar determinadas funcionalidades de la aplicación.

Por tanto, el usuario no tendrá que introducir manualmente sus coordenadas para utilizar la funcionalidad de geolocalización.

De forma simplificada:

```text
Usuario
   ↓
Navegador
   ↓
Permiso de ubicación
   ↓
Geolocalización
   ↓
Coordenadas
   ↓
AccessWay
```

### 8.10 Conclusión provisional

El estudio tecnológico realizado hasta este punto permite establecer una primera base tecnológica para el desarrollo de AccessWay como aplicación web.

A partir de las necesidades identificadas y de la comparación de diferentes alternativas, se han definido las principales tecnologías que formarán parte de la solución.

#### Arquitectura frontend

AccessWay se desarrollará como una **aplicación web responsive**, accesible desde un navegador y sin necesidad de instalar una aplicación específica en el dispositivo.

El frontend será desarrollado principalmente utilizando:

- **HTML** para la estructura de las interfaces.
- **CSS** para la presentación y el diseño responsive.
- **JavaScript** como lenguaje principal para la lógica e interacción del frontend.
- **React** para organizar la interfaz mediante componentes reutilizables.

Aunque React puede utilizarse junto con TypeScript, **TypeScript no será un requisito obligatorio para el proyecto**. Inicialmente se utilizará JavaScript para reducir la complejidad y facilitar el aprendizaje y desarrollo del MVP. Durante el desarrollo podrá valorarse la incorporación de TypeScript si aporta ventajas claras y resulta viable dentro del tiempo disponible.

#### Comunicación con el backend

El frontend se comunicará con el backend mediante una **API REST**.

La arquitectura general será:

```text
Usuario
   ↓
Aplicación web
   ↓
React + JavaScript
   ↓
API REST
   ↓
Spring Boot
   ↓
Service
   ↓
Repository
   ↓
PostgreSQL
```

