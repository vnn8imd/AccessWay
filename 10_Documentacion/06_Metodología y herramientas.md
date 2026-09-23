# 06. Metodología y Herramientas

**Proyecto:** AccessWay  
**Última actualización:** 23/09/2026  
**Estado:** Documento en evolución

---

## 1. Objetivo

Este documento describe la metodología de trabajo y las herramientas utilizadas para organizar, desarrollar y documentar AccessWay.

El proyecto se desarrolla de forma individual y cuenta inicialmente con una dedicación aproximada de 10 horas semanales.

Por este motivo, se utilizará una metodología adaptada que permita organizar el trabajo sin incorporar procesos innecesarios.

Los objetivos principales son:

- Dividir el proyecto en etapas asumibles.
- Establecer objetivos concretos.
- Priorizar las funcionalidades.
- Visualizar el trabajo pendiente.
- Registrar los avances.
- Mantener el código bajo control de versiones.
- Documentar las decisiones técnicas.
- Comprobar el funcionamiento de cada avance.
- Mantener el coste objetivo de 0 €.

---

# 2. Metodología de desarrollo

## 2.1. Scrum

### ¿Qué es Scrum?

Scrum es un marco de trabajo ágil que permite organizar el desarrollo de un producto mediante ciclos de trabajo denominados *sprints*.

En lugar de intentar desarrollar todo el proyecto de una sola vez, el trabajo se divide en periodos más pequeños.

Cada sprint tiene un objetivo concreto y busca conseguir un resultado que aporte valor al producto.

Para AccessWay, Scrum se utilizará como referencia para estructurar y organizar el desarrollo de forma progresiva.

### Adaptación a AccessWay

AccessWay es un proyecto individual.

Por tanto, no se reproducirán todos los roles y reuniones propios de un equipo Scrum profesional.

Se utilizarán principalmente:

- Product Backlog.
- Sprint Planning.
- Sprint Goal.
- Sprint Backlog.
- Revisión del sprint.
- Retrospectiva.

El objetivo será aprovechar los principios de organización y mejora continua sin incorporar una carga de gestión desproporcionada.

---

## 2.2. Product Backlog

El Product Backlog es la lista ordenada de funcionalidades, necesidades y trabajos pendientes del producto.

Entre los elementos previstos para AccessWay se encuentran:

- Registro de usuarios.
- Inicio de sesión.
- Registro de incidencias.
- Consulta de incidencias.
- Incorporación de fotografías.
- Representación de incidencias en un mapa.
- Consulta de rutas.
- Cálculo de rutas accesibles.
- Consideración de obstáculos.
- Preferencias de rutas.

El Product Backlog podrá modificarse a medida que avance el proyecto.

No todos sus elementos tendrán que formar parte del MVP.

---

## 2.3. Sprint

Un sprint es un periodo de trabajo durante el cual se desarrolla una parte concreta del proyecto.

Cada sprint tendrá:

- Un objetivo.
- Un conjunto limitado de tareas.
- Un resultado esperado.
- Una revisión final.

Se utilizarán sprints cortos, adaptados al tiempo disponible.

La duración concreta podrá ajustarse según la complejidad del trabajo.

Siempre que sea posible, cada sprint finalizará con un resultado funcional o comprobable.

---

## 2.4. Sprint Planning

Antes de comenzar cada sprint se realizará una planificación.

Durante esta planificación se determinará:

1. Qué objetivo se pretende conseguir.
2. Qué trabajos son necesarios.
3. Qué tareas tienen prioridad.
4. Qué resultado deberá comprobarse al finalizar.
5. Qué trabajo puede asumirse con el tiempo disponible.

Las tareas seleccionadas formarán el Sprint Backlog.

---

## 2.5. Sprint Goal

El Sprint Goal es el objetivo que se pretende alcanzar durante un sprint.

Debe expresar qué se quiere conseguir y ayudar a mantener el foco.

Por ejemplo:

> Implementar y comprobar el registro de incidencias de accesibilidad en el backend.

Para conseguir este objetivo podrían ser necesarias tareas relacionadas con:

- El modelo de datos.
- El repositorio.
- La capa de servicio.
- El controlador.
- Los DTOs.
- La validación.
- Las pruebas.

Este ejemplo representa una funcionalidad prevista y no implica que todos esos componentes estén ya implementados.

---

## 2.6. Sprint Backlog

El Sprint Backlog contiene los trabajos seleccionados para el sprint actual.

A diferencia del Product Backlog, no incluye todas las necesidades del proyecto.

Representa únicamente el trabajo previsto para alcanzar el objetivo del sprint.

