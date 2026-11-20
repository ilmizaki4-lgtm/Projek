import java.util.Scanner;
public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan Jumlah Mahasiswa");
        int jumlah=sc.nextInt();
        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        double rata2;
        int jumLulus=0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] =sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumLulus++;
            }
        } 
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi)  tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah=nilaiMhs[i];
        }
        rata2= (double) total/ nilaiMhs.length;
        if (rata2 >= 85) {
            System.out.println("Prediket Kelas Sangat Baik");
        } else if (rata2 >= 70){
            System.out.println("Prediket Kelas Baik");
        } else {
            System.out.println("Perlu Pendamping");
            
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Jumlah Mahasiswa Lulus: " + jumLulus);
    }
}
