package InnerClasses.StaticOlmayanInnerClasslar;

public class Main {
    public static void main(String[] args) {

        Matematik.Alan.Daire daire= new Matematik(). new Alan(). new Daire();
        Matematik.Faktoriyel faktoriel= new Matematik().new Faktoriyel();
        Matematik.Asal asal= new Matematik().new Asal();
        daire.DaireAlanHesapla();
        faktoriel.faktoriyelHesapla();

        if (asal.AsalMi()){
            System.out.println("girdiginiz sayi asaldir");
        }else {
            System.out.println("Girdiginiz sayi asal degildir");
        }

    }
}
