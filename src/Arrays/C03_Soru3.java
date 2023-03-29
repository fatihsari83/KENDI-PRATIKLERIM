package Arrays;

public class C03_Soru3 {
    public static void main(String[] args) {

        /*
        Soru 6- Verilen String bir array’deki en uzun ve
        en kisa kelimeleri yazdiran bir method olusturun.
         */

        String [] arr = {"Melih","Ali","Veli","Fatih"};

        enUzunEnKısaYazdiran(arr);

        String [] arr2= {"Can","Omer","Hasan","Ali","Mustafa"};

        enUzunEnKısaYazdiran(arr2);




    }

    public static void enUzunEnKısaYazdiran (String [] arr){

        String enUzunKelime=arr [0];
        String enKısaKelime=arr [0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>=enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<=enKısaKelime.length()){
                enKısaKelime=arr[i];

                // üst satırda (=) işaretini koydugumuzda array deki aynı uzunluktaki
                // kelimelerin en sonuncusunu alır.
                // eger (=) işaretini kaldırırsak bu sefer
                // array deki ilk kısa veya uzun kelimeyi yazdırır

        }
    }
        System.out.println("array deki en uzun kelime : " + enUzunKelime);
        System.out.println("array deki en kısa kelime : " + enKısaKelime);
}
}
