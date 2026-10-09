import java.util.Scanner;

public class diskonBuku20 {
    public static void main(String[] args) {
    Scanner zacky = new Scanner(System.in);

    String jenisBuku;
    int jumlahBuku;
    double diskon;

    System.out.println("masukkan jenis buku ");
    jenisBuku = zacky.nextLine();
    System.out.println("masukkan jumlah buku");
    jumlahBuku = zacky.nextInt();

    if ((jenisBuku.equalsIgnoreCase("kamus")) && (jumlahBuku >2)) {
        diskon = 0.1;
       } else if (jenisBuku.equalsIgnoreCase("kamus")) {
        diskon = 0.08;
       } else if ((jenisBuku.equalsIgnoreCase("Novel")) && (jumlahBuku >3)) {
            diskon = 0.07;
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.06;
       } else if (jumlahBuku >3){ 
            diskon = 0.03;
        } else {
            diskon = 0;
        }
    System.out.println("diskon buku " + diskon);

    }
}
    