# locadoraJavaPoo

Trabalho executado na disciplina de Programação Orientada a Objetos no curso de Análise e Desenvolvimento de Sistemas na Universidade de Caxias do Sul.

Enunciado do Trabalho

Objetivos:

Desenvolver um modelo orientado a objetos para o problema
Implementar um conjunto de classes para representar as entidades do problema (incluindo métodos e variáveis de instância e construtores).
Empregar conceitos que facilitam a manutenção e o reuso de software (encapsulamento)
Empregar conceitos de polimorfismo.
Detalhes:

O projeto envolve o desenvolvimento de um modelo de classes para o problema abaixo e a implementação dessas classes na linguagem de programação Java.

O projeto pode ser desenvolvido em duplas

Cada classe desenvolvida neste projeto deve ter "responsabilidades" bem definidas e limitar-se a essas responsabilidades. Por exemplo, aspectos relacionados com interação com usuários devem estar localizados somente nas classes que implementam a interface de usuário!

O que deve ser entregue:

O programa em Java documentado com comentários javadoc

O Problema:

Você trabalha em uma empresa de informática que foi contratada para informatizar uma locadora de automóveis.

Nessa locadora os automóveis são classificados como populares, médios e grandes (use uma classe específica para  cada tipo de automóvel) e o valor da diária é determinado da seguinte forma:

para carros populares, o valor base é reduzido em 7% para cada ano de idade do modelo, limitado a um desconto de 21%
para carros médios, o valor base é reduzido em 5% para cada ano de idade do modelo, limitado a um desconto de 15%
para carros grandes, o valor base que é reduzido em 2% para cada ano de idade do modelo, limitado a um desconto de 8%   
A locadora precisa organizar informações sobre:

Clientes
Automóveis disponíveis
Processo de locação/devolução
O sistema para a locadora precisa fornecer uma interface de usuário simples incluindo as seguintes Funcionalidade.

Cadastrar Cliente (nome, cpf)
Cadastrar Automóvel (placa, tipo, ano do modelo e valor base da diária)
Apresentar Clientes cadastrados
Apresentar Automóveis cadastrados
Alugar um automóvel informando: cpf do cliente e número de dias (a data e hora atuais determinam o início do período de locação)
o sistema deve apresentar os automóveis disponíveis e o usuário seleciona um deles.
Devolver um automóvel informando a data da devolução
O sistema deve informar o valor a ser pago. Diárias além da data de devolução têm 10% de acréscimo
Sair
 

A avaliação será realizada com base nos seguintes elementos:

análise da estrutura do programa fonte: o projeto deve estar bem estruturado e empregando o estilo de programação orientado a objetos.
nas funcionalidades implementadas
na presença de documentação javadoc nos programas (para todas as classes e métodos principais).
