import java.util.Scanner;

public class StrukRestoran {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int harga;
        double pajak,service,total;
        
        System.out.println("masukkan Harga makanan");
        harga = zacky.nextInt();
        pajak = 0.1*harga;
        service = 0.05*harga;
        total = harga+pajak+service;
        System.out.println("Total pajak nya adalah " + (int) pajak);
        System.out.println("Harga service nya adalah " + (int) service);
        System.out.println("total harga makanan adalah " + (int) total );
    }
}