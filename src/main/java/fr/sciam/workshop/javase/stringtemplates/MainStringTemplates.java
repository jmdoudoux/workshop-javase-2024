package fr.sciam.workshop.javase.stringtemplates;

import java.lang.StringTemplate.Processor;
import java.util.Base64;
import java.util.HexFormat;

public class MainStringTemplates {

  public static void main(String[] args) {

    System.out.println("Processeur STR");
    manipulerStr("Luke", "Skywalker");
    System.out.println();

    System.out.println("Processeur FMT");
    manipulerFmt();
    System.out.println();

    System.out.println("Processeur RAW");
    manipulerRaw(1977);
    System.out.println();

    System.out.println("Processeur personnalisé");
    manipulerProcesseurPersonnalise(6_000_000, -2);
    System.out.println();
  }

  private static void manipulerStr(String prenom, String nom) {

  }

  private static void manipulerFmt() {

  }

  private static void manipulerRaw(int annee) {

  }

  private static void manipulerProcesseurPersonnalise(int languesC3PO, int languesJabba) {

  }

  private static Processor<byte[], RuntimeException> creerProcesseurPersonnalise() {
    return null;
  }

  /**
   * Ne pas modifier (méthode utilitaire pour afficher le contenu base 64)
   */
  private static void afficherB64(final byte[] octets) {
    System.out.println(HexFormat.ofDelimiter(" ").formatHex(octets));
  }
}
