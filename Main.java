public class Main {
  public static void main(String[] args) {
    String[] nama = { "Zena", "Mimi", "Neni", "Ana", "Jeje" };
    String temp;
    System.out.println("Sebelum diurutkan");
    for (int i = 0; i < nama.length; i++) {
      System.out.println(i + 1 + " " + nama[i] + "");
    }
    System.out.println("Sesudah diurutkan");
    for (int i = 0; i < nama.length - 1; i++) {
      for (int j = 0; j < nama.length - 1; j++) {
        if (nama[j].compareTo(nama[j + 1]) > 0) {
          temp = nama[j + 1];
          nama[j + 1] = nama[j];
          nama[j] = temp;
        }
      }
    }
    for (int i = 0; i < nama.length; i++) {
      System.out.println(i + 1 + " " + nama[i]);
    }
  }
}
