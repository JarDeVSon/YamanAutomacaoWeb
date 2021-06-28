#language:pt
  Funcionalidade:  Exibir valores das acoes do dia


    @todasacoes
    Esquema do Cenario: <Scenario>
      Dado que esteja na pagina "https://www.google.com.br"
      Quando preencho o campo pesquisa com "<acoes>"
      E clico em Pesquisar
      Entao exibe o valor da acao

        Exemplos:
          | Scenario         | acoes |
          | Busca acao Itsa4 | Itsa4 |
          | Busca acao abev3 | abev3 |
          | Busca acao wege3 | wege3 |
          | Busca acao mglu3 | mglu3 |
          | Busca acao bbse3 | bbse3 |
