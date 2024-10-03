import java.util.Scanner;

/**
 * Pemilihan2Percobaan318
 */
public class Pemilihan2Percobaan318 {

    public static void main(String[] args) {
        Scanner D17 = new Scanner(System.in);
        String kategori;
        int penghasilan ,gajibersih;
        double pajak = 0;
        System.out.print("masukkan kategori = ");
        kategori = D17.nextLine();
        System.out.print("masukkan besar gaji = ");
        penghasilan = D17.nextInt();
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) 
                pajak = 0.1;
            if (penghasilan <= 3000000) 
                pajak = 0.15;
           else 
           pajak = 0.2;
           gajibersih = (int)(penghasilan - (pajak*penghasilan));
           System.out.println("gajibersih" + gajibersih);
        }
        else if (kategori.equalsIgnoreCase("pembisnis")) {
            if (penghasilan <= 2500000) 
            pajak = 0.15;
        if (penghasilan <= 3500000) 
            pajak = 0.2;
       else 
       pajak = 0.25;
       gajibersih = (int)(penghasilan - (pajak*penghasilan));
       System.out.println("gajibersih" + gajibersih);
        }
        else{
            System.out.println("masukkan kategori salah");
        }
    }
}