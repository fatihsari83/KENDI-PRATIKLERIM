package MultiDimensional_Arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        /*
        verilen bir array de istenen elemanın olup olmadıgını bulur

         */

        int [] arr = {4,9,1,5,11,8,6,7};

        System.out.println(Arrays.binarySearch(arr, 8)); // 5
        System.out.println(Arrays.binarySearch(arr, 5)); // 3
        System.out.println(Arrays.binarySearch(arr, 11));// -9


        // Array de binarySearch() ın duzgun calismasi icin
        // ocelikle sort() calistirilmalidir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 11));// 7


        // binarySearch() aranan elementin index ini doner.
        // aranan element yoksa önce array de olsaydı nerede olurdu bunu buluyoruz
        // olmasi gereken siranin (-) isaretli degerini veriyoruz.
        // bu mantıkla en kucuk elementten daha kuck butun sayilar icin -1
        // en buyuk elementten buyuk olan butun sayilar icin de -lenght -1 degeri dondurur

        System.out.println(Arrays.binarySearch(arr, 12));// -9
    }
}
