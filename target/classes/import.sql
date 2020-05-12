insert into cozinha(id, nome)
VALUES (1, 'Árabe');
insert into cozinha(id, nome)
VALUES (2, 'Chinesa');
insert into cozinha(id, nome)
VALUES (3, 'Brasileira');

insert into estado(id, nome)
VALUES (1, 'Espírito Santo');
insert into estado(id, nome)
VALUES (2, 'São Paulo');
insert into estado(id, nome)
VALUES (3, 'Minas Gerais');

insert into forma_pagamento(id, descricao)
VALUES (1, 'CRÉDITO');
insert into forma_pagamento(id, descricao)
VALUES (2, 'DÉBITO');
insert into forma_pagamento(id, descricao)
VALUES (3, 'DINHEIRO');

insert into permissao(id, descricao, nome)
VALUES (1, 'Disponibilidade para gerenciar o negócio', 'GERENTE');
insert into permissao(id, descricao, nome)
VALUES (2, 'Disponibilidade para gerenciar os pedidos', 'ATENDENTE');

insert into restaurante(id, nome, taxa_frete, cozinha_id)
VALUES (1, 'Yakisoba da China', 1, 2);
insert into restaurante(id, nome, taxa_frete, cozinha_id)
VALUES (2, 'Yakisoba Food', 2, 2);
insert into restaurante(id, nome, taxa_frete, cozinha_id)
VALUES (3, 'Esphirra\'s', 3, 1);

insert into cidade(id, nome, estado_id)
VALUES (1, 'Colatina', 1);
insert into cidade(id, nome, estado_id)
VALUES (2, 'Marilândia', 1);
insert into cidade(id, nome, estado_id)
VALUES (3, 'São Paulo', 2);
insert into cidade(id, nome, estado_id)
VALUES (4, 'Governador Valadares', 3);
insert into cidade(id, nome, estado_id)
VALUES (5, 'Belo Horizonte', 3);

