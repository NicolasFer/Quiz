create database Questionario;

use Questionario;

create table pergunta(
id int auto_increment,
descricao varchar(80),
comentario varchar(120),
resposta_certa int,
PRIMARY KEY (id));

create table resposta(
id int auto_increment,
descricao varchar(45),
id_pergunta int,
PRIMARY KEY (id),
FOREIGN KEY (id_pergunta) REFERENCES 
pergunta (id) ON DELETE CASCADE ON UPDATE CASCADE);