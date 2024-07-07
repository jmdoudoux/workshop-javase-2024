package fr.sciam.workshop.javase.compactformat;

import java.math.RoundingMode;
import java.text.CompactNumberFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.stream.LongStream;

public class MainCompactNumberFormat {

  private static final long[] nombreRonds = {100L, 1_000L, 10_000L, 100_000L, 1_000_000L, 1_000_001L, 10_000_000L, 10_000_001L, 10_000_000_000L, 10_000_000_001L};

  private static final long[] nombresDecimaux = {101L, 1_023L, 1_234L, 10_345L, 10_678L, 999_999L};

  private static final long[] nombresArrondis = {1_200L, 1_500L, 1_700L, 2_500L, 999L, 9_999L, 999_999L};

  public static void main(String[] args) {

    System.out.println("Formatage par défaut");
    formaterSimple();
    System.out.println();
    System.out.println("Formatage avec Locale long");
    formaterAvecLocaleLong();
    System.out.println();
    System.out.println("Formatage avec arrondi");
    formaterAvecArrondi();
    System.out.println();
    System.out.println("Formatage des décimaux");
    formaterDecimaux();
    System.out.println();
    System.out.println("Formatage avec patterns");
    formaterAvecPatterns();
    System.out.println();
    System.out.println("Parser");
    parser();
    System.out.println();
    System.out.println("Parser avec groupe");
    parserAvecGroupe();
    System.out.println();
    System.out.println("Parser entier");
    parserEntier();
  }
  
  private static void formaterSimple() {

  }

  private static void formaterAvecLocaleLong() {

  }

  private static void formaterAvecArrondi() {

  }

  private static void formaterDecimaux() {

  }
  
  private static void formaterAvecPatterns() {

  }
  
  
  private static void parser() {

  }
  
  private static void parserAvecGroupe() {

  }
  
  private static void parserEntier() {

  }
}
