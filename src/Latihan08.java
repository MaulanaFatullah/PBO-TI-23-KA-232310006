import java.util.Scanner;

public class Latihan08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Nama Kelas: ");
        String namaKelas = input.nextLine();

        System.out.print("Masukkan Semester: ");
        int semester = input.nextInt();

        System.out.print("Masukkan IPK(Contoh: 3,89): ");
        double ipk = input.nextDouble();

        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("NPM: " + npm);
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Nama Kelas: " + namaKelas);
        System.out.println("Semester: " + semester);
        System.out.println("IPK: " + ipk);

        input.close();
    }
}
