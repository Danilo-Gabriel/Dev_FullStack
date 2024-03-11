CREATE TABLE pacientes(

    id bigint not null auto_increment,
    nome varchar(200) not null,
    email varchar(200) not null unique,
    cpf varchar(11) not null unique ,
    telefone varchar(200) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null,

    primary key (id)

);