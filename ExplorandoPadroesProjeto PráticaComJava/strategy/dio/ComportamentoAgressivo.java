package strategy.dio;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Mover-se agressivamente.");
    }
}
