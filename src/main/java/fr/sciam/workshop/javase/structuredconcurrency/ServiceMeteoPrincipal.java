package fr.sciam.workshop.javase.structuredconcurrency;

import fr.sciam.workshop.javase.structuredconcurrency.Villes.Ville;

class ServiceMeteoPrincipal extends AbstractServiceMeteo {

  private static final int DELAI_MIN = 1_000;
  private static final int DELAI_MAX = 2_000;

  @Override
  public double obtenirTemperature(Ville ville) {

    try {
      Thread.sleep((long) ((DELAI_MAX - DELAI_MIN) * Math.random() + DELAI_MIN));
    } catch (InterruptedException e) {
      System.out.println("ServiceMeteoPrincipal : interruption lors de l'obtention de la température de " + ville.nom());
    }

    return this.temperatures.get(ville);
  }
}