insert into CONDUTOR ( metodo_favorito , endereco , info_contato , nome ) values 
(  1 , 'Sobradinho' ,'61993253661' , 'Gustavo'),
(  1 , 'Asa Norte' ,'11111111' , 'Pedro Pla'),
(  2 , 'Samambaia' ,'2222222' , 'Thiago Arcanjo');

INSERT INTO VEICULO ( CONDUTOR_ID , NOME_MODELO , PLACA) VALUES 
(1 , 'Gol' , 'PlacaGustavo1' ),
(1 , 'Celta' , 'PlacaGustavo2'),
(2 , 'Palio' , 'Placapla1'),
(3 , 'Golzin' , 'PlacaThiago');
 

INSERT INTO BILHETE (VEICULO_ID , TIMESTAMP_INICIO , TIMESTAMP_FIM , INFO_CONTATO ) VALUES  
(  1 , CURRENT_TIMESTAMP - 30 MINUTE,  CURRENT_TIMESTAMP + 6 MINUTE  , '  ' ),
(  1 , CURRENT_TIMESTAMP - 2 HOUR,  CURRENT_TIMESTAMP  , '  ' ),
(  2 , CURRENT_TIMESTAMP - 1 DAY,  CURRENT_TIMESTAMP  - 22 HOUR , '  ' ),
(  4 , CURRENT_TIMESTAMP - 61 MINUTE,  CURRENT_TIMESTAMP , '  ' );
