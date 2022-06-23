class Main {
  public static void main(String[] args) {
       arma a1 = new arma("excalibur",tipoArma.Espada,10);
    
    a1.setTipo(tipoArma.Espada);
    System.out.println("Tipo: "+a1.getTipo());
  }
}