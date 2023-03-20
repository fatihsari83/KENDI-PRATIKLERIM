package GrupCalismasi;

import java.util.Scanner;

public class C16_String_manipulations {
    public static void main(String[] args) {
         /*
        Kullanicidan isim ve soyismini ayri ayri alin.
        - ismi daha uzun ise, isim ve soyismi
        - ilk harf buyuk kalanlar kucuk seklinde yazdirin
        - soyisim daha uzun ise ismi ilk harf buyuk
         - digerleri kucuk, soyismi buyuk harflerle yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminiz giriniz");
        String soyisim = scan.nextLine();
    }
}
