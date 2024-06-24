package fr.sciam.workshop.javase.structuredconcurrency;

import fr.sciam.workshop.javase.structuredconcurrency.Villes.Ville;

class ServiceMeteoRestreint extends AbstractServiceMeteo {

  @Override
  public double obtenirTemperature(Ville ville) {

    if (ville.nom().contains("-")) {
      String message = "ServiceMeteoRestreint : le service ne sait pas traiter les villes contenant un trait d'union : " + ville.nom();
      throw new IllegalArgumentException(message);
    }

    return this.temperatures.get(ville);
  }
}