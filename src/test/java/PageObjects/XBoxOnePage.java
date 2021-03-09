package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XBoxOnePage {
    private WebDriver driver;
    private Waits waits;

    public XBoxOnePage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getGameParty(){
        return waits.esperarVisibilidadeDoElemento(By.id("det_img_95"));
    }

    public WebElement getLabelXBoxOne(){
        return waits.esperarVisibilidadeDoElemento(By.className("ty-mainbox-title"));
    }
    public WebElement getBotaoAdicionarAoCarrinho(){
        return waits.esperarVisibilidadeDoElemento(By.id("button_cart_95"));
    }

    public WebElement getBotaoDoCoracao(){
        return waits.esperarVisibilidadeDoElemento(By.id("button_wishlist_95"));
    }

    public WebElement getValorDoJogoParty(){
        return waits.esperarVisibilidadeDoElemento(By.id("sec_discounted_price_95"));
    }
    public WebElement getTelaDeNotificacao(){
        return waits.esperarVisibilidadeDoElemento(By.xpath("//div[@class='notification-body-extended']/div[2]/div[1]/a"));
    }
    public WebElement getQuantidadeBotaoDeAdicao(){
        return waits.esperarVisibilidadeDoElemento(By.cssSelector(".ty-value-changer__increase"));
    }
}
