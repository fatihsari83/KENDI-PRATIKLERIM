package GrupCalismasi;

public class C36_Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        /*
        verilen 2 katli bir arrayde bulunan sayilarin carpimini
        bize donduren bit method olusturun
         */

        int [][] arr = {{3,1,2,4},{1,2}, {3,4,5},{10},{2,7}};

        System.out.println(carpimiDondur(arr));
    }

    private static int carpimiDondur(int[][] arr) {

        int carpim =1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr [i][j];
            }
        }return carpim;
    }
}
