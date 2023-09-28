CREATE TABLE topicos (
    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensaje varchar(300) not null unique,
    fecha_creacion datetime not null,
    status varchar(50) not null,
    autor_id bigint not null,
    curso_id bigint not null,
    activo tinyint not null,

    primary key(id)
);

CREATE TABLE cursos (
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    categoria varchar(100) not null,
    activo tinyint not null,

    primary key(id)
);

CREATE TABLE usuarios (
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    email varchar(100) not null unique,
    contraseña varchar(100) not null,
    activo tinyint not null,
    
    primary key(id)
);