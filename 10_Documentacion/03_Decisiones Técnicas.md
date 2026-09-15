## Base de datos

### PostgreSQL

Se ha seleccionado PostgreSQL como sistema gestor de base de datos para AccessWay.

La aplicación utilizará PostgreSQL para almacenar la información persistente del sistema. La conexión desde el backend se realizará mediante Spring Data JPA y el driver oficial de PostgreSQL incluido como dependencia del proyecto.

La base de datos inicial del proyecto se ha creado con el nombre:

`accessway`

La conexión desde el backend se realiza mediante Spring Boot utilizando la configuración definida en `application.properties`.

### Estado

- Sistema gestor de base de datos: PostgreSQL 18.1
- Base de datos inicial: `accessway`
- Puerto: 5432
- Codificación: UTF-8

## Gestión de credenciales y configuración sensible

### Decisión

Las credenciales y otros datos sensibles necesarios para conectar AccessWay con servicios externos no se almacenarán directamente en el repositorio Git ni en el código fuente.

Para el desarrollo local se utilizarán variables de entorno, que serán referenciadas desde la configuración de Spring Boot.

Actualmente, las credenciales necesarias para conectar el backend con PostgreSQL se han configurado como variables de usuario permanentes de Windows.

Las variables utilizadas son:

- `DB_URL`
- `DB_USERNAME`
- `DB_PASSWORD`

El archivo `application.properties` obtiene los valores necesarios mediante referencias a estas variables de entorno.

Ejemplo conceptual:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```


### Ahora `03_Decisiones Técnicas.md`

Añade también al final:

```markdown
## Primer endpoint REST

### Decisión

Se crea un primer endpoint REST sencillo para comprobar el funcionamiento del backend antes de comenzar con las funcionalidades propias de AccessWay.

El endpoint utilizado es:

`GET /api/health`

La implementación se realiza mediante un controlador REST (`HealthController`) utilizando Spring Boot.

### Motivo

Antes de desarrollar funcionalidades relacionadas con usuarios, rutas o incidencias, se considera conveniente comprobar que la infraestructura básica del backend funciona correctamente.

Este endpoint permite realizar una primera comprobación independiente de la lógica de negocio y de la base de datos.

### Alcance

El endpoint tiene únicamente una finalidad de comprobación durante esta fase inicial del desarrollo.

No representa todavía una funcionalidad principal de AccessWay.

En fases posteriores se sustituirá o complementará con endpoints relacionados con las funcionalidades reales de la aplicación.
```

