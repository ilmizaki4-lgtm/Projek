import java.util.Scanner;

public class operatorLogikaWifi20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.println("apakah pengguna mahasiswa? (true/false): ");
        mahasiswa =zacky.nextBoolean();
        
        System.out.println("apakah pengguna dose? (true/false): ");
        dosen = zacky.nextBoolean();

        System.out.println("apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = zacky.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("akses wifi diberikan");
        } else {
            System.out.println("akses wifi tidak diberikan");
        }
    }
}