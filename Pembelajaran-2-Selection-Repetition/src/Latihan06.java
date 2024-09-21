import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ulangi;

        do {
            System.out.println("===============================");
            System.out.println("Menu Sarapan:");
            System.out.println("1. Nasi Goreng (Rp 22.000,-)");
            System.out.println("2. Bubur Ayam (Rp 15.000,-)");
            System.out.println("3. Soto Ayam (Rp 25.000,-)");
            System.out.println();

            System.out.print("Silahkan pilih menu: ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memesan Nasi Goreng dengan harga Rp 22.000,-");
                    break;
                case 2:
                    System.out.println("Anda memesan Bubur Ayam dengan harga Rp 15.000,-");
                    break;
                case 3:
                    System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-");
                    break;
                default:
                    System.out.println("Maaf, menu yang Anda masukkan salah.");
                    break;
            }

            System.out.print("Apakah anda akan memesan kembali? (y/n): ");
            ulangi = in.next().charAt(0); 
            System.out.println();
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih telah memesan.");
    }
}
