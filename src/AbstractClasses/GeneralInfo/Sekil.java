package AbstractClasses.GeneralInfo;

public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void ismini_söyle(){
        System.out.println("Bu obje " + isim + "objesidir.");
    }

    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
