package KendiYaptiklarim;

import java.util.Scanner;

public class C01_NestedIf {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi= scan.nextInt();

        if (sayi>0 && sayi%2!=0){
            System.out.println("Girdiginiz : " + sayi + " sayisi pozitif tek sayidir  ");


        } else if (sayi <0 && sayi%2!=0) {
            System.out.println("Girdiginiz : " + sayi + " sayisi negatif tek sayidir  ");

        } else if (sayi>0 && sayi%2==0 && sayi%10==0) {
            System.out.println("Girdiginiz : " + sayi + " 10'un tam katidir  ");


        }else {
            System.out.println("Girdiginiz : " + sayi + " 10'un tam kati degildir  ");

        }
    }
}
