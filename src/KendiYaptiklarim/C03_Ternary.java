package KendiYaptiklarim;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi girin : ");
        int sayi= scan.nextInt();

        System.out.println(sayi%5==0 ? "Sayi 5'in tam kati" : sayi);
    }
}
