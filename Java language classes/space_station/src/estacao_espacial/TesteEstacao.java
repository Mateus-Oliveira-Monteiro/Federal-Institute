package estacao_espacial;

public class TesteEstacao {
    public static void main(String[] args) {
        Astronauta astro1 = new Astronauta();
        Astronauta astro2 = new Astronauta();
        Astronauta astro3 = new Astronauta();
        astro1.setAtivo(true);
        astro1.setNome("teteus");
        astro1.setIdade(19);
        astro1.setRg("52062132840");
        astro1.setEspecialidade("Mecanica avancada");
        astro1.mostraAstronauta();

        Foguete foguete1 = new Foguete();
        foguete1.setNome("Saturno V");
        foguete1.setFabricante("SpaceX");
        foguete1.setQtdeCombustivel(1500);
        foguete1.setQtdeTripulacao(5);
        foguete1.mostraFoguete();

        Investimento inv1 = new Investimento();
        inv1.setOrganizacao("Brasil");
        inv1.setData("21/09/2204");
        inv1.setValorTotal(100000000);
        inv1.mostraInvestimento();

        Mantimentos mant1 = new Mantimentos();
        mant1.setNome("Batatas");
        mant1.setDescricao("Deliciosas");
        mant1.setQuantidade(90);
        mant1.mostraMantimentos();

        Missao missao1 = new Missao();
        missao1.setNome("Apollo");
        missao1.setDescricao("Descobrir a lua");
        missao1.setAstro(astro1);
        missao1.setFoguete(foguete1);
        missao1.setInvest(inv1);
        missao1.setDuracao(34);
        missao1.mostraMissao();

        Modulo modulo1 = new Modulo();
        modulo1.setNome("Dormitorio");
        modulo1.setTamanho(14);
        modulo1.setUtilidade("Dormir");
        modulo1.mostraModulo();

        Oxigenio oxi1 = new Oxigenio();
        oxi1.setQuantidade(500);
        oxi1.setQualidade("Bom");
        oxi1.setRemessa("23/03/2008");
        oxi1.mostraOxigenio();




    }
}
