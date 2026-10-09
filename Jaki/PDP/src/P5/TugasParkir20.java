import java.util.Scanner;

public class TugasParkir20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int jam,tarif;
        System.out.println("Masukkan jam: ");
        jam = zacky.nextInt();
        
        if (jam <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000+(jam-2)*1000;
        }
        System.out.println("tarif parkir : Rp" + tarif);
    }
}