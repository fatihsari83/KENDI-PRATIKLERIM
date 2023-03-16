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

     // //Scanner scan= new Scanner(System.in);
     // //System.out.println("Lutfen uzun bir kelime girin");
     // String cumle= "Java cok guzel fakat biraz zor gibi.";
     // System.out.println(cumle.length());

     // if (cumle.length()%2==0){
     //     //kelime= kelime.length()%2 + ":)";
     //     //System.out.println(cumle.substring(0,18) + ":)" + cumle.substring(18));
     //     //kelime=kelime.length()%2.

     // }else {
     //     System.out.println(cumle.length());
     // }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string girin: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();
        if (length % 2 == 0) { // uzunluk çift sayıysa
            int mid = length / 2;
            inputString = inputString.substring(0, mid) + ":)" + inputString.substring(mid);
        } else { // uzunluk tek sayıysa
            int mid = length / 2;
            inputString = inputString.substring(0, mid) + ":(" + inputString.substring(mid+1);
        }

        System.out.println("Sonuç: " + inputString);
    }
}

/*
Bu kodda kullanıcıdan bir String alınır ve length
değişkeninde uzunluğu saklanır. Ardından,
length değişkeninin mod 2'si hesaplanarak,
String'in uzunluğunun çift veya tek sayı olduğu belirlenir.

Eğer uzunluk çift sayıysa, mid değişkeninde String'in orta
noktasının index'i hesaplanır ve String'in bu noktasına ":)" eklenir.
Eğer uzunluk tek sayıysa, ortadaki harf mid değişkenindeki
index ile silinir ve yerine ":" eklenir.
Son olarak, yeni String konsola yazdırılır.

 */


