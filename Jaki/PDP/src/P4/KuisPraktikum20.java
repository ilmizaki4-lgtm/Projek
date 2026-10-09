import java.util.Scanner;

public class KuisPraktikum20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int biaya,Jam_penuh=7000,tarif_menit=150,tot_biaya,sis_menit,jam_main,Jam;
        double potongan=0.125,biaya_member;
        
        System.out.println("Masukkan jam main");
        jam_main=zacky.nextInt();
       
        System.out.println("Masukkan jam");
        Jam=zacky.nextInt();
        
        System.out.println("Masukkan jam penuh");
        Jam_penuh=zacky.nextInt();
        sis_menit=Jam-jam_main;
        tot_biaya=Jam_penuh+tarif_menit;
        biaya_member=tot_biaya*potongan;
        System.out.println("Biaya member adalah "+biaya_member);
    }
}