import java.util.Scanner;
import java.lang.Math; 

public class Latihan03 {

    static double PI = 3.14159;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
        	System.out.println("");
            System.out.println("Pilih bangunan yang ingin dihitung:");
            System.out.println("1. Segitiga Kerucut (Luas Permukaan)");
            System.out.println("2. Layang-layang (Luas)");
            System.out.println("3. Tabung (Volume)");
            System.out.println("4. Prisma Segitiga (Volume)");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    segitigaKerucut(input);
                    break;
                case 2:
                    layangLayang(input);
                    break;
                case 3:
                    tabung(input);
                    break;
                case 4:
                    prismaSegitiga(input);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Ketik Y/y jika ingin melanjutkan: ");
            ulang = input.next().charAt(0);

        } while (ulang == 'Y' || ulang == 'y');

        System.out.println("Terima kasih telah menggunakan program ini.");
        input.close();
    }

    // Menghitung luas kerucut
    public static void segitigaKerucut(Scanner input) {
        System.out.print("Masukkan jari-jari alas (r): ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi (t)");
        double t = input.nextDouble();

        double garisPelukis = Math.sqrt(r * r + t * t);
        double luasPermukaan = PI * r * (r + garisPelukis);
        System.out.println("Luas Permukaan Segitiga Kerucut: " + luasPermukaan);
    }

    // Menghitung luas layang-layang
    public static void layangLayang(Scanner input) {
        System.out.print("Masukkan diagonal 1 (d1): ");
        double d1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2 (d2): ");
        double d2 = input.nextDouble();

        double luas = (d1 * d2) / 2;  
        System.out.println("Luas Layang-layang: " + luas);
    }

    // Menghitung volume tabung
    public static void tabung(Scanner input) {
        System.out.print("Masukkan jari-jari alas (r): ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi (t): ");
        double t = input.nextDouble();

        double volume = PI * r * r * t;  
        System.out.println("Volume Tabung: " + volume);
    }

    // Menghitung volume prisma segitiga
    public static void prismaSegitiga(Scanner input) {
        System.out.print("Masukkan alas segitiga (a): ");
        double a = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga (tSegitiga): ");
        double tSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi prisma (tPrisma): ");
        double tPrisma = input.nextDouble();

        double luasAlas = (a * tSegitiga) / 2;  
        double volume = luasAlas * tPrisma;     
        System.out.println("Volume Prisma Segitiga: " + volume);
    }
}
