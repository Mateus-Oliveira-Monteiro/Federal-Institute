package casa;

class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX, dimensaoY, dimensaoZ;

    void abre(){
        if(aberta){
            System.out.println("A porta já esta aberta! ");
        }else{
            this.aberta = true;
            System.out.println("Você abriu a porta! ");
        }
    }
    void fecha(){
        if(aberta){
            this.aberta = false;
            System.out.println("Você fechou a porta! ");
        }else{
            System.out.println("A porta já está fechada");
        }
    }

    void pinta(String s){
        this.cor = s;
        System.out.println("Você pintou a porta de: " + this.cor);
    }
    boolean estaAberta(){
        if(aberta) {
            System.out.println("A porta está aberta! ");
            return true;
        }else{
            System.out.println("a porta está fechada!");
        }
        return false;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
}

