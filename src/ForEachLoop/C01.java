package ForEachLoop;

public class C01 {
    public static void main(String[] args) {


        int [] arr ={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        // arr in tum elementlerini toplamını yazdırın
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("Elementler toplamı : " + toplam);
        
        // arr in elementlerinden 3 ile bolunebilenleri yazdırın

        for (int each:arr
             ) {
            if (each%3==0) System.out.print(each + " ");
        }

        System.out.println("========");
        // arr in elementleri icinde kac tane tek sayı oldugunu bulun
        int sayac=0;
        for (int each:arr
             ) {
            if (each%2 !=0) sayac++;
        }
        System.out.println("Arrayde " + sayac + " tane tek sayi var");
    }

}
