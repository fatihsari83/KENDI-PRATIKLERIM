package KendiYaptiklarim;

import java.util.Scanner;

public class C33_Do_While_Loop {
    public static void main(String[] args) {

        /*Kullanicidan bir sifre girmesini isteyin.
                Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
         */

        Scanner scan=new Scanner(System.in);


        String sifre ="";
        int flag =0;

        do {
            System.out.println("Lutfen bir sifre giriniz");
            sifre= scan.nextLine();

            if (sifre.length() >=8){
                flag++;
                break;
            }

            for (int i = 0; i < sifre.length(); i++) {
                char harf= sifre.charAt(i);
                if (harf >=32 && harf <=47){
                    flag++;
                    break;
                }
            }
            for (int i = 0; i < sifre.length(); i++) {
                char harf1= sifre.charAt(i);
                if (harf1 >=65 && harf1 <= 90) {
                    flag++;
                    break;
                }
            }
            for (int i = 0; i < sifre.length(); i++) {
                char harf2= sifre.charAt(i);
                if (harf2 >=97 && harf2 <= 122) {
                    flag++;
                    break;

                }

            }if (flag!=4){
                System.out.println("Girdiğiniz şifre istenilen istenen şartları sağlamıyor\n" +
                        "lütfen tekrar deneyiniz");
            }

        }while (flag!=4);
        System.out.println("şifreniz kabul edilmiştir.");
    }
}
