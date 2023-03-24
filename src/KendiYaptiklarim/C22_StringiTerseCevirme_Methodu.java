package KendiYaptiklarim;

import java.util.Scanner;

public class C22_StringiTerseCevirme_Methodu {
    public static void main(String[] args) {

        // Kullanicidan alınan bir String'i tersine cevirip
        // bize donduren bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin girin");
        String metin = scan.nextLine();

        String sonuc= metniTerseCevirme(metin);

        System.out.println(sonuc);


    }
    public static String metniTerseCevirme (String metin){

        String tersMetin="";

        for (int i = metin.length()-1; i >=0; i--) {

            tersMetin+=metin.charAt(i);
        }
        return tersMetin;
    }
}
