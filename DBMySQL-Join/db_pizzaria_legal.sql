CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias(
id bigint auto_increment primary key,
descricao varchar(255),
tamanho varchar(255),
borda_recheada boolean
);
CREATE TABLE tb_pizzas(
id bigint auto_increment primary key,
sabor varchar(255),
preco decimal (6,2),
massa varchar(255),
quantidade int,
categoria_id bigint,

FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);