insert into CONDUTOR ( id , metodo_favorito , endereco , info_contato , nome ) values 
( 1 , 1 , 'Sobradinho' ,'61993253661' , 'Gustavo'),
( 2 , 1 , 'Asa Norte' ,'11111111' , 'Pedro Pla'),
( 3 , 2 , 'Samambaia' ,'2222222' , 'Thiago Arcanjo');

INSERT INTO VEICULO ( CONDUTOR_ID , ID, NOME_MODELO , PLACA) VALUES 
( 1 , 1 , 'Gol' , 'PlacaGustavo1' ),
(1 , 2 , 'Celta' , 'PlacaGustavo2'),
(2 , 3 , 'Palio' , 'Placapla1');


INSERT INTO BILHETE ( ID , VEICULO_ID , TIMESTAMP_INICIO , TIMESTAMP_FIM , INFO_CONTATO ) VALUES  
( 1 , 1 , CURRENT_TIMESTAMP - 30 MINUTE,  CURRENT_TIMESTAMP  , '  ' ),
( 2 , 1 , CURRENT_TIMESTAMP - 2 HOUR,  CURRENT_TIMESTAMP  , '  ' ),
( 3 , 2 , CURRENT_TIMESTAMP - 1 DAY,  CURRENT_TIMESTAMP  - 22 HOUR , '  ' );
