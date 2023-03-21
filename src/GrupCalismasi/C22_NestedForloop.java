package GrupCalismasi;

public record C22_NestedForloop() {
    public static void main(String[] args) {
        /*

         * * * * * * * *
         * * * * * *
         * * * *
         * *


         */

        int satir=4;
        int sutun=8;

        for (int i = 1; i <=satir ; i++) {
            for (int j =1; j  <=sutun ; j++) {
                System.out.print( sutun+ " ");

            }sutun-=2;
            System.out.println("");

        }
    }
}
