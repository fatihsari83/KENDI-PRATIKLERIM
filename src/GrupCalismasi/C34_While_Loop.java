package GrupCalismasi;

import java.util.Scanner;

public class C34_While_Loop {
    public static void main(String[] args) {
/*
            Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
            While loop kullanarak verilen sayinin istenen ussunu
            hesaplayip yazdiran bir method olusturun.
 */

        int sayi=0;
        int usSayi=5;

        ussunuHesaplama(sayi,usSayi);


    }

    public static void ussunuHesaplama(int sayi, int usSayi) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        sayi= scan.nextInt();

        System.out.println("Lutfen bir us sayi giriniz");
        usSayi= scan.nextInt();

        while (usSayi !=1){
            sayi *=sayi;
            usSayi--;
        }

        System.out.println(sayi);

    }

}
