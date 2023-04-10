package ForEachLoop;

public class C03 {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip,
         karelerinin toplamini yazdiran bir method olusturun.
         */

        int [] arr ={2,3,5};
        karelerininToplamı(arr);
    }

    public static void karelerininToplamı(int[] arr) {


        int kare=0;

        for (int each : arr
             ) {
            kare+= each*each;

        }//toplam+=kare;
        System.out.println(kare);
    }
}
