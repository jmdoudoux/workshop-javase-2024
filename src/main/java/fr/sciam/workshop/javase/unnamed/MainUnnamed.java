package fr.sciam.workshop.javase.unnamed;

import java.util.function.BiConsumer;

public class MainUnnamed {

  public static void main(String[] args) {

    Object o = new Employe("Nom1", "Prenom1", new Grade("DEV", "Développeur"));

    System.out.println("Variable sans nom");
    utiliserVariableSansNom();

    System.out.println("\nVariable de pattern sans nom");
    utiliserVariablePatternSansNom(o);

    Cercle cercle = new Cercle();
    System.out.println("\nVariable de pattern sans nom avec pattern matching");
    utiliserVariablePatternSansNomAvecPatternMatching(cercle);

    System.out.println("\nPattern sans nom");
    utiliserPatternSansNom(o);
  }

  private static void utiliserVariableSansNom() {
    try (var u = new UneRessource()) {
      var r = traiter((a, b) -> System.out.println("traiter"), null, null);
    }  catch (Throwable t) { }
  }

  private static void utiliserVariablePatternSansNom(Object o) {
    if (o instanceof Employe(var nom, var prenom , var grade)) {
      System.out.println("Employe : " + nom);
    }
  }

  private static void utiliserVariablePatternSansNomAvecPatternMatching(Forme forme) {
    switch(forme) {
      case Cercle c -> afficher(c);
       case Carre c -> {}
       case Rectangle r -> {}
    }
  }

  private static void utiliserPatternSansNom(Object o) {
    if (o instanceof Employe(var nom, var prenom , var grade)) {
      System.out.println("Employe : " + nom);
    }
  }

  private static String traiter(BiConsumer<String, String> affichage, String a, String b) {
    affichage.accept(a, b);
    return "Ok";
  }

  private static void afficher(Forme forme) {
    System.out.println(forme);
  }
}

record Grade(String code, String designation) {}

record Employe(String nom, String prenom, Grade grade) {}

class UneRessource implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("Fermeture de la ressource");
  }
}

sealed interface Forme permits Cercle, Carre, Rectangle {}

final class Cercle implements Forme {
}

final class Carre implements Forme {
}

final class Rectangle implements Forme {
}
