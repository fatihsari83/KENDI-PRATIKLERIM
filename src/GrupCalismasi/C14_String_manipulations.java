package GrupCalismasi;

import java.util.Scanner;

public class C14_String_manipulations {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
        - cumlede is geciyorsa, "calismak guzeldir"
        - ikisini de iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim" yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String cumle= scan.nextLine().toUpperCase();

        if (!(cumle.contains("ev") || cumle.contains("is"))){
            System.out.println("Cok calisman lazım");
        }else if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("hem ev lazım hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");

        }else {
            System.out.println("Hem ev lazim hem is");
        }
    }
}
