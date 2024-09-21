import java.util.Scanner;

public class Soal2SegitigaAngka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = in.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }

        in.close();
    }
}
