package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features/",
        tags = "@acessar",
        glue = "steps",
        monochrome = true,
        plugin = {"json:target/reports/CucumberReports.json", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerTest {

    @BeforeClass
    public static void iniciaExecucao(){
        System.setProperty("navegador", "chrome");
    }
}
