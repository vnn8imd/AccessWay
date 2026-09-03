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
## Gestión de credenciales y configuración sensible

### Variables de entorno

Las credenciales y otros datos sensibles necesarios para conectar AccessWay con servicios externos no se almacenarán directamente en el repositorio Git.

Para el desarrollo local se utilizarán variables de entorno, que serán referenciadas desde la configuración de Spring Boot.

De esta forma, archivos compartidos en el repositorio podrán contener referencias a la configuración necesaria sin incluir información sensible, como contraseñas.

Ejemplo conceptual:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
````

Las variables con los valores reales permanecerán configuradas únicamente en el entorno local de desarrollo.
Esta estrategia permite:

- Evitar almacenar contraseñas en GitHub.
- Mantener la configuración del proyecto compartible.
- Separar la configuración del código.
- Facilitar la futura configuración del entorno de producción.
- Utilizar una estrategia compatible con servicios de despliegue que permiten configurar variables de entorno.