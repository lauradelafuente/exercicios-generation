CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionaries(
id bigint auto_increment primary key,
nome varchar(255),
data_nascimento date,
funcao varchar(255),
salario decimal (6,2)
);

SELECT * FROM  tb_funcionaries;

INSERT INTO tb_funcionaries(nome,data_nascimento,funcao,salario)VALUES("Flavio","1997-4-3","Gerente de OP",4500);

SELECT * FROM tb_funcionaries;

SELECT * FROM tb_funcionaries WHERE salario > 4000;

SELECT * FROM tb_funcionaries WHERE salario <= 4000;
 