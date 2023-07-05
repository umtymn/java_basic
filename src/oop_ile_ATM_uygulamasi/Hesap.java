package oop_ile_ATM_uygulamasi;

public class Hesap {
    private String kulanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kulanici_adi, String parola, int bakiye) {
        this.kulanici_adi = kulanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKulanici_adi() {
        return kulanici_adi;
    }

    public void setKulanici_adi(String kulanici_adi) {
        this.kulanici_adi = kulanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int tutar){
        bakiye +=tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye);
    }

    public void paraCek(int tutar){
        if (tutar>bakiye){
            System.out.println("Yeterli bakiyeniz yok");
        }else {
            bakiye-=tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);

        }
    }

}
