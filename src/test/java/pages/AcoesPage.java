package pages;

import maps.AcoesMaps;

public class AcoesPage {

    AcoesMaps acoesMaps = new AcoesMaps();


    public void preenchoOCampoPesquisaCom(String value) {
        acoesMaps.inputSearch.sendKeys(value);
        acoesMaps.inputSearch.click();
    }

    public void clicoEm() {
        acoesMaps.buttonGoogleSearch.click();
    }

    public void exibeOValorDaAcao() {
        acoesMaps.spanValorAcao.getText();
    }
}
