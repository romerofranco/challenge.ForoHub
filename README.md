# ForoHub API REST

API REST de un foro desarrollada con Spring Boot.

## Tecnologías utilizadas
- Java 21
- Spring Boot 3.5
- Spring Security
- Spring Data JPA
- PostgreSQL
- Flyway Migration
- Lombok
- Maven

## Endpoints disponibles

### Tópicos
| Método | URI | Descripción |
|--------|-----|-------------|
| GET | /topicos | Lista todos los tópicos |
| GET | /topicos/{id} | Detalle de un tópico |
| POST | /topicos | Crea un nuevo tópico |
| PUT | /topicos/{id} | Actualiza un tópico |
| DELETE | /topicos/{id} | Elimina un tópico |

## Cómo ejecutar el proyecto
1. Clonar el repositorio
2. Crear la base de datos `forohub` en PostgreSQL
3. Configurar `application.properties` con tus credenciales
4. Ejecutar con `./mvnw spring-boot:run

