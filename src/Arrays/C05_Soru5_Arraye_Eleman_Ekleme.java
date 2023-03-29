package Arrays;

import java.util.Arrays;

public class C05_Soru5_Arraye_Eleman_Ekleme {
    public static void main(String[] args) {

        // Verilen bir array e istenen elementi ekleyelim

        int [] arr = {4,5,6};
        int eklenecekElement= 10;


        int[] yeniArr= new int[arr.length+1]; // [0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        } // yeniArr [4,5,6,0]

        yeniArr[yeniArr.length-1]= eklenecekElement; // [4,5,6,10]

        System.out.println(Arrays.toString(yeniArr));

        arr=yeniArr;
        System.out.println(Arrays.toString(arr));

    }
}
