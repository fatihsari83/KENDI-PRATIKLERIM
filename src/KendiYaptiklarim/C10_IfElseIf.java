package KendiYaptiklarim;

import java.util.Scanner;

public class C10_IfElseIf {
    public static void main(String[] args) {
        /*
        1- kullanicidan cinsiyetini ve yaşını aliniz
        2- Kadin, 60 yaş ve üzeri, Erkek 65 yaş ve üzeri emekli olabilir
        3- Cinsiyet ve yaşini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak için .. yil çalışman gerekir" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();

        System.out.println("Lutfen cinsiyetinizi kadın için 'K', erkek için 'E' giriniz");

        char cinsiyet= scan.next().charAt(0);


        if ((cinsiyet=='K' && yas>=60) || (cinsiyet=='E' && yas>=65)){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K') {
            System.out.println("Emekli olmak icin " + (60-yas) + " yil calisman gerekir");

        } else if (cinsiyet=='E') {
            System.out.println("Emekli olmak icin " + (65-yas) + " yil calisman gerekir");

        }
    }
}
