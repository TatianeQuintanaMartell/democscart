package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoGamesPage {
    private WebDriver driver;
    private Waits waits;

    public VideoGamesPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getPlayStation3(){
        return waits.esperarVisibilidadeDoElemento(By.cssSelector("#category_products_11 > ul > li:nth-child(2)"));
    }

    public WebElement getXBoxOne(){
        return waits.esperarVisibilidadeDoElemento(By.cssSelector("#category_products_11 > ul > li:nth-child(4)"));
    }

    public WebElement getLabelVideoGames(){
        return waits.esperarVisibilidadeDoElemento(By.className("ty-mainbox-title"));
    }
}
