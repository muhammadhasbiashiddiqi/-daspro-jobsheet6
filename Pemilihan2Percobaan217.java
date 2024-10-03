import java.util.Scanner;

/**
 * Pemilihan2Percobaan217
 */
public class Pemilihan2Percobaan217 {

    public static void main(String[] args) {
        Scanner D17 = new Scanner(System.in);
        int pemilihan_menu ,harga;
        double jumlah_beli ,total_bayar;
        String member ;
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1.ricebowl");
        System.out.println("2.ice tea");
        System.out.println("3.paket bunding(ricebowl + ice tea)");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pemilihan_menu = D17.nextInt();
        D17.nextLine();
        System.out.print("apkah punya member y/n ? = ");
        member = D17.nextLine();
        System.out.println("--------------------------");
        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10;
            System.out.println("besar diskon = 10%");
            if (pemilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
            }
            else if (pemilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
            }
            else if (pemilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bandling = " + harga);
            }
            else{
                System.out.println("masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga*diskon);
            System.out.println("total bayar setelah diskon =" + total_bayar);
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pemilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
            }
            else if (pemilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
            }
            else if (pemilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bandling = " + harga); 
            }
            else{
                System.out.println("masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("total bayar = " + harga);
           
        }
        else {
            System.out.println("member tidak valid");
        }
        System.out.println("--------------------------");
    }
}