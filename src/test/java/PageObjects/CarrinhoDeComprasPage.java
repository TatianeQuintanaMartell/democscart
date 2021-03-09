package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarrinhoDeComprasPage {
    private WebDriver driver;
    private Waits waits;

    public CarrinhoDeComprasPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getValorTotal(){
        return waits.esperarVisibilidadeDoElemento(By.id("sec_cart_total"));
    }

    public WebElement getBotaoVerCarrinho(){
        return waits.esperarVisibilidadeDoElemento(By.xpath("//div[@id='dropdown_8']/div/div[2]/div/a"));
    }


}
