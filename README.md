# 📘 Documentação do Sistema SAP Simples

## 📌 Introdução
Este documento descreve o funcionamento de um sistema SAP simples, detalhando suas entidades principais e os relacionamentos entre elas. O objetivo é fornecer uma visão geral da estrutura do sistema, facilitando o entendimento para desenvolvedores e administradores.

---

## 📂 Estrutura do Sistema

### 🔹 Entidades Principais

1. **Usuário**  
   Representa os funcionários que utilizam o sistema SAP para gerenciar pedidos, clientes e produtos.
    - Pode criar e gerenciar pedidos.
    - Tem permissões para acessar diferentes módulos.

2. **Cliente**  
   Representa uma empresa ou pessoa que realiza compras no sistema.
    - Pode realizar um ou mais pedidos.
    - Possui informações como nome, endereço e histórico de compras.

3. **Pedido**  
   Registro de uma compra feita por um cliente.
    - Contém múltiplos produtos.
    - Está associado a um cliente.
    - Gera uma fatura.

4. **Produto**  
   Itens disponíveis para venda no sistema.
    - Cada pedido pode conter um ou mais produtos.
    - Está vinculado ao estoque.

5. **Fatura**  
   Documento financeiro gerado após a realização de um pedido.
    - Está vinculado a um único pedido.
    - Contém informações sobre valores, impostos e formas de pagamento.

6. **Estoque**  
   Gerencia a disponibilidade dos produtos.
    - Controla a quantidade de produtos disponíveis.
    - Atualiza o saldo conforme novos pedidos são feitos.

---

## 🔗 Relacionamentos Entre Entidades

- Um **Usuário** pode **gerenciar vários Pedidos**.
- Um **Cliente** pode **realizar vários Pedidos**.
- Um **Pedido** pode **conter vários Produtos**.
- Um **Pedido** gera **uma única Fatura**.
- Um **Produto** pertence a um **Estoque**, que controla sua disponibilidade.

---

## 🔧 Funcionalidades do Sistema

### ✅ **Gestão de Pedidos**
- Criar, editar e excluir pedidos.
- Associar clientes e produtos a pedidos.

### ✅ **Controle de Estoque**
- Atualizar quantidades de produtos.
- Gerenciar entrada e saída de mercadorias.

### ✅ **Emissão de Faturas**
- Gerar faturas automaticamente após a criação de pedidos.
- Registrar pagamentos e impostos aplicáveis.

---

## 📌 Considerações Finais
Este sistema SAP simples fornece uma estrutura básica para gerenciamento de pedidos, clientes e estoque. Ele pode ser expandido conforme necessário para incluir mais módulos, como faturamento avançado, controle de logística e relatórios gerenciais.

