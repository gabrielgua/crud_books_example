create table livro (
    id bigint auto_increment,
    nome varchar(60) not null,
    autor varchar(60) not null,
    data_lancamento date not null,

    primary key (id)
) engine=InnoDB default charset=UTF8MB4;
