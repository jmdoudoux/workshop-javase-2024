package fr.sciam.workshop.javase.mapmulti;

import java.util.List;
import java.util.stream.Collectors;

public class MainMapMulti {

  private static List<String> fruits = List.of("Abricot", "Citron", "Kiwi", "Litchi");

  public static void main(String[] args) {
    
    System.out.println("mapMulti 1 a 1");
    transformer1a1();
    System.out.println();

    System.out.println("mapMulti 0 a 1");
    transformer0a1();
    System.out.println();

    System.out.println("mapMulti 1 a N");
    transformer1aN();
    System.out.println();

    System.out.println("mapMulti vers autre type");
    transformerVersAutreType();
    System.out.println();
  }

  private static void transformer1a1() {
  }

  private static void transformer0a1() {
  }

  private static void transformer1aN() {
  }

  private static void transformerVersAutreType() {
    record Tarte(String fruit) {
    }
    
  }
}

