#language: pt
#encoding: utf-8
#@regressao
Funcionalidade: Validar fluxo apuração PIS/COFINS

  Contexto:
    Dado o usuário acessar a url da aplicação sap
    Quando acesso a tela de login
    E preencho os dados de acesso

  @apuracao
  Cenário: Validar acesso a tela Painel PIS/COFINS
    Dado que estou na página home
    Quando informo a transação "/N/FHG/APC02"
    #E informo o numero da apuração "1"
    #Entao visualizo a tela "Apuração PIS/COFINS"