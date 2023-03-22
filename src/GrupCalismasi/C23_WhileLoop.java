package GrupCalismasi;

import java.util.Scanner;

public class C23_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir pozitif sayi isteyin,
        sayının tam kare olup olmadığını
        bulunuz, tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();
        int flag = 0;

        for (int i = 1; i <sayi; i++) {
            if (i*i==sayi){
                flag++;
                System.out.println(i + " true");

                //break;
            }
        }if (flag==0){
            System.out.println("false");
        }
    }
}
