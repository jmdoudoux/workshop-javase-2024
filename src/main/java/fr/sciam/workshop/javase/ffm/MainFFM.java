package fr.sciam.workshop.javase.ffm;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;
import java.nio.file.Path;

public class MainFFM {

  private static final int[] ENTIERS = {
    0, 123, 456, 789,
    -1, -2, -3, -4
  };

  private static final CoordonneesGps[] COORDONNEES_GPS = {
    new CoordonneesGps(43.1242f, 5.9285f),
    new CoordonneesGps(43.1176f, 5.9404f),
    new CoordonneesGps(43.0928f, 6.0756f),
    new CoordonneesGps(43.1055f, 5.8869f)
  };

  private static final String REQUETE = "SELECT * FROM users";

  public static void main(String[] args) {

    System.out.println("Manipulation d'une chaîne de caractères");
    manipulerChaineDeCaracteres();
    System.out.println();

    System.out.println("Manipulation d'entiers");
    manipulerEntiers();
    System.out.println("\n");

    System.out.println("Manipulation d'un StructLayout");
    manipulerStructLayout();
    System.out.println();

    System.out.println("Manipulation d'un SequenceLayout");
    manipulerSequenceLayout();
    System.out.println();

    System.out.println("Manipulation d'un StructLayout dans un SequenceLayout");
    manipulerStructLayoutDansSequenceLayout();
    System.out.println();

    try (Arena arena = Arena.ofConfined()) {
      System.out.println("Chargement de la bibliothèque sqlite3");
      SymbolLookup lookup = chargerBibliothequeNativeAvecPath(arena);
      System.out.println();

      System.out.println("Localisation de la fonction sqlite3_open()");
      MemorySegment fonctionOpen = localiserFonctionNativeOpen(lookup);
      System.out.println();

      System.out.println("Obtention d'un MethodHandle vers sqlite3_open()");
      Linker linker = Linker.nativeLinker();
      MethodHandle handle = obtenirMethodHandleOpen(linker, fonctionOpen);
      System.out.println();

      System.out.println("Invocation de la fonction sqlite3_open()");
      MemorySegment pointeurDePointeurBase = invoquerFonctionOpen(handle, arena);
      System.out.println();

      System.out.println("Configuration de l'appel montant (upcall)");
      MemorySegment upcall = configurerUpcall(linker, arena);
      System.out.println();

      if (upcall != null) {
        System.out.println("Invocation de sqlite3_trace_v2() avec callback et requête en base");
        invoquerTraceAvecCallbackPuisRequeter(lookup, linker, arena, pointeurDePointeurBase, upcall);
        System.out.println();
      }
    }
  }

  private static void manipulerChaineDeCaracteres() {

  }

  private static void manipulerEntiers() {

  }

  private static void manipulerStructLayout() {

  }

  private static void manipulerSequenceLayout() {

  }

  private static void manipulerStructLayoutDansSequenceLayout() {

  }

  private static SymbolLookup chargerBibliothequeNativeAvecPath(Arena arena) {
    return null;
  }

  private static MemorySegment localiserFonctionNativeOpen(SymbolLookup lookup) {
    return null;
  }

  private static MethodHandle obtenirMethodHandleOpen(Linker linker, MemorySegment memorySegment) {
    return null;
  }

  private static MemorySegment invoquerFonctionOpen(final MethodHandle handle, final Arena arena) {
    return null;
  }

  private static MemorySegment configurerUpcall(Linker linker, Arena arena) {
    return null;
  }

  private static MemorySegment traiterMessageErreur(MemorySegment pointeur) {
    return null;
  }

  /**
   * Ne pas modifier
   * Cette méthode est la callback sera appelé depuis le code natif
   */
  static int tracerCallback(
    final MemorySegment m1,
    final MemorySegment m2,
    final MemorySegment m3,
    final MemorySegment m4) {

    System.out.println("Appel de tracerCallback()");
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(m4);

    return 0;
  }

  /**
   * Ne pas modifier
   * Cette méthode configure les traces avec le callback fourni (upcall)
   * puis effectue une requête SQL en base afin de déclencher l'appel au callback
   */
  private static void invoquerTraceAvecCallbackPuisRequeter(
    SymbolLookup lookup,
    Linker linker,
    Arena arena,
    MemorySegment pointeurDePointeurBase,
    MemorySegment upcall) {

    MemorySegment traceSegment = lookup.find("sqlite3_trace_v2").orElseThrow();

    FunctionDescriptor traceDesc = FunctionDescriptor.of(
      ValueLayout.JAVA_INT,
      ValueLayout.ADDRESS,
      ValueLayout.JAVA_INT,
      ValueLayout.ADDRESS,
      ValueLayout.ADDRESS
    );

    MethodHandle traceHandle = linker.downcallHandle(traceSegment, traceDesc);

    MemorySegment pointeurBase = pointeurDePointeurBase.get(ValueLayout.ADDRESS, 0);

    try {
      int code = (int) traceHandle.invokeExact(
        pointeurBase,
        0x01,
        upcall,
        MemorySegment.NULL
      );

      FunctionDescriptor execDesc = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
      );

      MemorySegment execSegment = lookup.find("sqlite3_exec").orElseThrow();
      MethodHandle execHandle = linker.downcallHandle(execSegment, execDesc);
      MemorySegment errorMessagePointer = arena.allocate(ValueLayout.ADDRESS);

      MemorySegment requeteSegment = arena.allocateFrom(REQUETE);

      int execResult = (int) execHandle.invokeExact(
        pointeurBase,
        requeteSegment,
        MemorySegment.NULL,
        MemorySegment.NULL,
        errorMessagePointer
      );

      if (execResult != 0) {
        MemorySegment pointeur = errorMessagePointer.get(ValueLayout.ADDRESS, 0);
        MemorySegment erreur = traiterMessageErreur(pointeur);

        FunctionDescriptor freeDesc = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        MemorySegment freeSegment = lookup.find("sqlite3_free").orElseThrow();
        MethodHandle freeHandle = linker.downcallHandle(freeSegment, freeDesc);

        freeHandle.invokeExact(erreur);
      }

    } catch (Throwable e) {
      throw new IllegalStateException(e);
    }
  }
}

record CoordonneesGps(float latitude, float longitude) {
}