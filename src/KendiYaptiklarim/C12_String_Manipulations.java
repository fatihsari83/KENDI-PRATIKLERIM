package KendiYaptiklarim;

public class C12_String_Manipulations {
    public static void main(String[] args) {
        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2'den fazla kullanilmis
        // 3- aradıgınız kelime hic kullanilmamis


        String cumle = "Yasasin java, iyi ki java ogreniyorum";
        String kelime = "java;";
        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex = cumle.lastIndexOf(kelime);

        if (ilkIndex == (-1)){
            System.out.println("Aradıgınız kelime hic kullanilmamistir.");
        } else if (ilkIndex== lastIndex) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("aradiginiz kelime cumlede 1 den fazla kullanilmis");
        }




              //  (cumle.indexOf(kelime,(kelimeIndex+2))==(-1))
              //  System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");

            //} //else if (cumle.indexOf(kelime,(kelimeIndex+3))==(-1)) {
              //  System.out.println("aradiginiz kelime cumlede 3 kere kullanilmis");

            }
        }



