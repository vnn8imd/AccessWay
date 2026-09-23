# Diario de Desarrollo — AccessWay

Este documento recoge cronológicamente el trabajo realizado durante el desarrollo de AccessWay.

Su objetivo es registrar las tareas realizadas, las decisiones adoptadas, los problemas encontrados, las soluciones aplicadas y los conocimientos adquiridos.

A diferencia del documento `03_Decisiones Técnicas.md`, este diario se centra en el proceso real de desarrollo.

**Última actualización:** 23/09/2026

---

# 1. Preparación, configuración y comprobación del backend y la base de datos

Se continuó con la preparación del entorno de desarrollo de AccessWay.

Durante esta fase se realizaron las siguientes tareas:

- Se creó el proyecto backend mediante Spring Boot.
- Se configuró el proyecto para utilizar Java 21.
- Se verificó el funcionamiento de Maven mediante Maven Wrapper (`mvnw.cmd`).
- Se comprobó que Spring Boot podía compilar y ejecutar la aplicación.
- Se verificó la instalación de PostgreSQL 18.1.
- Se comprobó que el servidor PostgreSQL se encontraba activo y aceptaba conexiones en el puerto 5432.
- Se accedió correctamente a PostgreSQL mediante el usuario `postgres`.
- Se creó la base de datos inicial del proyecto con el nombre `accessway`.
- Se verificó que la base de datos utilizaba codificación UTF-8.

## 1.1. Comprobación de PostgreSQL

Se utilizó PowerShell para comprobar la instalación y el funcionamiento del servidor PostgreSQL.

Entre los comandos utilizados se encuentran:

```powershell
psql --version
```

Resultado:

```text
psql (PostgreSQL) 18.1
```

Para comprobar que el servidor aceptaba conexiones se utilizó:

```powershell
pg_isready
```

Posteriormente, se accedió a PostgreSQL mediante:

```powershell
psql -U postgres -d postgres
```

Se creó la base de datos `accessway` y se comprobó su configuración.

### Problema encontrado: advertencia de codificación

Durante el acceso a PostgreSQL apareció una advertencia relacionada con la diferencia entre el código de página de la consola y el código de página de Windows.

Esta advertencia no impidió el funcionamiento de PostgreSQL ni afectó al desarrollo inicial del proyecto.

Se decidió no modificar la configuración en ese momento y revisar la situación únicamente si aparecían problemas relacionados con caracteres especiales o codificación.

---

# 2. Configuración y comprobación de la conexión con PostgreSQL

Una vez creada la base de datos, se configuró el backend para utilizar PostgreSQL.

Las credenciales de acceso no se almacenaron directamente en el repositorio.

Para evitar exponer información sensible, se decidió utilizar variables de entorno.

El archivo `application.properties` se configuró para obtener los datos de conexión mediante las siguientes referencias:

```properties
spring.application.name=backend

spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

La propiedad `spring.jpa.hibernate.ddl-auto=update` permite que Hibernate actualice el esquema de la base de datos a partir de las entidades JPA detectadas.

Esta configuración se utiliza actualmente durante el desarrollo local.

Antes de iniciar la aplicación con nuevas entidades, será necesario revisar que su estructura sea coherente, ya que el arranque puede provocar modificaciones en el esquema de PostgreSQL.

## 2.1. Primera comprobación de Spring Boot

Se inició la aplicación Spring Boot y se comprobó correctamente su funcionamiento.

Durante esta comprobación se verificó que:

- Maven Wrapper compilaba y ejecutaba correctamente el proyecto.
- Spring Boot iniciaba correctamente el servidor web integrado.
- El servidor quedaba disponible en el puerto 8080.
- La aplicación podía establecer correctamente la conexión con PostgreSQL.
- El pool de conexiones HikariCP se inicializaba correctamente.

**HikariCP no se configuró manualmente.**

Su inicialización se produjo automáticamente como parte de la infraestructura utilizada por Spring Boot para gestionar las conexiones con la base de datos.

## 2.2. Primera comprobación desde el navegador

Se accedió a la dirección:

`http://localhost:8080/`

El navegador mostró una respuesta HTTP 404.

