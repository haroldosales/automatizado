package automatizado.test;




import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class GoogleTeste extends BaseGoogle {

    @Test
    public void BuscarDados(){

        WebElement pesquisa = driver.findElement(By.name("q"));
        pesquisa.sendKeys("Batata", Keys.ENTER);
        String elemento  = driver.findElement(By.id("result-stats")).getText();
        
        Assert.assertTrue(elemento, elemento.contains("Aproximadamente"));

    }

}
