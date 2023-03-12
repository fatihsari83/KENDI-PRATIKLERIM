package KendiYaptiklarim;

import java.util.Scanner;

public class C09_IfElseIf {
    public static void main(String[] args) {
        /*
        kullanicidan pozitif bir tam sayi alin
        1- sayi 3 ile bölünütorsa "3 ün katı"
        2- sayi 5 ile bölünüyorsa "5 in kati"
        3- sayi hem 3 e hemde 5 e bölünüyorsa "3 ve 5 in kati"
        4- ikisinede bölününemiyorsa "ne 3 ün ne de 5 in kati " yazdir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("Sayi 3 ve 5 in katidir.");
        } else if (sayi%5==0 ) {
            System.out.println("Sayi 5 in katidir");

        } else if (sayi%3==0) {
            System.out.println("Sayi 3 ün katidir.");

        } else  {
            System.out.println("Sayi ne 3 ün kati ne de 5 in katidir.");

        }
    }
}
