package Composition;

public class Main {
    public static void main(String[] args) {
        Resolution resolution= new Resolution(1920,1080);
        Monitor monitor= new Monitor("VS197DE", "Asus", "18.5", resolution);
        Kasa kasa= new Kasa("Shadow Blade", "shadow", "tamperli cam");
        Anakart anakart= new Anakart("B220-Pro","Asus", 10, "Windows 10" );

        Bilgisayar pc= new Bilgisayar(monitor, kasa, anakart);
        pc.getKasa().bilgisayari_ac();
        pc.getAnakart().isletim_sistemi_yükle("Ubuntu 16.04");
        pc.getMonitor().monitoru_kapat();
    }

}
