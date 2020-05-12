# qrcode-java
Projeto Maven com Java, Api Zxinf para Qrcode, Spring Boot, Spring Data Jpa

Script banco postgres

1 -Criar o Schema no pgAdmin com o nome: test_qrcode
2 - Rodar o scrip para criar a tabela:
CREATE TABLE test_qrcode.documento
(
    id integer NOT NULL,
    url text COLLATE pg_catalog."default",
    CONSTRAINT documento_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE test_qrcode.documento
    OWNER to postgres;
    
3 - Script para popular o banco

INSERT INTO test_qrcode.documento(
	id, url)
	VALUES (1, 'www6.tce.ma.gov.br/autentica');
