ALTER TABLE topicos DROP FOREIGN KEY fk_cursos_id;
ALTER TABLE topicos ADD CONSTRAINT fk_cursos_id FOREIGN KEY(curso_id) REFERENCES cursos(id);