import java.util.Scanner;

public class Soal1PersegiBintang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int ukuran = in.nextInt();

        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        in.close();
    }
}
