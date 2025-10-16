# Proyecto Demo - Gestión de Productos
## GA7-220501096-AA3-EV01

### Descripción
Aplicación web desarrollada con Spring Boot que implementa un CRUD de productos.
Demuestra el uso del framework Spring para desarrollo de aplicaciones empresariales.

### Tecnologías Utilizadas
- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

### Estructura del Proyecto
```
src/main/java/com/example/demo/
├── controller/    # Controladores REST
├── service/       # Lógica de negocio
├── repository/    # Acceso a datos
└── model/         # Entidades JPA
```

### Configuración
1. Crear base de datos PostgreSQL:
```sql
   CREATE DATABASE demo_db;
```

2. Configurar credenciales en `application.properties`:
```properties
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_password
```

### Ejecución
```bash
mvn spring-boot:run
```

La aplicación estará disponible en: http://localhost:8080

### Endpoints API REST

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | /api/productos | Listar todos los productos |
| GET | /api/productos/{id} | Obtener producto por ID |
| POST | /api/productos | Crear nuevo producto |
| PUT | /api/productos/{id} | Actualizar producto |
| DELETE | /api/productos/{id} | Eliminar producto |

### Ejemplo de Producto JSON
```json
{
  "nombre": "Laptop",
  "precio": 1200.50,
  "descripcion": "Laptop gaming 16GB RAM"
}
```

### Autor
GRUPO NOVA348
Ficha: 2977348
Fecha: Octubre 2025