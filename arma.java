public class arma{
  private String nome;
  private tipoArma tipo;
  private int poderDeAtaque;
  private int dano;
  
      public arma(String nome, tipoArma tipo, int poderDeAtaque) {
        this.nome = nome;
        this.tipo = tipo;
        this.poderDeAtaque = poderDeAtaque;   
    }
  

  public int danoDaArma(){
    if(tipo == tipoArma.Espada){
        this.poderDeAtaque = this.poderDeAtaque * 2;
    }else if (tipo == tipoArma.Arco_e_flecha){
        this.poderDeAtaque = this.poderDeAtaque;
    }else{
        this.poderDeAtaque = this.poderDeAtaque * 3;
    }
    return this.poderDeAtaque;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public tipoArma getTipo() {
        return tipo;
    }

    public void setTipo(tipoArma tipo) {
        this.tipo = tipo;
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(int poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }
  
}