Las tareas deberán ser suficientemente concretas para poder desarrollarlas y comprobarlas.

---

## 2.7. Revisión del sprint

Al finalizar cada sprint se revisará el resultado obtenido.

Se comprobará:

- Qué tareas se han completado.
- Qué funcionalidades están disponibles.
- Qué pruebas se han realizado.
- Qué problemas han quedado pendientes.
- Si se ha alcanzado el objetivo previsto.

Una tarea no se considerará terminada únicamente porque se haya escrito su código.

Cuando corresponda, también deberá comprobarse su funcionamiento.

---

## 2.8. Retrospectiva

Después de revisar el resultado del sprint se realizará una retrospectiva sencilla.

Se analizarán:

- Los aspectos que han funcionado.
- Las dificultades encontradas.
- Los errores cometidos.
- Las soluciones aplicadas.
- Las mejoras que pueden introducirse en el siguiente sprint.

Las conclusiones relevantes podrán registrarse en el Diario de Desarrollo.

---

# 3. Kanban

## 3.1. ¿Qué es Kanban?

Kanban es un método de gestión visual del trabajo.

Permite representar las tareas y seguir su evolución mediante un tablero dividido en columnas.

Su utilización facilita:

- Visualizar el trabajo pendiente.
- Conocer las tareas en desarrollo.
- Identificar bloqueos.
- Evitar comenzar demasiadas tareas simultáneamente.
- Comprobar el trabajo finalizado.

En AccessWay se utilizará Kanban como complemento de la planificación por sprints.

---

## 3.2. Tablero Kanban

El flujo inicial será:

```text
POR HACER
    |
    v
EN PROGRESO
    |
    v
 REVISIÓN
    |
    v
   HECHO
```

### Por hacer

Contendrá las tareas pendientes de comenzar.

### En progreso

Contendrá las tareas en las que se está trabajando.

### Revisión

Contendrá las tareas cuyo desarrollo se haya completado y que necesiten una comprobación.

### Hecho

Contendrá las tareas finalizadas y verificadas.

---

## 3.3. Tarjetas

Cada tarjeta representará una tarea concreta.

Por ejemplo:

- Crear `IncidenciaRepository`.
- Crear `IncidenciaService`.
- Crear `IncidenciaController`.
- Implementar un endpoint.
- Crear pruebas.
- Comprobar la persistencia en PostgreSQL.

Las tarjetas podrán contener:

- Título.
- Descripción.
- Objetivo.
- Criterios de finalización.
- Estado.
- Referencias a documentación o commits, cuando corresponda.

---

## 3.4. Trabajo en curso

WIP significa *Work In Progress*.

Representa el trabajo que se encuentra actualmente en desarrollo.

Para AccessWay se procurará mantener un número reducido de tareas simultáneas.

Al tratarse de un proyecto individual, se priorizará terminar y comprobar una tarea antes de comenzar varias nuevas.

Esta práctica permitirá mantener la concentración y reducir la acumulación de trabajo incompleto.

---

# 4. Combinación de Scrum y Kanban

Scrum y Kanban se utilizarán de forma complementaria.

Scrum proporcionará la estructura de planificación mediante sprints.

Kanban permitirá visualizar el estado de las tareas durante su ejecución.

El flujo general será:

```text
       PRODUCT BACKLOG
              |
              v
       SPRINT PLANNING
              |
              v
         SPRINT GOAL
              |
              v
        SPRINT BACKLOG
              |
              v
        TABLERO KANBAN
              |
              v
  POR HACER -> EN PROGRESO
              |
              v
           REVISIÓN
              |
              v
            HECHO
              |
              v
      REVISIÓN DEL SPRINT
              |
              v
        RETROSPECTIVA
              |
              v
       SIGUIENTE SPRINT
```

La combinación se adaptará a las necesidades reales del proyecto.

No se incorporarán ceremonias o procesos que no aporten valor.

---

# 5. Organización del trabajo de AccessWay

## 5.1. Sprint 0

El Sprint 0 se dedicó a definir las bases del proyecto.

Durante esta etapa se trabajó en:

- La idea de AccessWay.
- El problema que pretende resolver.
- Los objetivos generales y específicos.
- El alcance inicial.
- La definición del MVP.
- Los requisitos iniciales.
- Las posibilidades de ampliación.
- El estudio tecnológico.
- La organización de la documentación.

Esta fase permitió establecer una dirección inicial antes de comenzar la implementación.

## 5.2. Preparación del entorno

Posteriormente se comenzó a preparar el entorno técnico.

Se realizaron trabajos relacionados con:

- La creación del repositorio.
- La inicialización del backend.
- La configuración de Java y Maven.
- La preparación de PostgreSQL.
- La conexión con la base de datos.
- La configuración de las variables de entorno.

