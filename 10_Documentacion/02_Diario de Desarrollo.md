## Preparación, configuración y comprobación del backend y la base de datos

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

### Configuración y comprobación de la conexión con PostgreSQL

Una vez creada la base de datos, se configuró el backend para utilizar PostgreSQL.

Las credenciales de acceso a la base de datos no se almacenaron directamente en el repositorio. Para evitar exponer información sensible, se configuraron mediante variables de entorno del sistema.

Posteriormente, se inició la aplicación Spring Boot y se comprobó correctamente su funcionamiento.

Durante esta comprobación se verificó que:

- La aplicación se ejecuta utilizando Java 21.
- Maven Wrapper compila y ejecuta correctamente el proyecto.
- Spring Boot inicia correctamente el servidor web integrado.
- El servidor queda disponible en el puerto 8080.
- La aplicación puede establecer correctamente la conexión con PostgreSQL.
- El pool de conexiones HikariCP se inicializa correctamente.

Al acceder desde el navegador a la dirección `http://localhost:8080/`, se mostró una respuesta HTTP 404. Este resultado es esperado en el estado actual del proyecto, ya que todavía no se ha creado ningún controlador ni endpoint que responda a la ruta raíz `/`.

Finalmente, se detuvo la aplicación manualmente mediante `Ctrl + C` desde la terminal.

La aplicación realizó un apagado controlado correctamente, cerrando el servidor web y el pool de conexiones con la base de datos sin producir errores.

### Configuración permanente de las credenciales de la base de datos

Inicialmente, las variables necesarias para la conexión con PostgreSQL se configuraron temporalmente en una sesión de PowerShell.

Para facilitar el trabajo diario y evitar tener que volver a introducir la configuración cada vez que se abre una nueva terminal o se reinicia el equipo, las variables se configuraron posteriormente como variables de entorno de usuario permanentes de Windows.

Se configuraron las siguientes variables:

- `DB_URL`
- `DB_USERNAME`
- `DB_PASSWORD`

La contraseña de PostgreSQL no se almacena en el código fuente ni en el repositorio de GitHub.

El archivo `application.properties` utiliza estas variables para configurar la conexión con la base de datos.

Posteriormente se cerró la sesión de PowerShell y se abrió una nueva terminal para comprobar que las variables permanecían disponibles.

Finalmente, se ejecutó nuevamente el backend mediante Maven Wrapper y Spring Boot inició correctamente utilizando la configuración almacenada en las variables de entorno permanentes.

Se comprobó correctamente el inicio de la aplicación mediante el mensaje:

`Started BackendApplication`

Con esta configuración, el entorno de desarrollo puede utilizarse de forma habitual sin necesidad de volver a introducir las credenciales de PostgreSQL cada vez que se abre una nueva terminal o se reinicia el equipo.


