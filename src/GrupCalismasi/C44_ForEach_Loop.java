package GrupCalismasi;

import java.util.ArrayList;
import java.util.List;

public class C44_ForEach_Loop {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip,
        ikisinde ortak olan elementleri
        ayri bir liste olarak veren bir program yazin.
         */

        int []arr= {2,4,5,6,7,8,9,1};
        int [] arr1={1,2,3,4,85,9,5,3,};

        List <Integer> ortakElement= new ArrayList<>();

        for (int each:arr
             ) {
            for (int each1:arr1
                 ) {
                if (each==each1 && !ortakElement.contains(each)){
                    ortakElement.add(each);
                }
            }

        }
        System.out.println(ortakElement);

    }
}
