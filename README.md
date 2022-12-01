# Teste-Desenvolvedor-Programa
Programa relacionado ao teste do Programa Best Minds 2022 - Pessoa Desenvolvedora Trainee
---------------------------------------------------------------------------------------------------------------------------------------------------- 

# Solução
- Foi desenvolvido projeto em que, o usuário pode se cadastrar e ter seu cadastro salvo no banco de dados. Também pode realizar o login, com e-mail e senha, para acessar o sistema Oliveira Trade.

## Como iniciar
- Ao abrir o Visual Studio ir na aba Tools -> NuGet Package Manager -> Package Manager Console
- Ao abrir o console digitar: "update-database"

![Instrução 01](imgs/instrucao_1.png)
![Instrução 02](imgs/instrucao_2.png)

---------------------------------------------------------------------------------------------------------------------------------------------------- 

## Ferramentas utilizadas:
- IDE: Visual Studio
- Linguagem: C# com ASP.NET
- Banco de dados: Microsoft SQL Server

---------------------------------------------------------------------------------------------------------------------------------------------------- 

<h2>Funcionalidades das Classes</h2>

<h3>OliveiraTrade</h3>
<p>Classe de Execução do Sistema</p>
<hr>

<h3>TelaLogin</h3>
<p>Login para acessar o sistema, o usuário deve informar o e-mail e senha.</p>
<p>Caso o e-mail e senha existam no sistema, será redirecionado para o sistema Oliveira Trade. Caso contrário ou tenha ocorrido algum erro de digitação, será informado uma mensagem de erro.</p>
<p align="center">
    <img width="370" src="imgs/read_me/TelaLogin.png">
    <img width="370" src="imgs/read_me/TelaLogin_sucesso.png">
    <img width="370" src="imgs/read_me/TelaLogin_erro.png">
</p>  
<hr>

<h3>TelaCadastro</h3>
<p>Para ser feito o cadastro, o usuário deve preencher todos os campos. Após serem preenchidos será retornado que o cadastro foi realizado.</p>
<p align="center">
    <img width="400" src="imgs/read_me/TelaCadastro.png">
    <img width="400" src="imgs/read_me/TelaCadastro_sucesso.png">
    <img width="400" src="imgs/read_me/TelaCadastro_erro.png">
</p>  
<hr>

<h3>TelaSistema</h3>
<p>Tela principal do Sistema, que só poderá ser acessada após o usuário realizar o login.</p>
<p align="center">
    <img width="350" src="imgs/read_me/TelaSistema.png">
</p> 
