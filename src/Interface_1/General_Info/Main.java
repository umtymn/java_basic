package Interface_1.General_Info;

public class Main {
    public static void main(String[] args) {

       /*
        IMuhendis mühendis1= new PcMuhendisi(true, false);
        mühendis1.adli_sicil_kaydi();
        mühendis1.askerlik_durumu();
        mühendis1.mezuniyet_ortalmasi(3.5);

        String [] tecrübe= {"Vestel", "SRF", "UBS"};
        mühendis1.calistigi_yerler(tecrübe);

        */

        MakineMühendisi mühendis2= new MakineMühendisi(true, false);
        String [] tecrübe ={};
        String [] referans= {"Ümit Yaman", "Ali Saymaz"};
        mühendis2.adli_sicil_kaydi();
        mühendis2.askerlik_durumu();
        mühendis2.calistigi_yerler(tecrübe);
        mühendis2.referans_getir(referans);
    }
}
