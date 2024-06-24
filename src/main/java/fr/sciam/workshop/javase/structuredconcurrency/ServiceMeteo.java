package fr.sciam.workshop.javase.structuredconcurrency;

import fr.sciam.workshop.javase.structuredconcurrency.Villes.Ville;

import java.util.Map;

public interface ServiceMeteo {

  double obtenirTemperature(Ville ville);

  void afficherBulletin(Map<Ville, Double> donnees);
}
