<h1 align="center">Foro Alura - Spring Boot REST API</h1>

![Static Badge](https://img.shields.io/badge/STATUS-FINISH-green)
![Static Badge](https://img.shields.io/badge/RELEASE%20DATE-SEPTEMBER-lighgreen)
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

![Uploading db_foro_api_1.png…]()

## 🔋 Estado del proyecto
<h4 align="center">
   ✔️ Proyecto finalizado ✔️
</h4>

## 🔨 Funcionalidades del proyecto
<p align="center">
  <img src="https://usagif.com/wp-content/uploads/loading-12.gif" alt="Upload" width="10%" height="10%"/>
</p>

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
