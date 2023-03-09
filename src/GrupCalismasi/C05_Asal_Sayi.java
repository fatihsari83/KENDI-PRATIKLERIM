package GrupCalismasi;

import java.util.Scanner;

public class C05_Asal_Sayi {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu
        // yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz : ");

        int sayi= scan.nextInt();
        int sayac= scan.nextInt();

        if (sayi==1){
            System.out.println("1 sayisi asal degildir");
        } else {
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    sayac++;
                    break;
                }

            }
            if (sayac==0){
                System.out.println("Girilen sayi asaldir");
            }else {
                System.out.println("Girilen sayi asal degildir");
            }
        }


    }
}
