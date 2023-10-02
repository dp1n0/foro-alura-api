<h1 align="center">Foro Alura - Spring Boot REST API</h1>

![Static Badge](https://img.shields.io/badge/STATUS-FINISH-green)
![Static Badge](https://img.shields.io/badge/RELEASE%20DATE-OCTOBER-lighgreen)
![Static Badge](https://img.shields.io/badge/MAVEN%20CENTRAL-v3.8.0-blue)
![Static Badge](https://img.shields.io/badge/JAVA-17-blue)

## Proyecto

### Descripción del proyecto
Se trabajara sobre una aplicación de **foro** donde los usuarios podrán consultar por:

* Topicos
* Usuarios

Se podrá acceder a los datos con operaciones CRUD (Create, Read, Update, Eliminate). Tendrá una persistencia en base de datos MySQL.

### Reglas de negocio

***

#### Registro de un nuevo tópico
 
* URI /topicos.
* Los datos del tópico( titulo, mensaje, autor y curso) deben enviarse en el cuerpo de la solicitud, en formato JSON.
* Todos los campos son obligatorios.
* La API no debe permitirlos registros duplicados (que contengan el mismo el mismo título y mensaje)

***

#### Lista de tópicos

* La API debe tener un endpoint para la lista de todos los tópicos y debe aceptar solicitudes GET para el URI /topicos.
* Los datos del tópico (titulo, mensaje, fecha de creación, estatus autor y curso) deben devolverse en el cuerpo de la respuesta, en formato JSON.

***

#### Detallando un tópico

* La API debe tener un endpoint para la lista de todos los tópicos y debe aceptar solicitudes GET para el URI /topicos/{id}
* Los datos del tópico (titulo, mensaje, fecha de creación, estatus autor y curso) deben devolverse en el cuerpo de la respuesta, en formato JSON.

***

#### Actualizar un tópíco

* La API debe tener un endpoint para el registro de nuevos tópicos y debe aceptar solicitudes PUT para el URI /topicos/{id}
* Observación: Las mismas reglas de negocio para el registro de un tópico deben ser aplicadas en la actualización del mismo.

***

#### Eliminar topico

* La API debe tener un endpoint para la eliminación de tópicos y debe aceptar requisiciones DELETE para el URI /topicos/{id}, se realizará una eliminación lógica cambiando el valor de activo a *false*.

***

### Diagrama

![db_foro_api_1](https://github.com/dp1n0/foro-alura-api/assets/50959223/1f589549-8d7d-4764-9f77-ea5b090c2815)

## 🔋 Estado del proyecto
<h4 align="center">
   ✔️ Proyecto finalizado ✔️
</h4>

## 🔨 Funcionalidades del proyecto

![image](https://github.com/dp1n0/foro-alura-api/assets/50959223/10045097-77c1-4454-a609-197c574ff65c)

![image](https://github.com/dp1n0/foro-alura-api/assets/50959223/6b7c89c0-3db5-457b-ab38-7c04fe213f95)

![image](https://github.com/dp1n0/foro-alura-api/assets/50959223/a2283b1e-0fa0-4806-9770-a626ed1bbe14)

![image](https://github.com/dp1n0/foro-alura-api/assets/50959223/de47d6f6-a04d-4b8b-aa58-080d59fdb1db)


## ✔️ Tecnologías utilizadas
- Java 17
- Maven 3.8.0
- MySQL

## Dependencias
- Spring Boot DevTools.
- Lombok.
- Spring Web.
- Spring data JPA.
- MySQL driver.
- Flyway Migration.
- Spring Security
- Java JWT
- Springdoc OpenApi.
