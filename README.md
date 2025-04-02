El proyecto está enfocado en el desarrollo de una aplicación web utilizando Spring Boot, con una arquitectura basada en Frontend, Backend y Base de Datos. Se exploran conceptos clave como controladores (@Controller y @RestController), inyección de dependencias (@Autowired), y las diferentes capas de servicio (@Service, @Repository, @Component).

Además, se investiga sobre el uso de DTOs para la transferencia segura de datos, la configuración de PostgreSQL en Spring Boot, y medidas de seguridad en APIs REST, como autenticación con JWT, protección contra ataques y uso de HTTPS.
En el ejemplo practico tenemos:
API de Estudiantes con Spring Boot
🔹 Operaciones CRUD (crear, leer, actualizar, eliminar).
🔹 Usa DTOs para transferencia de datos.
🔹 Almacenamiento en memoria con ConcurrentHashMap.
🔹 Endpoints:

GET /estudiantes → Listar todos.

GET /estudiantes/{id} → Buscar por ID.

POST /estudiantes → Crear.

PUT /estudiantes/{id} → Actualizar.

DELETE /estudiantes/{id} → Eliminar.
