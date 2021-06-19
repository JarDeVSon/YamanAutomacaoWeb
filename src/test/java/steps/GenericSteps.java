package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class GenericSteps {
    @Before
    public void abreNavegador(){
        Driver.abreNavegador();

    }

    @After
    public void fechaNavegador(Scenario cenario) throws IOException {
        System.out.println(cenario.getName() + " Status: " + cenario.getStatus());
        Driver.printScreen(cenario.getName());
        Driver.fechaNavegador();
    }
    @Given("que possuo uma conta no site da Trios de Capacitação {string}")
    public void quePossuoUmaContaNoSiteDaTriosDeCapacitacao(String string) {
        Driver.driver.get("https://triosdecapacitacao.eadplataforma.com/login/");
    }
}
