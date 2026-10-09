import java.util.Scanner;

public class DiskonPembelian {
    public static void main(String[] args) {
        Scanner zacky = new Scanner(System.in);
        int totBelanja;
        int totBiaya;

        System.out.println("Masukkan total belanja");
        totBelanja=zacky.nextInt();

        if (totBelanja >= 500000); {
            totBiaya = totBelanja -(int)(totBelanja*0.1);
            System.out.println("total biaya adalah " + totBiaya);
        }
    }
}