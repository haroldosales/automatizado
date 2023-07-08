package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseProduto {
    protected static  WebDriver driver;
    private static final String URL_BASE = "file:///home/haroldo/Downloads/Teste%20Automatizado-20230628T220833Z-001/Teste%20Automatizado/controle-de-produtos/sistema/produtos.html";
    private static final String CAMINHO_DRIVER = "src/test/java/automatizado/resources/chromedriver";

    @BeforeClass
    public static void Iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
        }

    @AfterClass
    public static void Close(){
        driver.quit();
    }
}
