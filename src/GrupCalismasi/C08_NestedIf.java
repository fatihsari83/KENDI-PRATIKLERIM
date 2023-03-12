package GrupCalismasi;

import java.util.Scanner;

public class C08_NestedIf {
    public static void main(String[] args) {
         /*
        Kullanicidan bir sayi alin sayi tek ise negatif
        veya pozitif tek sayi oldugunu yazdirin,
        sayi cift sayi ise 10’un tam kati olup olmadigini
        yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            //System.out.println("Girilen sayi pozitif sayidir");
            if (sayi % 2 == 0) {
                //ystem.out.println("Girilen sayi çift sayidir");
                if (sayi % 10 == 0) {
                    System.out.println("Girilen sayi : " + sayi + "pozitif 10 un katıdir");
                } else {
                    System.out.println("Girilen sayi : " + sayi + "pozitif çift sayidir ");
                }
            } else {
                System.out.println("Girilen sayi : " + sayi + "pozitif tek sayidir");


            }

        } else if (sayi < 0) {
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi : " + sayi + "negatif 10 un katıdir");
            } else {
                System.out.println("Girilen sayi : " + sayi + "negatif tek sayidir ");

            }
        }else {
            System.out.println("Girilen sayi : " + sayi + "negatif tek sayidir");
        }
    }
}