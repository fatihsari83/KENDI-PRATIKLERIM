package KursDers18;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 ondalikli sayi girin : ");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        double bolum= sayi1 / sayi2;
        int sonuc= (int) bolum;
        System.out.println(sonuc);
    }
}
