import java.util.Scanner;

public class Latihan06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan Usia: ");
        String usia = input.nextLine();

        System.out.print("Masukkan Firstname: ");
        String firstName = input.nextLine();

        System.out.print("Masukkan Lastname: ");
        String lastName = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        // Menggabungkan semua input menggunakan concat()
        String hasil = usia.concat(firstName).concat(lastName).concat(npm);

        // Menampilkan hasil
        System.out.println("Hasil penggabungan: " + hasil);

        input.close();
    }
}
