package Arrays;

import java.util.Arrays;

public class C10_sort_BinarySearch {
    public static void main(String[] args) {
        /*
        verilen bir arrayi naturel order a gore sıralamak icin
        Arrays.sort() kullanilir
         */

        int [] arr1 = {5,8,9,7,6,15,4};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1)); // [4, 5, 6, 7, 8, 9, 15]

        String [] arr2 = {"Hasan","Huseyin","Mehmet","Melih","Ahmet","ali"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); //[Ahmet, Hasan, Huseyin, Mehmet, Melih, ali]
        // Yukarıdaki örnekte "ali" ismi kucuk yazıldıgı icin basa alınmadı.
        // Önce buyuk harflere bakar. Sonra kucuk harflere bakar.
        // ALfabetik sıraya göre dizer



        // sort yapıldıktan sonra Array de
        // bir elementin var oldugunu kontrol etmek icin
        // binarySearch () metodu kullanılır

        System.out.println(Arrays.binarySearch(arr2, "Melih"));
        // Burada binarySearch arraydeki index ini getiren bir methoddur.


    }
}
