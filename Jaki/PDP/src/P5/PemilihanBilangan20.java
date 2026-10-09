import java.util.Scanner;

public class PemilihanBilangan20 {
    public static void main(String[] arg) {
        Scanner zacky = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = zacky.nextInt();

        if (angka % 2 ==0)
        {
            System.out.println("Angka " + angka + "termasuk bilangan genap");
        }    
        else 
        {
            System.out.println("Angka " + angka + "termasuk bilangan ganjil");
        }
    }
}