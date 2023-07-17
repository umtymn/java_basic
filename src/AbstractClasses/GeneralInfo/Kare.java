package AbstractClasses.GeneralInfo;

public class Kare extends Sekil{

    private int kenar;


    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + "alani : " + (kenar*kenar));
    }
    public void cevre_hesapla(){
        System.out.println(getIsim() + "in cevresi : " + kenar*4);
    }
}
