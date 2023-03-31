package MultiDimensional_Arrays;

import java.util.Arrays;

public class C03_MultiDimensional_Arrays {
    public static void main(String[] args) {


        int [] [] arr = {{3,4,5},{3,4},{1}};

        // int [][] iki katli array belirtir.
        // ilk [] ana arrayi (outerArray) kontrol eder.
        // ikinci [] ise icerideki array leri (innerArray) kontrol eder.

        System.out.println(arr[1][1]); // 4

        System.out.println(arr[2].length); // 1
        System.out.println(arr[1]); //[I@378bf509

        System.out.println(Arrays.toString(arr));// [[I@5fd0d5ae, [I@378bf509, [I@2d98a335]

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [3, 4], [1]]

        System.out.println(arr.length); // 3
    }
}
