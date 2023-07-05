package inheritance_3_mini_calisanlar_projesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Calisanlar programina hosgeldiniz...");
        String islemler= "Islemler...\n" +
                "1. Yazilimci Islemleri\n" +
                "2. Yönetici Islemleri\n" +
                "Cikis icin q `ya basiniz";
        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");

        while (true){
            System.out.print("Lütfen bir islem seciniz....");
            String islem= scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Sistemden cikiliyor");
                break;
            }else if (islem.equals("1")){
                Yazilimci yazilimci= new Yazilimci("ümit", "yaman", 123, "Java, Javascript");

                String yazilimci_islemleri= "Yazilimci islemleri"+
                        "1. Format At\n" +
                        "2. Bilgileri Göster\n" +
                        "Cikis icin q`ya basiniz";


                while (true){
                    System.out.print("Lütfen islemi seciniz");
                    String y_islem= scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.print("Yazilimci islemlerinden cikiliyor");
                        break;
                    }else if (y_islem.equals("1")){
                        System.out.print("Isletim sistemi: ");
                        String isletim_sistemi= scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Gecersiz yazilimci islemi....");
                    }
                }


            }else if (islem.equals("2")){
                Yonetici yonetici= new Yonetici("Ahmet", "Macit", 1234 , 45);
                String yönetici_islemleri="Yönetici islemleri"+
                        "1. Zam Yap\n" +
                        "2. Bilgileri Göster\n" +
                        "Cikis icin q`ya basiniz";
                System.out.println(yönetici_islemleri);
                while (true){
                    System.out.println("islem seciniz");
                    String y_islem= scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici islemlerinden cikiliyor");
                        break;
                    }else if (y_islem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasni istiyorsunuz");
                        int zamMiktari= scanner.nextInt();
                        scanner.nextLine();
                    }else if (y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }else {
                        System.out.println("Gecersiz yönetici islemi");
                    }
                }

            }else {
                System.out.println("Gecersiz islem...");
            }


        }
    }

}
