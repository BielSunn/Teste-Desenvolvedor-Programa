drop table T_OT_USUARIO CASCADE;
drop table T_OT_ENDERECO CASCADE;

create table T_OT_USUARIO(
	id_usuario serial CONSTRAINT PK_OT_USUARIO primary key,
	nm_usuario varchar(20),
	dt_nascimento date,
	nr_cpf varchar(20) not null,
	tp_sexo varchar(20) not null,
	ds_email varchar(100) not null,
	ds_senha varchar(20) not null,
	nr_telefone int not null
);

create table T_OT_ENDERECO (
	id_endereco serial CONSTRAINT PK_OT_ENDERECO primary key,
	id_usuario int not null,
	nm_estado varchar(60),
	nm_cidade varchar(60),
	nm_bairro varchar(60),
	nr_cep int,
	ds_logradouro varchar(100)
);

ALTER TABLE T_OT_ENDERECO
ADD CONSTRAINT FK_OT_USUARIO_ENDERECO FOREIGN KEY (id_usuario) REFERENCES T_OT_USUARIO(id_usuario);






SELECT * FROM T_OT_USUARIO;
SELECT * FROM T_OT_ENDERECO;