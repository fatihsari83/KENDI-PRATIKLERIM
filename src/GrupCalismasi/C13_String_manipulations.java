package GrupCalismasi;

import java.util.Scanner;

public class C13_String_manipulations {
    public static void main(String[] args) {

        /*
        Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
        yazdirin
        - String aranan metni icermiyor
        - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmis
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.nextLine();

        if (!metin.contains(kelime)){
            System.out.println("Aradıgınız kelime bulunmamaktadır");
        } else if (metin.indexOf(kelime)== metin.lastIndexOf(kelime)) {
            System.out.println("Aradıgınız kelime 1 kere kullanılmıstır.");
        }else {
            System.out.println("Birden fazla kullanılmıstır.");
        }
    }
}
