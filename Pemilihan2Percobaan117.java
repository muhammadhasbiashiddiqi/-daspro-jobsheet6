import java.util.Scanner;

/**
 * Pemilihan2Percobaan117
 */
public class Pemilihan2Percobaan117 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan tahun :");
        int tahun = sc.nextInt();
        if ((tahun % 4) == 0) {
            System.out.println("tahun kabisat ");
            
        } else {
            System.out.println("bukan tahun kabisat");
            
        }
    }
}