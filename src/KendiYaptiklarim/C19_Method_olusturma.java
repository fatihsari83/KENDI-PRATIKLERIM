package KendiYaptiklarim;

import java.util.Scanner;

public class C19_Method_olusturma {
    public static void main(String[] args) {

        /*
        Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
bolenleri sayisini bulup bize donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();
        int tamBolen=pozitifTamBolenler(sayi);
        System.out.println(sayi + " sayısının pozitif tam bölen sayısı: " +tamBolen);

    }
    public static int pozitifTamBolenler (int sayi){
            int tamBolen=0;

        for (int i = 1; i <sayi; i++) {

            if (sayi%i==0){

                tamBolen++;
            }
        }
        return tamBolen;
    }


}
