package GrupCalismasi;

public class C41_ForEach_Loop {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip,
        karelerinin toplamini yazdiran bir method olusturun.
         */

        int []arr= {2,4,6,8,4,2,3,6,1,8};

        karelerToplamYazdir(arr);
    }

    public static void karelerToplamYazdir(int[] arr) {

        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("Verilen Arraydeki elementlerin karelerinin toplamı : " + toplam);
    }
}
