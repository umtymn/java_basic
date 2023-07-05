package constructor;

public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telNo;

    public Account(){
    }

    public Account(String hesapNo, double bakiye, String isim, String email, String telNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telNo = telNo;
    }

    public void paraYatir(double miktar){
        bakiye +=miktar;
        System.out.println("Yeni bakiye = " + bakiye);

    }
    public void paraCekme(double miktar){
        if (miktar>1500){
            System.out.println("Bir günde 1500 Tl den fazla para cekemezsiniz");
        }
        if (miktar>bakiye){
            System.out.println("Yeterli bakiyeniz yok. Bakiyeniz : " + bakiye);
        }
        else {
            bakiye -=miktar;
            System.out.println("yeni bakiyeniz = " + bakiye);;
        }
    }

}
