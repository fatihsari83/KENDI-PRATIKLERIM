package KendiYaptiklarim;

import java.util.Scanner;

public class C16_String_Manipulations {
    public static void main(String[] args) {

        /*
        Kullanicidan alinan bir String alin,
        String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        String’in uzunlugu tek sayi ise ortadaki harfi silin ve
        yerine :( yazdirin.
         */

        //Scanner scan= new Scanner(System.in);
        //System.out.println("Lutfen uzun bir kelime girin");
        String cumle= "Java cok guzel fakat biraz zor gibi.";
        System.out.println(cumle.length());

        if (cumle.length()%2==0){
            //kelime= kelime.length()%2 + ":)";
            //System.out.println(cumle.substring(0,18) + ":)" + cumle.substring(18));
            //kelime=kelime.length()%2.

        }else {
            System.out.println(cumle.length());
        }


    }

}
