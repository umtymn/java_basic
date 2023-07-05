package day01_javayaGiris;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Kullanici_Giris_Programi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int giris_hakki=3;
        String sys_isim_soyisim= "umit yaman";
        String sys_parola="123456";

        System.out.println("Bankamiza hosgeldiniz");

        while (true){
            System.out.print("lütfen isminizi giriniz: ");
            String isim_soyisim= scanner.nextLine();
            System.out.print("lütfen parolanizi giriniz: ");
            String parola= scanner.nextLine();

            if (isim_soyisim.equals(sys_isim_soyisim) && parola.equals(sys_parola)){
                System.out.println("Hesabiniza giris yapildi...");
                break;
            } else if (isim_soyisim.equals(sys_isim_soyisim) && !parola.equals(sys_parola)) {
                System.out.println("parolaniz yanlis... Lütfen dogru parolanizi giriniz");
                giris_hakki -=1;
                System.out.println("kalan hakkiniz " + giris_hakki);
            } else if (!isim_soyisim.equals(sys_isim_soyisim) && parola.equals(sys_parola)) {
                System.out.println("isminiz yanlis... Lütfen isminizi dogru giriniz");
                giris_hakki -=1;
                System.out.println("kalan hakkiniz. " + giris_hakki);
            }else {
                giris_hakki -=1;
                System.out.println("bilgileriniz yanlis. Lütfen dogru bilgiler giriniz. Giris hakkiniz:  " + giris_hakki);
            }

            if (giris_hakki==0){
                System.out.println("hakkiniz bitti. Lütfen 3 saat sonra tekrar deneyiniz");
                break;
            }

        }

    }
}
