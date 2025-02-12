## 🔄 Refatoração para GraphQL

### Visão Geral
Este projeto está em processo de refatoração para suportar **GraphQL**, que irá substituir a arquitetura REST existente. A ideia é proporcionar uma maneira mais flexível e eficiente de consultar os dados dos cardápios.

### O que está sendo alterado:
- **GraphQL** será adicionado para substituir a comunicação via REST.
- A lógica de CRUD será reestruturada para utilizar GraphQL.
- As operações atuais de criação, leitura, atualização e exclusão de produtos serão mantidas, mas agora acessadas via queries e mutations do GraphQL.

### Como isso será implementado:
- Definiremos tipos, queries e mutations para gerenciar produtos no cardápio.
- A lógica para resolver as queries e mutations será implementada.

### 📝 Passos para o processo:
1. Criar o **schema GraphQL** com tipos e definições.
2. Implementar **resolvers** para conectar ao banco de dados.
3. Testar a integração da API com GraphQL.
4. Garantir que as APIs REST ainda funcionem enquanto o GraphQL é implementado.

📍 **Status Atual:** Por enquanto, a estrutura da API permanece com endpoints REST. Em breve, será possível consultar a API utilizando GraphQL.

