package KendiYaptiklarim;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {


        /*
        Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
zamani” yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz : ");
        String gun = scan.nextLine();
        String haftaici= "Pazartesi,Sali,Carsamba,Persembe,Cuma";
        String  haftasonu ="Cumartesi, Pazar";
        
        if (gun==haftaici){
            if (gun=="Pazartesi"){
                System.out.println("simdi calisma zamani tatile 5 gun var");
            } else if (gun=="Sali") {
                System.out.println("simdi calisma zamani tatile 4 gun var");

            } else if (gun=="Carsamba") {
                System.out.println("simdi calisma zamani tatile 3 gun var");

            } else if (gun=="Persembe") {
                System.out.println("simdi calisma zamani tatile 2 gun var");

            } else if (gun=="Cuma") {
                System.out.println("simdi calisma zamani tatile 1 gun var");

            }


        } if (gun==haftasonu) {
            if (gun=="Cumartesi"){
                System.out.println("simdi dinlenme zamani");
            } else if (gun=="Pazar") {
                System.out.println("simdi dinlenme zamani");

            }


        }
        else {
            System.out.println("Lutfen gecerli bir giris yapiniz");
        }
            
    // } else if (gun=="Carsamba") {
    //     System.out.println("simdi calisma zamani tatile 3 gun var");

    // } else if (gun=="Persembe") {
    //     System.out.println("simdi calisma zamani tatile 2 gun var");

    // } else if (gun=="Cuma") {
    //     System.out.println("simdi calisma zamani tatile 1 gun var");

    // } else if (gun=="Cumartesi") {
    //     System.out.println("simdi dinlenme zamani");

    // } else if (gun=="Pazar") {
    //     System.out.println("simdi dinlenme zamani");

    // }



        //if (gun.equals("Pazartesi,Sali,Carsamba,Persembe,Cuma")){
        //    System.out.println("simdi calisma zamani tatile .. gun var");
        //} else if (gun.equals("Cumartesi,Pazar")){
        //    System.out.println("Simdi dinlenme zamani");

        }//else {
            //System.out.println("Lutfen gecerli bir giris yapiniz : ");

    //}
    
    
    
}
