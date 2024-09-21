import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int number = 44;
		
		String text = "Java", size;
		
		
		if (number > 0) {
			System.out.println("The number is positive");
		} else if (number > 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is 0");
		}
		
		if (text == "Java") {
			System.out.println("Variable text is same as the condition");
		} else {
			System.out.println("Variable text is different with given condition");
		}
		
		
		System.out.println("Statement outside if block");
		switch (number) {
		case 42:
			size = "Small";
			break;
		case 43:
			size = "Medium";
			break;
		case 44:
			size = "Large";
			break;
		default:
			size = "Unknown";
			break;
			}
		System.out.println("The size is = " + size);
		int value = 80;
		String output = value >= 40 ? "Lulus" : "Tidak lulus";
		System.out.println("Selamat kamu " + output + " dari kelas ini!");
		
			for (int i = 1; i <= 10; i++) {
			
				if (i == 5) {
					break;
				}
				System.out.println(i);
			}
			System.out.println("");
			for (int i = 1; i <= 10; i++) {
				
				if (i > 4 && i < 9) {
					continue;
				}
				System.out.println(i);
			}
		
		}
	}