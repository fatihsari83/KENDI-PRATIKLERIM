package KendiYaptiklarim;

import java.util.Scanner;

public class C29_Do_While_Loop {
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


        String sifre ="";
        int flag =0;

        do {
            System.out.println("Lutfen bir sifre giriniz");
            sifre= scan.nextLine();

            if (sifre.length() >=8){
                flag++;

            }else {
                System.out.println("Sifre en az 8 karakter olmali");
            }


            for (int i = 0; i < sifre.length(); i++) {
                char harf= sifre.charAt(i);
                if (harf >40 && harf <57){
                    flag++;
                }
            }
            for (int i = 0; i < sifre.length(); i++) {
                char harf1= sifre.charAt(i);
                if (harf1 >101 && harf1  <132) {
                    flag++;

                }
            }
            for (int i = 0; i < sifre.length(); i++) {
                char harf2= sifre.charAt(i);
                if (harf2 >141 && harf2  <172) {
                    flag++;

                }

        }

    }while (flag==4);
        System.out.println("Sifreniz kabul edilmiştir.");
}
}
