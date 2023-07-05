package inheritance_1;

public class Calisan { //SuperClass veya BaseClass

    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis(){
        System.out.println("Calisan Calisiyor...");
    }
    public void bilgileriGöster(){
        System.out.println("isim : " + isim);
        System.out.println("Maas : " +maas);
        System.out.println("Departman : " + departman);
    }

    public void departmanDegistir(String yeni_departman){
        System.out.println("Departman degisitiriliyor...");
        this.departman=yeni_departman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
