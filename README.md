<h1>API de Gerenciamento de Cardápio 🍽️</h1>
<p>A API de Gerenciamento de Cardápio é uma ferramenta desenvolvida em Java 17 para praticar habilidades de desenvolvimento. Embora seja um projeto de portfólio, foi projetada com a funcionalidade de lidar com as operações básicas (CRUD) dos produtos em um cardápio, com potencial utilidade para restaurantes e estabelecimentos similares. Esta API oferece uma visão prática, demonstrando habilidades técnicas e conhecimentos em desenvolvimento de software.</p>

<br>

<h2>Descrição:</h2>
<p>
Esta API oferece funcionalidades para criação, leitura, atualização e exclusão de produtos em um cardápio. É uma solução eficiente para restaurantes, e similares que precisam gerenciar seus menus de forma organizada.
</p>

<br>

<h2>Instalações:</h2>

<p>Para utilizar esta API, é necessário ter o Java 17, IDE de preferência e o MySQL instalados em sua máquina.</p>

<br>

<h2>Configuração Banco de dados:</h2>

<ol>
    <li>Baixe e instale o MySQL, se ainda não tiver feito isso.</li>
    <li>Após a instalação, crie um banco de dados para a API.</li>
</ol>

<br>

<h2>Configuração das Variáveis de Ambiente</h2>

<p>Para configurar corretamente as variáveis de ambiente necessárias para o build do projeto sem remover as variáveis do arquivo de configuração <strong>'application.properties'</strong>, siga estas etapas:</p>
<br>

<ol>
    <li>Abra as configurações de variáveis de ambiente do seu ambiente de desenvolvimento ou IDE.</li>
    <li>Adicione as seguintes variáveis de ambiente, substituindo os valores pelos específicos do seu banco de dados:</li>
</ol>

<br>

<pre><code>
DB_JDBC_URL=jdbc:mysql://localhost:8080/seu_banco_de_dados
DB_USER=seu_usuario
DB_PASSWORD=sua_senha
</code></pre>

<br>

<p>Certifique-se de que as variáveis de ambiente estejam definidas com os valores corretos no seu ambiente de desenvolvimento antes de executar o build do projeto. Essas variáveis permitirão que o projeto se conecte ao banco de dados corretamente durante o processo de build.</p>
