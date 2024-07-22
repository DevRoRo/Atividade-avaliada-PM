class App {
    public static void main(String... args) {
      // substring, classe String, podem usar o método
      // length() e charAt(indice), "abc".length(), "abc".charAt(1)
      // toCharArray()
      //                          -7654321
      // Considere a String str = "modular"; // length = 7
      //                          +01234567890
  
      System.out.println(Texto.substr("modular", 1, 6)); // odula
      System.out.println(
        Texto.substr("modular", 2, 5)); // dul
      System.out.println(
        Texto.substr("modular", 2)); // dular
      System.out.println(
        Texto.substr("modular", -5, -2)); // dul
      System.out.println(
        Texto.substr("modular", -2)); // ar
      System.out.println(
        Texto.substr("modular", -6, 4)); // odu
      System.out.println(
        Texto.substr("modular", 8, 10)); // ""
      System.out.println(
        Texto.substr("modular", 4, 20)); // lar
      System.out.println(
        Texto.substr("modular", 4, 1)); // ""
      // fase 2
      System.out.println(
        //            0123456789012345678
        Texto.substr("programacao modular", 0, 4, 12, 15)); // progmod
      System.out.println(
        //            0123456789012345678
        Texto.substr("programacao modular", 0, 4, 12)); // progmodular
      System.out.println(
        //            0123456789012345678
        Texto.substr("programacao modular", 0, 3, 6, 9, 12, 15));
    }
  }