Este resultado era esperado porque todavía no se había creado ningún controlador ni endpoint que respondiera a la ruta raíz `/`.

La respuesta 404 no significaba que Spring Boot estuviera funcionando incorrectamente.

Significaba que el servidor estaba disponible, pero no existía una funcionalidad asociada a la dirección solicitada.

## 2.3. Detención de la aplicación

Finalmente, se detuvo la aplicación manualmente mediante:

```text
Ctrl + C
```

Spring Boot realizó un apagado controlado, cerrando el servidor web y el pool de conexiones con la base de datos sin producir errores.

---

# 3. Configuración permanente de las credenciales de la base de datos

Inicialmente, las variables necesarias para la conexión con PostgreSQL se configuraron temporalmente en una sesión de PowerShell.

Para facilitar el trabajo diario y evitar tener que volver a introducir la configuración cada vez que se abría una nueva terminal o se reiniciaba el equipo, las variables se configuraron posteriormente como variables de entorno de usuario permanentes de Windows.

Se configuraron las siguientes variables:

- `DB_URL`
- `DB_USERNAME`
- `DB_PASSWORD`

La contraseña de PostgreSQL no se almacena en el código fuente ni en el repositorio de GitHub.

El archivo `application.properties` utiliza estas variables para configurar la conexión con la base de datos.

Posteriormente, se cerró la sesión de PowerShell y se abrió una nueva terminal para comprobar que las variables permanecían disponibles.

Finalmente, se ejecutó nuevamente el backend mediante Maven Wrapper.

Spring Boot inició correctamente utilizando la configuración almacenada en las variables de entorno permanentes.

Se comprobó el inicio de la aplicación mediante el mensaje:

```text
Started BackendApplication
```

Con esta configuración, el entorno de desarrollo puede utilizarse sin necesidad de volver a introducir las credenciales de PostgreSQL cada vez que se abre una nueva terminal o se reinicia el equipo.

Este avance quedó registrado en el commit:

`f0b1ad9 — feat: configuracion como variables de usuario permanentes de Windows`

---

# 4. Creación y comprobación del primer endpoint REST

## 4.1. Creación del controlador

Una vez comprobada la configuración inicial del backend, se creó la carpeta `controller` dentro de la estructura principal del proyecto:

```text
backend/src/main/java/com/accessway/backend/controller
```

Dentro de esta carpeta se creó la clase:

`HealthController.java`

El controlador se implementó utilizando la anotación `@RestController`.

Se añadió un primer endpoint mediante `@GetMapping`.

El endpoint creado fue:

`GET /api/health`

Su objetivo en esta fase inicial era comprobar que el backend podía recibir una petición HTTP y devolver correctamente una respuesta.

La primera implementación devolvía una cadena de texto:

```java
@RestController
public class HealthController {

    @GetMapping("/api/health")
    public String health() {
        return "AccessWay backend funcionando correctamente";
    }
}
```

## 4.2. Comprobación de compilación y pruebas

Desde la carpeta raíz del proyecto:

```text
C:\Proyectos\AccessWay
```

Se ejecutó el siguiente comando:

```powershell
.\backend\mvnw.cmd -f .\backend\pom.xml test
```

La compilación y las pruebas finalizaron correctamente con el resultado:

```text
BUILD SUCCESS
```

Posteriormente, se arrancó el backend mediante:

```powershell
.\backend\mvnw.cmd -f .\backend\pom.xml spring-boot:run
```

## 4.3. Problema encontrado: ERR_CONNECTION_REFUSED

Durante la primera comprobación del endpoint desde el navegador apareció el error:

```text
ERR_CONNECTION_REFUSED
```

Se comprobó que el problema se debía a que el servidor Spring Boot no estaba ejecutándose en ese momento.

Para solucionarlo, se volvió a iniciar la aplicación mediante Maven Wrapper.

Una vez arrancado el servidor, se accedió nuevamente a:

`http://localhost:8080/api/health`

El endpoint respondió correctamente:

```text
AccessWay backend funcionando correctamente
```

### Aprendizaje

Durante el desarrollo local, el backend debe estar ejecutándose para que el navegador pueda comunicarse con sus endpoints.

