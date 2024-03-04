package casa;

public class TestePorta {
    public static void main(String[] args) {
        Porta p1 = new Porta();
        p1.setAberta(true);
        p1.setCor("Laranja");
        p1.estaAberta();
        p1.fecha();
        p1.estaAberta();
        p1.abre();
        p1.estaAberta();
        p1.pinta("Marrom");
    }
}
