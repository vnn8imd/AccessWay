## 1. Metodología de desarrollo

# Scrum

## ¿Qué es Scrum?

Scrum es un marco de trabajo ágil que permite organizar el desarrollo de un proyecto en ciclos de trabajo llamados **Sprints**.

En lugar de intentar desarrollar todo el proyecto de una sola vez, el trabajo se divide en periodos más pequeños. Cada Sprint tiene un objetivo concreto y busca conseguir un resultado que aporte valor al producto.

Para AccessWay, Scrum se utilizará como referencia para estructurar y organizar el desarrollo de forma progresiva.

## Product Backlog

El **Product Backlog** es la lista ordenada y priorizada de funcionalidades, necesidades y trabajos que se quieren realizar durante el desarrollo de AccessWay.

Algunos ejemplos de elementos que podrían formar parte del Product Backlog son:

- Registro de usuarios.
    
- Inicio de sesión.
    
- Registro de incidencias de accesibilidad.
    
- Consulta de incidencias.
    
- Registro de fotografías.
    
- Creación y consulta de rutas.
    
- Cálculo de rutas accesibles.
    
- Consideración de obstáculos y pendientes.
    
- Priorización de rutas según diferentes preferencias.
    

El Product Backlog representa el conjunto de trabajo pendiente del producto y podrá evolucionar a medida que avance el proyecto.

## Sprint

Un **Sprint** es un periodo de trabajo durante el cual se desarrolla una parte concreta de AccessWay.

Cada Sprint tendrá un objetivo definido y un conjunto limitado de trabajos seleccionados del Product Backlog.

La finalidad será conseguir un resultado comprobable al finalizar el Sprint, evitando intentar desarrollar demasiadas funcionalidades simultáneamente.

## Sprint Planning

Antes de comenzar cada Sprint se realizará una planificación para determinar qué se quiere conseguir y qué trabajos serán necesarios para lograrlo.

Partiendo del Product Backlog, se seleccionarán los elementos que sean prioritarios y adecuados para el Sprint.

De esta selección surgirá el **Sprint Backlog**.

## Sprint Goal

El **Sprint Goal** es el objetivo que se pretende alcanzar durante un Sprint.

Define para qué se realiza el Sprint y ayuda a mantener el foco durante su desarrollo.

Por ejemplo, un posible objetivo podría ser:

> Permitir que un usuario registrado pueda comunicar una incidencia de accesibilidad desde AccessWay.

Las tareas necesarias para conseguir este objetivo podrían incluir la creación del modelo de datos, el Repository, el Service, el Controller, el endpoint de la API y las correspondientes pruebas.

## Sprint Backlog

El **Sprint Backlog** contiene los trabajos seleccionados del Product Backlog que se realizarán durante el Sprint.

A diferencia del Product Backlog, que contiene el conjunto de necesidades del producto, el Sprint Backlog representa el trabajo seleccionado para el Sprint actual.

## Revisión del Sprint

Al finalizar un Sprint se revisará el resultado obtenido para comprobar qué se ha conseguido y qué funcionalidades están realmente disponibles.

La revisión permitirá comprobar si se ha alcanzado el Sprint Goal y detectar posibles trabajos que deban continuar en futuros Sprints.

## Retrospectiva

Después de revisar el resultado del Sprint se realizará una retrospectiva para analizar cómo se ha desarrollado el trabajo.

Se identificarán aspectos que hayan funcionado correctamente, dificultades encontradas y posibles mejoras para los siguientes Sprints.

La finalidad será mejorar progresivamente la forma de trabajar en el proyecto.

## Adaptación de Scrum a AccessWay

AccessWay es un proyecto individual, por lo que Scrum se aplicará de forma adaptada a esta circunstancia.

No se reproducirán todos los roles y ceremonias propios de un equipo de desarrollo profesional cuando no sean necesarios para el proyecto.

Se mantendrá principalmente la estructura basada en:

- Product Backlog.
    
- Sprints.
    
- Sprint Goal.
    
- Sprint Backlog.
    
- Revisión del resultado.
    
- Retrospectiva.
    

Cada Sprint deberá tener un objetivo concreto y, siempre que sea posible, finalizar con un resultado funcional o comprobable.

De esta forma, Scrum permitirá organizar el desarrollo de AccessWay de manera progresiva, manteniendo un objetivo claro en cada etapa y evitando intentar desarrollar toda la aplicación simultáneamente.

## Kanban

### ¿Qué es Kanban?

Kanban es un método de gestión visual del trabajo que permite representar las tareas de un proyecto y seguir su evolución a través de diferentes estados.

Su objetivo principal es facilitar la visualización del trabajo, controlar la cantidad de tareas que se encuentran en progreso y detectar posibles bloqueos o acumulaciones de trabajo.

En AccessWay se utilizará Kanban como complemento de Scrum para visualizar el estado de las tareas durante el desarrollo.

### Tablero Kanban

El trabajo se representará mediante un tablero dividido en diferentes columnas que representan las etapas por las que pasa una tarea.

Cada tarea se representará mediante una tarjeta que podrá desplazarse entre las diferentes columnas a medida que avance su desarrollo.

El flujo básico utilizado inicialmente en AccessWay será:

Por hacer → En progreso → Revisión → Hecho

