package GrupCalismasi;

import java.util.Scanner;

public class C19_For {
    public static void main(String[] args) {
        /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.


        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
        kaydedin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String metin = scan.nextLine();

        String tersMetin="";

        for (int i = metin.length()-1; i >= 0; i--) {
            tersMetin+= metin.charAt(i);

        }System.out.println(tersMetin);
        metin=tersMetin;
        System.out.println(metin);
    }
}
