import java.util.Scanner;

public class Latihan05 {

    public static void cetakFor(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }    
            for (int j = 1; j < (2 * i - 1); j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {    
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < (2 * i - 1); j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void cetakWhile(int n) {
        int i = 1;
        while (i <= n) {
            int j = i;    
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            j = 1;
            while (j < (2 * i - 1)) {
                System.out.print("  ");
                j++;
            }
            j = i;
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        
        i = n - 1;
        while (i >= 1) {
            int j = i;    
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            j = 1;
            while (j < (2 * i - 1)) {
                System.out.print("  ");
                j++;
            }
            j = i;
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        long npm = in.nextLong();
        System.out.print("Masukkan jumlah baris yang ingin dicetak: ");
        int n = in.nextInt();

        if (npm % 2 == 0) {
        	System.out.println("NPM Genap menggunakan For");
            cetakFor(n);
        } else {
        	System.out.println("NPM Ganjil menggunakan While");
            cetakWhile(n);
        }
        in.close();
    }
}
