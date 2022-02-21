drop table T_OT_USUARIO CASCADE;

create table T_OT_USUARIO(
	id_usuario serial CONSTRAINT PK_OT_USUARIO primary key,
	nm_usuario varchar(20),
	dt_nascimento varchar(30),
	nr_cpf varchar(20) not null,
	tp_sexo varchar(20) not null,
	ds_email varchar(100) not null,
	ds_senha varchar(20) not null,
	nr_telefone int not null,
	nm_estado varchar(60),
	nm_cidade varchar(60),
	nm_bairro varchar(60),
	nr_cep varchar(15),
	ds_logradouro varchar(100)
);


						 
SELECT * FROM T_OT_USUARIO;
