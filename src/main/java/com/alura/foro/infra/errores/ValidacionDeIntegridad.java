package com.alura.foro.infra.errores;

public class ValidacionDeIntegridad extends RuntimeException {
    public ValidacionDeIntegridad(String s) {
        super(s);
    }

//    TO-DO
//    implementar una excepción para el siguiente error
//    2023-09-27T11:13:32.930-05:00  WARN 8848 --- [nio-8080-exec-7] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 1062, SQLState: 23000
//            2023-09-27T11:13:32.930-05:00 ERROR 8848 --- [nio-8080-exec-7] o.h.engine.jdbc.spi.SqlExceptionHelper   : Duplicate entry 'prueba' for key 'topicos.titulo'
//            2023-09-27T11:13:32.959-05:00 ERROR 8848 --- [nio-8080-exec-7] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: org.springframework.dao.DataIntegrityViolationException: could not execute statement [Duplicate entry 'prueba' for key 'topicos.titulo'] [insert into topicos (activo,autor_id,curso_id,fecha_creacion,mensaje,status,titulo) values (?,?,?,?,?,?,?)]; SQL [insert into topicos (activo,autor_id,curso_id,fecha_creacion,mensaje,status,titulo) values (?,?,?,?,?,?,?)]; constraint [topicos.titulo]] with root cause
//
//    java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'prueba' for key 'topicos.titulo'
//    at
}
