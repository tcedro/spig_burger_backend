INSERT INTO tb_categoria(name) VALUES('Lanche');
INSERT INTO tb_categoria(name) VALUES('Bebida');
INSERT INTO tb_categoria(name) VALUES('Porção');

INSERT INTO tb_lanche(name, short_description,  ingredientes, price) VALUES('CTRL+F', 'Hambúrguer artesal com queijo cheader e cebola caramelizada', 'Carne 120g, Queijo Cheader, Cebola roxa', 22.0);
INSERT INTO tb_lanche (name, short_description, ingredientes, price) VALUES ('Double Cheese', 'Hambúrguer duplo com queijo cheddar e molho especial', '2 Carne 120g, Queijo Cheddar, Alface, Tomate, Cebola, Molho especial', 25.0);
INSERT INTO tb_lanche (name, short_description, ingredientes, price) VALUES ('Veggie Deluxe', 'Hambúrguer vegetariano com cogumelos e queijo derretido', 'Hambúrguer de cogumelos, Queijo derretido, Alface, Tomate, Cebola roxa', 20.0);
INSERT INTO tb_lanche (name, short_description, ingredientes, price) VALUES ('BBQ Bacon', 'Hambúrguer com molho barbecue e bacon crocante', 'Carne 150g, Queijo, Bacon, Cebola caramelizada, Alface, Molho barbecue', 23.5);

INSERT INTO tb_bebida (name, is_alcoolica, short_description, price) VALUES ('Coca-cola', FALSE, 'Refigerante de Cola', 5.0);
INSERT INTO tb_bebida (name, is_alcoolica, short_description, price) VALUES ('Suco de Laranja', FALSE, 'Suco natural de laranja', 6.0);
INSERT INTO tb_bebida (name, is_alcoolica, short_description, price) VALUES ('Caipirinha', TRUE, 'Coquetel com cachaça, limão e açúcar', 10.0);
INSERT INTO tb_bebida (name, is_alcoolica, short_description, price) VALUES ('Água Mineral', FALSE, 'Água sem gás', 3.0);

INSERT INTO tb_porcao (name, price, short_description) VALUES('Batata Frita', 17.0, '100g de Batata americana frita em tiras')
INSERT INTO tb_porcao (name, price, short_description) VALUES ('Onion Rings', 12.0, 'Porção de anéis de cebola empanados e crocantes');
INSERT INTO tb_porcao (name, price, short_description) VALUES ('Frango à Passarinho', 20.0, 'Porção de pedaços de frango fritos e temperados');
INSERT INTO tb_porcao (name, price, short_description) VALUES ('Mandioca Frita', 15.0, 'Porção de mandioca cozida e frita');


