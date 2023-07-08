package automatizado.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.test.BaseTesteLogin;

public class LoginPO extends BasePO {

    public LoginPO(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement buttonEntrar;

    @FindBy(id = "mensagem")
    public WebElement spanMensagem;

    public String PegarTitulo() {
        return driver.getTitle();
    }


}
