package GrupCalismasi;

import java.util.Scanner;

public class C10_SwitchStatements {
    public static void main(String[] args) {
        /*
        - Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
ve girilen harfin karsiligini yazdirin.
I : International S : Software T : Testing Q : Qualifications B: Board
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anlamini ogrenmek istediğiniz harfi giriniz giriniz");
        char kisaltmaAnlami = scan.next().toUpperCase().charAt(0);

        switch (kisaltmaAnlami){
            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Boardi");
                break;

            default:
                System.out.println("HATA : Yanlış giriş yaptınız");
        }
    }
}
