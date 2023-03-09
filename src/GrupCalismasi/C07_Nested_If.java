package GrupCalismasi;

import java.util.Scanner;

public class C07_Nested_If {
    public static void main(String[] args) {

        /*
        - Kullanicidan aldigi urun adedi ve
        ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti
        varsa 10 urunden fazla alirsa %20, yoksa
        %15 indirim yapin, Musteri karti yoksa
        10 urunden fazla alirsa %15,
        yoksa %10 indirim yapin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ürün adedini giriniz : ");
        int urunAdedi = scan.nextInt();
        System.out.println("Lutfen urun liste fiyatini giriniz");
        int urunListeFiyati = scan.nextInt();
        System.out.println("Musteri kartiniz var mi : ");
        boolean kartSahipligi = scan.nextBoolean();

        if (kartSahipligi == true) {
            if (urunAdedi > 10) {
                System.out.println(urunListeFiyati * urunAdedi * 0.8);
            } else {
                System.out.println(urunListeFiyati * urunAdedi * 0.85);

            }


        } else if (kartSahipligi == false) {
            if (urunAdedi>10){
            System.out.println(urunListeFiyati * urunAdedi * 0.85);

        } else {
            System.out.println(urunListeFiyati * urunAdedi * 0.9);
        }

    }else {
            System.out.println("Yanlıs giriş");
        }








}}
