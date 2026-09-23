# 04. Glosario

**Proyecto:** AccessWay  
**Última actualización:** 23/09/2026  
**Estado:** Documento en evolución

---

## 1. Java

### Clase

Estructura que permite definir atributos y métodos.

**Ejemplo en AccessWay:** `Incidencia`.

### Objeto

Instancia de una clase.

**Ejemplo:** un objeto `Incidencia` representa una incidencia concreta.

### Atributo

Variable que forma parte de una clase y representa una característica de sus objetos.

**Ejemplo:**

```java
private String descripcion;
```

### Método

Bloque de código que realiza una operación.

**Ejemplo:** `prePersist()`.

### Constructor

Elemento que permite inicializar los objetos de una clase.

**Ejemplo:**

```java
public Incidencia() {

}
```

### Enumerado

Tipo de Java que permite definir un conjunto limitado de valores.

**Ejemplo:** `EstadoIncidencia`.

### LocalDateTime

Clase de Java que permite representar una fecha y una hora sin información de zona horaria.

**Ejemplo:**

```java
LocalDateTime.now();
```

### Getter

Método que permite obtener el valor de un atributo.

### Setter

Método que permite modificar el valor de un atributo.

---

## 2. Spring Boot

### Framework

Conjunto de herramientas y estructuras que facilita el desarrollo de aplicaciones.

### Spring Boot

Tecnología del ecosistema Spring utilizada para crear y ejecutar el backend de AccessWay.

### Controller

Componente encargado de recibir peticiones HTTP y devolver respuestas.

**Ejemplo:** `HealthController`.

### @RestController

Anotación que permite definir un controlador cuyas respuestas se envían directamente al cliente.

### @GetMapping

Anotación que permite asociar una petición HTTP GET a un método.

**Ejemplo:**

```java
@GetMapping("/api/health")
```

### Endpoint

Punto de acceso de una API que permite realizar una operación concreta.

**Ejemplo:**

`GET /api/health`

### Service

Capa destinada a implementar la lógica de negocio.

### Repository

Capa encargada de realizar operaciones de acceso a los datos.

---

## 3. API REST

### API

Interfaz que permite que diferentes aplicaciones o componentes se comuniquen.

### REST

Estilo de arquitectura utilizado para diseñar servicios web.

### HTTP

Protocolo utilizado para intercambiar información entre clientes y servidores.

### GET

Método HTTP utilizado habitualmente para consultar información.

### POST

Método HTTP utilizado habitualmente para enviar información y crear recursos.

### PUT

Método HTTP utilizado habitualmente para actualizar recursos.

### DELETE

Método HTTP utilizado habitualmente para eliminar recursos.

### JSON

Formato de texto utilizado para representar e intercambiar datos.

**Ejemplo:**

```json
{
  "status": "UP"
}
```

### DTO

*Data Transfer Object*.

Objeto utilizado para transportar información entre diferentes partes de una aplicación.

**Ejemplo:** `HealthResponse`.

---

## 4. Persistencia y JPA

### Persistencia

Capacidad de almacenar información para que permanezca disponible después de finalizar la ejecución de una aplicación.

### JPA

Especificación de Java para gestionar la persistencia de datos.

### Entidad

Clase que representa información que puede almacenarse en una base de datos.

**Ejemplo:** `Incidencia`.

### @Entity

Anotación que identifica una clase como entidad JPA.

### @Id

Anotación que identifica el atributo utilizado como clave primaria de una entidad.

### @GeneratedValue

Anotación que permite configurar la generación automática de identificadores.

### GenerationType.IDENTITY

Estrategia que utiliza un mecanismo de generación de identificadores proporcionado por la base de datos.

### @Enumerated

Anotación que permite configurar cómo se almacena un enumerado.

### EnumType.STRING

Indica que el enumerado debe almacenarse utilizando el nombre de su valor.

### @PrePersist

Anotación que identifica un método que debe ejecutarse antes de insertar por primera vez una entidad en la base de datos.

**Ejemplo en AccessWay:**

```java
@PrePersist
public void prePersist() {
    fechaCreacion = LocalDateTime.now();
    estado = EstadoIncidencia.ACTIVA;
}
```

