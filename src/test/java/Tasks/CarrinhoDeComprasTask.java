package Tasks;

import Framework.FileOperation;
import Framework.Waits;
import PageObjects.CarrinhoDeComprasPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CarrinhoDeComprasTask {
    private static WebDriver driver;
    private static Waits waits;
    private static CarrinhoDeComprasPage carrinhoDeComprasPage;

    public CarrinhoDeComprasTask(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
        carrinhoDeComprasPage = new CarrinhoDeComprasPage(this.driver);
    }

    public void validarValortotalDaCompra(){
        String valorTotalDaCompraNoSiteStr = carrinhoDeComprasPage.getValorTotal().getText();


        String valordojogofearStr = FileOperation.getProperties("valoresDosJogos").getProperty("valordojogofear");
        String valordojogopartyStr = FileOperation.getProperties("valoresDosJogos").getProperty("valordojogoparty");

        double valordojogofear  = Double.parseDouble(valordojogofearStr);
        double valordojogoparty = Double.parseDouble(valordojogopartyStr);
        double valorTotalDaCompraNoSite = Double.parseDouble(valorTotalDaCompraNoSiteStr);
        double valorTotalDaCompra = valordojogofear + valordojogoparty;

        Assertions.assertEquals(valorTotalDaCompra, valorTotalDaCompraNoSite);

    }
}
