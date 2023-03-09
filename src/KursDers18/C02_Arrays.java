package KursDers18;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int []arr1 = {1,2,3,4,5,6,7,8,9};
        int []arr2 = {8,7,5,6,4,1,2,9,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
