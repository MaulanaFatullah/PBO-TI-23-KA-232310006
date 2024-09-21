import java.text.DecimalFormat;
import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final String PIN = "232310006";
        final String nama = "Maulana Fatullah";
        int percobaan = 1;
        String inputPIN;
        long saldo = 100000000;
        boolean isAuthenticated = false;

        while (!isAuthenticated) {
            System.out.print("Masukkan PIN Anda: ");
            inputPIN = in.nextLine();
            
            if (inputPIN.equals(PIN)) {
                isAuthenticated = true;
                System.out.println("Selamat datang, " + nama + "!");
            } else {
            	if (percobaan == 3) {
            		System.out.println("Kartu anda terblokir karena salah memasukkan PIN sebanyak 3 kali");
            		return;
            	}
                System.out.println("PIN salah. Silakan coba lagi.");
                System.out.println("Tersisa " + (3 - percobaan) + " kali percobaan.");
                percobaan++;
            }
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Silahkan pilih menu: ");
            pilihan = in.nextInt();
            DecimalFormat currencyFormat = new DecimalFormat("Rp #,###");
            
            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda: Rp " + currencyFormat.format(saldo));
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setor tunai: Rp ");
                    double setor = in.nextDouble();
                    saldo += setor;
                    System.out.println("Setoran berhasil. Saldo Anda sekarang: Rp " + currencyFormat.format(saldo));
                    break;
                case 3:
                    System.out.print("Masukkan jumlah tarik tunai: Rp ");
                    double tarik = in.nextDouble();
                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil. Saldo Anda sekarang: Rp " + currencyFormat.format(saldo));
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        in.close();
    }
}
