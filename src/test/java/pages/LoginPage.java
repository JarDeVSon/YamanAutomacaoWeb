package pages;

import maps.LoginMaps;

public class LoginPage {

    LoginMaps loginMaps = new LoginMaps();

    public void verificarOPreenchimentoDoEmail(String value){
        loginMaps.inputEmail.sendKeys(value);
    }
    public void verificarOPreenchimentoDaSenha(String value){
        loginMaps.inputSenha.sendKeys(value);
    }
    public void validarAcessoAConta(){
        loginMaps.buttonEntrar.click();
    }
    public void paginaInicial(){
        loginMaps.hrefMeusCursos.visibilityOf();
    }

    public void validoORedirecionamentoDe(String value) {
        loginMaps.hrefLembrarSenha.click();
        loginMaps.inputRedefinirSenha.isDisplayed();
        loginMaps.inputRedefinirSenha.sendKeys("jardounifanor@gmail.com");
        loginMaps.buttonRedefinirSenhaEnviar.click();
    }
    public void validoORedirecionamentoEm(String value) {
        loginMaps.hrefAutenticar.click();
        loginMaps.inputReenviarAutenticacao.isDisplayed();
        loginMaps.inputReenviarAutenticacao.sendKeys("AAA@email.com");
        loginMaps.buttonReenviarAutenticacaoEnviar.click();
    }
    public void oSistemaExibeASeguinteMensagem(String value) {
        loginMaps.divMensagem.getText(value);
    }
}
