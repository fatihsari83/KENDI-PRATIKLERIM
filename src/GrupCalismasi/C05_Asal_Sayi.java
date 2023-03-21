package GrupCalismasi;

import java.util.Scanner;

public class C05_Asal_Sayi {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu
        // yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz : ");

        int sayi = scan.nextInt();

        // Asal sayılar sadece 1 ve kendilerine tam bölünebilen sayılardır.
        // Bu nedenle, 2'den (sayi-1)'e kadar tüm sayıları kontrol ederek
        // sayının asal olup olmadığını kontrol edebiliriz.
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            }
        }

        if (asalMi) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

       //scan.close();
    }
}







