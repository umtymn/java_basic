package inheritance_2;

public class Köpek extends Hayvan{

    private int dis_sayisi;

    public Köpek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi=dis_sayisi;
    }

    public void harekete_gec(int hiz){
        System.out.println("Köpek "+ hiz + " ile hareket ediyor");
    }
    public void kos(int hiz){
        System.out.println("köpek kosuyor....");
        harekete_gec(hiz);

    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
}
