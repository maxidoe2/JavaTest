create database mitiendita;
create table johnwick (
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    PRIMARY KEY (id)
    );
INSERT INTO johnwick (id, nombre, apellido, edad) VALUES (1, 'John', 'Wick', 16);
show tables
SELECT * FROM johnwick;
