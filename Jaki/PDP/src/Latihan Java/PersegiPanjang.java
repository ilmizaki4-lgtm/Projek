import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
    Scanner zacky = new Scanner (System.in);

    int panjang,lebar,luas,keliling;
    panjang = zacky.nextInt();
    lebar = zacky.nextInt();
    luas = panjang*lebar;
    keliling = 2*(panjang+lebar);
    System.out.println("Luas adalah " + luas);
    System.err.println("keliling adalah " + keliling);
    }
}