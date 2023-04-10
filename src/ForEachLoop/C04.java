package ForEachLoop;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf= scan.nextLine();
        String [] karakterler= cumle.split("");

        int sayac=0;

        for (String each : karakterler
             ) {
            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Istenen harf cumlede kullanılmamıstır");
        }else {
            System.out.println(harf + " harfi cumlede " + sayac + " kere kullanılmıstır");

        }


    }
}