---

## 5. Bases de datos

### PostgreSQL

Sistema de gestión de bases de datos relacionales utilizado por AccessWay.

### SQL

Lenguaje utilizado para consultar y gestionar información en bases de datos relacionales.

### Base de datos

Conjunto organizado de información almacenada.

**Ejemplo:** `accessway`.

### Tabla

Estructura de una base de datos relacional formada por filas y columnas.

### Clave primaria

Campo que permite identificar de forma única cada registro de una tabla.

### HikariCP

Pool de conexiones utilizado para gestionar las conexiones con la base de datos.

En AccessWay se inicializa automáticamente mediante la infraestructura de Spring Boot.

---

## 6. Maven

### Maven

Herramienta que permite gestionar dependencias y automatizar la construcción de proyectos Java.

### pom.xml

Archivo principal de configuración de Maven.

### Dependencia

Biblioteca o componente externo que necesita una aplicación.

### Maven Wrapper

Mecanismo que permite ejecutar la versión de Maven configurada para un proyecto.

### Compilación

Proceso mediante el cual se transforma el código fuente en una representación ejecutable por la plataforma correspondiente.

### Test

Prueba utilizada para comprobar el comportamiento de una parte de la aplicación.

---

## 7. Git y GitHub

### Git

Sistema de control de versiones utilizado para registrar los cambios del proyecto.

### GitHub

Plataforma utilizada para alojar el repositorio remoto de AccessWay.

### Repositorio

Espacio que contiene los archivos de un proyecto y su historial de versiones.

### Commit

Registro de un conjunto de cambios en Git.

### Push

Operación utilizada para enviar los commits locales a un repositorio remoto.

### Rama

Línea de desarrollo dentro de un repositorio Git.

**Ejemplo:** `main`.

### git status

Comando que permite consultar el estado de los archivos del repositorio.

---

## 8. Geolocalización

### Geolocalización

Proceso que permite obtener o determinar una ubicación geográfica.

### Latitud

Coordenada que representa la posición norte-sur de un punto.

### Longitud

Coordenada que representa la posición este-oeste de un punto.

### Coordenadas geográficas

Valores que permiten representar una ubicación sobre la superficie terrestre.

### Ubicación del dispositivo

Posición que puede proporcionar un dispositivo cuando el usuario concede los permisos necesarios.

---

## 9. Metodología

### Scrum

Marco de trabajo ágil utilizado como referencia para organizar el desarrollo de AccessWay.

### Sprint

Periodo de trabajo durante el cual se desarrolla una parte concreta del proyecto.

### Product Backlog

Lista ordenada de necesidades y trabajos pendientes del producto.

### Sprint Backlog

Conjunto de trabajos seleccionados para un sprint.

### Sprint Goal

Objetivo que se pretende alcanzar durante un sprint.

### Kanban

Método de gestión visual del trabajo mediante un tablero.

### WIP

*Work In Progress*.

Cantidad de trabajo que se encuentra actualmente en desarrollo.

### MVP

*Minimum Viable Product* o producto mínimo viable.

Versión inicial de un producto que contiene las funcionalidades necesarias para comprobar su propuesta principal.

---

## 10. Documentación

### Markdown

Lenguaje de marcado ligero utilizado para estructurar documentos de texto.

### Obsidian

Herramienta utilizada para organizar la documentación de AccessWay.

### Diario de Desarrollo

Documento que recoge cronológicamente los avances, problemas, soluciones y aprendizajes del proyecto.

### Decisión técnica

Elección relacionada con el diseño o la implementación del sistema, acompañada de su justificación.

---

## 11. Conceptos pendientes de incorporar

Este apartado se completará a medida que se estudien e implementen nuevas tecnologías.

Entre los conceptos que probablemente necesitaremos se encuentran:

- Spring Security.
- JWT.
- BCrypt.
- React.
- JavaScript y TypeScript.
- Tecnologías de mapas.
- Almacenamiento de fotografías.
- Pruebas de integración.

No se desarrollarán estas entradas hasta que abordemos los conceptos correspondientes.