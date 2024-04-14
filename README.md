# GymBuddy

<h1>Nome dos Integrantes e Atividade Responsável</h1>

<ul>
  <li>Luigi Exposito Uchiyama - Responsável por fazer o projeto Java </li>
</ul>

<h1>Como rodar o projeto</h1>

<p>Abra o Projeto no IntelliJ:
Abra o IntelliJ IDEA e abra o projeto Java no qual você deseja trabalhar. Você pode fazer isso selecionando a opção "File" (Arquivo) no menu superior e, em seguida, escolhendo "Open" (Abrir) para navegar até o diretório do projeto e selecioná-lo.

Configure as Configurações de Execução:
No canto superior direito da janela do IntelliJ, você verá uma lista suspensa de configurações de execução / depuração. Selecione ou adicione uma configuração de execução apropriada para sua aplicação. Se não houver uma configuração adequada, clique no menu suspenso e selecione "Edit Configurations" (Editar Configurações) para adicionar uma nova.

Defina a Classe Principal:
Na janela de configurações de execução, você verá uma opção para configurar a classe principal a ser executada. Selecione a classe principal da sua aplicação Java. Geralmente, essa é a classe que contém o método main.

Execute a Aplicação:
Após configurar as opções de execução conforme necessário, você pode executar sua aplicação Java clicando no botão "Run" (Executar) na barra de ferramentas superior ou pressionando Shift + F10. Isso compilará e executará sua aplicação usando as configurações especificadas.

Visualize a Saída:
Após a execução, você verá a saída da sua aplicação no console do IntelliJ. Certifique-se de verificar o console para quaisquer mensagens de erro ou saída relevante produzida pela sua aplicação.

Interaja com a Aplicação:
Dependendo da natureza da sua aplicação, você pode interagir com ela diretamente na interface do IntelliJ ou no console, conforme necessário.

Encerre a Execução:
Quando terminar de testar ou usar sua aplicação, você pode encerrar a execução clicando no botão "Stop" (Parar) na barra de ferramentas superior ou pressionando Ctrl + F2.</p>

<h1>Diagramas</h1>

<img src="documentacao/Diagrama.png">

<h1>Link da ideia do Projeto</h1>

<h1>Endpoints</h1>

<p>
    
    async function cadastrar(nome, email, senha, idade) {
    let url = `http://localhost/cadastro/cadastrar`;

    let headers = {
        'Content-Type': 'application/json',
    };

    let body = {
        nome,
        email,
        senha,
        idade,
    };

    let response = await fetch(url, {
        method: 'POST',
        headers: headers,
        body: JSON.stringify(body),
    });
    console.log(response.status)
    };
    
</p>

<p>
    
    async function getPerfil(id) {
    let url = `http://localhost/cadastro/${id}`;

    let response = await fetch(url, {
        method: 'GET',
    });
    console.log(response.status)
    };
    
</p>

<p>
    
    async function autenticar(email, senha) {
    let url = `http://localhost/login/autenticar`;

    let headers = {
        'Content-Type': 'application/json',
    };

    let body = {
        email,
        senha,
    };

    let response = await fetch(url, {
        method: 'POST',
        headers: headers,
        body: JSON.stringify(body),
    });
    console.log(response.status)
    };
    
</p>

<p>
    
    async function getPerfil(email, senha) {
    let url = `http://localhost/login/perfil/${email}/${senha}`;

    let response = await fetch(url, {
        method: 'GET',
    });
    console.log(response.status)
    };
    
</p>
