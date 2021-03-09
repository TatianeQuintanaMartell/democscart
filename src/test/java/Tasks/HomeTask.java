package Tasks;

import Framework.Waits;
import PageObjects.CarrinhoDeComprasPage;
import PageObjects.HomePage;
import PageObjects.VideoGamesPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeTask {
    private static WebDriver driver;
    private static Waits waits;
    private static HomePage homePage;
    private static VideoGamesPage videoGamesPage;
    private static CarrinhoDeComprasPage carrinhoDeComprasPage;

    public HomeTask(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
        homePage = new HomePage(this.driver);
        videoGamesPage = new VideoGamesPage(this.driver);
        carrinhoDeComprasPage = new CarrinhoDeComprasPage(this.driver);
    }

    public void clicarMenuVideoGames() {
        homePage.getItemDeMenuVideoGames().click();
        verificarSeFoiParaTelaDeVideoGames();
    }
    public void fecharBarraDePreview() {
        homePage.getBarraDePreview().click();
    }
    public void verificarSeFoiParaTelaDeVideoGames(){
        WebElement validar = waits.esperarCarregarElemento(videoGamesPage.getLabelVideoGames());
        Assertions.assertTrue(validar.isDisplayed());
    }

    public void clicarEmCarrinhoDeCompras(){
        homePage.getImagemCarrinhoDeCompras().click();
        validarSeFoiParaCarrinhoDeCompras();
        carrinhoDeComprasPage.getBotaoVerCarrinho().click();
    }

    public void validarSeFoiParaCarrinhoDeCompras(){
        WebElement validar = waits.esperarCarregarElemento(carrinhoDeComprasPage.getBotaoVerCarrinho());
        Assertions.assertTrue(validar.isDisplayed());
    }

}
