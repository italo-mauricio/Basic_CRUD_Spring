<!DOCTYPE html>
<html>

<body>
    <h1>Projeto de CRUD de Usuários com Spring Boot</h1>
  
  <p>Este é um projeto de exemplo que demonstra como criar um aplicativo de CRUD (Create, Read, Update, Delete) de usuários usando o Spring Boot. Este aplicativo permite que você execute operações básicas em um banco de dados de usuários, como criar, ler, atualizar e excluir registros de usuários.</p>

  <h2>Pré-requisitos</h2>
  <p>Antes de executar este projeto, certifique-se de ter instalado o seguinte:</p>
  <ul>
      <li>Java Development Kit (JDK) 8 ou superior</li>
      <li>Maven</li>
      <li>Uma IDE, como o IntelliJ IDEA ou Eclipse (opcional)</li>
  </ul>

  <h2>Configuração do Banco de Dados</h2>
  <p>Este projeto usa o banco de dados H2 (em memória) por padrão. No entanto, você pode configurar um banco de dados diferente no arquivo <code>application.properties</code>. Certifique-se de definir as configurações corretas, como URL, nome de usuário e senha do banco de dados, se aplicável.</p>

  <h2>Como Executar</h2>
  <ol>
      <li>Clone o repositório para o seu ambiente local:
          <pre>git clone https://github.com/italo-mauricio/Basic_CRUD_Spring.git</pre>
      </li>
      <li>Navegue até o diretório do projeto:
          <pre>cd Basic_CRUD_Spring</pre>
      </li>
      <li>Compile o projeto usando o Maven:
          <pre>mvn clean install</pre>
      </li>
      <li>Execute o aplicativo Spring Boot:
          <pre>java -jar Basic_CRUD_Spring target/-1.0.jar</pre>
      </li>
  </ol>

  <p>O aplicativo estará disponível em <a href="http://localhost:8080">http://localhost:8080</a>. Você pode acessar a interface de usuário para executar as operações de CRUD de usuários.</p>

  <h2>Uso</h2>
  <p>A interface de usuário fornece as seguintes operações:</p>
  <ul>
      <li><strong>Listar Usuários:</strong> Visualize a lista de todos os usuários cadastrados.</li>
      <li><strong>Adicionar Usuário:</strong> Adicione um novo usuário fornecendo os detalhes necessários.</li>
      <li><strong>Editar Usuário:</strong> Atualize as informações de um usuário existente.</li>
      <li><strong>Excluir Usuário:</strong> Remova um usuário do banco de dados.</li>
  </ul>

  <p>As operações também podem ser acessadas programaticamente usando APIs REST. Consulte a documentação da API para obter mais informações.</p>

  <h2>Documentação da API</h2>
  <p>A documentação da API pode ser acessada em:</p>
  <a href="http://localhost:8080/swagger-ui.html">http://localhost:8080/swagger-ui.html</a>

  <h2>Contribuindo</h2>
  <p>Se você deseja contribuir para este projeto, sinta-se à vontade para abrir issues e enviar pull requests. Ficaremos felizes em receber contribuições da comunidade.</p>

  <h2>Licença</h2>
  <p>Este projeto está sob a licença <a href="LICENSE">MIT License</a>.</p>
</body>

</html>