## 5.3. Primer desarrollo funcional

Se implementó el primer endpoint REST:

`GET /api/health`

Posteriormente, se modificó para utilizar el DTO `HealthResponse`.

Se comprobó su funcionamiento y se registraron los cambios en Git.

## 5.4. Inicio del modelo de incidencias

Se comenzó a desarrollar la primera entidad del dominio:

`Incidencia`

Se crearon también:

- `TipoIncidencia`.
- `EstadoIncidencia`.

Se incorporaron los atributos iniciales y el método `prePersist()` para asignar automáticamente la fecha y el estado inicial.

Este trabajo continúa en desarrollo.

Todavía no se ha comprobado la persistencia de la entidad en PostgreSQL.

---

# 6. Herramientas de gestión

## 6.1. Decisión sobre Jira

Durante la planificación inicial se contempló utilizar Jira para organizar el trabajo mediante Scrum y Kanban.

Posteriormente se revisó esta decisión.

Se decidió no utilizar Jira en esta fase para evitar incorporar una herramienta adicional cuya configuración y mantenimiento no resultan necesarios para el alcance actual de AccessWay.

Esta decisión responde a la necesidad de mantener una organización sencilla y un coste objetivo de 0 €.

## 6.2. Tablero Kanban

Se utilizará un tablero Kanban gratuito para visualizar el trabajo.

El tablero deberá permitir:

- Registrar tareas.
- Organizarlas por estados.
- Identificar prioridades.
- Seguir el progreso.
- Detectar bloqueos.

La herramienta concreta de tablero deberá mantenerse documentada cuando quede definitivamente configurada.

## 6.3. GitHub Issues

GitHub Issues se contempla como herramienta para organizar tareas técnicas relacionadas con el repositorio.

Podrá utilizarse para registrar:

- Funcionalidades.
- Errores.
- Mejoras.
- Tareas técnicas.
- Trabajos pendientes.

No se considera necesario duplicar automáticamente todas las tareas en diferentes herramientas.

Se procurará mantener una organización sencilla y evitar registros redundantes.

---

# 7. Herramientas de desarrollo

## 7.1. IntelliJ IDEA

IntelliJ IDEA se utiliza como entorno de desarrollo para el backend Java.

Permite trabajar con:

- Clases Java.
- Spring Boot.
- Maven.
- Estructura de paquetes.
- Ejecución y depuración.
- Herramientas de desarrollo.

Actualmente se utiliza para desarrollar el backend de AccessWay.

Queda pendiente configurar una forma cómoda de iniciar la aplicación desde el entorno de desarrollo.

---

## 7.2. Git

### ¿Qué es Git?

Git es un sistema de control de versiones.

Permite registrar los cambios realizados en el proyecto y consultar su evolución.

### Utilización en AccessWay

Git se utiliza para:

- Registrar avances.
- Mantener un historial de cambios.
- Identificar modificaciones.
- Facilitar la recuperación de versiones anteriores.
- Organizar el desarrollo.

### Commits

Los commits deberán representar cambios coherentes.

Siempre que sea posible, se realizarán después de comprobar el resultado del trabajo.

Se utilizarán mensajes descriptivos.

Por ejemplo:

```text
feat: crear primer endpoint
```

O:

```text
docs: documentar primer endpoint REST
```

### Comprobación del estado

Antes de registrar cambios se podrá utilizar:

```powershell
git status
```

Este comando permite comprobar qué archivos se han modificado y si existen cambios pendientes.

---

## 7.3. GitHub

### ¿Qué es GitHub?

GitHub es una plataforma que permite alojar repositorios Git y colaborar en proyectos de desarrollo.

### Repositorio de AccessWay

El proyecto dispone de un repositorio remoto denominado:

`AccessWay`

Actualmente se trabaja sobre la rama:

`main`

### Utilización

GitHub permitirá:

- Conservar una copia remota del repositorio.
- Consultar el historial de commits.
- Mostrar la evolución del proyecto.
- Organizar tareas técnicas mediante Issues cuando corresponda.
- Incorporar el proyecto al portfolio profesional.

### Registro de avances

Entre los commits ya realizados se encuentran:

```text
5b5448a docs: inicializar documentación de AccessWay

e45ccb7 feat: inicializar backend y configurar entorno

ac5bc63 feat: configurar conexión con PostgreSQL

f0b1ad9 feat: configuracion como variables de usuario permanentes de Windows

89ed836 feat: crear primer endpoint

316d460 docs: documentar primer endpoint REST

453287e feat: estructurar respuesta del endpoint health con DTO

4cd14a2 docs: definir modelo inicial de incidencias
```

