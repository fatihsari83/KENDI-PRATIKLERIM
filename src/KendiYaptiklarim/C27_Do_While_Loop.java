package KendiYaptiklarim;

public class C27_Do_While_Loop {
    public static void main(String[] args) {

        int sayi=-10;
        int toplam =0;
        while (sayi>0){

            toplam+= sayi*sayi;
            sayi--;
        }
        System.out.println("while toplma : " + toplam);


        sayi=-10;
        toplam =0;


        do {
            toplam+=sayi*sayi;
            sayi--;
        }while (sayi>0);{

        }
        System.out.println("do while toplam : " + toplam);
    }
}
