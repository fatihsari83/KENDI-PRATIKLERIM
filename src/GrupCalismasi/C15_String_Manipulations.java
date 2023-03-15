package GrupCalismasi;

import java.util.Scanner;

public class C15_String_Manipulations {
    public static void main(String[] args) {
        /*
        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €”
        output : 36.70 €
         */

        String input1= "15.30 €";
        String input2= "11.40 €";

        input1=input1.replaceAll("\\D", "");
       // System.out.println(input1);
        input2=input2.replaceAll("\\D","");
        double d1= Double.parseDouble(input1);
        double d2= Double.parseDouble(input2);
        System.out.println((d1+d2)/100 + " " + " €");



    }
}
