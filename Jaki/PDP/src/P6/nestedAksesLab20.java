import java.util.Scanner;

public class nestedAksesLab20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.println("apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = zacky.nextBoolean();
        System.out.println("apakah sedang disanksi? (true/false): ");
        sedangDisanksi = zacky.nextBoolean();
        System.out.println("apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = zacky.nextBoolean();
        System.out.println("apakah asisten lab? (true/false): ");
        asistenLab = zacky.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("akses labor diberikan");
            } else {
                System.out.println("akses ditolak: membuthkan izin dosen atau status asisten lab");
            } 
        }else {
                System.out.println("akses ditolak: status mahasiswa tidak memenuhi syarat");
            }
        }
    }