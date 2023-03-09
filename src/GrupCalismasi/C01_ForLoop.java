package GrupCalismasi;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir baslangic sayisi giriniz");
        int baslangicSayisi= scan.nextInt();
        System.out.println("Lutfen bitis degeri giriniz");
        int bitisdegeri= scan.nextInt();

        int toplam=0;
        if (baslangicSayisi <bitisdegeri){

            for (int i = baslangicSayisi; i <= bitisdegeri; i++) {
                toplam = toplam + i;

                toplam+=i;
        }
        }



else {
            System.out.println("Yanlıs giris yaptiniz! Lutfen gecerli bir giris yapiniz");

        }
        System.out.println("Sayilarin toplami : " + toplam);

    }
}
