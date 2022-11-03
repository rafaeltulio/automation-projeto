#language: pt
#encoding: utf-8
#@regressao
Funcionalidade: Login

  Contexto:
    Dado o usuário acessar a url da aplicação sap

  @login
  Cenario: Login - Realizar login com sucesso
    Quando acesso a tela de login
    E informo os dados de login "US_FRONTAUTO"
    E informo os dados de senha "frontauto2022"
    E selecionar o botão login
    Entao sou direcionado para pagina inicial

  @login
  Cenario: Login - Realizar login com email inválido
    Quando acesso a tela de login
    E informo os dados de login "US_FRONTAUTO"
    E informo os dados de senha "12345@Joao"
    E selecionar o botão login
    Entao recebo mensagem informando dados inválidos "Mandante, nome ou senha incorretos. Repetir logon"

  @login
  Cenario: Login - Realizar login com senha inválida
    Quando acesso a tela de login
    E informo os dados de login "qa_automacao@rentcars.com"
    E informo os dados de senha "teste.teste"
    E selecionar o botão login
    Entao recebo mensagem informando dados inválidos "Mandante, nome ou senha incorretos. Repetir logon"
