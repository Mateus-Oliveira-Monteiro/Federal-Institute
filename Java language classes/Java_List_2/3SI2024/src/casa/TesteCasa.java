package casa;

public class TesteCasa {
    public static void main(String[] args) {
        Casa casa = new Casa("Branco");
        casa.pinta("Amarelo");
        casa.porta1.abre();
        casa.porta2.fecha();
        casa.porta3.abre();
        System.out.println("Número de portas abertas na casa: " + casa.quantasPortasEstaoAbertas());
    }
}
