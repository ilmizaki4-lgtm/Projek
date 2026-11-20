
import java.util.Scanner;

public class ArrayNilai20 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + ":");
            nilaiAkhir[i] = sc.nextInt();
        }
        int jumLulus=0;
        int jumTdkLulus=0;
        int nomor = 1;

           for ( int nilai : nilaiAkhir){
            if (nilai > 70) {
                  System.out.println("Mahasiswa ke-" + nomor + " : " + nilai + " (LULUS)");
                  jumLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + nomor + " : " + nilai + " (TIDAK LULUS)");
                jumTdkLulus++;
            }
            nomor++;
        }
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumTdkLulus);
        System.out.println("Jumlah Mahasiswa Yang Lulus: " + jumLulus);
        sc.close();
    }
}
