package GrupCalismasi;

import java.util.Scanner;

public class C04_If_Else {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin
        // ve String’i tersine cevirip kaydedin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Kutfen bir metin giriniz : ");
        String mtn = scan.nextLine();
        String tersmtn= "";

        for (int i = mtn.length()-1; i >=0 ; i--) {

            tersmtn+=mtn.charAt(i);

        }
        System.out.println("Girilen metin : " + tersmtn);

    }
}
