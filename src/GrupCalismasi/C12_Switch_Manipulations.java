package GrupCalismasi;

import java.util.Scanner;

public class C12_Switch_Manipulations {
    public static void main(String[] args) {
        /*
        Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.nextLine();

        //if (metin.contains(kelime)){
      //  System.out.println(metin.indexOf(kelime));

    //}else {
          //  System.out.println("Aradıgınız kelime metinde yoktur");
        //}
        if (metin.indexOf(kelime) != -1){
            System.out.println("Aradıgınız kelime metinde bulunmaktadır.");
        }else {
            System.out.println("Aradıgınız kelime metinde yoktur");
        }
}}
