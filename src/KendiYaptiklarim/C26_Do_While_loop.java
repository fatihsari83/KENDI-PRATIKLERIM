package KendiYaptiklarim;

import java.util.Scanner;

public class C26_Do_While_loop {
    public static void main(String[] args) {


        /*
        -- kullanicidan toplanmak uzere sayilar alin,
        -- kullaniciya bitirmek için 0'a basmasını soyleyin
        -- kullanici 0'a bastıgında
        -- 0 haric kac sayi girdigini ve toplamini yazdirin
         */

        Scanner scan = new Scanner(System.in);



        int girilenSayi = 1;
        int toplam = 0;
        int sayiAdedi = 0;

        while (girilenSayi != 0) {
            System.out.println("Lutfen toplanmak uzere positif tam sayilar giriniz +" +
                    "\nBitirmek icin 0' a basiniz");

            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi++;

            }


        }
        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami : "+ toplam);
    }
}
