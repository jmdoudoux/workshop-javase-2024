package fr.sciam.workshop.javase.records;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MainRecord {

  private static final File FILE = new File("point.bin");

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    System.out.println("Afficher point");
    afficherPoint();
    System.out.println();

    System.out.println("Tester égalités");
    testerEgalites();
    System.out.println();

    System.out.println("Comparer point");
    comparerPoint();
    System.out.println();

    System.out.println("Constructeur avec contrôles");
    utiliserConstructeurAvecControles();
    System.out.println();

    System.out.println("Autre constructeur");
    utiliserAutreConstructeur();
    System.out.println();

    System.out.println("Record local");
    utiliserRecordLocal();
    System.out.println();

    System.out.println("Sérialiser");
    serialiserPoint();
    System.out.println();

    System.out.println("Désérialiser");
    deserialiserPoint();
    System.out.println();

    System.out.println("Introspecter");
    instrospecterPoint();
  }

  private static void afficherPoint() {

  }

  private static void testerEgalites() {

  }

  private static void comparerPoint() {

  }

  private static void utiliserConstructeurAvecControles() {

  }

  private static void utiliserAutreConstructeur() {

  }

  private static void utiliserRecordLocal() {

  }

  private static void serialiserPoint() {

  }

  private static void deserialiserPoint() {

  }

  private static void instrospecterPoint() throws NoSuchFieldException, IllegalAccessException {

  }
}