El último commit de esta relación se envió correctamente al repositorio remoto.

Los cambios posteriores relacionados con la implementación de la entidad `Incidencia` todavía están pendientes de un nuevo commit.

---

# 8. Documentación

## 8.1. Obsidian

### ¿Qué es Obsidian?

Obsidian es una herramienta para crear y organizar notas mediante archivos Markdown.

Se utilizará como herramienta principal para la documentación de AccessWay.

### Objetivo

La documentación permitirá:

- Registrar el desarrollo real.
- Explicar las decisiones técnicas.
- Organizar el conocimiento adquirido.
- Preparar la memoria del proyecto.
- Facilitar futuras revisiones.
- Disponer de material para la presentación ante el tribunal.

### Organización documental

La documentación principal se organizará mediante los siguientes documentos:

| Documento | Finalidad |
|---|---|
| 01_Libro del Proyecto | Memoria técnica de AccessWay |
| 02_Diario de Desarrollo | Registro cronológico del trabajo |
| 03_Decisiones Técnicas | Justificación de las decisiones |
| 04_Glosario | Definición de conceptos |
| 05_Estudio Tecnológico | Investigación y selección de tecnologías |
| 06_Metodología y Herramientas | Organización del desarrollo |

Cada documento tendrá una finalidad diferenciada para evitar duplicidades.

---

## 8.2. Libro del Proyecto

El Libro del Proyecto será la memoria técnica de AccessWay.

Explicará:

- El problema.
- La justificación.
- Los objetivos.
- Los requisitos.
- La arquitectura.
- El diseño.
- La implementación.
- Las pruebas.
- Los resultados.

Se completará progresivamente.

Deberá distinguir entre las funcionalidades previstas y las realmente implementadas.

---

## 8.3. Diario de Desarrollo

El Diario de Desarrollo registrará cronológicamente el trabajo realizado.

Cada avance relevante podrá incluir:

- Fecha.
- Objetivo.
- Tareas realizadas.
- Comandos utilizados.
- Resultados.
- Problemas encontrados.
- Soluciones aplicadas.
- Aprendizajes.
- Commit correspondiente, cuando exista.

No se incorporarán retrospectivamente tareas que no se hayan realizado.

Tampoco se presentarán como comprobadas funcionalidades que todavía no se hayan probado.

---

## 8.4. Decisiones Técnicas

Este documento explicará las decisiones de diseño y sus motivos.

Por ejemplo:

- Selección de PostgreSQL.
- Gestión de credenciales.
- Utilización de DTOs.
- Definición de enumerados.
- Diseño del modelo de incidencias.
- Geolocalización.
- Almacenamiento de fotografías.

También deberá identificar las decisiones que todavía están pendientes.

---

## 8.5. Glosario

El glosario recogerá los conceptos técnicos que aparezcan durante el desarrollo.

Cada entrada podrá contener:

- Nombre del concepto.
- Definición.
- Finalidad.
- Ejemplo aplicado a AccessWay.

Se actualizará progresivamente a medida que se incorporen nuevos conocimientos.

---

## 8.6. Estudio Tecnológico

Este documento recogerá la investigación de las tecnologías necesarias para AccessWay.

Explicará:

- Las alternativas consideradas.
- Los criterios de selección.
- Las tecnologías elegidas.
- Las tecnologías pendientes de estudio.
- El estado real de implementación.

Se actualizará cuando se adopten nuevas decisiones tecnológicas.

---

## 8.7. Documentación oficial

Durante el desarrollo se consultará documentación técnica cuando resulte necesario.

Se priorizarán las fuentes oficiales de las tecnologías utilizadas.

La información relevante podrá incorporarse a las notas de investigación y a los documentos correspondientes.

---

# 9. Procedimiento habitual de desarrollo

Para mantener un proceso ordenado, se seguirá una secuencia de trabajo adaptada a cada tarea.

## Paso 1. Comprender el objetivo

Antes de comenzar a programar se identificará:

- Qué problema queremos resolver.
- Qué resultado esperamos.
- Qué conocimientos necesitamos.
- Qué archivos o componentes estarán implicados.

No se incorporará código sin comprender su finalidad.

## Paso 2. Analizar las alternativas

Cuando existan varias soluciones posibles, se estudiarán sus ventajas e inconvenientes.

La decisión deberá responder a las necesidades reales del proyecto.

Si una decisión requiere más investigación, se registrará como pendiente.

## Paso 3. Implementar

Se desarrollará la funcionalidad de forma progresiva.

Se procurará realizar cambios pequeños y comprensibles.

