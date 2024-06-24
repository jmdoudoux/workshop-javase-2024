package fr.sciam.workshop.javase.listformat;

import java.text.ListFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class MainListFormat {

  private static List<String> couleurs = List.of("vert", "orange", "rouge");

  public static void main(String[] args) {

    System.out.println("Formatage par défaut");
    formaterParDefaut();
    System.out.println();
    System.out.println("Formatage avec Locale FR");
    formaterAvecLocaleFr();
    System.out.println();
    System.out.println("Formatage avec Locale US");
    formaterAvecLocaleUs();
    System.out.println();
    System.out.println("Formatage avec patterns");
    formaterAvecPatterns();
    System.out.println();
    System.out.println("Parser");
    parser();
  }

  private static void formaterParDefaut() {
  }

  private static void formaterAvecLocaleFr() {

  }

  private static void formaterAvecLocaleUs() {

  }

  private static void formaterAvecPatterns() {
    
  }

  private static void parser() {
    
  }
}
