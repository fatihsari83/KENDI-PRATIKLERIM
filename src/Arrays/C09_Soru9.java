package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_Soru9 {
    public static void main(String[] args) {

        /*
        Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
donduren bir method olusturun.

         */

        System.out.print("Dizi boyutunu girin: ");

        int [] arr = arrayDonduren();
        System.out.println(Arrays.toString(arr));
    }
    public static int [] arrayDonduren (){

        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan alın

        int boyut = scanner.nextInt();

        // Dizinin elemanlarını kullanıcıdan alın
        int[] arr = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.print("Dizinin " + (i+1) + ". elemanını girin: ");
            arr[i] = scanner.nextInt();
        }

        // Diziyi döndürün
        return arr;



    }

}

