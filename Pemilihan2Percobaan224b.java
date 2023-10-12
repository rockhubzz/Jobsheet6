import java.util.Scanner;

public class Pemilihan2Percobaan224b {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int sudut1, sudut2, sudut3;

        System.out.print("Masukkan besar sudut 1: ");
        sudut1 = input24.nextInt();
        System.out.print("Masukkan besar sudut 2: ");
        sudut2 = input24.nextInt();
        System.out.print("Masukkan besar sudut 3: ");
        sudut3 = input24.nextInt();

        int totalSudut = sudut1+sudut2+sudut3;

        if (totalSudut == 180){
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if((sudut1 == sudut2) && (sudut2 == sudut3)){
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)){
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }else{
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        } else{
            System.out.println("Bukan segitiga");
        }
    }
}
