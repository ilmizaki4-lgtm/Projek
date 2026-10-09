import java.util.Scanner;

public class JumlahCicilan20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int harga,uangMuka,bulan,sisa;
        double bunga=0.02,tot_bunga,cicilan,pokok;
       
        System.out.println("Masukkan harga");
        harga=zacky.nextInt();

        System.out.println("Masukkan uang muka");
        uangMuka=zacky.nextInt();
       
        System.out.println("Masukkan bulan");
        bulan=zacky.nextInt();
        
        sisa=harga-uangMuka;
        tot_bunga=bunga*sisa;
        pokok=sisa/bulan;
        cicilan=harga+tot_bunga;
        System.out.println("Cicilan yang dibayar adalah " + (int)cicilan);
    }
}