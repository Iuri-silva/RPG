public class castelo{
  private int poderDeDefesa;
  private int vida;

    public castelo(int poderDeDefesa, int vida) {
        this.poderDeDefesa = poderDeDefesa;
        this.vida = vida;
    }
  

  public boolean receberAtaque(int x){
    boolean recebeuAtk;
         
    vida = vida - x;
    return recebeuAtk = true;
  }

    public int getPoderDeDefesa() {
        return poderDeDefesa;
    }

    public void setPoderDeDefesa(int poderDeDefesa) {
        this.poderDeDefesa = poderDeDefesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
  
}
