import java.util.Scanner;

/**
 * tugaspertemuan617
 */
public class tugaspertemuan617 {

    public static void main(String[] args) {
        Scanner D17 = new Scanner(System.in);
        int jumlahbuku;
        double hargabuku ,diskon ,totalhargabayar ;
        String jenisbuku;
        System.out.print("jenis buku = ");
        jenisbuku = D17.nextLine();
        System.out.print("masukkan jumlah buku = ");
        jumlahbuku = D17.nextInt();
        if (jenisbuku.equalsIgnoreCase("kamus")) {
            if (jumlahbuku > 2) 
                diskon = 0.12;
            else
            diskon = 0.1;
        }
        else if (jenisbuku.equalsIgnoreCase("novel")) {
            if (jumlahbuku > 3) 
                diskon = 0.09;
            else
            diskon = 0.08;
        }
        else{
            if (jumlahbuku > 3) 
                diskon = 0.1;
            else
            diskon = 0.05;
            
        }
        int harga = 20000 * jumlahbuku;
        totalhargabayar = harga - (diskon * harga);
        System.out.println("jenis buku = " + jenisbuku);
        System.out.println("total diskon = "+ diskon);
        System.out.println("jumlah buku = " + jumlahbuku);
        System.out.println("total harga bayar = "+ totalhargabayar);
    }
}