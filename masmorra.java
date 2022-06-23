public class masmorra{
  private String nome;
  private String nivelDeDificuldade;
  private int ouroASerEncontrado;

    public masmorra(String nome, String nivelDeDificuldade, int ouroASerEncontrado) {
        this.nome = nome;
        this.nivelDeDificuldade = nivelDeDificuldade;
        this.ouroASerEncontrado = ouroASerEncontrado;
    }

  public void relatorio(){
      System.out.println("Nome: "+this.nome);
      System.out.println("Dificuldade: "+this.nivelDeDificuldade);
      System.out.println("Ouro Disponível: "+this.ouroASerEncontrado);
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelDeDificuldade() {
        return nivelDeDificuldade;
    }

    public void setNivelDeDificuldade(String nivelDeDificuldade) {
        this.nivelDeDificuldade = nivelDeDificuldade;
    }

    public int getOuroASerEncontrado() {
        return ouroASerEncontrado;
    }

    public void setOuroASerEncontrado(int ouroASerEncontrado) {
        this.ouroASerEncontrado = ouroASerEncontrado;
    }
  
}