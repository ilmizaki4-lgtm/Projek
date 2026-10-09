import java.util.Scanner;

public class tugas2SeleksiAsisten20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);

        boolean statusAktif;
        boolean sedangDisanksi;
        boolean punyaSertif;
        int nilaiDasar;
        int nilaiWawancara;

        System.out.println("apakah berstatus aktif? (true/false): ");
        statusAktif = zacky.nextBoolean();
        System.out.println("apakah sedang disanksi? (true/false): ");
        sedangDisanksi = zacky.nextBoolean();
       
        if (statusAktif && !sedangDisanksi) {
            System.out.println("Tahap 1 lulus");
            System.out.println("masukkan nilai dasar");
            nilaiDasar = zacky.nextInt();
            System.out.println("apakah punya sertif? (true/false): ");
            punyaSertif = zacky.nextBoolean();

           if (nilaiDasar >= 84 || punyaSertif ) {
            System.out.println("Tahap 2 lulus");
            System.out.println("mahasiswa dipanggil wawancara");

            System.out.println("masukkan nilai wawancara");
            nilaiWawancara = zacky.nextInt();
        
            if (nilaiWawancara >= 79) {
                System.out.println("Selamat,kamu diterima sebagai asisten praktikum");                
            } else {
                System.out.println("nilai belum wawancara memenuhi syarat,kamu gagal");
            } 
        } else {
                System.out.println("nilai dasar tidak mencukupi");
            } 
        } else {
                System.out.println("gagal pada tahap administrasi.");
        
        }
    }
}