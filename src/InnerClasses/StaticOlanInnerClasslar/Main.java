package InnerClasses.StaticOlanInnerClasslar;

public class Main {
    public static void main(String[] args) {
        Matematik.Alan alan= new Matematik.Alan(); // burdaki fark nokta koyup direkt statik class lari cagirabilirz
        //eger Matematik sinifiinin icindeki alan hesapla methodunu da statik yapsaydik
        // Matematik.Alan.daire_alan(5); de ayni sonucu verirdi. Ayrica obje olusturmamaiza gerek kalmazdi
        alan.alanHesapla(5);
    }
    }
