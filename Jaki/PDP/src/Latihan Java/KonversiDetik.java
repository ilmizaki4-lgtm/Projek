import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int total,detik,sisaDetik,jam,menit;
        System.out.println("Masukkan Detik");
        total = zacky.nextInt();
        jam = total / 3600;
        sisaDetik = total % 3600;
        menit = sisaDetik / 60;
        detik = sisaDetik % 60;
        System.out.println(jam + " jam " + menit + " menit " + detik + " detik ");
    }
}