Este flujo podrá modificarse si durante el desarrollo se considera necesario adaptarlo a las necesidades reales del proyecto.

### Tarjetas

Cada tarjeta representará un trabajo concreto que deba realizarse.

Por ejemplo:

- Crear entidad Incidencia.
- Crear IncidenciaRepository.
- Crear IncidenciaService.
- Crear IncidenciaController.
- Crear endpoint para registrar una incidencia.
- Realizar pruebas del endpoint.

Las tarjetas permitirán identificar de forma rápida qué trabajo debe realizarse y en qué estado se encuentra.

### Flujo de trabajo

Una tarea comenzará normalmente en la columna **Por hacer**.

Cuando se comience a trabajar en ella pasará a **En progreso**.

Una vez finalizado el desarrollo, pasará a **Revisión**, donde se comprobará que funciona correctamente.

Después de superar la revisión, pasará a **Hecho**.

De esta forma se podrá visualizar en todo momento el estado de las tareas y detectar aquellas que permanezcan bloqueadas o demasiado tiempo en una determinada etapa.

### Trabajo en curso (WIP)

WIP significa **Work In Progress** y hace referencia al trabajo que se encuentra actualmente en progreso.

Kanban utiliza límites de trabajo en curso para evitar comenzar demasiadas tareas simultáneamente y favorecer un flujo de trabajo más controlado.

En AccessWay se aplicará este principio de forma sencilla, procurando mantener un número reducido de tareas simultáneamente en la columna **En progreso**.

Al tratarse de un proyecto individual, se priorizará terminar una tarea antes de comenzar otras nuevas siempre que sea posible.

### Kanban como complemento de Scrum

Scrum y Kanban no se utilizarán como metodologías independientes dentro de AccessWay, sino de forma complementaria.

Scrum proporcionará la estructura temporal del desarrollo mediante Sprints y permitirá establecer un objetivo concreto para cada Sprint.

Kanban permitirá visualizar el estado de las tareas que forman parte del trabajo del proyecto y facilitará el seguimiento de su progreso.

La combinación se puede representar de la siguiente manera:

Product Backlog
↓
Sprint Planning
↓
Sprint Goal
↓
Sprint Backlog
↓
Tablero Kanban
↓
Por hacer → En progreso → Revisión → Hecho
↓
Revisión y retrospectiva

### Aplicación de Kanban a AccessWay

Kanban se utilizará principalmente para:

- Visualizar las tareas pendientes y en desarrollo.
- Conocer rápidamente el estado actual del proyecto.
- Evitar trabajar en demasiadas tareas simultáneamente.
- Detectar bloqueos o tareas que estén acumulándose.
- Facilitar el seguimiento del trabajo realizado durante cada Sprint.
- Mejorar progresivamente el flujo de trabajo.

El tablero Kanban se gestionará mediante Jira, que permitirá representar visualmente las tareas y moverlas entre los diferentes estados del flujo de trabajo.

#### Adaptación de Scrum y Kanban a AccessWay

Scrum y Kanban se utilizarán de forma complementaria durante el desarrollo de AccessWay.

Scrum proporcionará la estructura del desarrollo mediante Sprints, permitiendo establecer objetivos concretos y seleccionar el trabajo que se realizará durante cada Sprint.

Kanban se utilizará para visualizar el flujo de trabajo y conocer en todo momento el estado de las tareas.

El flujo general de trabajo será:

Product Backlog
↓
Sprint Planning
↓
Sprint Goal
↓
Sprint Backlog
↓
Tablero Kanban
↓
Por hacer → En progreso → Revisión → Hecho
↓
Sprint Review
↓
Retrospectiva
↓
Siguiente Sprint

Al tratarse de un proyecto individual, ambos enfoques se aplicarán de forma adaptada a las necesidades reales de AccessWay, evitando incorporar procesos o elementos que no aporten valor al desarrollo.

Jira será la herramienta utilizada para gestionar el trabajo mediante Scrum y Kanban. Se utilizará para gestionar el Product Backlog, organizar los Sprints y visualizar el estado de las tareas mediante el tablero.

Obsidian continuará utilizándose como herramienta principal para la documentación y el conocimiento del proyecto, mientras que Git y GitHub se utilizarán para el desarrollo y control de versiones del código.

## 2. Herramientas de gestión

#### Jira

Jira será la herramienta utilizada para llevar a la práctica la gestión del trabajo mediante Scrum y Kanban. Se utilizará para gestionar el Product Backlog, organizar los Sprints y visualizar el estado de las tareas mediante un tablero. La elección de Jira responde a la necesidad de disponer de una herramienta específica para la gestión del desarrollo, diferenciándola de Obsidian, que se utilizará principalmente para la documentación y el conocimiento del proyecto. El objetivo será utilizar únicamente las funcionalidades necesarias para AccessWay, evitando incorporar herramientas o procesos que no aporten valor al desarrollo. El uso de Jira se realizará dentro de su modalidad gratuita, manteniendo como requisito del proyecto un coste de 0 €.

## 3. Herramientas de desarrollo

#### Git

#### GitHub

## 4. Documentación

#### Obsidian

#### Documentación web

## 5. Restricción económica

#### Coste objetivo: 0 €