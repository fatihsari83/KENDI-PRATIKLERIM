package KendiYaptiklarim;

import java.util.Scanner;

public class C11_IfElseIf {
    public static void main(String[] args) {
        /*
        Kullanicinin kilo ve boyunu isteyip
        vücut kitle endeksini hesaplayın
        kilo*10000 / (boy*boy)
        vucut kitle endexi 30 dan buyukse obez,
        25-30 arası ise kilolu,
        20-25 arasi normal,
        20 den kucukse zayif yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();
        System.out.println("Lutfen boyunucu cm olarak giriniz");
        int boy = scan.nextInt();

        double index = (kilo * 10000) / (boy*boy);
        System.out.println("Vucut kitle endexiniz :" + index);

        if (index>=30){
            System.out.println("Obez");
        } else if (index>=25) {
            System.out.println("Kilolu");

        } else if (index>=20) {
            System.out.println("Normal");

        } else if (index <20) {
            System.out.println("Zayif");
        }

    }
}
