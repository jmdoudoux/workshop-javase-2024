package fr.sciam.workshop.javase.switchexpressions;

public class Poker {

  public static String obtenirNomEtSymbole(TypeCarte type) {

    String nom;

    switch (type) {
      case TREFLE:
        nom = "Trèfle ♣";
        break;
      case CARREAU:
        nom = "Carreau ♦";
        break;
      case COEUR:
        nom = "Cœur ♥";
        break;
      case PIQUE:
        nom = "Pique ♠";
        break;
      default:
        throw new IllegalArgumentException("Type '" + type + "' inconnu");
    }

    return nom;
  }

  public static String obtenirCouleur(TypeCarte type) {

    String couleur;

    switch (type) {
      case TREFLE:
      case PIQUE:
        couleur = "noir";
        break;

      case COEUR:
      case CARREAU:
        couleur = "rouge";
        break;

      default:
        throw new IllegalArgumentException("Type '" + type + "' inconnu");
    }

    return couleur;
  }

  public static String traduireType(TypeCarte type) {

    return switch (type) {
      case TREFLE -> "Club";
      case CARREAU -> "Diamond";
      case COEUR -> "Heart";
      case PIQUE -> "Spade";
    };
  }
}
