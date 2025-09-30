CREATE TABLE IF NOT EXISTS ciudades
(
    ciud_id     SERIAL PRIMARY KEY,
    ciud_nombre VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS personas
(
    dir_tel       VARCHAR(20) PRIMARY KEY,
    dir_tipo_tel  VARCHAR(20)  NOT NULL,
    dir_nombre    VARCHAR(100) NOT NULL,
    dir_direccion VARCHAR(150) NOT NULL,
    dir_ciud_id   INT          NOT NULL REFERENCES ciudades (ciud_id)
);

INSERT INTO ciudades (ciud_nombre)
VALUES ('Bogotá'),
       ('Medellín'),
       ('Cali'),
       ('Bucaramanga'),
       ('Barranquilla');

INSERT INTO personas (dir_tel, dir_tipo_tel, dir_nombre, dir_direccion, dir_ciud_id)
VALUES ('3001112233', 'movil', 'Ana Torres', 'Calle 10 # 5-33', 1),
       ('3175557788', 'movil', 'Luis Pérez', 'Carrera 45 # 12-08', 2),
       ('6012223344', 'fijo', 'María Gómez', 'Av. Siempre Viva 742', 1),
       ('3129998877', 'movil', 'Carlos Ruiz', 'Cra 9 # 9-99', 3),
       ('6041234567', 'fijo', 'Diana López', 'Cll 30 # 20-15', 2);
