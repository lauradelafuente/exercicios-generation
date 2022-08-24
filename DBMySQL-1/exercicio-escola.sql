/*comando de criação de banco de dados*/
CREATE DATABASE db_escola;
/*seleciona o banco de dados a ser usado*/
USE db_escola;
/*comando de criação de tabela*/
CREATE TABLE tb_alunes(
id bigint auto_increment primary key,
nome varchar(255),
data_nascimento date,
turma int,
nota decimal(4,2)
);
/*mostrar tabela*/
SELECT * FROM tb_alunes;

INSERT INTO tb_alunes(nome,data_nascimento,turma,nota)VALUES("Thais Oliveira","1995-6-20",57,6);

SELECT * FROM tb_alunes;

SELECT * FROM tb_alunes WHERE nota > 7;

SELECT * FROM tb_alunes WHERE nota < 7;

UPDATE tb_alunes SET nota = 7 WHERE id=3;

DELETE FROM tb_alunes WHERE id=1;