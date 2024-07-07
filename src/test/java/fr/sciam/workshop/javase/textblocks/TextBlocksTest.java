package fr.sciam.workshop.javase.textblocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextBlocksTest {

  @Test
  void fournirChaineVide_devraitRenvoyerChaineVide() {
    assertEquals("", TextBlocks.fournirChaineVide());
  }

  @Test
  void fournirRequeteSQL_devraitRenvoyerRequeteCorrecte() {

    assertEquals("SELECT *\n" +
                 "FROM \"utilisateurs\"\n" +
                 "WHERE \"nom\" = 'Duke';", TextBlocks.fournirRequeteSQL());
  }

  @Test
  void fournirCodeHTML_devraitRenvoyerCodeCorrect() {
    String html = "<body>\n" +
      "    <h2>Login</h2>\n" +
      "    <form>\n" +
      "        <input type=\"text\" name=\"login\" required>\n" +
      "        <input type=\"submit\" value=\"Login\">\n" +
      "    </form>\n" +
      "</body>\n";

    assertEquals(html, TextBlocks.fournirCodeHTML());
  }

  @Test
  void fournirMessage_devraitRenvoyerUneLigne() {
    assertEquals("Bienvenue dans cet atelier", TextBlocks.fournirMessage());
  }

  @Test
  void fournirExplication_devraitRenvoyerExplication() {
    assertEquals("Le délimiteur de fin d'un Text Block est : \"\"\"", TextBlocks.fournirExplication());
  }

  @Test
  void fournirEspaces_devraitRenvoyer5Espaces() {
    assertEquals("Voici 5 espaces:     \n", TextBlocks.fournirEspaces());
  }

  @Test
  void fournirRequeteSQLAvecParametre_devraitRenvoyerRequeteFormatee() {
    String nom = "Un autre duke";
    String requete = "SELECT *\n" +
                     "FROM \"utilisateurs\"\n" +
                     "WHERE \"nom\" = '" + nom + "';";
    assertEquals(requete, TextBlocks.fournirRequeteSQLAvecParametre(nom));
  }
}
