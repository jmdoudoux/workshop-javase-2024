package fr.sciam.workshop.javase.scopedvalues;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.StructuredTaskScope;

public class MainScopedValues {

  public static void main(String[] args) throws Exception {

    System.out.println("Associer une valeur à un traitement");
    Thread.sleep(200);
    associerValeur();
    System.out.println();

    System.out.println("Reassocier une valeur à un traitement");
    Thread.sleep(200);
    reassocierValeur();
    System.out.println();

    System.out.println("Associer plusieurs valeurs à un traitement");
    associerPlusieursValeurs();
    System.out.println();
        
    System.out.println("Associer une valeur à un StructuredTaskScope");
    associerValeurConcurrenceStructuree();
    System.out.println();

  }

  private static void associerValeur() throws InterruptedException {

  }

  private static void reassocierValeur() throws InterruptedException {

  }

  private static void associerPlusieursValeurs() throws Exception {

  }

  
  private static void associerValeurConcurrenceStructuree() {

  }
}

class Contexte {
  
}

class MonService {
  static int executer() {
    return 0;
  }
  
  static int traiter() {
    return 0;
  }
}
