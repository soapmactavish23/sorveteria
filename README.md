# Sorveteria - Sistema de Pedidos Usando o Padrão Decorator

## Descrição do Problema

A sorveteria precisa de um sistema para gerenciar os pedidos dos clientes, onde os sorvetes podem ser servidos em diferentes recipientes (copo, taça, casquinha) e com coberturas adicionais (chocolate, morango, caramelo). Cada sorvete tem um custo base por bola e a adição de coberturas ou a escolha do recipiente pode influenciar o preço final.

## Padrão Decorator

Optamos por utilizar o padrão de projeto **Decorator** para implementar esse sistema porque ele permite adicionar dinamicamente responsabilidades aos objetos (neste caso, os sorvetes) sem a necessidade de criar subclasses para cada possível combinação de sabores, recipientes e coberturas.

### Vantagens do Decorator:

- **Flexibilidade**: Permite adicionar ou remover funcionalidades em tempo de execução.
- **Manutenção**: Evita a criação de diversas subclasses para cada combinação de opções de sorvete, cobertura e recipiente.
- **Modularidade**: Cada componente ou responsabilidade adicional (como coberturas) é tratada de forma independente, facilitando a manutenção e extensão do código.

## Estrutura do Sistema

- **Sorvete**: Componente base que define as funcionalidades essenciais (preço e descrição).
- **SorveteConcreto**: Implementação concreta que define os diferentes sabores e seus respectivos preços.
- **Cobertura**: Classe abstrata que serve como base para a adição de coberturas aos sorvetes.
- **Coberturas Concretas**: Implementações específicas para adicionar cobertura de chocolate, morango ou caramelo.

Essa abordagem garante um sistema escalável e de fácil modificação, que atende às necessidades de adicionar/remover elementos de forma dinâmica e modular.

