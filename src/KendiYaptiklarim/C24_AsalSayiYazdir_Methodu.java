package KendiYaptiklarim;

public class C24_AsalSayiYazdir_Methodu {
    public static void main(String[] args) {

        // Verilen bir pozitif bir tamsayinin asal sayi
        // olup olmadıgını yazdiran bir method olusturun

        //int sayi= 15;
        //int sonuc= asalMi(sayi);

       asalMi(15);
       asalMi(35);
       asalMi(43);


    }

    public static void asalMi (int sayi){

        int flag=0;

        for (int i = 2; i <sayi; i++) {

            if (sayi % i ==0){
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girilen " + sayi + " sayisi ASAL");
        }else {
            System.out.println("Girilen " + sayi + " sayisi ASAL değil");
        }
        //return flag;

    }
}
