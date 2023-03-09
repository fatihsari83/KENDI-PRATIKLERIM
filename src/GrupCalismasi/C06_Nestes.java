package GrupCalismasi;

public class C06_Nestes {
    public static void main(String[] args) {


        // asagidaki sekilleri yazdirin
        //         *
        //         * *
        //         * * *
        //         * * * *


        int satirSayisi=4;
        int sutunSayisi=8;
        int sembol=8;


        for (int i = 0; i  <satirSayisi ; i++) {
            for (int j = 0; j  <sutunSayisi ; j++) {

                System.out.print("* ");

            }
            System.out.println("");
            sutunSayisi-=2;

        }


    }


}
