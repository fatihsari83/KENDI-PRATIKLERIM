package GrupCalismasi;

import java.util.Arrays;
import java.util.Scanner;

public class C43_ForEach_Loop {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere
        kullanildigini yazdirin, kullanilmadiysa
        “harf cumlede kullanilmamis” yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf=scan.nextLine();

        String [] arr=cumle.split("");
        System.out.println(Arrays.toString(arr));

        int sayac=0;

        for (String each:arr
             ) {
            if (each.equalsIgnoreCase(harf)){
                sayac++;
                //System.out.println("Harf : " + sayac + "kullanılmıstır");
            }
        }
        if (sayac == 0){
            System.out.println("Harf cumlede kullanılmamıstır");
        }else {
            System.out.println("Istenen harf cumle de " + sayac + " kez kullanılmıstır");
        }

    }
}
