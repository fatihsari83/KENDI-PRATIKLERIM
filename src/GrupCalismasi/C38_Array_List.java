package GrupCalismasi;

import java.util.ArrayList;
import java.util.List;

public class C38_Array_List {
    public static void main(String[] args) {

        /*
        verilen bir array de tekrar eden elementler icin
        mukerrer olanlari silip, tum elemanlari sadece 1 tane yapip
        bize dondurecek bir method olusturun.
         */

        int[] arr = {4,6,8,9,4,7,8,2,9,1,3,6,9};

        tekrarlariSil(arr);
    }

    public static int[] tekrarlariSil(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for (Integer each:arr
        ) {
            if (!list.contains(each)){
                list.add(each);
            }
        }
        //System.out.println(list);

        arr=new int[list.size()];
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i]+= list.get(i);
        }

        return arr;
    }
}
