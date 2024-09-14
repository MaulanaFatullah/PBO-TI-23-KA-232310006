import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input dalam Celcius
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;
        double reamur = celcius * 4/5;
        double kelvin = celcius + 273.15;

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam Reamur: " + reamur);
        System.out.println("Suhu dalam Kelvin: " + kelvin);
        
        input.close();
    }
}