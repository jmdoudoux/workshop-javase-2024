package fr.sciam.workshop.javase.structuredconcurrency;

import fr.sciam.workshop.javase.structuredconcurrency.Villes.Ville;

import java.util.Map;

public abstract class AbstractServiceMeteo implements ServiceMeteo {

  final Map<Ville, Double> temperatures = Map.of(
    Villes.NICE, 18.0,
    Villes.PARIS, 16.0,
    Villes.PONT_A_MOUSSON, 13.0,
    Villes.TOULON, 17.0
  );

  @Override
  public void afficherBulletin(final Map<Ville, Double> donnees) {
    donnees.forEach((ville, temperature) -> System.out.println(ville.nom() + " : " + temperature));
  }
}
