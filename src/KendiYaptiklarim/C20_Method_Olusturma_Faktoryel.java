package KendiYaptiklarim;

public class C20_Method_Olusturma_Faktoryel {
    public static void main(String[] args) {

        // verdiğimiz bir sayinin faktoryelini hesaplayıp
        //sonucunu bize donduren bir method olusturun

        int sayi= 6;
        int faktoryel=faktoryelHesaplama(sayi);
        System.out.println(sayi + "!: "+ faktoryelHesaplama(6));
    }

    public static int faktoryelHesaplama (int sayi){

        int faktoryel=1;

        for (int i = sayi; i >1 ; i--) {
            faktoryel*=i;
            //System.out.println(i+" ");
        }
        return faktoryel;
    }
}
