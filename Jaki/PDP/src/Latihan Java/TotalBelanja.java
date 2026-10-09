import java.util.Scanner;

public class TotalBelanja {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int harga,jumlah,total;
        harga = zacky.nextInt();
        jumlah = zacky.nextInt();
        total=harga*jumlah;
        System.out.println("totalnya adalah " + total);
    }
}