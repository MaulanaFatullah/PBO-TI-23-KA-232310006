import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Latihan04 {
    
    static final int HARGA_SATUAN = 6300;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        do {
        	System.out.println("");
	        System.out.println("======================================================");
	        System.out.println("                 TOKO SERBAGUNA IBIK");
	        System.out.println("======================================================");
	        System.out.print("Masukan jumlah produk yang dibeli: ");
	        int jumlahProduk = input.nextInt();
	
	        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy (HH:mm)");
	        Date date = new Date();
	
	        int totalHarga = jumlahProduk * HARGA_SATUAN;
	
	        double diskon = 0;
	        if(jumlahProduk >= 3) {
	        	diskon = (jumlahProduk / 3) * 0.05;
	        }
	        double subTotal = totalHarga - (totalHarga * diskon);
	        
	        DecimalFormat currencyFormat = new DecimalFormat("Rp #,###");
	
	        System.out.println("======================================================");
	        System.out.println(formatter.format(date)); 
	        System.out.println("ITEM          QTY        HARGA        TOTAL");
	        System.out.println("======================================================");
	        System.out.println("ROTI ENAK     " + jumlahProduk + "         " + currencyFormat.format(HARGA_SATUAN) + "     " + currencyFormat.format(totalHarga));
	        System.out.println("------------------------------------------------------");
	        
	        if (diskon > 0) {
	            System.out.println("Diskon: " + ((jumlahProduk / 3) * 5) + "%");
	        } else {
	            System.out.println("Diskon: 0%");
	        }
	        
	        System.out.println("Sub Total: " + currencyFormat.format(subTotal));
	        System.out.println("======================================================");
	        
	        System.out.print("Ketik Y/y jika ingin melanjutkan transaksi: ");
	        ulang = input.next().charAt(0);
	        
		} while(ulang == 'Y' || ulang == 'y');
        System.out.println("Terima kasih sudah berbelanja di toko kami.");
		input.close();
    }
}
