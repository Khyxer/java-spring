# 📘 README - Proyecto Spring Boot: Gestión de Productos

## 📋 Información del Proyecto

**Evidencia:** GA7-220501096-AA3-EV01  
**Título:** Sistema de Gestión de Productos con Spring Boot  
**Framework:** Spring Boot  
**Lenguaje:** Java 17  
**Build Tool:** Gradle  
**Base de Datos:** PostgreSQL (configurable)  

---

## 📝 Descripción

Sistema web para gestión de productos que implementa un CRUD completo utilizando Spring Boot. Incluye:
- API REST completa con endpoints para operaciones CRUD
- Interfaz web para interactuar con el sistema
- Arquitectura en capas (Controller, Service, Repository, Model)
- Persistencia con Spring Data JPA
- Validación y manejo de errores

---

## 🏗️ Arquitectura del Proyecto

```
src/main/java/com/example/demo/
├── DemoApplication.java          # Clase principal de Spring Boot
├── config/
│   └── WebConfig.java           # Configuración CORS
├── controller/
│   └── ProductoController.java  # Controlador REST - Endpoints API
├── service/
│   └── ProductoService.java     # Lógica de negocio
├── repository/
│   └── ProductoRepository.java  # Acceso a datos (JPA Repository)
└── model/
    └── Producto.java            # Entidad JPA

src/main/resources/
├── application.properties       # Configuración de la aplicación
└── static/
    └── index.html              # Interfaz web del usuario
```

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| Java | 17+ | Lenguaje de programación |
| Spring Boot | 3.x | Framework principal |
| Spring Web | 3.x | Creación de API REST |
| Spring Data JPA | 3.x | Persistencia de datos |
| PostgreSQL | 15+ | Base de datos (opcional) |
| Gradle | 8.x | Gestión de dependencias |
| HTML/CSS/JavaScript | - | Interfaz de usuario |

---

## 📦 Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

### **1. Java Development Kit (JDK) 17 o superior**

**Verificar instalación:**
```bash
java -version
```

**Descargar si no está instalado:**
- **Eclipse Temurin (Recomendado):** https://adoptium.net/temurin/releases/?version=17
- **Oracle JDK:** https://www.oracle.com/java/technologies/downloads/#java17

### **2. IDE (Entorno de Desarrollo)**

**Opciones recomendadas:**
- IntelliJ IDEA Community Edition: https://www.jetbrains.com/idea/download/
- Eclipse/Spring Tool Suite: https://spring.io/tools
- Visual Studio Code con Extension Pack for Java

### **3. PostgreSQL (Opcional)**

Si deseas persistencia real de datos:

**Descargar:** https://www.postgresql.org/download/

**Configuración post-instalación:**
- Usuario por defecto: `postgres`
- Contraseña: la que definas durante la instalación
- Puerto: `5432`

---

## 🚀 Instalación y Configuración

### **Paso 1: Clonar el Repositorio**

```bash
git clone https://github.com/Khyxer/java-spring.git
cd proyecto-spring
```

### **Paso 2: Configurar Base de Datos (OPCIONAL)**

#### **Opción A: Usar PostgreSQL**

1. **Instalar y arrancar PostgreSQL**

2. **Crear la base de datos:**
```sql
-- Conectarse a PostgreSQL
psql -U postgres

-- Crear la base de datos
CREATE DATABASE demo_db;

-- Salir
\q
```

3. **Configurar credenciales:**

Edita el archivo `src/main/resources/application.properties`:

```properties
spring.application.name=demo

# Configuración de PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/demo_db
spring.datasource.username=postgres
spring.datasource.password=TU_CONTRASEÑA_AQUI

# Configuración JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Puerto del servidor
server.port=8080
```

**⚠️ IMPORTANTE:** Reemplaza `TU_CONTRASEÑA_AQUI` con tu contraseña real de PostgreSQL.

#### **Opción B: Usar Base de Datos en Memoria (H2)**

Para pruebas rápidas sin instalar PostgreSQL:

