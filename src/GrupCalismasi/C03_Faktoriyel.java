package GrupCalismasi;

import java.util.Scanner;

public class C03_Faktoriyel {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 20 den kucuk pozitif bir sayi giriniz");
        int sayi= scan.nextInt();
        int faktoriyel=1;

        if (sayi >=20){
            System.out.println("Lutfen gecerli bir sayi giriniz");

            }else {
            for (int i = sayi; i >=1; i--) {
                faktoriyel*=i;
        }System.out.println(sayi + "! = " + faktoriyel);

    }
}
}
