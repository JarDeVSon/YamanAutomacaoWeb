package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.AcoesPage;

public class AcoesSteps {
    AcoesPage acoesPage = new AcoesPage();

    @Quando("preencho o campo pesquisa com {string}")
    public void preenchoOCampoPesquisaCom(String value) {
        acoesPage.preenchoOCampoPesquisaCom(value);
    }
    @Quando("clico em Pesquisar")
    public void clicoEm() {
        acoesPage.clicoEm();
    }
    @Entao("exibe o valor da acao")
    public void exibeOValorDaAcao() {
        acoesPage.exibeOValorDaAcao();
    }
}
