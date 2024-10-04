import java.util.Scanner;

/**
 * Pemilihan2Percobaan117
 */
public class Pemilihan2Percobaan117 {
    public static void main(String[] args) {
        Scanner D17 = new Scanner(System.in);
        System.out.print("masukkan tahun :");
        int tahun = D17.nextInt();
        if ((tahun % 4) == 0) {
        if ((tahun % 100)!= 0 ) {
            if ((tahun % 400)== 0) {
                System.out.println("tahun kabisat");
            }
            else{
                System.out.println("bukan tahun kabisat");
            }
        }
            else{
            System.out.println("bukan tahun kabisat");
         }  
        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}