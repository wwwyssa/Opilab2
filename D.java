class D extends A {
  public D() {
    y38 = 7;
    y29 = 4L;
  }
  public void y40() {
    System.out.println("метод y40 в классе D");
    System.out.println(y38 << 2);
  }
  public void y19() {
    System.out.println("метод y19 в классе D");
    System.out.println(y38);
  }
  public void y10() {
    System.out.println("метод y10 в классе D");
    System.out.println(y9 - 5);
  }
  public static void y1() {
    System.out.println("метод y1 в классе D");
    System.out.println((y12 - 5));
  }
  public static void y16() {
    System.out.println("метод y16 в классе D");
    System.out.println(++y12);
  }
  public static void y11() {
    System.out.println("метод y11 в классе D");
    System.out.println(y13);
  }
  public static void y4() {
    System.out.println("метод y4 в классе D");
    System.out.println((y13 - 1));
  }
  public void y24(A r) {
    r.y34();
  }
  public void y24(D r) {
    r.y33();
  }
}
