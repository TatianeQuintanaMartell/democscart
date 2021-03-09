package Tasks;

import Framework.FileOperation;
import Framework.Utils;
import Framework.Waits;
import PageObjects.PlayStationPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlayStationTask {
    private static WebDriver driver;
    private static Waits waits;
    private static PlayStationPage playStationPage;
    private static Utils utils;

    public PlayStationTask(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
        playStationPage = new PlayStationPage(this.driver);
        utils = new Utils(this.driver);
    }

    public void escolherJogoFear(){
        playStationPage.getJogoFear().click();
        validarSeFoiParaTelaJogoFear();
    }

    public void validarSeFoiParaTelaJogoFear(){
        WebElement validar = waits.esperarCarregarElemento(playStationPage.getBotaoCoracao());
        Assertions.assertTrue(validar.isDisplayed());
    }
    public void adicionarAoCarrinho(){
        contabilizaQuantidadeDoJogoFear();
        gravaValorDoJogoFear();
        playStationPage.getBotaoAdicionarAoCarrinho().click();
        utils.sleep(3);
        playStationPage.getTelaDeNotificacao().click();
    }

    public void contabilizaQuantidadeDoJogoFear(){
        String quantidadeDoJogoFearStr= FileOperation.getProperties("valoresDosJogos").getProperty("quantidadedojogofear");
        int quantidadeDoJogoFearInt = Integer.parseInt(quantidadeDoJogoFearStr);
        for (int i = 1; i < quantidadeDoJogoFearInt; i++){
            playStationPage.getQuantidadeBotaoDeAdicao().click();
        }
    }


    public void gravaValorDoJogoFear(){
        String valordojogofearStr = (playStationPage.getValorDoJogoFear().getText());
        String quantidadeDoJogoFearStr = FileOperation.getProperties("valoresDosJogos").getProperty("quantidadedojogofear");
        utils.gravaValorDoJogo(valordojogofearStr,quantidadeDoJogoFearStr, "valordojogofear");

    }


}
