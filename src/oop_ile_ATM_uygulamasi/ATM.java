package oop_ile_ATM_uygulamasi;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){

        Login login = new Login();

        Scanner scanner= new Scanner(System.in);

        System.out.println("Bankamiza hosgeldiniz...");
        System.out.println("************************");
        System.out.println("Kullanici Girisi...");
        System.out.println("************************");
        int giris_hakki=3;
        while (true){
            if (login.login(hesap)){
                System.out.println("Giris basarili");
                break;
            }else {
                System.out.println("giris basarisiz");
                giris_hakki-=1;
                System.out.println("Giris hakkiniz: " +giris_hakki);
            }
            if(giris_hakki==0){
                System.out.println("Giris hakkiniz bitti...");
                return;
            }
        }
        System.out.println("************************");
        String islemler = "1. Bakiye Görüntüle \n"
                        + "2. Para Yatirma\n"
                        + "3. Para Cekme\n"
                        + "Cikis icin q`ya basiniz";
        System.out.println(islemler);
        System.out.println("************************");

        while (true){
            System.out.println("islemi seciniz: ");
            String islem= scanner.nextLine();

            if (islem.equals("q")){
                break;
            }else if (islem.equals("1")){
                System.out.println("Hesabiniz: "+hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Yatirmak istediginiz tutar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);

            } else if (islem.equals("3")) {
                System.out.println("cekmek istediginiz tutar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);

            }else {
                System.out.println("Gecersiz islem...");
            }
        }

    }
}
