
import java.util.Scanner;

/**
 * PemilihanLat220
 */
public class PemilihanLat320 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        String merk, kategori;
        int ukuran, harga;

        System.out.println("masukkan merk : ");
        merk = input20.nextLine();
        System.out.println("masukkan kategori : ");
        kategori = input20.nextLine();
        System.out.println("masukkan ukuran : ");
        ukuran = input20.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slipOn")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equalsIgnoreCase("hightTop")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else {
                System.out.println("Kategori tidak valid");
                return;
            }
        } else if (merk.equalsIgnoreCase("skecthers")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else {
                System.out.println("Kategori tidak valid");
                return;
            }
        } else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else {
                System.out.println("Kategori tidak valid");
                return;
            }
        }
    }
}
