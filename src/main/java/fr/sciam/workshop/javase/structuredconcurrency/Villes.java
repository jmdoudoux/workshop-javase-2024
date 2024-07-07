package fr.sciam.workshop.javase.structuredconcurrency;

interface Villes {

  record Ville(String nom) {}

  Ville NICE = new Ville("Nice");
  Ville PARIS = new Ville("Paris");
  Ville PONT_A_MOUSSON = new Ville("Pont-à-Mousson");
  Ville TOULON = new Ville("Toulon");
}
