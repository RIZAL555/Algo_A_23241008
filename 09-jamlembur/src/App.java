import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int percobaan = 1; percobaan <= 3; percobaan++) {
            System.out.println("Percobaan ke-" + percobaan);
            System.out.print("Masukkan jumlah jam lembur: ");
            int jamLembur = scanner.nextInt();
            System.out.print("Apakah karyawan tetap? (ya/tidak): ");
            String statusKaryawan = scanner.next().toLowerCase();

            if (statusKaryawan.equals("ya")) {
                if (jamLembur >= 12) {
                    System.out.println("Gaji lembur: Rp. 200.000");
                } else if (jamLembur >= 8) {
                    System.out.println("Gaji lembur: Rp. 100.000");
                } else {
                    System.out.println("Tidak mendapatkan gaji lembur.");
                }
            } else if (statusKaryawan.equals("tidak")) {
                if (jamLembur >= 8) {
                    System.out.println("Gaji lembur: Rp. 75.000");
                } else {
                    System.out.println("Tidak mendapatkan gaji lembur.");
                }
            } else {
                System.out.println("Masukan status karyawan tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
            }

            System.out.println(); 
        }

        scanner.close();
    }
}