Si el servidor no está iniciado, las peticiones a `localhost:8080` no pueden completarse.

Más adelante se configurará una forma más cómoda de iniciar el backend desde el entorno de desarrollo.

## 4.4. Registro en Git

La creación del primer endpoint quedó registrada en el commit:

`89ed836 — feat: crear primer endpoint`

Posteriormente, su documentación quedó registrada en:

`316d460 — docs: documentar primer endpoint REST`

---

# 5. Evolución del endpoint de estado: respuesta estructurada mediante DTO

Una vez comprobado el funcionamiento del primer endpoint REST, se decidió mejorar su respuesta.

Inicialmente, el controlador devolvía directamente una cadena de texto.

Se modificó para devolver información estructurada en formato JSON mediante un DTO.

## 5.1. Creación del DTO

Se creó el paquete:

```text
backend/src/main/java/com/accessway/backend/dto
```

Dentro de este paquete se creó la clase:

`HealthResponse.java`

Esta clase actúa como DTO (*Data Transfer Object*) y contiene los datos que el endpoint enviará al cliente:

- `status`
- `message`

Su implementación es:

```java
package com.accessway.backend.dto;

public class HealthResponse {

    private String status;
    private String message;

    public HealthResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
```

El DTO dispone de un constructor para inicializar los atributos y de sus correspondientes métodos `get`.

## 5.2. Modificación del controlador

El método `health()` de `HealthController` se modificó para devolver un objeto `HealthResponse`.

La nueva implementación es:

```java
package com.accessway.backend.controller;

import com.accessway.backend.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public HealthResponse health() {
        return new HealthResponse(
                "UP",
                "AccessWay backend funcionando correctamente"
        );
    }
}
```

El controlador ya no devuelve una cadena de texto simple.

Ahora devuelve un objeto Java con una estructura definida.

Spring Boot transforma este objeto en una respuesta JSON.

## 5.3. Comprobación del funcionamiento

Se ejecutaron nuevamente las pruebas mediante Maven Wrapper:

```powershell
.\backend\mvnw.cmd -f .\backend\pom.xml test
```

El resultado fue:

```text
Tests run: 1
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

Posteriormente, se inició Spring Boot y se accedió desde el navegador a:

`http://localhost:8080/api/health`

Se obtuvo la siguiente respuesta:

```json
{
  "status": "UP",
  "message": "AccessWay backend funcionando correctamente"
}
```

## 5.4. Aprendizaje

Se comprendió la diferencia entre devolver directamente una cadena de texto y devolver un objeto estructurado mediante un DTO.

También se comprobó cómo Spring Boot puede transformar automáticamente un objeto Java en una respuesta JSON.

Este avance permite preparar la estructura del backend para futuros endpoints relacionados con las funcionalidades reales de AccessWay.

## 5.5. Registro en Git

Este avance quedó registrado en el commit:

`453287e — feat: estructurar respuesta del endpoint health con DTO`

El commit se envió correctamente al repositorio remoto de GitHub.

---

# 6. Diseño del modelo inicial de incidencias de accesibilidad

Una vez comprobado el funcionamiento del backend y del primer endpoint REST, se comenzó a trabajar en la primera funcionalidad real de AccessWay.

Se decidió comenzar por el registro y la gestión de incidencias de accesibilidad.

Una incidencia representa un obstáculo que puede dificultar o impedir el desplazamiento de una persona con movilidad reducida.

## 6.1. Definición inicial de los datos

Se propuso que el usuario pudiera registrar:

- Una descripción del obstáculo.
- La ubicación.
- Una fotografía.
- Información relacionada con posibles rutas alternativas.

Durante el análisis se decidió que las rutas alternativas no debían almacenarse directamente como un atributo de cada incidencia.

Una incidencia debe describir el obstáculo y su ubicación.

El futuro sistema de cálculo de rutas será el encargado de utilizar esa información para intentar encontrar recorridos accesibles.

El modelo conceptual inicial quedó definido mediante los siguientes datos:

- Identificador.
- Tipo de incidencia.
- Descripción.
- Dirección.
- Latitud.
- Longitud.
- Fotografía.
- Fecha de creación.
- Estado.

