package KendiYaptiklarim;

import java.util.Scanner;

public class C13_String_Manipulations {
    public static void main(String[] args) {
        /*
        soru-   Kullanicidan bir şifre isteyip,
                Aşağıdaki şartlari kontrol edin ve
                kullaniciya düzeltmesi gereken tüm eksiklikleri söyleyin.
                eğer tüm şartlar sağlarsa, "şifre başarıyla kaydedildi" yazdirin
                 - ilk harf küçük olmali
                 - son karakter rakam olmali
                 - şifre boşluk içermemeli
                 - uzunlugu en az 10 karakter olmali
         */

        int flag =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir şifre giriniz");
        String sifre= scan.nextLine();

        // ilk harf küçük olmali
        if (sifre.charAt(0) >= 'a' && sifre.charAt(0)  <= 'z'){
            flag++;
        }else {
            System.out.println("Sifrenin ilk karakter kucuk olmali");
        }
        //son karakter rakam olmali
        char sonHarf= sifre.charAt(sifre.length()-1);
        if ( sonHarf >='0' && sonHarf<='9'){
            flag++;

        }else {
            System.out.println("son karakter rakam olmali");
        }
        //şifre boşluk içermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else {
            flag++;
        }
        //uzunlugu en az 10 karakter olmali
        if (sifre.length()>=10){
            flag++;
        }else {
            System.out.println("Sifre en az 10 karakter olmali");
        }

        // eğer tüm şartlar sağlarsa, "şifre başarıyla kaydedildi" yazdirin
        if (flag==4){
            System.out.println("Sifre basarıyla kaydedildi");
        }



}}
