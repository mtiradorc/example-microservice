CREATE TABLE usuario (
  id bigint NOT NULL AUTO_INCREMENT,
  usuario varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO usuario (usuario,password) VALUES ('Mtiradorc', '1234');