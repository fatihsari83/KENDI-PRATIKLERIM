package Arrays;

public class C08_Soru8 {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari
        toplayip sonucu bize donduren bir method yaziniz.
         */

        int [] arr = {2,7,8,9,5,6};
        System.out.println(arraydekiSayilariToplma(arr));

    }

    public static int arraydekiSayilariToplma (int[] arr) {

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                toplam += arr[i];
            }
        }

     return toplam;
    }

}
