ALTER TABLE topicos add constraint fk_autor_id foreign key(autor_id) references usuarios(id);
ALTER TABLE topicos add constraint fk_cursos_id foreign key(curso_id) references usuarios(id);