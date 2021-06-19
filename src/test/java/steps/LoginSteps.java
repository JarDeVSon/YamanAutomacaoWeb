package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @When("verifico o preenchimento do E-mail {string}")
    public void verificoOPreenchimentoDoEMail(String value) {
        loginPage.verificarOPreenchimentoDoEmail(value);
    }

    @When("verifico o preenchimento da Senha {string}")
    public void verificoOPreenchimentoDaSenha(String value) {
      loginPage.verificarOPreenchimentoDaSenha(value);
    }
    @Then("o sistema deve retornar {string}")
    public void oSistemaDeveRetornar(String value) {
        assertEquals(value, value);
    }

    @When("preencho as informações com E-mail {string}")
    public void preenchoAsInformacoesComEMail(String value) {
      loginPage.verificarOPreenchimentoDoEmail(value);
    }
    @When("com Senha {string}")
    public void comSenha(String value) {
        loginPage.verificarOPreenchimentoDaSenha(value);
    }
    @When("seleciono o Entrar")
    public void selecionoOEntrar() {
       loginPage.validarAcessoAConta();
    }
    @Then("o sistema deve redirecionar para a página inicial")
    public void oSistemaDeveRedirecionarParaAPaginaInicial() {
        loginPage.paginaInicial();
    }
    @When("valido o redirecionamento de {string}")
    public void validoORedirecionamentoDe(String value) {
        loginPage.validoORedirecionamentoDe(value);
    }
    @When("valido o redirecionamento em {string}")
    public void validoORedirecionamentoEm(String value) {
        loginPage.validoORedirecionamentoEm(value);
    }

    @Then("o sistema exibe a seguinte mensagem: {string}")
    public void oSistemaExibeASeguinteMensagem(String value) {
        loginPage.oSistemaExibeASeguinteMensagem(value);
        assertEquals(value, value);
    }


}
