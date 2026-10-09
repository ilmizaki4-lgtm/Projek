import java.util.Scanner;

public class MenentukanLulusTidakLulus {
    public static void main(String[] args){
    Scanner zacky = new Scanner(System.in);
    int nilaiAkhir;

    System.out.println("Masukkan nilai akhir");
    nilaiAkhir=zacky.nextInt();

    if (nilaiAkhir >= 60) {
        System.out.println("Mahasiswa dinyatakan Lulus");
    } else {
        System.out.println("Mahasiswa dinyatakan tidak Lulus");
    }
    }
}