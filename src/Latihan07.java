import java.util.Scanner;

public class Latihan07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama lengkap: ");
        String namaLengkap = input.nextLine();

        String namaDiubah = namaLengkap.replaceAll("[AIUEOaiueo]", "X");

        System.out.println("Nama setelah diubah: " + namaDiubah);

        input.close();
    }
}
