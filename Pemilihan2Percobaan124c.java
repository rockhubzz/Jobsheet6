import java.util.Scanner;

public class Pemilihan2Percobaan124c {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = input24.nextInt();
        if ((tahun % 4) == 0 && ((tahun % 100) != 0 || (tahun % 400) == 0)) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }    }
}
