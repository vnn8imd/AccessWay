## Base de datos

### PostgreSQL

Se ha seleccionado PostgreSQL como sistema gestor de base de datos para AccessWay.

La aplicación utilizará PostgreSQL para almacenar la información persistente del sistema. La conexión desde el backend se realizará mediante Spring Data JPA y el driver oficial de PostgreSQL incluido como dependencia del proyecto.

La base de datos inicial del proyecto se ha creado con el nombre:

`accessway`

La conexión y configuración definitiva se establecerán en Spring Boot mediante la configuración de la aplicación.

### Estado

- Sistema gestor de base de datos: PostgreSQL 18.1
- Base de datos inicial: `accessway`
- Puerto: 5432
- Codificación: UTF-8