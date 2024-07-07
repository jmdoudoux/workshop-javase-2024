package fr.sciam.workshop.javase.pmswitch;

import java.math.BigDecimal;

public class MainPatternMatchingSwitch {

  interface Vehicule {}

  enum VehiculeAerien implements Vehicule {
    AVION,
    MONGOLFIERE
  }

  enum VehiculeTerrestre implements Vehicule {
    VOITURE,
    TRAIN
  }

  static class VehiculePrototype implements Vehicule {}

  public static void main(String[] args) {

    System.out.println("Formatter nombres");
    System.out.println(formatterNombre(2024));
    System.out.println(formatterNombre(10_000_000_000L));
    System.out.println(formatterNombre(123.0f));
    System.out.println(formatterNombre((1 + Math.sqrt(5)) / 2));
    System.out.println(formatterNombre(BigDecimal.ZERO));
    System.out.println();

    System.out.println("Analyser nombre avec when");
    analyserNombre(5);
    analyserNombre(10_000);
    analyserNombre(Math.PI);
    analyserNombre(1e9);
    System.out.println();

    System.out.println("Analyser objet");
    analyserObjet("Hello");
    analyserObjet(-7);
    analyserObjet(9.99);
    System.out.println();

    System.out.println("Utiliser switch avec null");
    utiliserSwitchAvecNull(null);
    utiliserSwitchAvecNull(321);
    System.out.println();

    System.out.println("Vérifier exhaustivité");
    verifierExhaustivite(83000);
    System.out.println();

    System.out.println("Analyser véhicule");
    analyserVehicule(VehiculeAerien.AVION);
    analyserVehicule(VehiculeAerien.MONGOLFIERE);
    analyserVehicule(VehiculeTerrestre.VOITURE);
    analyserVehicule(VehiculeTerrestre.TRAIN);
    analyserVehicule(new VehiculePrototype());
    analyserVehicule(new Vehicule() {});
    System.out.println();
  }

  private static String formatterNombre(Number nombre) {

    String resultat;

    if (nombre instanceof Integer i) {
      resultat = String.format("entier : %d", i);
    } else if (nombre instanceof Long l) {
      resultat = String.format("long : %d", l);
    } else if (nombre instanceof Float f) {
      resultat = String.format("flottant : %f", f);
    } else if (nombre instanceof Double d) {
      resultat = String.format("double : %f", d);
    } else {
      resultat = "inconnu : " + nombre.getClass().getName();
    }

    return resultat;
  }

  private static void analyserNombre(Number nombre) {

  }

  private static void analyserObjet(Object objet) {

  }

  private static void verifierExhaustivite(Number nombre) {

  }

  private static void utiliserSwitchAvecNull(Number nombre) {

  }

  private static void analyserVehicule(Vehicule vehicule) {

  }
}
