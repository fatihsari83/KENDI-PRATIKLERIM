package KendiYaptiklarim;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
        - Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 pozitif tam sayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a>b ? a : b);
    }
}
