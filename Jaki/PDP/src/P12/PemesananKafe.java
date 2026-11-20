import java.util.Scanner;
public class PemesananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };
        int[] harga = {
            15000, 13000, 10000, 12000,
            8000, 18000, 20000
        };
        for (int i = 0; i < menu.length; i++) {
            System.out.println(
                (i + 1) + ". " + menu[i] + " - Rp" + harga[i]
            );
        }
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = sc.nextLine();

        int posisi = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari.trim())) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Menu ditemukan!");
            System.out.println("Nama Menu: " + menu[posisi]);
            System.out.println("Harga: Rp" + harga[posisi]);
        } else {
            System.out.println("Menu tidak tersedia!");
        }
        System.out.print("Masukkan jumlah item yang dipesan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        if (jumlah <= 0) {
            System.out.println("Jumlah pesanan harus lebih dari 0!");
            sc.close();
            return;
        }
        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int totalBiaya = 0;
        for (int i = 0; i < jumlah; i++) {
         while (true) {
                System.out.print(
                    "Masukkan nama menu pesanan ke-" + (i + 1) + ": "
                );
                String nama = sc.nextLine();
                int index = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama.trim())) {
                        index = j;
                        break;
                    }
                }
               if (index != -1) {
                    pesanan[i] = menu[index];
                    hargaPesanan[i] = harga[index];
                    totalBiaya += harga[index];
                    System.out.println("Pesanan berhasil ditambahkan!");
                    break;
                } else {
                    System.out.println(
                        "Menu tidak ditemukan! Silakan masukkan kembali."
                    );
                }
            }
        }
        System.out.printf("%-5s %-22s %s%n","No", "Nama Menu", "Harga");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-22s Rp%d%n",(i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("Jumlah Item : " + jumlah);
        System.out.println("Total Biaya : Rp" + totalBiaya);
        sc.close();
    }
}