```properties
spring.application.name=demo

# Base de datos en memoria
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

# Puerto del servidor
server.port=8080
```

**Nota:** Los datos se perderán al detener la aplicación y la verdad no probe este metodo entonces no puedo confirmar que funcione.

---

## ▶️ Ejecución del Proyecto

### **Método 1: Desde IntelliJ IDEA (Recomendado)**

1. **Abrir el proyecto:**
   - `File` → `Open` → Seleccionar la carpeta del proyecto

2. **Esperar sincronización de Gradle:**
   - IntelliJ descargará automáticamente las dependencias

3. **Configurar JDK:**
   - `File` → `Project Structure` → `Project`
   - Seleccionar SDK: Java 17 o superior

4. **Ejecutar:**
   - Abrir `src/main/java/com/example/demo/DemoApplication.java`
   - Click en el ícono verde ▶️ junto al método `main`
   - Seleccionar `Run 'DemoApplication'`

### **Método 2: Desde Eclipse/STS**

1. **Importar proyecto:**
   - `File` → `Import` → `Existing Gradle Project`
   - Seleccionar la carpeta del proyecto

2. **Ejecutar:**
   - Click derecho en el proyecto
   - `Run As` → `Spring Boot App`

### **Método 3: Desde la Terminal (Windows/Mac/Linux)**

**Windows:**
```bash
# Navegar a la carpeta del proyecto
cd ruta/al/proyecto

# Ejecutar con Gradle Wrapper
.\gradlew.bat bootRun
```

**Mac/Linux:**
```bash
# Navegar a la carpeta del proyecto
cd ruta/al/proyecto

# Dar permisos de ejecución (solo primera vez)
chmod +x gradlew

# Ejecutar con Gradle Wrapper
./gradlew bootRun
```

### **Verificar que arrancó correctamente:**

Deberías ver en la consola algo como:

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.x.x)

...
Started DemoApplication in 3.245 seconds (JVM running for 3.789)
```

---

## 🌐 Acceso a la Aplicación

Una vez ejecutado el proyecto:

### **Interfaz Web (Frontend)**
```
http://localhost:8080/
```

Aquí podrás:
- ✅ Crear nuevos productos mediante formulario
- ✅ Ver lista de todos los productos
- ✅ Eliminar productos
- ✅ Interfaz visual e intuitiva

### **API REST (Backend)**

Base URL: `http://localhost:8080/api/productos`

---

## 📡 Documentación de la API

### **Endpoints Disponibles**

| Método | Endpoint | Descripción | Código Éxito |
|--------|----------|-------------|--------------|
| GET | `/api/productos` | Obtener todos los productos | 200 |
| GET | `/api/productos/{id}` | Obtener un producto por ID | 200 |
| POST | `/api/productos` | Crear un nuevo producto | 201 |
| PUT | `/api/productos/{id}` | Actualizar un producto existente | 200 |
| DELETE | `/api/productos/{id}` | Eliminar un producto | 204 |

### **Ejemplos de Uso**

#### **1. Crear un Producto (POST)**

**Request:**
```http
POST http://localhost:8080/api/productos
Content-Type: application/json

{
  "nombre": "Laptop Gamer",
  "precio": 1500.00,
  "descripcion": "Laptop gaming con RTX 3060 y 16GB RAM"
}
```

**Response (201 Created):**
```json
{
  "id": 1,
  "nombre": "Laptop Gamer",
  "precio": 1500.0,
  "descripcion": "Laptop gaming con RTX 3060 y 16GB RAM"
}
```

#### **2. Obtener Todos los Productos (GET)**

**Request:**
```http
GET http://localhost:8080/api/productos
```

**Response (200 OK):**
```json
[
  {
    "id": 1,
    "nombre": "Laptop Gamer",
    "precio": 1500.0,
    "descripcion": "Laptop gaming con RTX 3060 y 16GB RAM"
  },
  {
    "id": 2,
    "nombre": "Mouse Inalámbrico",
    "precio": 45.99,
    "descripcion": "Mouse ergonómico con sensor óptico"
  }
]
```

