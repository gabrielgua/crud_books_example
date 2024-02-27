set foreign_key_checks = 0;

delete from livro;

set foreign_key_checks = 1;

alter table livro auto_increment = 1;


insert into livro (id, nome, autor, data_lancamento) values
(1, "Livro 1 teste", "Autor do livro um.", utc_timestamp),
(2, "Livro 2 teste teste", "Autor do livro dois.", utc_timestamp),
(3, "Livro três", "Autor do livro um e três.", utc_timestamp);



