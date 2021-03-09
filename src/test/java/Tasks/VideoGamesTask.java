package Tasks;

import Framework.Waits;
import PageObjects.PlayStationPage;
import PageObjects.VideoGamesPage;
import PageObjects.XBoxOnePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoGamesTask {
    private static WebDriver driver;
    private static Waits waits;
    private static VideoGamesPage videoGamesPage;
    private static PlayStationPage playStationPage;
    private static XBoxOnePage xBoxOnePage;

    public VideoGamesTask(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
        videoGamesPage = new VideoGamesPage(this.driver);
        playStationPage = new PlayStationPage(this.driver);
        xBoxOnePage = new XBoxOnePage(this.driver);
    }

    public void escolherPlayStation3(){
        videoGamesPage.getPlayStation3().click();
        validaSeFoiParaTelaDePlayStation3();
    }

    public void escolherXBoxOne(){
        videoGamesPage.getXBoxOne().click();
        validaSeFoiParaTelaDeXBoxOne();
    }

    public void validaSeFoiParaTelaDePlayStation3(){
        WebElement validar = waits.esperarCarregarElemento(playStationPage.getLabelPlayStation());
        Assertions.assertTrue(validar.isDisplayed());
    }

    public void validaSeFoiParaTelaDeXBoxOne(){
        WebElement validar = waits.esperarCarregarElemento(xBoxOnePage.getLabelXBoxOne());
        Assertions.assertTrue(validar.isDisplayed());
    }
}
