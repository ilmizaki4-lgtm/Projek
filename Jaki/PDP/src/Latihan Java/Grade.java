import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int nilai;
        System.out.println("Silahkan masukkan nilai anda");
        nilai=zacky.nextInt();

        if ( nilai < 0 || nilai > 100 ) {
            System.out.println("nilai tidak valid");
        } else if(nilai >= 85) {
            System.out.println(" rade A ");
        } else if (nilai >= 70) {
            System.out.println("Grade B ");
        } else if (nilai >= 55) {
            System.out.println("Grade c ");
        } else if (nilai >= 40) {
            System.out.println("Grade D ");
        } else if (nilai >= 0) {
           System.out.println("Grade E ");
        }
        zacky.close();
    }
}