## Paso 4. Comprobar

Se comprobará el resultado mediante las herramientas adecuadas.

Según la tarea, podrá ser necesario:

- Compilar.
- Ejecutar pruebas.
- Iniciar Spring Boot.
- Realizar una petición HTTP.
- Consultar PostgreSQL.
- Revisar el resultado en la aplicación.

No todas las tareas requerirán las mismas comprobaciones.

## Paso 5. Documentar

Se actualizarán los documentos afectados.

Por ejemplo:

- El Diario de Desarrollo registrará el proceso.
- Las Decisiones Técnicas recogerán los motivos de las elecciones.
- El Estudio Tecnológico reflejará nuevas tecnologías.
- El Glosario incorporará conceptos nuevos.
- El Libro del Proyecto recogerá los avances consolidados.

## Paso 6. Registrar los cambios

Cuando corresponda, se comprobará el estado del repositorio y se realizará un commit.

Después se enviarán los cambios al repositorio remoto.

Antes de considerar finalizada la tarea se comprobará que el registro se ha realizado correctamente.

---

# 10. Criterios de finalización

Una tarea se considerará terminada cuando se hayan completado las comprobaciones que correspondan a su naturaleza.

Para una tarea de desarrollo, los criterios podrán incluir:

- Código implementado.
- Compilación correcta.
- Pruebas realizadas.
- Resultado funcional comprobado.
- Documentación actualizada.
- Cambios registrados en Git.

Para una tarea de investigación, los criterios podrán incluir:

- Alternativas identificadas.
- Ventajas e inconvenientes documentados.
- Decisión adoptada o cuestión pendiente claramente registrada.

No se dará por completada una tarea únicamente por haber comenzado su implementación.

---

# 11. Gestión de problemas y aprendizajes

Los problemas encontrados durante el desarrollo se registrarán en el Diario de Desarrollo cuando aporten información relevante.

Por ejemplo, durante la creación de la entidad `Incidencia` se colocó inicialmente el método `prePersist()` dentro del constructor.

Se detectó el problema y se corrigió la estructura de la clase.

Este tipo de situaciones forman parte del proceso de aprendizaje y deben quedar documentadas.

También se registrarán los problemas relacionados con:

- Configuración del entorno.
- Dependencias.
- Compilación.
- Ejecución.
- Conexión con PostgreSQL.
- Peticiones HTTP.
- Persistencia.
- Control de versiones.

La finalidad no será acumular incidencias sin resolver, sino comprender sus causas y documentar las soluciones.

---

# 12. Restricción económica

El objetivo económico inicial de AccessWay es:

**0 €**

Se priorizarán herramientas gratuitas y tecnologías de código abierto.

Actualmente se utilizan herramientas que permiten desarrollar el proyecto localmente sin costes de licencia.

No obstante, el coste de un futuro despliegue deberá estudiarse por separado.

La gratuidad de una tecnología no garantiza que su alojamiento, almacenamiento o utilización mediante servicios externos sea siempre gratuito.

Cualquier servicio adicional deberá analizarse antes de incorporarlo.

---

# 13. Estado actual de la metodología y las herramientas

**Fecha: 23/09/2026**

| Elemento | Estado |
|---|---|
| Scrum adaptado | Metodología definida |
| Sprints | Incorporados a la planificación |
| Product Backlog | Planteado |
| Kanban | Método de seguimiento seleccionado |
| Herramienta definitiva del tablero | Pendiente de confirmar |
| GitHub Issues | Previsto para tareas técnicas |
| Jira | Descartado para esta fase |
| Git | En uso |
| GitHub | Repositorio creado y utilizado |
| IntelliJ IDEA | En uso para el backend |
| Obsidian | En uso |
| Diario de Desarrollo | En actualización |
| Decisiones Técnicas | En actualización |
| Estudio Tecnológico | En actualización |
| Libro del Proyecto | Pendiente de completar |
| Glosario | Pendiente de completar |

---

# 14. Conclusión

La metodología de AccessWay combinará una planificación basada en Scrum adaptado con la visualización del trabajo mediante Kanban.

Esta combinación permitirá organizar el desarrollo en etapas pequeñas y mantener el control sobre las tareas pendientes.

Git y GitHub se utilizarán para registrar y conservar la evolución del código.

Obsidian será la herramienta principal de documentación.

El proceso de trabajo se basará en comprender, implementar, comprobar, documentar y registrar cada avance.

Se priorizará una organización sencilla, adaptada a un proyecto individual y compatible con una dedicación inicial aproximada de 10 horas semanales.

La metodología y las herramientas podrán revisarse si aparecen nuevas necesidades durante el desarrollo.