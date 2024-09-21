import java.util.Scanner;

public class Resto {
    private long harga;

    public void chooseMenu() {
        Scanner in = new Scanner(System.in);
        int pilihan;
        	System.out.println("===============================");
            System.out.println("Menu Sarapan:");
            System.out.println("1. Nasi Goreng (Rp 22.000,-)");
            System.out.println("2. Bubur Ayam (Rp 15.000,-)");
            System.out.println("3. Soto Ayam (Rp 25.000,-)");
            System.out.println();
            
            System.out.print("Silahkan pilih menu: ");
             pilihan = in.nextInt();
            
            long hargaMenu = getPrices(pilihan);
            
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + hargaMenu);
                    break;
                case 2:
                    System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + hargaMenu);
                    break;
                case 3:
                    System.out.println("Anda memesan Soto Ayam dengan harga Rp " + hargaMenu);
                    break;
                default:
                    System.out.println("Maaf, menu yang Anda masukkan salah.");
            }
    }

    private long getPrices(int pilihanMenu) {
        switch (pilihanMenu) {
            case 1:
                harga = 22000;
                break;
            case 2:
                harga = 15000;
                break;
            case 3:
                harga = 25000;
                break;
            default:
                harga = 0;
                break;
        }
        return harga;
    }
}
