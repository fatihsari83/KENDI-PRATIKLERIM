package KendiYaptiklarim;

public class C28_Do_Whilw_Loop {
    public static void main(String[] args) {


        // 'k' harfinden 't' harfine kadar harfleri yazdirin

        char harf = 'k';


        do {
            System.out.print(harf + " ");
            harf++;
        }while (harf <= 't');
    }
}
