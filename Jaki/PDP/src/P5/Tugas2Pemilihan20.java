import java.util.Scanner;

public class Tugas2Pemilihan20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int jumlahSks;
        System.out.println("Masukkan jumlah sks");
        jumlahSks = zacky.nextInt();
        
        if (jumlahSks>24) {
            System.out.println("melebihi batas");
        }
        else {
           System.out.println("KRS valid"); 
        }
    }
}