#### **3. Obtener Producto por ID (GET)**

**Request:**
```http
GET http://localhost:8080/api/productos/1
```

**Response (200 OK):**
```json
{
  "id": 1,
  "nombre": "Laptop Gamer",
  "precio": 1500.0,
  "descripcion": "Laptop gaming con RTX 3060 y 16GB RAM"
}
```

#### **4. Actualizar Producto (PUT)**

**Request:**
```http
PUT http://localhost:8080/api/productos/1
Content-Type: application/json

{
  "nombre": "Laptop Gamer Pro",
  "precio": 1800.00,
  "descripcion": "Laptop gaming actualizada con RTX 4060"
}
```

**Response (200 OK):**
```json
{
  "id": 1,
  "nombre": "Laptop Gamer Pro",
  "precio": 1800.0,
  "descripcion": "Laptop gaming actualizada con RTX 4060"
}
```

#### **5. Eliminar Producto (DELETE)**

**Request:**
```http
DELETE http://localhost:8080/api/productos/1
```

**Response (204 No Content):**
```
(Sin contenido)
```

---

## 🧪 Pruebas con Herramientas Externas

### **Opción 1: Postman**

1. **Descargar:** https://www.postman.com/downloads/
2. **Crear peticiones según la documentación de endpoints**
3. **Probar todos los métodos HTTP**

### **Opción 2: cURL (Terminal)**

**Crear producto:**
```bash
curl -X POST http://localhost:8080/api/productos \
  -H "Content-Type: application/json" \
  -d "{\"nombre\":\"Teclado Mecánico\",\"precio\":120.00,\"descripcion\":\"Teclado RGB\"}"
```

**Listar productos:**
```bash
curl http://localhost:8080/api/productos
```

**Obtener por ID:**
```bash
curl http://localhost:8080/api/productos/1
```

**Eliminar:**
```bash
curl -X DELETE http://localhost:8080/api/productos/1
```

---

## 🔧 Solución de Problemas Comunes

### **1. Error: "Project JDK is not defined"**

**Solución:**
- `File` → `Project Structure` → `Project`
- Seleccionar SDK con Java 17+
- Si no aparece, descargar desde: https://adoptium.net

### **2. Error: "Cannot find Java installation matching languageVersion=17"**

**Solución:**
- Instalar JDK 17 o superior
- Configurar en IntelliJ: `File` → `Project Structure`
- O cambiar versión en `build.gradle`

### **3. Error: "Address already in use: bind"**

**Causa:** Puerto 8080 ocupado

**Solución:** Cambiar puerto en `application.properties`:
```properties
server.port=8081
```

### **4. Error de conexión a PostgreSQL**

**Solución:**
1. Verificar que PostgreSQL esté corriendo
2. Verificar credenciales en `application.properties`
3. Verificar que exista la base de datos `demo_db`
4. Como alternativa, usar H2 en memoria

### **5. CORS Error en navegador**

**Solución:**
Verificar que exista la clase `WebConfig.java` en `src/main/java/com/example/demo/config/`

---

## 📁 Estructura de la Base de Datos

### **Tabla: productos**

| Campo | Tipo | Restricciones | Descripción |
|-------|------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador único |
| nombre | VARCHAR(100) | NOT NULL | Nombre del producto |
| precio | DOUBLE | NOT NULL | Precio del producto |
| descripcion | VARCHAR(500) | NULL | Descripción detallada |

**Script SQL (se crea automáticamente con JPA):**
```sql
CREATE TABLE productos (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DOUBLE PRECISION NOT NULL,
    descripcion VARCHAR(500)
);
```

---

## 👨‍💻 Autor

**Nombre:** NOVA 348
**Ficha:** 2977348
**Institución:** SENA  
**Evidencia:** GA7-220501096-AA3-EV01  
**Fecha:** Octubre 2025  

---

## 📄 Licencia

Este proyecto fue desarrollado con fines educativos como parte del programa de formación del SENA.

---

**¡Gracias por revisar este proyecto!** 🚀
