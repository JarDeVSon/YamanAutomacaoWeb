#author: Jardeson Santos
#encoding: UTF-8
  @regressivo
Feature: Login no site da Trios de Capacitação

    Background:
      Given que possuo uma conta no site da Trios de Capacitação "https://triosdecapacitacao.eadplataforma.com/login/"

      @email
    Scenario: Verificar o preenchimento do E-mail
        When verifico o preenchimento do E-mail "jardounifanor@gmail.com"
        Then o sistema deve retornar "jardounifanor@gmail.com"

        @senha
    Scenario: Verificar o preenchimento da Senha
          When verifico o preenchimento da Senha "1996$jrd"
          Then o sistema deve retornar "1996$jrd"

      @acessar
    Scenario: Validar Acesse sua conta.
      When preencho as informações com E-mail "jardounifanor@gmail.com"
      And com Senha "1996$jrd"
      And seleciono o Entrar
      Then o sistema deve redirecionar para a página inicial

        @esqueceu_senha
    Scenario: Validar Esqueceu sua senha
      When valido o redirecionamento de "Esqueceu sua senha?"
      Then o sistema exibe a seguinte mensagem: " Senha enviada com sucesso."

          @nao_consegue_autenticar
    Scenario: Validar Nao consegue se autenticar
    When valido o redirecionamento em "Não consegue se autenticar?"
    Then o sistema exibe a seguinte mensagem: "Este e-mail não está cadastrado no EAD TRIOS DE CAPACITAÇÃO,"
