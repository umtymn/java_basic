package GenericMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("LGS LYS birinci bulma Programi....");
        Scanner scanner= new Scanner(System.in);
        String islemler= "Islemler....\n" +
                "1. Esit Agirlik ögtrencileri\n" +
                "2. Sayisal ägrencileri\n" +
                "Cikis : q";
        System.out.println(islemler);
        while (true){
            String islem= scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            // Birinci ögrenci
            System.out.println("Birinci Ogrenci Ismi: ");
            String isim1= scanner.nextLine();
            System.out.print(" Netler (Türkce Matematik Edebiyat Fizik ) :");
            int turkce1= scanner.nextInt();
            int matematrik1= scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1= scanner.nextInt();
            scanner.nextLine();

            // Ikinci ögrenci
            System.out.println("Birinci Ogrenci Ismi: ");
            String isim2= scanner.nextLine();
            System.out.print(" Netler (Türkce Matematik Edebiyat Fizik ) :");
            int turkce2= scanner.nextInt();
            int matematrik2= scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2= scanner.nextInt();
            scanner.nextLine();

            // ücüncü ögrenci
            System.out.println("Birinci Ogrenci Ismi: ");
            String isim3= scanner.nextLine();
            System.out.print(" Netler (Türkce Matematik Edebiyat Fizik ) :");
            int turkce3= scanner.nextInt();
            int matematrik3= scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3= scanner.nextInt();
            scanner.nextLine();
            System.out.println("islemi giriniz: ");


            if (islem.equals("1")){
                EsitAgirlik ogrenci1= new EsitAgirlik(turkce1, matematrik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2= new EsitAgirlik(turkce2, matematrik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3= new EsitAgirlik(turkce3, matematrik3, edebiyat3, fizik3, isim3);

                EsitAgirlik birinci= birinci(ogrenci1, ogrenci2, ogrenci3 );
                System.out.println("Birinci Esit Agirlik Ogrencisi : " + birinci.getIsim());
                System.out.println(" Ogrenci Puani : " + birinci.puanHesapla());


            } else if (islem.equals("2")) {
                Sayisal ogrenci1= new Sayisal(turkce1, matematrik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2= new Sayisal(turkce2, matematrik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3= new Sayisal(turkce3, matematrik3, edebiyat3, fizik3, isim3);

                Sayisal birinci= birinci(ogrenci1, ogrenci2, ogrenci3 );
                System.out.println("Birinci Sayisal Ogrencisi : " + birinci.getIsim());
                System.out.println(" Ogrenci Puani : " + birinci.puanHesapla());



            }else {
                System.out.println("Gecersiz islem...");
            }
        }




    }
    public static <E extends Aday> E birinci(E e1, E e2, E e3){
       if (e1.puanHesapla()>e2.puanHesapla() && e1.puanHesapla()>e3.puanHesapla()){
           return e1;
       }
        else if (e2.puanHesapla()>e1.puanHesapla() && e2.puanHesapla()>e3.puanHesapla()){
            return e2;
        }
        if (e3.puanHesapla()>e1.puanHesapla() && e3.puanHesapla()>e2.puanHesapla()){
            return e3;
        }else {
            return e1;
        }
    }
}
