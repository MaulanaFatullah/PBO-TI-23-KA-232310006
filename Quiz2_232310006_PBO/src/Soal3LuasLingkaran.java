import java.util.Scanner;

public class Soal3LuasLingkaran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = in.nextDouble();

        double luas = Math.PI * Math.pow(jariJari, 2);

        System.out.printf("Luas lingkaran nya adalah: " + luas);

        in.close();
    }
}
