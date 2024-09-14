import java.util.Scanner;

public class Latihan05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat atau kata: ");
        String kalimat = input.nextLine();

        String kalimatUppercase = kalimat.toUpperCase();

        System.out.println("Kalimat dalam huruf besar: " + kalimatUppercase);

        input.close();
    }
}
