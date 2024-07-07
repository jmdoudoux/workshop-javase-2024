package fr.sciam.workshop.javase.beforesuper;

public class MainBeforeSuper {
  public static void main(String[] args) {
    try {
      EntierPositif entier = new EntierPositif(-1);
    } catch (IllegalArgumentException iae) {
      iae.printStackTrace(System.err);
    }
  }
}

class EntierPositif extends Entier {

  public EntierPositif(int valeur) {
    super(valeur);
    if (valeur < 0) throw new IllegalArgumentException("La valeur est negative");
  }
}

class Entier {
  protected int valeur;

  public Entier(int valeur) {
    System.out.println("Invocation constructeur Entier");
    this.valeur = valeur;
  }

  public int getValeur() {
    return valeur;
  }
}