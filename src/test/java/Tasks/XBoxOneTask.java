package Tasks;

import Framework.FileOperation;
import Framework.Utils;
import Framework.Waits;
import PageObjects.XBoxOnePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XBoxOneTask {
    private static WebDriver driver;
    private static Waits waits;
    private static XBoxOnePage xBoxOnePage;
    private static Utils utils;

    public XBoxOneTask(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
        xBoxOnePage = new XBoxOnePage(this.driver);
        utils = new Utils(this.driver);
    }

    public void escolherJogoParty(){
        xBoxOnePage.getGameParty().click();
        validarSeFoiParaTelaGameParty();
    }

    public void validarSeFoiParaTelaGameParty(){
        WebElement validar = waits.esperarCarregarElemento(xBoxOnePage.getBotaoDoCoracao());
        Assertions.assertTrue(validar.isDisplayed());
    }
    public void adicionarAoCarrinho(){
        contabilizaQuantidadeDoJogoParty();
        gravaValorDoJogoParty();
        xBoxOnePage.getBotaoAdicionarAoCarrinho().click();
        utils.sleep(2);
        xBoxOnePage.getTelaDeNotificacao().click();
    }

    public void contabilizaQuantidadeDoJogoParty(){
        String quantidadeDoJogoFearStr= FileOperation.getProperties("valoresDosJogos").getProperty("quantidadedojogoparty");
        int quantidadeDoJogoFearInt = Integer.parseInt(quantidadeDoJogoFearStr);
        for (int i = 1; i < quantidadeDoJogoFearInt; i++){
            xBoxOnePage.getQuantidadeBotaoDeAdicao().click();
        }
    }

    public void gravaValorDoJogoParty(){
        String valordojogoPartyStr = (xBoxOnePage.getValorDoJogoParty().getText());
        String quantidadeDoJogoPartyStr = FileOperation.getProperties("valoresDosJogos").getProperty("quantidadedojogoparty");
        utils.gravaValorDoJogo(valordojogoPartyStr, quantidadeDoJogoPartyStr, "valordojogoparty");
    }

}
