import java.util.Scanner;

public class nestedUjianSkripsi20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);

        String pesan;
        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak):");
        String bebasKompen= zacky.nextLine().trim();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = zacky.nextInt();
        System.out.println("Masukkan jumlah bimbingan Pembimbing 2: ");
        int bimbinganP2 = zacky.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >= 6 && bimbinganP2 >= 5) {
                pesan = "Semua syarat terpenuhi, mahasiswa dapat mengikuti ujian skripsi.";
            } else if (bimbinganP1 < 6 && bimbinganP2 < 5) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 6 kali dan P2 kurang dari 5 kali.";
            } else if (bimbinganP1 < 6) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 6 kali.";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 5 kali.";
            }
        } else {
            pesan = "Gagal! Mahasiswa  masih memiliki tanggungan kompen.";
            }
            System.out.println(pesan);
        }
           
    }