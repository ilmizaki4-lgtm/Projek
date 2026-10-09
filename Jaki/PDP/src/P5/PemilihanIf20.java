import java.util.Scanner;

public class PemilihanIf20 {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (True/false): ");
        boolean uktLunas = zacky.nextBoolean();
        
       String pesan= (uktLunas)? "pembayaran ukt terverifikasi silahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
       System.out.println(pesan);
           
    }
}