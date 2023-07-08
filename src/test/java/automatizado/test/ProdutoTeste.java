package automatizado.test;

import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.PO.ProdutoPO;

public class ProdutoTeste extends BaseProduto{
    private static ProdutoPO produtoPage;

    @Before
    public  void Prepara(){
        produtoPage = new ProdutoPO(driver);
    }


     @FindBy(name = "navbar-brand")
    public WebElement paginaProduto;
}
