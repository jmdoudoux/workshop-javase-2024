package fr.sciam.workshop.javase.switchexpressions;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static fr.sciam.workshop.javase.switchexpressions.Poker.obtenirCouleur;
import static fr.sciam.workshop.javase.switchexpressions.Poker.obtenirNomEtSymbole;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerTest {

  private static final String ROUGE = "rouge";
  private static final String NOIR = "noir";

  @Test
  void obtenirNomEtSymbole_devraitRenvoyerAttendu() {

    assertAll(
      "Test des types de cartes",
      () -> assertEquals("Trèfle ♣", obtenirNomEtSymbole(TypeCarte.TREFLE)),
      () -> assertEquals("Carreau ♦", obtenirNomEtSymbole(TypeCarte.CARREAU)),
      () -> assertEquals("Cœur ♥", obtenirNomEtSymbole(TypeCarte.COEUR)),
      () -> assertEquals("Pique ♠", obtenirNomEtSymbole(TypeCarte.PIQUE))
    );
  }

  @Test
  void obtenirCouleur_devraitRenvoyerBonneCouleur() {

    assertAll(
      "Test des couleurs de cartes",
      () -> assertEquals(NOIR, obtenirCouleur(TypeCarte.TREFLE)),
      () -> assertEquals(ROUGE, obtenirCouleur(TypeCarte.CARREAU)),
      () -> assertEquals(ROUGE, obtenirCouleur(TypeCarte.COEUR)),
      () -> assertEquals(NOIR, obtenirCouleur(TypeCarte.PIQUE))
    );
  }
}
