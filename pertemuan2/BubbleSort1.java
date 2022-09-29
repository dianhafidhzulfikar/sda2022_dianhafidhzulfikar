package pertemuan2;

public class BubbleSort1 {
  static void bublesort(int[] angka) {
    for (int i = 0; i < angka.length; i++) {
      for (int j = 0; j < angka.length - 1; j++) {
        if (angka[j] > angka[j + 1]) {
          int temp = angka[j];
          angka[j] = angka[j + 1];
          angka[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] angka = { 23, 43, 33, 12, 76, 87, 89, 54, 67, 78 };
    System.out.println("Data sebelum diurutkan :");
    for (int i = 0; i < angka.length; i++) {
      System.out.print(angka[i] + " ");
    }
    System.out.println(" ");
    bublesort(angka);
    System.out.println("Data setelah diurutkan");
    for (int index = 0; index < angka.length; index++) {
      System.out.print(angka[index] + " ");
    }

  }

}
