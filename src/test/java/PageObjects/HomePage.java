package PageObjects;

import org.openqa.selenium.WebDriver;
import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private Waits waits;

    public HomePage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getItemDeMenuVideoGames(){
        return waits.esperarVisibilidadeDoElemento(By.cssSelector(".ty-menu-item__media"));
    }

    public WebElement getImagemCarrinhoDeCompras(){
        return waits.esperarVisibilidadeDoElemento(By.id("sw_dropdown_8"));
    }

    public WebElement getBarraDePreview(){
        return waits.esperarVisibilidadeDoElemento(By.id("bp_off_bottom_panel"));
    }
}
