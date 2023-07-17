package AbstractClasses.GeometrikSekilHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String islemler= "Islemler... \n" +
                         "1. Kare Alan Hesapla \n" +
                         "2. Ücgen Alan Hesapla \n" +
                         "3. Daire Alan Hesapla \n" +
                         "4. Cikis icin q `ya basiniz";


        while(true){
            System.out.println(islemler);
            System.out.println("*****************************");
            System.out.println("Hangi seklin alanini hesaplamak istiyorsun");
            String sekil_türü= scanner.nextLine();
            int islem;
            boolean cikis;
            if (sekil_türü.equals("q")){
                System.out.println("Programdan cikiliyor");
                break;
            }else if (sekil_türü.equals("1")) {
                System.out.println("Lütfen karenin bir kenarini giriniz");
                int kenar= scanner.nextInt();
                Kare kare1= new Kare("Kare1", kenar);
                kare1.alanHesapla();
            }else if (sekil_türü.equals("2")){
               System.out.print("Lütfen ilk kenari giriniz..");
               int kenar1= scanner.nextInt();
               System.out.print("Lütfen ikinci kenari giriniz..");
               int kenar2=scanner.nextInt();
               System.out.print("Lütfen ücüncü kenari giriniz..");
               int kenar3=scanner.nextInt();
               Ucgen ucgen1= new Ucgen("ücgen1",kenar1, kenar2,kenar3);
               ucgen1.alanHesapla();
           } else if (sekil_türü.equals("3")) {
               System.out.println("Lütfen yaricapi giriniz..");
               int yaricap= scanner.nextInt();
               Daire daire1= new Daire("Daire 1", yaricap);
               daire1.alanHesapla();
           }


        }



    }
}
