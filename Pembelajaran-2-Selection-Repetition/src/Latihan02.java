import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan NPM Anda: ");
        int npm = in.nextInt();

        boolean isPrima = true;

        for (int i = 2; i <= Math.sqrt(npm); i++) {
            if (npm % i == 0) {
                isPrima = false;
                break;
            }
        }

        if (isPrima && npm > 1) {
            System.out.println("Termasuk bilangan Prima");
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
        }
    }
}