package KendiYaptiklarim;

public class C15_String_manipulations {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan metindeki istenmeyen rakam ve
        ozel karakterleri silip, sadece ilk harfi buyuk
        diger harfler kucuk harf yapan bir program yazin.
        input : java1 ogRe2@nMek3 #ne +Gu=zel
        output : Java ogrenmek ne guzel.
         */

        String input= "java1 ogRe2@nMek3 #ne +Gu=zel";

        input= input.replaceAll("\\d",""); // java ogRe@nMek #ne +Gu=zel
        input= input.replaceAll(" ","5"); // java5ogRe@nMek5#ne5+Gu=zel
        input= input.replaceAll("\\W",""); // java5ogRenMek5ne5Guzel
        input= input.replaceAll("5"," "); // java ogRenMek ne Guzel
       input=input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase(); // Java ogrenmek ne guzel


        System.out.println(input); // javaogRenMekneGuzel
         //
    }
}
