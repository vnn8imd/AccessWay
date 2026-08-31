## Preparación inicial del backend y base de datos

Se continuó con la preparación del entorno de desarrollo de AccessWay.

Durante esta fase se realizaron las siguientes tareas:

- Se creó el proyecto backend mediante Spring Boot.
- Se configuró el proyecto para utilizar Java 21.
- Se verificó el funcionamiento de Maven mediante Maven Wrapper (`mvnw.cmd`).
- Se comprobó que Spring Boot podía compilar y ejecutar la aplicación.
- Se verificó la instalación de PostgreSQL 18.1.
- Se comprobó que el servidor PostgreSQL se encuentra activo y acepta conexiones en el puerto 5432.
- Se accedió correctamente a PostgreSQL mediante el usuario `postgres`.
- Se creó la base de datos inicial del proyecto con el nombre `accessway`.
- Se verificó que la base de datos utiliza codificación UTF-8.

Durante el acceso a PostgreSQL apareció una advertencia relacionada con la diferencia entre el código de página de la consola y el código de página de Windows. Actualmente esta advertencia no impide el funcionamiento de PostgreSQL ni afecta al desarrollo inicial del proyecto. Se tendrá en cuenta en caso de que aparezcan problemas relacionados con caracteres especiales o codificación.