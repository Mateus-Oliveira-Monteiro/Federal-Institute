package casa;

public class Casa {
    private String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

    void pinta(String s){
        this.cor = s;
        System.out.println("Voce pintou a casa de: " + this.cor);
    }
    public int quantasPortasEstaoAbertas() {
        int contador = 0;
        if (porta1.estaAberta()) contador++;
        if (porta2.estaAberta()) contador++;
        if (porta3.estaAberta()) contador++;
        return contador;
    }



}
