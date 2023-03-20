package GrupCalismasi;

import java.util.Scanner;

public class C18_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan 20’den kucuk bir sayi alip,
        bu sayinin faktoryel degerini
        hesaplayin.
         */


      // for (int i = sayi; i >0; i--) {
      //     toplam*= i;
      // }
      // System.out.println(toplam);

    /*
    Kullanicidan 20’den kucuk bir sayi alip,
    bu sayinin faktoryel degerini
    hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
    Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720


        System.out.print(sayi + "! = " );
        for (int i = sayi; i >0 ; i--) {
            toplam*=i;
            if (i>1 ){
                System.out.print(i+ " * ");

            }else {
                System.out.print(i);
            }

        }
        System.out.print(" = " + toplam);

        - Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();
        int toplam= 0;

        for (int i = (sayi + "").length(); i > 0; i--) {
            int birler= sayi % 10;
            toplam+=birler;
            sayi/=10;

        }
        System.out.println(toplam);



    }
}
