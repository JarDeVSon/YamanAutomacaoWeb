package maps;

import core.Element;

public class LoginMaps {

    public Element inputEmail = new Element("#email");
    public Element inputSenha = new Element("#senha");
    public Element buttonEntrar = new Element("#btn_login");
    public Element hrefMeusCursos = new Element("#btn_my");
    public Element hrefLembrarSenha = new Element("a[href='#lembrarsenha']");
    public Element hrefAutenticar = new Element("a[href='#autenticacao']");
    public Element inputRedefinirSenha = new Element("input[placeholder='Digite seu E-mail']");
    public Element buttonRedefinirSenhaEnviar = new Element("#btnRedefinePassword");
    public Element inputReenviarAutenticacao = new Element("#email");
    public Element buttonReenviarAutenticacaoEnviar = new Element("#btn_confirmacao");
    public Element divMensagem = new Element(".alert-heading");
}
