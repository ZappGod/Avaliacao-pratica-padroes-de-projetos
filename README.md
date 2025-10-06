## Questão 1
O Factory Method foi escolhido porque permite criar objetos de maneira flexível, delegando às subclasses a responsabilidade de instanciar o tipo correto.
O código cliente (MainDemo) não precisa conhecer as classes concretas.
O sistema fica aberto para extensão (novos tipos de transporte podem ser adicionados sem modificar o código existente).
O cálculo é feito de forma polimórfica, com base na interface FareCalculator.

## Questão 2
Esse padrão desacopla a criação dos objetos do código cliente, permitindo adicionar novos tipos de pagamento facilmente.
O cliente (MainDemo) não precisa saber como cada processador é criado.
A fábrica (PaymentFactory) centraliza a lógica de criação.
O contrato comum (PaymentProcessor) garante que todos os meios de pagamento implementem o mesmo método processPayment().

## Questão 3
O padrão Observer é ideal para cenários onde um objeto (o Sujeito) precisa informar automaticamente várias outras partes (Observadores) sobre mudanças em seu estado.
Cada NewsTopic mantém uma lista de leitores (observers).
Quando uma notícia é publicada, o método notifyObservers() percorre a lista e chama update() em cada leitor inscrito.
Os leitores recebem automaticamente a atualização, sem que o site precise manter listas manuais ou condicionais.

## Questão 4
O padrão Decorator permite estender o comportamento de objetos de forma dinâmica e flexível, encapsulando-os dentro de outros objetos.
O BasicReport gera o conteúdo básico.
Cada decorador recebe um Report como parâmetro no construtor e adiciona uma funcionalidade.
O cliente (classe MainDemo) decide dinamicamente quais funcionalidades empilhar.

## Questão 5
O padrão Prototype permite criar novos objetos clonando objetos existentes, evitando a necessidade de instanciar e configurar tudo novamente.
O sistema define um modelo base de documento (DesignDocument).
Quando um novo documento é necessário, o sistema apenas chama clone() no modelo.
O clone pode ser personalizado (mudando cor, fonte, logo) sem afetar o original.

### Criado por Gabriell de Souza Zappelini
