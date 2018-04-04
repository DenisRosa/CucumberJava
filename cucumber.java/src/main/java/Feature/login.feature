# language: pt
Funcionalidade: Acessar e Logar no e-mail CWI

  Contexto: 
    Dado que estou na tela de login

  @login
  Cenario: Realizar login no e-mail CWI
    Quando informar usuario e senha validos
    |usuario   |senha       |
    |denis.rosa|@reseta*1313|
    E clico em login
    Entao a tela home do sistema deve aparecer
