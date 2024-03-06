package estacao_espacial;

public class Oxigenio {

    private double quantidade;
    private String qualidade;
    private String remessa;
    private static double consumo;



    public Oxigenio(){
        System.out.println("############ Oxigenio Consumo ##############\n");
        System.out.println("Estamos consumindo oxigenio!" + "\n");
        System.out.println("O consumo da tripulação é de: " + consumo + "KG/Dia\n");
    }


    void mostraOxigenio (){
        System.out.println("############ Oxigenio ##############\n");
        System.out.println("Quantidade: "+ this.quantidade);
        System.out.println("Qualidade: "+ this.qualidade);
        System.out.println("Remessa: "+ this.remessa+ "\n");
    }

    public static void setConsumo(double consumo) {
        Oxigenio.consumo = consumo;
    }

    public static double getConsumo() {
        return consumo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public String getRemessa() {
        return remessa;
    }

    public void setRemessa(String remessa) {
        this.remessa = remessa;
    }
}
