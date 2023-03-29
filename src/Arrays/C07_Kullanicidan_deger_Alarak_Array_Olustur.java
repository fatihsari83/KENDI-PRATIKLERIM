package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Kullanicidan_deger_Alarak_Array_Olustur {
    public static void main(String[] args) {

        // kullanicidan array olusturmak uzere pozitif am sayılar alın
        // kullaniciya islemi bitirmek icin 0 a basmasını soyleyin
        // bir onceki class da methodu kulanarak aldıgınız elementleri arr ye ekleyin

        Scanner scan = new Scanner(System.in);

        int girilenSayi=1;
        int [] arr= new int[0];

        while (girilenSayi !=0 ){
            System.out.println("Array e eklemek icin pozitif tamsayılar girin"+
                    "\nislemi bitirmek icicn 0 a basin");
            girilenSayi = scan.nextInt();

            if (girilenSayi !=0){

                arr=C06_Arraye_Eleman_Ekleme_Methodu.arrayeElementEkle(arr,girilenSayi);
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
