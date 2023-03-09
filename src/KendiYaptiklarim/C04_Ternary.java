package KendiYaptiklarim;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {


        /*
        Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
harf olarak yazdirin, yoksa girilen harfi yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin :");
        char harf= scan.next().charAt(0);

        System.out.println((harf>97 && harf <122) ? (char) (harf-32) : harf );

        //System.out.println((harf >= 97 && harf < 122) ? (char) (harf - 32) : harf);
        //System.out.println((harf >= 'a' && harf <= 'z' ? (char)(harf - 32): harf));
    }
}
