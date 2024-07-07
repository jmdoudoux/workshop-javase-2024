package fr.sciam.workshop.javase.gatherers;

import java.util.concurrent.atomic.AtomicInteger;

class Guichet {
  private static AtomicInteger compte = new AtomicInteger(0);

  static int acceder(int nombre) {
    System.out.println("Accès au guichet de #" + nombre + " / (" + compte.incrementAndGet() + " accès simultané(s))");
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    compte.decrementAndGet();

    return nombre;
  }
}