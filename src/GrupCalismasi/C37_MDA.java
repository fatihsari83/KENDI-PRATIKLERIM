package GrupCalismasi;

public class C37_MDA {
    public static void main(String[] args) {
        /*
        verilen 2 katli bir array de her bir inner array in
        son elementinin toplamını yazdirin bir method olusturun
         */

        int [][] arr = {{3,1,2,4},{1,2}, {3,4,5},{10},{2,7}};

        sonElementTopla(arr);
    }

    private static void sonElementTopla(int[][] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length-1; j < arr [i].length; j++) {
                toplam+=arr[i][j];
            }
        }
        System.out.println(toplam);
    }
}
