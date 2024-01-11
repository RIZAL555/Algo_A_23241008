import java.util.Scanner;

public class App {
  public static void main (String[] args) {
    //data variabel
    int jamlembur;
    //membuat objek scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Jumlah jam lembur : ");
    jamlembur = input.nextInt();
    //membuat percabangan
    if (jamlembur < 12) {
      System.out.println("Gaji Lembur : Rp.200.000");
    } else if (jamlembur == 12) {
      System.out.println("Gaji Lembur : Rp. 100.000");
    } else if (jamlembur > 12){
      System.out.println("Gaji Lembur : Rp. 75.000");
    }
  }
}