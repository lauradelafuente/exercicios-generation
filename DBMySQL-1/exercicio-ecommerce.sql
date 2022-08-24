CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
id bigint auto_increment primary key,
nome varchar(255),
tamanho varchar(255),
quantidade int,
valor double(6,2)
);

SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(nome,tamanho,quantidade,valor)VALUES("Camisa TIME","G",35,165);

SELECT * FROM tb_produtos WHERE valor < 100;
SELECT * FROM tb_produtos WHERE valor > 100;

UPDATE tb_produtos SET quantidade = 30 WHERE id = 6;