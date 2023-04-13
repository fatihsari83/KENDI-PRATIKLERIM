package GrupCalismasi;

public class Deneme {
    String isim="John Doe";
    int yas=40;

    public Deneme(){
        String isim="Olcay";
        System.out.println("isim :" + isim);
    }

    public Deneme (String isim){
        this.yas=30;
        System.out.println("isim :"+ isim);
    }
    public Deneme (String isim, int yas){
        this("Murat");
        this.yas=45;
    }
    public void Deneme (){
        System.out.println(isim);
    }

    public static void main(String[] args) {
        Deneme obj1= new Deneme("Esra");
    }
}
