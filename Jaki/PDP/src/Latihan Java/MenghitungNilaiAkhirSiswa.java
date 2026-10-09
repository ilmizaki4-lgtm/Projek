import java.util.Scanner;

public class MenghitungNilaiAkhirSiswa {
    public static void main(String[] args) {
       Scanner zacky = new Scanner(System.in);
       int tugas,UTS,UAS;
       double nilaiAkhir;
       
       System.out.println("Masukkan tugas ");
       tugas=zacky.nextInt();
       System.out.println("Masukkan UTS");
       UTS=zacky.nextInt();
       System.out.println("Masukkan UAS");
       UAS=zacky.nextInt();
      
       nilaiAkhir=(tugas*0.3)+(UTS*0.3)+(UAS*0.4);
       System.out.println("Nilai akhir adalah " + nilaiAkhir);


    } 
}