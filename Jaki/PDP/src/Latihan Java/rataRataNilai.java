import java.util.Scanner;

public class rataRataNilai {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int nilai1,nilai2,nilai3;
        System.out.println("Masukkan nilai siswa");
        nilai1=zacky.nextInt();
        nilai2=zacky.nextInt();
        nilai3=zacky.nextInt();
        double rataRata = (nilai1+nilai2+nilai3)/3;
        System.out.println(" Rata rata nilai siswa tersebut " + (int)rataRata);

    }
}