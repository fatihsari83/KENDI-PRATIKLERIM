package KendiYaptiklarim;

import java.util.Scanner;

public class C30_Sifre {
    public static void main(String[] args) {

         /*
        Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
         */

        Scanner scan = new Scanner(System.in);


        String sifre = "";
        int flag = 0;

        do {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();

            if (sifre.length() >= 8) {
                flag++;


            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }

            char harf = sifre.charAt(sifre.length());
            if (harf > 40 && harf < 57) {
                flag++;
            } else {
                System.out.println("Lutfen ozel karakter giriniz");
            }
            char harf1 = sifre.charAt(sifre.length());
            if (harf1 > 101 && harf1 < 132) {
                flag++;
                break;
            } else {
                System.out.println("Lutfen buyuk harf giriniz");
            }
            char harf2 = sifre.charAt(sifre.length());
            if (harf2 > 141 && harf2 < 172) {
                flag++;
                break;
            }else{
                System.out.println("Lutfen kucuk harf giriniz");
            }
        }while (flag==4);
        System.out.println("Sifreniz kabul edilmiştir.");


    }
}




