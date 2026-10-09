import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in); 
        int gajiPokok,gajiKotor,tunjangan;
        double pajak,gajiBersih;
        gajiPokok = zacky.nextInt();
        tunjangan = zacky.nextInt();
        gajiKotor=gajiPokok+tunjangan;
        pajak=0.05*gajiPokok;
        gajiBersih=gajiKotor-pajak;
        System.out.println("gaji bersih adalah " + (int)gajiBersih);
    }
}