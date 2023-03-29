package Arrays;

import java.util.Arrays;

public class C01_Soru1 {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir int array’in tum elemanlarini
        2 artirip bize donduren bir method
        olusturun. Eski array’i yeni haliyle kaydedin.

        yapılan metod dinamiktir.
         */


        int [] arr = {1,2,3,4,5,6};

        arr=arrayElemanSayisiniArtırma(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static int [] arrayElemanSayisiniArtırma(int [] ilkarr, int artıs ) {

        for (int i = 0; i < ilkarr.length; i++) {
            ilkarr [i] ++;
        }
     return ilkarr;
    }

}
