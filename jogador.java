public class jogador{
  private String nome;
  private String raça;
  private castelo castelo;
  private arma arma;

    public jogador(String nome, String raça, castelo castelo, arma arma) {
        this.nome = nome;
        this.raça = raça;
        this.castelo = castelo;
        this.arma = arma;
    }
    
  public float calcularTotal(){
    float calculo;
    
    return calculo = 1.2f;
  }

  public float retornarTesouroMaiorValor(){
    float TesMaiVal;
    
    return TesMaiVal = 1.2f;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public castelo getCastelo() {
        return castelo;
    }

    public void setCastelo(castelo castelo) {
        this.castelo = castelo;
    }

    public arma getArma() {
        return arma;
    }

    public void setArma(arma arma) {
        this.arma = arma;
    }
  
}
