package automatizado.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import automatizado.PO.GooglePO;


public class GoogleTeste extends BaseGoogle {
    
    private static GooglePO googlePage;

    @Before
    public  void Prepara(){
        googlePage = new GooglePO(driver);
    }

    @Test
    public void BuscarDados(){

        
        googlePage.inputPesquisa.sendKeys("Batata"+ Keys.ENTER);
        String elemento  = googlePage.div.getText();
        
        Assert.assertTrue(elemento, elemento.contains("Aproximadamente"));

    }


    @Test
    public void BuscarResultados(){

        
          googlePage.inputPesquisa.sendKeys("Batata frita"+ Keys.ENTER);
          String elemento = googlePage.div.getText();
        
        Assert.assertTrue(elemento, elemento.contains("resultados"));

    }



}
