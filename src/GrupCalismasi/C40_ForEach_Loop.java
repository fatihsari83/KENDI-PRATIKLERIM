package GrupCalismasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C40_ForEach_Loop {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin,
        mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip
         eski array’e yeni halini atayip yazdirin.

         */
        int []arr= {2,4,6,8,4,2,3,6,1,8};
        List <Integer> liste= new ArrayList<>();

        for (int each:arr
             ) {
            if (!liste.contains(each)){
                liste.add(each);
            }
        }
        arr=new int[liste.size()];

        for (int i = 0; i < liste.size(); i++) {
            arr[i]= liste.get(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
