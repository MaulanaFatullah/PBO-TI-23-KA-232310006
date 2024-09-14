
import java.util.Scanner;

public class Latihan09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat object dari class Students
        Students student = new Students();

        System.out.print("Masukkan NPM: ");
        Integer npm = input.nextInt();       

        input.nextLine(); 
        // Membaca newline setelah nextInt()
        // Digunakan hanya jika input selanjutnya berbeda tipe data
        // Diperlukan karena iinput setelah integer adalah string

        System.out.print("Masukkan Nama Lengkap: ");
        String fullName = input.nextLine();
        
        System.out.print("Masukkan Nama Kelas: ");
        String className = input.nextLine();

        System.out.print("Masukkan Semester: ");
        Integer semester = input.nextInt();   

        System.out.print("Masukkan GPA (Contoh: 3,89): ");
        Float gpa = input.nextFloat();
        
        System.out.println("===========================");
        System.out.println("NPM: " + student.getNPM(npm));
        System.out.println("Nama Lengkap: " + student.getFullName(fullName));
        System.out.println("Nama Kelas: " + student.getClassName(className));
        System.out.println("Semester: " + student.getSemester(semester));
        System.out.println("GPA: " + student.getGPA(gpa));
        
        input.close();
    }
}

