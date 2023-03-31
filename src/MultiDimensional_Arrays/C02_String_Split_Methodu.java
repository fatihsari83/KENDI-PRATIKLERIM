package MultiDimensional_Arrays;

import java.util.Arrays;

public class C02_String_Split_Methodu {
    public static void main(String[] args) {

        // bir stringi istediğimiz parcalara ayırmak SPLİT Methodu icin kullanilir.

        String str = "Java candir can";

        // str kac kelimedir?

        String [] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can]

        System.out.println("kelime sayisi : " +kelimeler.length);

        // en uzun kelime kac harflidir
        int enUzunKelimelenght= kelimeler[0].length();

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length()>enUzunKelimelenght){
                enUzunKelimelenght = kelimeler [i].length();
            }

        }
        System.out.println("En uzun kelimenin karakter sayisi : " + enUzunKelimelenght);

        // bir Stringi karakterlerine ayirmak istersek

        String [] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakter sayisi : " + karakterler.length);

    }
}
