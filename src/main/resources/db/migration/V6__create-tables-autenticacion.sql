CREATE TABLE autenticaciones (
    id BIGINT NOT NULL auto_increment,
    login VARCHAR(100) NOT NULL,
    clave VARCHAR(256) NOT NULL,

    PRIMARY KEY(id)
);

INSERT INTO autenticaciones (login, clave)
VALUES
    ('david', '$2y$10$QsPUhb8SFx6Zz03PWfFGCu.5IHTg/DQIPNsim.zS05GCFNYPm/qDW'),
    ('alana', '$2y$10$45Kfb2eXym9/6FwQIGjar.2KgaINtgUx.J9YNATNho8nQ11Jng1Q6');
