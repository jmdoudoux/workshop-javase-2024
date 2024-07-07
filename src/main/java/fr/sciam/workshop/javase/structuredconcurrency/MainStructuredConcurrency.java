package fr.sciam.workshop.javase.structuredconcurrency;

import fr.sciam.workshop.javase.structuredconcurrency.Villes.Ville;

import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.ShutdownOnFailure;
import java.util.concurrent.StructuredTaskScope.ShutdownOnSuccess;
import java.util.concurrent.StructuredTaskScope.Subtask;
import java.util.concurrent.StructuredTaskScope.Subtask.State;
import java.util.concurrent.TimeoutException;

public class MainStructuredConcurrency {

  private final ServiceMeteo serviceMeteoPrincipal = new ServiceMeteoPrincipal();
  private final ServiceMeteo serviceMeteoRestreint = new ServiceMeteoRestreint();

  public static void main(String[] args) throws InterruptedException {

    MainStructuredConcurrency structuredConcurrency = new MainStructuredConcurrency();

    System.out.println("Création du bulletin météo");
    structuredConcurrency.creerBulletinMeteo();
    System.out.println();

    System.out.println("Création du bulletin météo avec ShutdownOnFailure");
    structuredConcurrency.creerBulletinMeteoShutdownOnFailure();
    System.out.println();

    System.out.println("Obtenir température avec ShutdownOnSuccess");
    structuredConcurrency.obtenirTemperatureShutdownOnSuccess();
    System.out.println();

    System.out.println("Obtenir plus haute température");
    structuredConcurrency.obtenirPlusHauteTemperature();
  }

  private void creerBulletinMeteo() throws InterruptedException {

  }

  private void creerBulletinMeteoShutdownOnFailure() throws InterruptedException {

  }

  private void obtenirTemperatureShutdownOnSuccess() throws InterruptedException {

  }

  private void obtenirPlusHauteTemperature() throws InterruptedException {

  }
}

class ExceptionCustom extends Exception {
  ExceptionCustom(Throwable t) {
    super(t);
  }
}

class ScopePlusHauteTemperature extends StructuredTaskScope<Double> {

  @Override
  protected void handleComplete(final Subtask<? extends Double> subtask) {
    // TODO
    switch (subtask.state()) {
    }
  }

  public Collection<Throwable> exceptions() {
    // TODO
    return Collections.emptyList();
  }

  public double max() {
    // TODO
    return Double.NaN;
  }
}