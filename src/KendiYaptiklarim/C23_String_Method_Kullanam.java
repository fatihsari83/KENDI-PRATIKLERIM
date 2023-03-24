package KendiYaptiklarim;

import java.util.Scanner;

public class C23_String_Method_Kullanam {

    public static void main(String[] args) {

        // Verilen bir String in Palindrome olup olmadıgını yazdirin
        // Polindrome: duzden ve tersten aynı sekilde yazilan
        // kabak, 12321,

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin girin");
        String metin = scan.nextLine();

        String tersMetin= C22_StringiTerseCevirme_Methodu.metniTerseCevirme(metin);

        if (metin.equals(tersMetin)){
            System.out.println("Girilen metin Palindrome bir metindir");
        }else {
            System.out.println("Girilen metin Palindrome bir metin degildir");
        }
    }
}
