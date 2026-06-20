# Facade Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Facade** em Java, aplicado a um sistema de pedidos que envolve estoque, pagamento e entrega.

## 📌 Estrutura

- **Classe abstrata**
  - `Departamento` → define a estrutura comum para departamentos, mantendo lista de clientes com pendências.

- **Subclasses concretas (Singletons)**
  - `Estoque` → controla pendências relacionadas a disponibilidade de produtos.
  - `Pagamento` → controla pendências financeiras dos clientes.
  - `Entrega` → controla pendências na logística de entrega.

- **Facade**
  - `PedidoFacade` → fornece uma interface simplificada para verificar pendências em todos os departamentos antes de liberar o pedido.

- **Participante**
  - `Cliente` → representa o usuário que deseja finalizar um pedido.

- **Classe de execução**
  - `Main` → instancia clientes, adiciona pendências e demonstra o uso do facade.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/facade`.
3. Execute a classe `Main`.

## 💻 Saída esperada

Finalizando pedido de Vinícius:
Cliente sem pendências. Pedido liberado!

Finalizando pedido de Maria:
Cliente possui pendência no pagamento.


## 🎯 Objetivo

O padrão **Facade** fornece uma interface unificada para um conjunto de interfaces em um subsistema.  
Neste exemplo, `PedidoFacade` simplifica a interação do `Cliente` com os departamentos de `Estoque`, `Pagamento` e `Entrega`, centralizando a verificação de pendências em um único ponto.
