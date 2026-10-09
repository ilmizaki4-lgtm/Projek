import java.util.Scanner;

public class TugasAntrean20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int kode;
        String layanan;
        String loket;
        System.out.println("Masukkan kode");
        kode = zacky.nextInt();

        switch (kode) {
            case 1:
                layanan = "legalisir ijazah";
                loket ="Loket A";
                break;
            case 2:
                layanan = "Layanan surat keterangan aktif kuliah";
                loket = "Loket B";
                break;
            case 3:
                layanan = "Layanan pembayaran UKT";
                loket = "Loket C";
                break;
            case 4:
                layanan ="Layanan pengajuan cuti akademik";
                loket = "Loket D";
                break;
            default: 
            layanan= "layanan tidak tersedia";
            loket = "-";                
        }
        System.out.println("Layanan: " + layanan);
        System.out.println("Loket: " + loket);
    }
}