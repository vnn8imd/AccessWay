# AccessWay

> **Proyecto Final de DAM: plataforma colaborativa para la planificación de rutas accesibles.**
>
> AccessWay es una aplicación orientada a facilitar los desplazamientos de personas con movilidad reducida mediante información sobre obstáculos urbanos, incidencias de accesibilidad y, progresivamente, rutas adaptadas a sus necesidades.

**Última sesión de trabajo:** 23/09/2026

---

## Estado del proyecto

| Apartado | Estado |
|---|---|
| Fase actual | Desarrollo inicial del backend |
| Sprint 0 | Finalizado |
| Próximo sprint | Pendiente de planificación |
| Backend | En desarrollo |
| Base de datos | Configurada y conectada |
| Frontend | Pendiente de implementación |
| Documentación | Actualizada |
| Repositorio GitHub | Creado y actualizado |

**Última actualización:** 23/09/2026

### Situación actual

Se ha completado la configuración inicial del backend y se ha comprobado su conexión con PostgreSQL.

El primer endpoint REST está implementado y funciona correctamente.

Actualmente estamos desarrollando la primera entidad del proyecto: `Incidencia`.

La entidad está creada, pero todavía tenemos que completar su implementación y comprobar su persistencia en PostgreSQL.

---

## Documentación principal

Los seis documentos principales se encuentran en la carpeta `10_Documentacion`.

- [[01_Libro del Proyecto]]
- [[02_Diario de Desarrollo]]
- [[03_Decisiones Técnicas]]
- [[04_Glosario]]
- [[05_Estudio Tecnológico]]
- [[06_Metodología y herramientas]]

### Estado de la documentación

Los seis documentos se han revisado y actualizado con la información disponible hasta el 23/09/2026.

La actualización quedó registrada en Git y se envió a GitHub mediante el commit:

`ae24582 — docs: actualizar y unificar los seis documentos de AccessWay`

A partir de ahora, la documentación se revisará después de cada avance relevante del proyecto.

---

## Organización por sprints

### Sprint 0 — Definición y planificación inicial

**Estado:** Finalizado.

Durante esta fase se definieron las bases de AccessWay:

- Problema que pretende resolver.
- Usuarios a los que se dirige.
- Objetivos generales y específicos.
- Alcance inicial.
- Producto mínimo viable.
- Posibles ampliaciones.
- Organización inicial de la documentación.

**Documentación del sprint:**

- [[01_Objetivos]]
- [[02_Trabajo realizado]]
- [[03_Conclusiones]]
- [[04_Version]]

### Próximo sprint

Pendiente de planificación.

El siguiente periodo de trabajo deberá organizarse teniendo en cuenta el estado actual del backend y las tareas necesarias para completar la gestión inicial de incidencias.

---

## Desarrollo del backend

### Tecnologías actuales

| Tecnología | Estado |
|---|---|
| Java 21 | Versión objetivo del proyecto |
| Spring Boot 4.1.1 | Configurado |
| Maven | Configurado |
| API REST | Primer endpoint implementado |
| PostgreSQL 18.1 | Instalado y conectado |
| JPA | Incorporado al proyecto |
| Git | En uso |
| GitHub | En uso |

### Funcionalidades comprobadas

- Inicialización del backend.
- Configuración de Maven Wrapper.
- Conexión con PostgreSQL.
- Gestión de credenciales mediante variables de entorno.
- Primer endpoint REST.
- Respuesta JSON mediante el DTO `HealthResponse`.

### Funcionalidad en desarrollo

**Gestión de incidencias de accesibilidad.**

Se han creado los siguientes archivos:

- `Incidencia.java`
- `TipoIncidencia.java`
- `EstadoIncidencia.java`

La entidad incorpora los atributos iniciales y un método `prePersist()` para asignar automáticamente la fecha de creación y el estado `ACTIVA`.

Todavía no se ha comprobado su persistencia en PostgreSQL.

---

## Próximas tareas

### Prioridad actual

- [ ] Estudiar las alternativas para almacenar fotografías.
- [ ] Elegir una solución compatible con el presupuesto de 0 €.
- [ ] Completar la entidad `Incidencia`.
- [ ] Ejecutar la compilación y las pruebas correspondientes.
- [ ] Comprobar la persistencia de incidencias en PostgreSQL.
- [ ] Registrar los cambios de la entidad en Git.
- [ ] Enviar el nuevo commit a GitHub.

### Desarrollo posterior

- [ ] Crear el repositorio de incidencias.
- [ ] Implementar la capa de servicio.
- [ ] Diseñar los DTOs necesarios.
- [ ] Crear los endpoints REST de incidencias.
- [ ] Implementar las pruebas correspondientes.

---

## Decisiones pendientes

### Frontend

Se ha seleccionado React.

Queda pendiente confirmar si utilizaremos JavaScript o TypeScript.

### Fotografías

Debemos decidir si almacenaremos las fotografías directamente en PostgreSQL o si utilizaremos un almacenamiento independiente.

### Mapas y geolocalización

La aplicación deberá permitir obtener la ubicación del dispositivo, con autorización del usuario, o seleccionar la posición de un obstáculo sobre un mapa.

La tecnología definitiva todavía no está seleccionada.

### Organización de tareas

Debemos confirmar la herramienta que utilizaremos para nuestro tablero Kanban.

---

## Investigación

Carpeta: `30_Investigacion`

### Próxima investigación

**Almacenamiento de fotografías de incidencias.**

Se estudiarán:

- Almacenamiento de imágenes en PostgreSQL.
- Almacenamiento independiente con referencias en la base de datos.
- Costes.
- Seguridad.
- Rendimiento.
- Mantenimiento.
- Posibilidades de despliegue gratuito.

Las conclusiones se trasladarán a `03_Decisiones Técnicas`.

---

## Ideas futuras

Funcionalidades que podrán estudiarse después de completar las bases del MVP:

- Preferencias personalizadas de rutas.
- Priorización de recorridos con menor pendiente.
- Priorización de calles con sombra.
- Validación comunitaria de incidencias.
- Clasificación de obstáculos mediante inteligencia artificial.
- Ampliación de las funcionalidades de accesibilidad.

Estas funcionalidades no están implementadas actualmente.

---

## Recursos

Carpeta: `90_Recursos`

Se utilizará para almacenar materiales de consulta y referencias que resulten útiles durante el desarrollo.

Actualmente no contiene documentación.

---

## Git y GitHub

**Repositorio:** [AccessWay](https://github.com/vnn8imd/AccessWay)

**Rama principal:** `main`

**Último commit confirmado:**

`ae24582 — docs: actualizar y unificar los seis documentos de AccessWay`

### Estado actual

Los seis documentos principales están registrados en GitHub.

Los archivos de la entidad `Incidencia` todavía no se han incorporado a un nuevo commit.

Se registrarán cuando hayamos completado y comprobado los cambios correspondientes.

---

## Procedimiento de trabajo

Para mantener coordinados el desarrollo y la documentación, seguiremos este procedimiento:

1. Comprender la tarea.
2. Investigar y tomar las decisiones necesarias.
3. Implementar los cambios.
4. Comprobar su funcionamiento.
5. Actualizar los documentos afectados.
6. Registrar los cambios mediante Git.
7. Enviar los commits a GitHub.

El Dashboard se actualizará cuando cambie el estado general del proyecto, se complete un sprint o se produzca un avance importante.