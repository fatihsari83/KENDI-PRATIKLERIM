package KendiYaptiklarim;

import java.util.Scanner;

public class C18_ForLoops {
    public static void main(String[] args) {
        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        sayinin asal sayi olup olmadigini
        kontrol edin ve sonucu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <sayi ; i++) {
            if (sayi%1==0 && sayi%sayi==0){
                System.out.println(i + " sayısı asal sayidir");
            }else {
                System.out.println(i + " sayı asal sayi degildir");
            }
        }
    }
}
