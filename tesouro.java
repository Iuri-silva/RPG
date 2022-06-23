abstract class tesouro{
  private String tipo;
  protected float valor;

    public tesouro(String tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
  
  public abstract float calcularQuantia();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
  
  
}