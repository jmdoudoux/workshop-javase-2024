package fr.sciam.workshop.javase.patternmatchinginstanceof;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public class MainPatternMatchingInstanceof {

  public static void main(String[] args) {
    
    Employe employe = new Employe("Pierre","Dupond", List.of(
        new Conge(LocalDate.of(2024,3,15), LocalDate.of(2024,3,22)), 
        new Conge(LocalDate.of(2024,8,1), LocalDate.of(2024,8,21))));
    
    afficherConges(employe);
    System.out.println();
  }

  private static void afficherConges(Object obj) {
    if (obj instanceof Employe) {
      Employe employe  = (Employe) obj;
      var conges = employe.conges();
      conges.forEach(System.out::println);
    }
  }  
}

record Employe (String nom, String prenom, List<Conge> conges) {
}

record Conge(LocalDate debut, LocalDate fin) {
  static DateTimeFormatter pattern = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
  
  @Override
  public final String toString() {
    return "Congés du " + debut.format(pattern) + " au " + fin.format(pattern);
  }
}
