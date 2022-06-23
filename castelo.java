public class castelo{
  private int poderDeDefesa;
  private int vida;

    public castelo(int poderDeDefesa, int vida) {
        this.poderDeDefesa = poderDeDefesa;
        this.vida = vida;
    }
  

  public void receberAtaque(int x){
    this.vida = this.vida - (x - this.poderDeDefesa);
    System.out.println("Vida Atual: "+this.vida);
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