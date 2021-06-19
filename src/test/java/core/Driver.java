package core;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Driver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void abreNavegador(){
        String path = "C:\\Users\\jarde\\Desktop\\YamanAutomacaoWeb\\src\\test\\resources\\drivers\\";
        String navegador = System.getProperty("navegador");
        escolheNavegador(path, navegador);

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Driver.driver.manage().window().maximize();
    }
    public static void escolheNavegador(String path, String navegador){
        try {
            switch (navegador){
                case "chrome":
                chrome(path);
                break;
                case "firefox":
                    firefox(path);
                    break;
                case "edge":
                    edge(path);

                default:
                    chrome(path);
                    break;
            }
        } catch (Exception e){
            chrome(path);
        }
    }

    private static WebDriver chrome(String path){
        System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
        Driver.driver = new ChromeDriver();
        return Driver.driver;
    }
    private static WebDriver firefox(String path){
        System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
        Driver.driver = new FirefoxDriver();
        return Driver.driver;
    }
    private static WebDriver edge(String path){
        System.setProperty("webdriver.edge.driver", path+"msedgedriver.exe");
        Driver.driver = new EdgeDriver();
        return Driver.driver;
    }
    public static void fechaNavegador() {
        Driver.driver.quit();
    }
    public static void printScreen(String titulo) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File(".\\evidencia\\"+titulo+".png"));
    }
}
