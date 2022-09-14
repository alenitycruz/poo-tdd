# DESAFIO-TDD-POO
Este é o Segundo Desafio da Turma Starter JAVA 4

Consiste em Aplicar TDD nos Exercícios anteriores de POO(Desafio 1) aos quais selecionei 3:

1 - Exercício do "Veículo"

2 - Exercício da "Loja"

3 - Exercício dos "Empregados"

Este último("Exercício dos Empregados"), na realidade seria o 5º Exercício levando em consideração sua referência do Desafio 1.

Foram realizados os métodos de Baby Steps na aplicação do TDD.
======================================================================
Seguem os Enunciados dos Exercícios Propostos:
1 - Exercício do "Veículo"
Seguindo o diagrama UML a seguir, implemente a classe Veiculo e seus
métodos. Após a implementação, testar cada um dos métodos via console.
acelerar(): este método acrescenta um valor de 20 no atributo
velocidade.
abastecer(int combustivel): recebe como parâmetro uma quantidade de
combustível e atribui a listrosCombustivel. OBS O limite do tanque de
combustível é de 60 litros, validar para não ultrapassar.
frear(): a cada chamada do método diminui a velocidade em 20. Não
aceitar a chamada do método se o veiculo estiver parado.
pintar(String cor): recebe uma cor como parâmetro e altera o atributo.
ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.
desligar(): Verifica se o veículo já se encontra desligado, caso não, desliga
o carro. Não permitir que desligue o veículo com (velocidade > 0.


2 - Exercício da "Loja"
Seguindo o diagrama UML a seguir, implemente as classes, interfaces e as
saídas do programa. Após a implementação, testar cada um dos métodos via
console.


3 - Exercício dos "Empregados"
Considerando os conceitos de Orientação a Objetos, crie uma classe Pai de
nome Funcionário com os seguintes atributos (nome, idade e salário) e mais
três classes Filhas Gerente, Supervisor e Vendedor). Na classe Funcionário
deve existir um método de nome bonificação que retorna o salário, nas
classes filhas deve existir o mesmo método bonificação porem com as
seguintes regras:
Para Gerente, o método bonificação deve retornar o salário + 10000.00;
Para Supervisor, o método bonificação deve retornar o salário + 5000.00;
Para Vendedor, o método bonificação deve retornar o salário + 3000.00;
Por fim, criar uma classe principal que instancie objetos de Gerente,
Supervisor e Vendedor e adicione no mínimo um valor para cada atributo e
imprima cada funcionário (Gerente, Supervisor e Vendedor) com suas devidas
bonificações
