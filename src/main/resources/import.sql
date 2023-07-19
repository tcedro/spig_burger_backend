CREATE TABLE tb_users(
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    login TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    role TEXT NOT NULL
);

INSERT INTO tb_categoria(name) VALUES('Lanche');
INSERT INTO tb_categoria(name) VALUES('Bebida');
INSERT INTO tb_categoria(name) VALUES('Porção');

INSERT INTO tb_lanche(name, short_description,  ingredientes, price, categoria_id) VALUES('CTRL+F', 'Hambúrguer artesal com queijo cheader e cebola caramelizada', 'Carne 120g, Queijo Cheader, Cebola roxa', 22.0, 1);
INSERT INTO tb_lanche (name, short_description, ingredientes, price, categoria_id) VALUES ('Double Cheese', 'Hambúrguer duplo com queijo cheddar e molho especial', '2 Carne 120g, Queijo Cheddar, Alface, Tomate, Cebola, Molho especial', 25.0, 1);
INSERT INTO tb_lanche (name, short_description, ingredientes, price, categoria_id) VALUES ('Veggie Deluxe', 'Hambúrguer vegetariano com cogumelos e queijo derretido', 'Hambúrguer de cogumelos, Queijo derretido, Alface, Tomate, Cebola roxa', 20.0, 1);
INSERT INTO tb_lanche (name, short_description, ingredientes, price, categoria_id) VALUES ('BBQ Bacon', 'Hambúrguer com molho barbecue e bacon crocante', 'Carne 150g, Queijo, Bacon, Cebola caramelizada, Alface, Molho barbecue', 23.5, 1);

INSERT INTO tb_bebida (name, is_alcoolica, short_description, price, categoria_id) VALUES ('Coca-cola', FALSE, 'Refigerante de Cola', 5.0, 2);
INSERT INTO tb_bebida (name, is_alcoolica, short_description, price, categoria_id) VALUES ('Suco de Laranja', FALSE, 'Suco natural de laranja', 6.0, 2);
INSERT INTO tb_bebida (name, is_alcoolica, short_description, price, categoria_id) VALUES ('Caipirinha', TRUE, 'Coquetel com cachaça, limão e açúcar', 10.0, 2);
INSERT INTO tb_bebida (name, is_alcoolica, short_description, price, categoria_id) VALUES ('Água Mineral', FALSE, 'Água sem gás', 3.0, 2);

INSERT INTO tb_porcao (name, price, short_description, categoria_id) VALUES('Batata Frita', 17.0, '100g de Batata americana frita em tiras', 2)
INSERT INTO tb_porcao (name, price, short_description, categoria_id) VALUES ('Onion Rings', 12.0, 'Porção de anéis de cebola empanados e crocantes', 2);
INSERT INTO tb_porcao (name, price, short_description, categoria_id) VALUES ('Frango à Passarinho', 20.0, 'Porção de pedaços de frango fritos e temperados', 2);
INSERT INTO tb_porcao (name, price, short_description, categoria_id) VALUES ('Mandioca Frita', 15.0, 'Porção de mandioca cozida e frita', 2);


