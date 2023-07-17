package Interface.YurtdisiCikisProgrami;


public class Yolcu implements YurtdisiCikisKurallari2 {
    int harc;
    String vize;
    String siyasi_yasak;

    public Yolcu(int harc, String vize, String siyasi_yasak) {
        this.harc = harc;
        this.vize = vize;
        this.siyasi_yasak = siyasi_yasak;
    }


    @Override
    public boolean vizeKontrol2() {
        if (vize.equals("evet")){
            System.out.println("Vizeniz var. Cikin");
            return true;
        }else {
            System.out.println("vizeniz yok. Cikamazsin bilader...");
            return false;
        }
    }

    @Override
    public boolean harcKontrol2() {
        if (harc<15){
            System.out.println("Yurtdisi harciniz tamam degil");
            return false;
        }else {
            System.out.println("Harciniz tamam olarak yatirilmistir.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol2() {
       if (siyasi_yasak.equals("evet")){
           System.out.println("Siyasi yasaginiz var. cikamazsiniz");
           return true;
       }else {
           System.out.println("Siyasi yasaginiz bulunmamaktadir. Cikin...");
           return false;
       }
    }

}
