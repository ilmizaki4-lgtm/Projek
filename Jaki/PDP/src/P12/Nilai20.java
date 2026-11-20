import java.util.Scanner;
public class Nilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0!");
            sc.close();
            return;
        }
        int[] nilai = new int[jumlah];

        int total = 0;
        int lulus = 0;
        int tidakLulus = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            total += nilai[i];
        }
        int tertinggi = nilai[0];
        int terendah = nilai[0];
       for (int i = 0; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
            if (nilai[i] > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        double rataRata = (double) total / jumlah;
        System.out.println("Jumlah Mahasiswa: " + jumlah);
        System.out.println("Total Nilai: " + total);
        System.out.println("Rata-rata Nilai: " + rataRata);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1));
            System.out.print(" | Nilai: " + nilai[i]);

            if (nilai[i] > 70) {
                System.out.println(" | Status: LULUS");
            } else {
                System.out.println(" | Status: TIDAK LULUS");
            }
        }
        System.out.println("Jumlah Lulus: " + lulus);
        System.out.println("Jumlah Tidak Lulus: " + tidakLulus);
        sc.close();
    }
}