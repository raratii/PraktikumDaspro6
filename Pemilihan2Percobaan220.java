
import java.util.Scanner;

/**
 * Pemilihan2Percobaan220
 */
public class Pemilihan2Percobaan220 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        String member, jenisPembayaran;
        int menu;
        double total_bayar, diskon, harga;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricwbowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.println(" Masukkan angka dari menu yang dipilih = ");
        menu = input20.nextInt();
        input20.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input20.nextLine();
        System.out.println("Jenis pembayaran (QRIS/Non-QRIS) ? = ");
        jenisPembayaran = input20.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            if (menu == 1) {
                harga = 10000;
                System.out.println("Harga ricebowl =" + harga);

            } else if (menu == 2) {
                harga = 4000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu == 3) {
                harga = 13000;
                System.out.println("Harga bunling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);

            if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("potongan harga QRIS = " + total_bayar);
                System.out.println("total bayar = " + total_bayar);
            } else if (jenisPembayaran.equalsIgnoreCase("Non-QRIS")) {
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else {
                System.out.println("Jenis pembayaran tidak valid");
            }

        } else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 10000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (menu == 2) {
                harga = 4000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (menu == 3) {
                harga = 13000;
                System.out.println("Harga bundling" + harga);

            } else {
                System.out.println("Memasukkan pilihan menu dengan benar");
                return;
            }

            if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
                harga -= 1000;
                System.out.println("Potongan harga QRIS = " + harga);
                System.out.println("Total bayar = " + harga);
            } else if (jenisPembayaran.equalsIgnoreCase("non-QRIS")) {
                System.out.println("Total bayar = " + harga);
            } else {
                System.out.println("Jenis pembayaran tidak valid");
            }
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-----------------------------------------");
        
    }
}
