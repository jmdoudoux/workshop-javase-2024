package fr.sciam.workshop.javase.recordpattern;

public class MainRecordPattern {

  enum Type {
    FANTAISIE,
    SCIENCE_FICTION
  }
  record Univers(String titre, Type type) {}
  record Heros(String prenom, String nom, Univers univers) {}

  record Quete<T>(T valeur) {}

  public static void main(String[] args) {

    Univers univers = new Univers("Le seigneur des anneaux", Type.FANTAISIE);
    Heros heros = new Heros("Bilbon", "Sacquet", univers);

    System.out.println("Afficher Héros");
    afficherHeros(heros);
    System.out.println();

    System.out.println("Utiliser switch");
    utiliserSwitch(heros);
    utiliserSwitch(univers);
    utiliserSwitch(42);
    System.out.println();

    System.out.println("Utiliser génériques");
    utiliserGeneriques(new Quete<>(heros));
    utiliserGeneriques(new Quete<>("Anneau unique"));
    System.out.println();
  }

  private static void afficherHeros(Object objet) {

  }

  private static void utiliserSwitch(Object objet) {

  }

  private static void utiliserGeneriques(Object objet) {

  }
}
