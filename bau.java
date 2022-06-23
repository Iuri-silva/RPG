public class bau extends tesouro{
  public int multiplicador;
  private String tamanho;

      public bau(String tipo,float valor, int multiplicador, String tamanho) {
        super(tipo,valor);
        this.multiplicador = multiplicador;
        this.tamanho = tamanho;
    }
  
  public  float calcularQuantia(){
    float valorTotal;
    valorTotal = this.valor * this.multiplicador;
    return valorTotal;
  }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
  
  
}
