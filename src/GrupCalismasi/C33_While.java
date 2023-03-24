package GrupCalismasi;

import java.util.Scanner;

public class C33_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int sayac= 0;
        int toplam = 0;
        int sayi = 0;

        while (true){
            System.out.println("Lutfen pozitif tam sayi giriniz \nBitirmek istediginizde 0'a basiniz");
            sayi = scan.nextInt();

            if(sayi==0){
                break;
            }else if(sayi<0){
                System.out.println("negatif sayi kullanamazsiniz ");

            }else
                sayac ++;
            toplam+= sayi;


        }

        System.out.println("Toplam "+sayac + " adet sayi girdiniz.Sayilarin toplami: "+toplam);
    }}

    /*
    true" ifadesi, programlama dillerinde bir değerdir ve genellikle doğru veya doğru olmayan bir ifadeyi temsil eder.
    Bir parantez içinde "true" yazmak, genellikle bir koşulun doğru olduğunu belirtmek için kullanılır.

Örneğin, bir if bloğu içindeki koşulun doğru olduğunda çalışması gerektiğini belirtmek için şu şekilde kullanılabilir:


        // koşul doğru olduğunda buradaki kod çalıştırılacak
            }
        Bu örnekte, parantez içine "true" yazarak, koşulun her zaman doğru olduğunu belirtiyoruz.
        Bu nedenle, if bloğu her zaman çalıştırılacaktır.
     */
