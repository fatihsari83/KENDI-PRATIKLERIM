package KendiYaptiklarim;

import java.util.Scanner;

public class C21_Method_Kullanma {
    public static void main(String[] args) {


        // Kullanicidan 10 dan kucuk 2 pozitif tamsayi alip,
        // faktoryel degerlerini toplayın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10 dan kucuk 2 pozitif tam sayi girin");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int sonuc= C20_Method_Olusturma_Faktoryel.faktoryelHesaplama(sayi1)+
                    C20_Method_Olusturma_Faktoryel.faktoryelHesaplama(sayi2);

        System.out.println(sonuc);


    }
}
