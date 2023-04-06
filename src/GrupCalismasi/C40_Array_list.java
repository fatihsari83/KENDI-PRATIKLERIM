package GrupCalismasi;

import java.util.*;

public class C40_Array_list {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip,
        o tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        List <Integer> bolenList=tamBolunebilenListesi(sayi);
        System.out.println(bolenList);
        List <String> arr=new ArrayList<>();
        arr.add("Ali");
        arr.add("Veli");
        arr.add("Ahmet");
        arr.add("Aycan");
        arr.add("ayca");
        arr.add("Ayca");

        Collections.sort(arr);
        System.out.println(arr);

        String[]arr2= {"Ali","Ahmet","Ayca","Veli","ali"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static List <Integer> tamBolunebilenListesi(int sayi) {

        List <Integer> bolenListesi= new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0){
                bolenListesi.add(i);
            }
        }return bolenListesi;
    }
}
