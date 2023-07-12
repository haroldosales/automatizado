package automatizado.PO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPO extends BasePO {

    public LoginPO(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    @FindBy(id = "email")
    public static WebElement inputEmail;

    @FindBy(id = "senha")
    public static WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement buttonEntrar;

    @FindBy(id = "mensagem")
    public WebElement spanMensagem;

    public String PegarTitulo() {
        return driver.getTitle();
    }


    public static void LogarComNomex(String email, String senha)
    {
        inputEmail.sendKeys(email,Keys.ENTER);
        inputSenha.sendKeys(senha,Keys.ENTER);

    }


  

}
