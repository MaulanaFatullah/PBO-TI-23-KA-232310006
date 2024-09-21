import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Resto resto = new Resto();
        char ulangi;

        do {
            resto.chooseMenu();
           
            System.out.print("Apakah anda akan memesan kembali? (y/n): ");
            ulangi = in.next().charAt(0);
            System.out.println();
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih telah memesan.");
    }
}
