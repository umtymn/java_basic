package inheritance_3_mini_calisanlar_projesi;

public class Yazilimci extends Calisan{
private String bildigi_diller;
    public Yazilimci(String ad, String soyad, int id, String bildigi_diller) {
        super(ad, soyad, id);
        this.bildigi_diller=bildigi_diller;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor... ");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazilimcinin bildigi diller : " + bildigi_diller);
    }
}
