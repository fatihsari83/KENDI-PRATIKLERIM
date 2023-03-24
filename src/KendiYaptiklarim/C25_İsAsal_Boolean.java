package KendiYaptiklarim;

import java.util.Scanner;

public class C25_İsAsal_Boolean {
    public static void main(String[] args) {

        // Verilen 1 den buyuk bir tamsayi icin
        // sayi asal ise true
        // sayi asal degil ise false donen bir method olusturun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 den buyuk bir tam sayi girin");
        int sayi = scan.nextInt();
        boolean sonuc = isAsal(sayi);
        System.out.println(sonuc);



    }
    public static boolean isAsal (int sayi){

        int flag=0;

        for (int i = 2; i <sayi ; i++) {
            if (sayi % i ==0){
            flag++;
            break;
        }
    }
        if (flag==0){
            return true;
        }else {
            return false;
        }

}
}
