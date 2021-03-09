package TestCases;

import Framework.TestBase;
import Tasks.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ComprarDoisProdutosComSucessoTastCase extends TestBase {
    private WebDriver driver = this.pegarDriver();
    HomeTask homeTask = new HomeTask(driver);
    VideoGamesTask videoGamesTask = new VideoGamesTask(driver);
    PlayStationTask playStationTask = new PlayStationTask(driver);
    XBoxOneTask xBoxOneTask = new XBoxOneTask(driver);
    CarrinhoDeComprasTask carrinhoDeComprasTask = new CarrinhoDeComprasTask(driver);

    @Test
    public void comprarDoisProdutos(){
        homeTask.fecharBarraDePreview();
        homeTask.clicarMenuVideoGames();
        videoGamesTask.escolherPlayStation3();
        playStationTask.escolherJogoFear();
        playStationTask.adicionarAoCarrinho();
        homeTask.clicarMenuVideoGames();
        videoGamesTask.escolherXBoxOne();
        xBoxOneTask.escolherJogoParty();
        xBoxOneTask.adicionarAoCarrinho();
        homeTask.clicarEmCarrinhoDeCompras();
        carrinhoDeComprasTask.validarValortotalDaCompra();
    }

}
