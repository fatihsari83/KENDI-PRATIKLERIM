package GrupCalismasi;

import java.util.Scanner;

public class C30_While_Loop {
    public static void main(String[] args) {
        /*
        Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
                yazdirin.

        Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */

     //  int sayi=10;

     //  while (sayi<100){
     //      if (sayi%7==0){
     //          System.out.print(sayi + " ");
     //      }sayi++;

     //  }
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        while (sayi>0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("Girilen sayinin rakamlar toplamı : " + toplam);



    }
}
