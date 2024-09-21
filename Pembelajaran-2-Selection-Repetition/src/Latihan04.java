import java.util.Scanner;
public class Latihan04 {    
    public static void printAscending(int num) {
        System.out.print("ASC (Genap): ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i);
                if (i != num) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
    
    public static void printDescending(int num) {
        System.out.print("DESC (Ganjil):  ");
        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                System.out.print(i);
                if (i != 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan NPM: ");
        long npm = in.nextLong();
        int num;
		do {
	        System.out.print("Masukkan angka yang ingin difaktorisasi (minimal 20): ");
	        num = in.nextInt();
	               
	        if (num < 20) {	
	        	System.out.println("Angka tidak boleh kurang dari 20.");
	        } else {
		        if (npm % 2 == 0) {
		            printAscending(num);
		        } else {
		            printDescending(num);
		        }
	        }
        }while(num < 20);
		in.close();
    }
}