## 6.2. Definición de los tipos de incidencia

Se decidió utilizar categorías controladas en lugar de permitir que cada usuario introdujera libremente el tipo de obstáculo.

Las categorías iniciales definidas fueron:

- `BLOQUEO_ACCESO`
- `OBRAS`
- `ESCALON_DESNIVEL`
- `ACERA_MAL_ESTADO`
- `FALTA_RAMPA`
- `ASCENSOR_FUERA_SERVICIO`
- `OTRO`

Estas categorías permitirán clasificar las incidencias de manera uniforme.

## 6.3. Definición de los estados

Para el MVP se decidió utilizar inicialmente dos estados:

- `ACTIVA`
- `RESUELTA`

Una incidencia nueva comenzará automáticamente con el estado `ACTIVA`.

Posteriormente, cuando el obstáculo desaparezca o se solucione, podrá pasar al estado `RESUELTA`.

## 6.4. Documentación y registro en Git

Las decisiones iniciales relacionadas con el modelo de incidencias se incorporaron al documento:

`03_Decisiones Técnicas.md`

Este avance quedó registrado en el commit:

`4cd14a2 — docs: definir modelo inicial de incidencias`

El commit se envió correctamente al repositorio remoto.

Después de este envío se comprobó que la rama local `main` estaba actualizada con `origin/main` y que el directorio de trabajo estaba limpio.

---

# 7. Creación de la primera entidad JPA: Incidencia

Después de definir el modelo conceptual, se comenzó su implementación en el backend.

Se creó el paquete:

```text
backend/src/main/java/com/accessway/backend/entity
```

Dentro de este paquete se crearon tres archivos:

```text
entity/
├── Incidencia.java
├── TipoIncidencia.java
└── EstadoIncidencia.java
```

## 7.1. Creación de Incidencia.java

Se creó la clase `Incidencia` y se añadió la anotación:

```java
@Entity
```

Esta anotación permite que JPA reconozca la clase como una entidad persistente.

Se comenzó definiendo su identificador:

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```

La anotación `@Id` identifica la clave primaria.

La estrategia `GenerationType.IDENTITY` permite delegar la generación del identificador en la base de datos.

Se utiliza el tipo `Long` porque permite representar el identificador como `null` antes de guardar la entidad.

También se incorporó un constructor sin parámetros:

```java
public Incidencia() {
}
```

Este constructor es necesario para que JPA pueda crear instancias de la entidad.

## 7.2. Incorporación de la descripción

Se añadió el atributo:

```java
private String descripcion;
```

Este atributo permitirá almacenar la explicación del obstáculo comunicada por el usuario.

Por ejemplo:

```text
Una furgoneta bloquea completamente la acera.
```

---

# 8. Creación de los enumerados

Para representar los tipos y estados de las incidencias se decidió utilizar enumerados de Java.

Un `enum` permite definir un conjunto limitado de valores.

Esta solución evita utilizar cadenas de texto arbitrarias para representar categorías que deben estar controladas.

## 8.1. TipoIncidencia

Se creó el archivo:

`TipoIncidencia.java`

Con el siguiente contenido:

```java
package com.accessway.backend.entity;

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

Posteriormente, se incorporó a la entidad `Incidencia`:

```java
@Enumerated(EnumType.STRING)
private TipoIncidencia tipo;
```

La anotación `@Enumerated(EnumType.STRING)` indica a JPA que debe almacenar el nombre del valor enumerado.

Por ejemplo:

```text
BLOQUEO_ACCESO
```

En lugar de almacenar su posición numérica.

## 8.2. EstadoIncidencia

Se creó el archivo:

`EstadoIncidencia.java`

Con el siguiente contenido:

```java
package com.accessway.backend.entity;

public enum EstadoIncidencia {

    ACTIVA,
    RESUELTA

}
```

Posteriormente, se incorporó a la entidad:

```java
@Enumerated(EnumType.STRING)
private EstadoIncidencia estado;
```

### Aprendizaje

Se comprendió la utilidad de los enumerados para representar conjuntos de valores controlados.

