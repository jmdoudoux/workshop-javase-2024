public class Hello {
  public static void main(String[] args) {
    Utils.saluer();
  }

  interface Utils {
    static void saluer() {
      System.out.println("Hello");
    }
  }
}
