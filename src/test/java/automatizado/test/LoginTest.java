package automatizado.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import automatizado.PO.LoginPO;

public class LoginTest extends BaseTesteLogin {
    private static LoginPO loginPage;

    @Before
    public void Prepara() {
        loginPage = new LoginPO(driver);
    }

    @Test
    public void TesteComLoginErrado() {

        loginPage.inputEmail.sendKeys("Aadmin@admin.com");
        loginPage.inputSenha.sendKeys("admin@123");
        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertTrue(elemento, elemento.contains("E-mail ou senha inválidos"));
    }

    @Test
    public void TesteComLoginEsenhaErrado() {

        loginPage.inputEmail.sendKeys("Aadmin@admin.com");
        loginPage.inputSenha.sendKeys("teste");
        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertTrue(elemento, elemento.contains("E-mail ou senha inválidos"));
    }

    @Test
    public void TesteComLoginErradoESenhaEmBranco() {

        loginPage.inputEmail.sendKeys("teste");
        loginPage.inputSenha.sendKeys(" ");
        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertTrue(elemento, elemento.contains("E-mail ou senha inválidos"));
    }

    @Test
    public void TesteComDadosEmBranco() {

        loginPage.inputEmail.sendKeys(" ");
        loginPage.inputSenha.sendKeys(" ");
        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertTrue(elemento, elemento.contains("Informe usuário e senha, os campos não podem ser branco"));
    }

    @Test
    public void TesteComLoginEmBrancoEsenhaErrado() {

        loginPage.inputEmail.sendKeys(" ");
        loginPage.inputSenha.sendKeys("teste");
        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertTrue(elemento, elemento.contains("Informe usuário e senha, os campos não podem ser branco"));
    }

    @Test
    public void TesteComLoginErradoEsenhaErrado() {

        loginPage.inputEmail.sendKeys("teste");
        loginPage.inputSenha.sendKeys("teste");
        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertTrue(elemento, elemento.contains("E-mail ou senha inválidos"));
    }

    @Test
    public void LoginSucesso() {

        loginPage.inputEmail.sendKeys("admin@admin.com");
        loginPage.inputSenha.sendKeys("admin@123");
        loginPage.buttonEntrar.click();

        Assert.assertEquals(loginPage.PegarTitulo(), "Controle de Produtos");

    }

}