También se aprendió la función de `@Enumerated(EnumType.STRING)` y su importancia para almacenar los valores mediante nombres legibles.

---

# 9. Incorporación de la ubicación y decisión sobre geolocalización

Se continuó desarrollando la entidad `Incidencia` mediante la incorporación de los atributos relacionados con la ubicación del obstáculo.

Se añadieron:

```java
private String direccion;

private Double latitud;

private Double longitud;
```

Durante este paso surgió una cuestión importante relacionada con la experiencia del usuario.

Solicitar que una persona introduzca manualmente la latitud y la longitud de un obstáculo supondría una dificultad innecesaria.

Por ello, se decidió que AccessWay deberá ofrecer una forma más sencilla de proporcionar la ubicación.

## 9.1. Decisión adoptada

Se contemplan dos posibilidades:

1. Obtener automáticamente la ubicación actual del dispositivo, previa autorización del usuario.
2. Permitir seleccionar manualmente la ubicación del obstáculo sobre un mapa.

La segunda posibilidad también permitirá comunicar incidencias observadas anteriormente, cuando el usuario ya no se encuentre físicamente en el lugar del obstáculo.

Las coordenadas se conservarán como datos técnicos necesarios para identificar la posición de las incidencias y utilizarlas posteriormente en el cálculo de rutas.

### Aprendizaje

Se distinguió entre la información que necesita almacenar el backend y la forma en que el usuario debe proporcionar esa información.

Se decidió mantener los atributos `latitud` y `longitud` sin obligar al usuario a introducirlos manualmente.

### Estado actual

Los atributos están incorporados a la entidad.

La geolocalización automática y la selección de ubicaciones sobre un mapa todavía no están implementadas.

---

# 10. Incorporación de la fecha de creación

Se continuó completando la entidad mediante la incorporación de la fecha de creación de las incidencias.

Se decidió utilizar la clase `LocalDateTime` de Java.

Para ello, se añadió el siguiente import:

```java
import java.time.LocalDateTime;
```

Y se incorporó el atributo:

```java
private LocalDateTime fechaCreacion;
```

Se decidió que la fecha no debía introducirla manualmente el usuario.

El backend será el encargado de asignarla automáticamente cuando JPA vaya a guardar una incidencia nueva.

---

# 11. Automatización de la fecha de creación mediante @PrePersist

Para asignar automáticamente la fecha de creación se decidió utilizar la anotación:

```java
@PrePersist
```

Se añadió el import correspondiente:

```java
import jakarta.persistence.PrePersist;
```

Esta anotación permite ejecutar un método antes de que JPA inserte por primera vez una entidad en la base de datos.

## 11.1. Primer intento

Inicialmente, se añadió el método `prePersist()` dentro del constructor de la entidad.

El código quedó de la siguiente manera:

```java
public Incidencia() {
    @PrePersist
    public void prePersist() {
        fechaCreacion = LocalDateTime.now();
    }
}
```

Esta estructura era incorrecta.

En Java no se puede declarar un método dentro de otro método o constructor.

## 11.2. Corrección del problema

Se revisó la estructura de las llaves y se trasladó el método `prePersist()` fuera del constructor.

El código corregido quedó así:

```java
public Incidencia() {
}

@PrePersist
public void prePersist() {
    fechaCreacion = LocalDateTime.now();
}
```

De esta manera, el constructor y el método quedaron correctamente definidos al mismo nivel dentro de la clase.

### Aprendizaje

Este problema permitió comprender mejor la estructura de una clase Java y la importancia de colocar correctamente las llaves.

También permitió diferenciar el constructor de una clase de los métodos que forman parte de ella.

---

# 12. Automatización del estado inicial ACTIVA

Una vez corregido el método `prePersist()`, se decidió aprovecharlo para asignar también el estado inicial de las incidencias.

Se modificó el método para que realizara ambas operaciones:

```java
@PrePersist
public void prePersist() {
    fechaCreacion = LocalDateTime.now();
    estado = EstadoIncidencia.ACTIVA;
}
```

De esta manera, cuando JPA vaya a guardar por primera vez una incidencia:

