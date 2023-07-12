package automatizado.test;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automatizado.PO.LoginPO;

public class LoginTest extends BaseTesteLogin {
    private static LoginPO loginPage;

    @Before
    public void Prepara() {
        loginPage = new LoginPO(driver);
    }

    @Test
    public void TesteComLoginErrado() {

                        loginPage.LogarComNomex("Aadmin@admin.com","admin@123");

        
        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertEquals(elemento, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TesteComLoginEsenhaErrado() {

                loginPage.LogarComNomex("Aadmin@admin.com","teste");

        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertEquals(elemento, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TesteComLoginErradoESenhaEmBranco() {

                loginPage.LogarComNomex("teste","");

        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertEquals(elemento, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TesteComDadosEmBranco() {

        loginPage.LogarComNomex("","");

        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertEquals(elemento, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TesteComLoginEmBrancoEsenhaErrado() {

     
                loginPage.LogarComNomex("null","teste");

        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertEquals(elemento, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TesteComLoginErradoEsenhaErrado() {
        
        loginPage.LogarComNomex("teste","teste");

        loginPage.buttonEntrar.click();

        String elemento = loginPage.spanMensagem.getText();

        Assert.assertEquals(elemento, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void LoginSucesso() {

     
        loginPage.LogarComNomex("admin@admin.com","admin@123");

        Assert.assertEquals(loginPage.PegarTitulo(), "Controle de Produtos");

    }

}
