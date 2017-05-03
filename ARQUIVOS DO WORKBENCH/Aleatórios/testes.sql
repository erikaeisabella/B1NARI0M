select * from chamado;

SELECT * FROM menu WHERE id=1;

UPDATE menu SET nome="as", link="das", id_perfil=2 WHERE id=1;

select * from menu;

SELECT * FROM equipamento WHERE etiqueta=12;

select count(bin) from chamado WHERE bin=4;

SELECT count(status) FROM chamado WHERE status="aberto";

SELECT curdate();

Select id,nome from perfil;

UPDATE menu SET nome= "ma", link="drid", id_perfil=1 WHERE id =1;

SELECT (localidade) FROM chamado;

SELECT c.* FROM chamado as c, chamado_cliente as cc WHERE c.bin=cc.chamado_bin AND cc.cliente_matricula="CL123";

DELETE FROM equipamento WHERE etiqueta=123;

SELECT bin FROM chamado WHERE status='aberto';

UPDATE equipamento SET etiqueta=125 WHERE etiqueta=12;