1. Se asignará automáticamente la fecha y hora de creación.
2. Se establecerá el estado inicial `ACTIVA`.

El usuario no tendrá que introducir manualmente ninguno de estos dos datos.

## 12.1. Comprobación del código

Se guardaron los cambios y se comprobó el contenido del archivo mediante PowerShell.

Desde la carpeta raíz del proyecto:

```text
C:\Proyectos\AccessWay
```

Se ejecutó:

```powershell
Get-Content .\backend\src\main\java\com\accessway\backend\entity\Incidencia.java
```

Se comprobó que el método estaba correctamente situado fuera del constructor y que contenía las dos asignaciones previstas.

### Estado actual

El método está implementado.

Todavía no se ha comprobado su ejecución mediante una prueba de persistencia.

---

# 13. Estado actual de la entidad Incidencia

**Fecha: 23/09/2026**

Al finalizar esta sesión, la clase `Incidencia.java` contiene el siguiente código:

```java
package com.accessway.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

@Entity
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @Enumerated(EnumType.STRING)
    private TipoIncidencia tipo;

    @Enumerated(EnumType.STRING)
    private EstadoIncidencia estado;

    private String direccion;

    private Double latitud;

    private Double longitud;

    private LocalDateTime fechaCreacion;

    public Incidencia() {
    }

    @PrePersist
    public void prePersist() {
        fechaCreacion = LocalDateTime.now();
        estado = EstadoIncidencia.ACTIVA;
    }
}
```

La clase dispone actualmente de:

- Un identificador único.
- Una descripción.
- Un tipo de incidencia.
- Un estado.
- Una dirección.
- Coordenadas geográficas.
- Una fecha de creación.
- Un constructor sin parámetros.
- Un método para asignar automáticamente la fecha y el estado inicial.

Todavía no se han incorporado los atributos relacionados con las fotografías.

Tampoco se han implementado el repositorio, el servicio ni los endpoints REST asociados a las incidencias.

---

# 14. Situación actual y próximos pasos

**Fecha de actualización: 23/09/2026**

El backend de AccessWay dispone actualmente de:

- Proyecto Spring Boot configurado.
- Java 21 definido en `pom.xml`.
- Maven Wrapper.
- PostgreSQL 18.1.
- Base de datos `accessway`.
- Credenciales configuradas mediante variables de usuario permanentes de Windows.
- Primer endpoint REST funcional.
- DTO `HealthResponse`.
- Modelo conceptual inicial de incidencias.
- Entidad JPA `Incidencia` en desarrollo.
- Enumerados `TipoIncidencia` y `EstadoIncidencia`.
- Asignación automática de la fecha de creación y del estado inicial.

## Próximos pasos

### 1. Estudiar el almacenamiento de fotografías

Antes de continuar programando, se estudiarán las alternativas para almacenar las fotografías que los usuarios puedan adjuntar a las incidencias.

Se analizarán las ventajas e inconvenientes de guardar las imágenes directamente en PostgreSQL frente a almacenarlas por separado y conservar únicamente una referencia en la base de datos.

La decisión deberá tener en cuenta el presupuesto inicial de 0 €.

### 2. Completar la entidad

Una vez tomada la decisión sobre las fotografías, se continuará completando la entidad `Incidencia`.

### 3. Comprobar el código

Se ejecutarán la compilación y las pruebas correspondientes para comprobar los cambios realizados.

### 4. Comprobar la persistencia

Se iniciará Spring Boot y se comprobará la creación de la tabla de incidencias en PostgreSQL.

También se comprobará el funcionamiento de la asignación automática de la fecha de creación y del estado inicial.

### 5. Registrar los cambios en Git

Los cambios recientes relacionados con la entidad todavía no se han incorporado a un nuevo commit.

Una vez comprobados, se registrarán en Git y se enviarán al repositorio remoto de GitHub.

### 6. Continuar con la arquitectura del backend

Posteriormente, se comenzará a trabajar en:

- El repositorio de incidencias.
- La capa de servicio.
- Los DTOs necesarios.
- Los primeros endpoints REST para registrar y consultar incidencias.

Cada avance se realizará progresivamente y se documentará en este diario.