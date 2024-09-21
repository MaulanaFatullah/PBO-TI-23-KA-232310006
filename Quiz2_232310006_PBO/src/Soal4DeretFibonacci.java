import java.util.Scanner;

public class Soal4DeretFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("# Program Java Deret Fibonacci #");
        System.out.println("================================");

        System.out.print("Jumlah deret fibonacci yang diinginkan: ");
        int jumlahDeret = in.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " ");

        for (int i = 1; i < jumlahDeret; i++) {
            System.out.print(b + " ");
            int c = a + b; 
            a = b;
            b = c;
        }

        System.out.println();
        in.close();
    }
}
