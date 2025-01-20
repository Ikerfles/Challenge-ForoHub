# Bienvenido a ForoHub
ForoHub es una aplicación que permite a los usuarios crear, listar y gestionar tópicos en un foro virtual. 

## Caracteristicas

1. Crear Topicos
  - Los usuarios autenticados pueden crear nuevos tópicos para iniciar discusiones.
  - Endpoint: POST /topico:
    
    {
      "titulo": "String",
      "mensaje": "String",
      "autor": "String",
      "curso": "String"
    }
    
  - Seguridad: Se requiere un token JSON Web Token (JWT) válido para autenticar la solicitud.
  - Respuesta: Devuelve el tópico creado con el estado HTTP 201 Created.

2. Listar Topicos
  - Los usuarios pueden consultar una lista de todos los tópicos registrados en el foro.
  - Endpoint: GET /topico
  - Respuesta: Lista de tópicos en formato JSON.

3. Autenticación de Usuarios
  - La API incluye un sistema de autenticación mediante JWT para proteger los endpoints.
  - Endpoint: POST /login
  - Cuerpo de la petición:

    {
    	"login": "String",
    	"clave": "String"
    }
  
  - Respuesta: Devuelve un token JWT que se usará para autenticar las solicitudes subsecuentes.

4. Eliminar Tópicos
  - Los usuarios autenticados pueden eliminar tópicos específicos mediante su ID.
  - Endpoint: DELETE /topics/{id}
  - Seguridad: Se requiere autenticación JWT.
  - Respuesta: Estado HTTP 200 OK tras una eliminación exitosa.

## Códigos de Estado

  - 200 OK: Operación realizada con éxito.
  - 201 Created: Recurso creado correctamente.
  - 403 Forbidden: Acceso denegado debido a la falta de autenticación.

## Instrucciones de Uso

1. Configuración Inicial
  - Configura y ejecuta tu base de datos (por ejemplo, PostgreSQL).
  - Clona el repositorio del proyecto en tu entorno local.
  - Configura las variables de entorno necesarias, como las credenciales de la base de datos.
  - Inicia la aplicación desde tu IDE o terminal.

2. Pruebas de la API
  - Usa Insomnia o Postman para realizar solicitudes a los endpoints de la API.
  - Asegúrate de obtener un token JWT desde el endpoint de autenticación antes de acceder a los endpoints protegidos.
  - Prueba las funcionalidades como listar, crear y eliminar tópicos según lo especificado.

## Tecnologías Utilizadas

  - Java: Lenguaje principal para desarrollar la lógica de la aplicación.
  - Spring Boot: Framework utilizado para construir la API REST.
  - JWT: Implementado para garantizar la seguridad de los endpoints.
  - Insomnia: Herramienta recomendada para probar las funcionalidades de la API.
  - Base de Datos: Puedes elegir entre PostgreSQL u otras bases de datos compatibles con Spring Boot.

## ¡Gracias por utilizar ForoHub! 
Este proyecto fue creado para como parte de un challenge donde se unen los conocimientos en desarrollo backend y el uso de tecnologías modernas como Spring Boot y JWT.
