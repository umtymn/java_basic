package inheritance_1;

public class Yonetici extends Calisan{ //Subclass
    private int sorumlu_kisi; //Extra özellik
    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
        super(isim, maas, departman);
        this.sorumlu_kisi=sorumlu_kisi;
    }

    public void zam_yap(int zam_miktari){
        System.out.println("Calisanlara " + zam_miktari + " TL zam yapildi");
    }
    public void bilgileriGöster(){
        super.bilgileriGöster();
        System.out.println("Sorumlu kisi sayisi : " + this.sorumlu_kisi);
    }
}
