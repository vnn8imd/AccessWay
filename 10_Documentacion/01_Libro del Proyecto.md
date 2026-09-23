# 01. Libro del Proyecto

**Proyecto:** AccessWay  
**Ciclo formativo:** Desarrollo de Aplicaciones Multiplataforma (DAM)  
**Última actualización:** 23/09/2026  
**Estado:** Documento en desarrollo

---

## 1. Introducción

AccessWay es un proyecto de desarrollo de software orientado a facilitar la movilidad de personas que utilizan silla de ruedas o presentan otras dificultades de movilidad.

La aplicación pretende proporcionar información útil sobre la accesibilidad de los desplazamientos urbanos, teniendo en cuenta los obstáculos que pueden encontrarse durante un recorrido.

El proyecto contempla una aplicación web desde la que los usuarios puedan consultar información sobre accesibilidad y comunicar incidencias relacionadas con el estado de las vías y los elementos urbanos.

AccessWay se desarrollará progresivamente, comenzando por un producto mínimo viable (MVP).

---

## 2. Justificación del proyecto

Los desplazamientos urbanos pueden presentar dificultades para las personas con movilidad reducida.

La existencia de escalones, aceras deterioradas, obras, rampas inexistentes u otros obstáculos puede impedir o dificultar determinados recorridos.

Además, la información disponible sobre estos problemas no siempre está actualizada.

AccessWay nace con el propósito de estudiar cómo una aplicación colaborativa puede ayudar a comunicar incidencias de accesibilidad y utilizar esa información para facilitar la planificación de desplazamientos.

El proyecto también permitirá aplicar los conocimientos adquiridos durante el ciclo de DAM y profundizar en tecnologías de desarrollo backend, bases de datos y aplicaciones web.

---

## 3. Objetivos

### 3.1. Objetivo general

Desarrollar una aplicación que contribuya a facilitar los desplazamientos de personas con movilidad reducida mediante información sobre rutas e incidencias de accesibilidad.

### 3.2. Objetivos específicos

- Diseñar una aplicación accesible y adaptable a distintos dispositivos.
- Permitir registrar incidencias relacionadas con obstáculos de accesibilidad.
- Asociar las incidencias a una ubicación geográfica.
- Permitir consultar las incidencias registradas.
- Incorporar mapas para representar información geográfica.
- Estudiar el cálculo de rutas que tenga en cuenta las necesidades de accesibilidad.
- Aplicar una arquitectura organizada que facilite el mantenimiento del proyecto.
- Incorporar mecanismos adecuados de seguridad.
- Documentar el desarrollo y las decisiones técnicas.

La implementación de estos objetivos se realizará progresivamente.

---

## 4. Alcance del proyecto

AccessWay se plantea inicialmente como una aplicación web responsive.

La aplicación deberá poder utilizarse desde navegadores de ordenadores, tablets y teléfonos móviles.

El desarrollo se organizará mediante un MVP para evitar abordar simultáneamente todas las funcionalidades previstas.

### 4.1. Funcionalidades contempladas

- Registro y consulta de incidencias.
- Asociación de incidencias a ubicaciones.
- Visualización de información sobre mapas.
- Gestión de usuarios.
- Consulta de rutas.
- Consideración de obstáculos en los desplazamientos.

### 4.2. Posibles ampliaciones

En futuras fases podrán estudiarse:

- Preferencias de rutas.
- Priorización de recorridos con menor pendiente.
- Preferencias relacionadas con la sombra.
- Validación comunitaria de incidencias.
- Clasificación de obstáculos mediante inteligencia artificial.

Estas posibilidades no se consideran funcionalidades implementadas.

---

## 5. Requisitos iniciales

### 5.1. Requisitos funcionales

Entre los requisitos funcionales inicialmente identificados se encuentran:

**RF01.** El sistema deberá permitir registrar incidencias de accesibilidad.

**RF02.** Cada incidencia deberá estar asociada a un tipo.

**RF03.** Cada incidencia deberá tener un estado.

**RF04.** El sistema deberá permitir asociar una ubicación a las incidencias.

**RF05.** El sistema deberá permitir consultar las incidencias registradas.

**RF06.** La aplicación deberá permitir representar información geográfica.

**RF07.** Se estudiará la incorporación de funcionalidades para consultar rutas accesibles.

La numeración y el alcance de estos requisitos podrán revisarse durante el desarrollo.

### 5.2. Requisitos no funcionales

- La aplicación deberá tener una estructura mantenible.
- Se utilizarán tecnologías que permitan mantener un coste inicial de 0 €.
- La interfaz deberá adaptarse a diferentes tamaños de pantalla.
- Se tendrán en cuenta criterios de accesibilidad.
- La comunicación entre frontend y backend se realizará mediante una API REST.
- Se deberán proteger las credenciales y los datos sensibles.
- El código se mantendrá bajo control de versiones.

---

## 6. Arquitectura general

AccessWay utilizará una arquitectura que separará la aplicación web, el backend y la base de datos.

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
                 BACKEND
                     |
                     v
                POSTGRESQL
```

El backend seguirá una arquitectura por capas:

```text
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

Esta es la arquitectura prevista para las funcionalidades que requieren persistencia.

Actualmente, la implementación de las capas específicas de incidencias todavía no está completa.

---

## 7. Tecnologías seleccionadas

### 7.1. Backend

