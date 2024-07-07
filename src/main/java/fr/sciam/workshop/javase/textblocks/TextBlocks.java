package fr.sciam.workshop.javase.textblocks;

public class TextBlocks {

  public static void main(String[] args) {
    System.out.println("Afficher message d'accueil");
    afficherMessageAccueil();
    System.out.println();
  }

  private static void afficherMessageAccueil() {

  }

  public static String fournirChaineVide() {
    // TODO : Convertir en Text Block
    return "";
  }

  public static String fournirRequeteSQL() {
    // TODO : Convertir en Text Block
    String requete = "SELECT *\n" +
                     "FROM \"utilisateurs\"\n" +
                     "WHERE \"nom\" = 'Duke';";

    return requete;
  }

  public static String fournirCodeHTML() {
    // TODO : Modifier l'indentation du bloc
    // sans modifier le contenu de la chaîne de caractères résultante
    String html = "<body>\n" +
      "    <h2>Login</h2>\n" +
      "    <form>\n" +
      "        <input type=\"text\" name=\"login\" required>\n" +
      "        <input type=\"submit\" value=\"Login\">\n" +
      "    </form>\n" +
      "</body>\n";

    return html;
  }

  public static String fournirMessage() {

    // TODO : remplacer par ce Text Block en y ajoutant des \
    String message = """
      Bienvenue dans cet atelier""";

    return message;
  }

  public static String fournirExplication() {
    // TODO : convertir en Text Block
    String explication = "Le délimiteur de fin d'un Text Block est : \"\"\"";

    return explication;
  }

  public static String fournirEspaces() {
    // TODO : convertir en Text Block
    String espaces = "Voici 5 espaces:     \n";

    return espaces;
  }

  public static String fournirRequeteSQLAvecParametre(String nom) {
    // TODO : Convertir en Text Block formaté
    String requete = "SELECT *\n" +
                     "FROM \"utilisateurs\"\n" +
                     "WHERE \"nom\" = '" + nom + "';";

    return requete;
  }
}
