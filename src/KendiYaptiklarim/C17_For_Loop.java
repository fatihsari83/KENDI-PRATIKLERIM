package KendiYaptiklarim;

public class C17_For_Loop {
    public static void main(String[] args) {

        /*
            50 den başlayip, 100 e kadar (100 dahil)
            sayilari yan yana aralarında bir boşluk bırakacak
            şekilde yazdirin
         */

        //for (int i = 50; i <=100 ; i++) {

        // System.out.print(i + " ");
        //}

        /*
            3 basamakli sayilardan 23 ile bolunebilen sayilari
            an yana aralarında bir boşluk bırakacak
            şekilde yazdirin
         */
        for (int i = 100; i <= 999; i++) {
            if (i % 23 == 0) {
                System.out.print(i + " ");
            }


        }
        System.out.println("");

        /*
            20 den başlayarak 7 şer artarak 100 e kadar yazdirin
            (100 yazdirmaniz gerekirse yazdirin ama 100 ü geçmeyin
         */


        for (int i = 20; i <101 ; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println("");
        /*
        100 den başlayarak 1 e kadar sınırlar dahil
        7 ile bolunebilen sayilari yazdirin
         */
        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }
    }


}
