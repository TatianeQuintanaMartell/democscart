package Framework;

import org.openqa.selenium.WebDriver;

public class Utils {
    private static WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void sleep(int tempoDeEsperaEmSegundos){
        try{
            Thread.sleep(tempoDeEsperaEmSegundos * 1000);
        }catch(InterruptedException e){
            System.out.println("Tela de notificação não visível");
        }
    }

    public void gravaValorDoJogo(String valor, String quantidade, String valorDoJogo){
        double valordojogoDouble  = Double.parseDouble(valor);
        int quantidadeDoJogoInt = Integer.parseInt(quantidade);
        double valorMultiplicadoPelaQuantidade = (valordojogoDouble * quantidadeDoJogoInt);
        String valorFinalDoJogo = String.valueOf(valorMultiplicadoPelaQuantidade);
        FileOperation.setProperties("valoresDosJogos", valorDoJogo, valorFinalDoJogo);

    }


}

