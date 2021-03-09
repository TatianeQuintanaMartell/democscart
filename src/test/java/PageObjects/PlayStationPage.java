package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlayStationPage {
    private WebDriver driver;
    private Waits waits;

    public PlayStationPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getJogoFear(){
        return waits.esperarVisibilidadeDoElemento(By.id("det_img_90"));
    }

    public WebElement getLabelPlayStation(){
        return waits.esperarVisibilidadeDoElemento(By.className("ty-mainbox-title"));

    }
    public WebElement getBotaoAdicionarAoCarrinho(){
        return waits.esperarVisibilidadeDoElemento(By.id("button_cart_90"));
    }

    public WebElement getBotaoCoracao(){
        return waits.esperarVisibilidadeDoElemento(By.id("button_wishlist_90"));
    }

    public WebElement getValorDoJogoFear(){
        return waits.esperarVisibilidadeDoElemento(By.id("sec_discounted_price_90"));
    }

    public WebElement getTelaDeNotificacao(){
        return waits.esperarVisibilidadeDoElemento(By.xpath("//*[contains(@class,\"cm-notification-close\")]"));
    }
    public WebElement getQuantidadeBotaoDeAdicao(){
        return waits.esperarVisibilidadeDoElemento(By.cssSelector(".ty-value-changer__increase"));
    }
}
