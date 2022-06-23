class Main {
  public static void main(String[] args) {
    castelo c1 = new castelo(10,30);
    arma a1 = new arma("Excalibur",tipoArma.Espada,10);
    jogador j1 = new jogador("Arthur","Humano",c1,a1);
    masmorra m1 = new masmorra("Pit do Dragão","Difícil",50);
    bau b1 = new bau("Lendário",10,2,"Médio");
    ouro o1 = new ouro("Raro",20);
    bau b2 = new bau ("Normal",3,1,"Pequeno");
    
    b1.calcularQuantia();
    System.out.println("Dano base: "+a1.getPoderDeAtaque());
    m1.relatorio();
    c1.receberAtaque(20);
    
  }
}