package GrupCalismasi;

import java.util.Scanner;

public class C24_for {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pozitif bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        boolean tamKareMi = false;

        int kok = (int) Math.sqrt(sayi); // sayının karekökünü alıyoruz

        if (kok * kok == sayi) { // sayının karekökünün karesi sayıya eşitse
            tamKareMi = true;
        }

        System.out.println(tamKareMi);
    }
}