- Java 21 como versión objetivo.
- Spring Boot 4.1.1.
- API REST.
- Maven.
- JPA.

### 7.2. Base de datos

- PostgreSQL 18.1.

### 7.3. Frontend

Se ha seleccionado React como tecnología principal.

La elección definitiva entre JavaScript y TypeScript deberá confirmarse antes de crear el proyecto frontend.

### 7.4. Herramientas

- IntelliJ IDEA.
- Git.
- GitHub.
- Obsidian.

La justificación de estas tecnologías se encuentra en `05_Estudio Tecnológico`.

---

## 8. Diseño inicial de los datos

La primera entidad del dominio de AccessWay es `Incidencia`.

Su finalidad es representar un problema de accesibilidad comunicado por un usuario.

### 8.1. Atributos actuales

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

### 8.2. Tipos de incidencia

Se ha creado el enumerado `TipoIncidencia` con los siguientes valores:

- BLOQUEO_ACCESO.
- OBRAS.
- ESCALON_DESNIVEL.
- ACERA_MAL_ESTADO.
- FALTA_RAMPA.
- ASCENSOR_FUERA_SERVICIO.
- OTRO.

### 8.3. Estados

Se ha creado el enumerado `EstadoIncidencia`:

- ACTIVA.
- RESUELTA.

El estado inicial previsto para una nueva incidencia es `ACTIVA`.

### 8.4. Ubicación

Las incidencias dispondrán de información geográfica.

El usuario no tendrá que introducir manualmente las coordenadas.

Se contempla obtener la ubicación del dispositivo, con autorización del usuario, o permitir seleccionar la ubicación del obstáculo sobre un mapa.

### 8.5. Fotografías

La posibilidad de adjuntar fotografías forma parte de las funcionalidades contempladas.

Todavía no se ha decidido cómo se almacenarán las imágenes.

Esta cuestión deberá resolverse antes de incorporar los atributos correspondientes a la entidad.

---

## 9. Desarrollo realizado

### 9.1. Inicialización del proyecto

Se ha creado el repositorio AccessWay y se ha inicializado el backend.

Se ha configurado el proyecto con Java, Spring Boot y Maven.

### 9.2. Base de datos

Se ha instalado PostgreSQL y se ha creado la base de datos `accessway`.

Se ha configurado la conexión con Spring Boot mediante variables de entorno.

La conexión se ha comprobado correctamente.

### 9.3. Primer endpoint REST

Se ha implementado:

`GET /api/health`

El endpoint permite comprobar que el backend recibe peticiones HTTP y devuelve respuestas.

### 9.4. Primer DTO

Se ha creado `HealthResponse`.

El endpoint de comprobación devuelve actualmente:

```json
{
  "status": "UP",
  "message": "AccessWay backend funcionando correctamente"
}
```

Esta implementación se ha probado correctamente.

### 9.5. Primera entidad

Se ha comenzado a desarrollar la entidad `Incidencia`.

También se han creado los enumerados `TipoIncidencia` y `EstadoIncidencia`.

La entidad incorpora un método `prePersist()` para asignar automáticamente la fecha de creación y el estado inicial.

Todavía no se ha comprobado su persistencia en PostgreSQL.

---

## 10. Pruebas realizadas

Hasta la fecha se ha comprobado:

- La conexión entre Spring Boot y PostgreSQL.
- El arranque del backend.
- El funcionamiento del endpoint `/api/health`.
- La respuesta JSON mediante `HealthResponse`.
- La ejecución correcta de las pruebas anteriores a la incorporación de la entidad `Incidencia`.

Quedan pendientes las pruebas relacionadas con la persistencia de incidencias.

---

## 11. Seguridad

La seguridad se incorporará progresivamente.

Se ha planteado estudiar Spring Security, JWT y BCrypt.

Actualmente, las credenciales de PostgreSQL se gestionan mediante variables de entorno y no se incluyen directamente en el código fuente.

La autenticación y autorización de usuarios todavía no están implementadas.

---

## 12. Metodología

El desarrollo se organizará mediante Scrum adaptado a un proyecto individual y Kanban para visualizar las tareas.

Se utilizarán Git y GitHub para controlar las versiones del código.

Obsidian será la herramienta principal de documentación.

El procedimiento habitual consistirá en:

1. Comprender el objetivo.
2. Analizar las alternativas.
3. Implementar.
4. Comprobar.
5. Documentar.
6. Registrar los cambios.

La metodología se explica detalladamente en `06_Metodología y Herramientas`.

---

## 13. Estado actual del proyecto

**Fecha: 23/09/2026**

### Implementado y comprobado

- Inicialización del backend.
- Conexión con PostgreSQL.
- Configuración de variables de entorno.
- Primer endpoint REST.
- DTO `HealthResponse`.

### En desarrollo

- Entidad `Incidencia`.
- Modelo inicial de incidencias.

### Pendiente

- Decisión sobre almacenamiento de fotografías.
- Comprobación de la persistencia de incidencias.
- Repository de incidencias.
- Service de incidencias.
- Controller de incidencias.
- Endpoints de incidencias.
- Seguridad de usuarios.
- Frontend.
- Integración de mapas.
- Cálculo de rutas.

---

## 14. Resultados y conclusiones

Este apartado se completará progresivamente conforme se implementen y comprueben las funcionalidades del proyecto.

La conclusión definitiva se redactará cuando se disponga de los resultados finales del desarrollo y de las pruebas correspondientes.