# ServicioUsuarios
ServicioUsuarios


Aplicacion desarrollada con la tecnologia de spring boot , spring data 
la cual esta conectada a una instancia de bd mysql en google app egine 
en la cual esta creada la tabla usuario :

CREATE TABLE usuario(
id bigint AUTO_INCREMENT,
name VARCHAR(150) NOT NULL,
phone VARCHAR(20),
birth_date  DATE,
PRIMARY KEY (id)
);


las propiedades de conexion en la instancia de bd en la nube estan en el archivo properties del proyecto 

spring.datasource.url=jdbc:mysql://35.236.62.131:3306/microservices?useTimezone=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root123


para poder acceder a ella se necesita agregar la ip publica de quien lo quiera consumir .



