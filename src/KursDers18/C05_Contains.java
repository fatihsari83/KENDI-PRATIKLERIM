package KursDers18;

import java.util.Scanner;

public class C05_Contains {
    public static void main(String[] args) {


        //  kullanicidan bir mail alin
        //- mail @ icermiyorsa "gecersiz mail"
        //- mail @gmail.com icermiyorsa, "mail gmail olmali"
        //- mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //yazdirin.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir mail adresi girin");
        String mail= scan.nextLine();


        if (!mail.contains("@")){
            System.out.println("Gecersiz mail");
        } else if (!mail.contains("gmail")) {
            System.out.println("Mail gmail olmali");

        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Mail de yazim hatasi var");


        }
        System.out.println("mail adresi :" + mail + " dir." );

    }
}
