package LinkedList_And_Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void bastir(LinkedList<String> gidilecek_yerler){



        /*
        for (String s: gidilecek_yerler){
            System.out.println(s);
        }
         */

        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()){
              System.out.println(iterator.next());
        }
    }

    public static void sirali_ekle(LinkedList<String>gidilecek_yerler, String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()){

            int karsilastir= iterator.next().compareTo(yeni); // burda iki elemani karsilastiriyoruz. duruma göre degerlendirme yapacagiz

            if (karsilastir==0){
                // iki deger esit
                System.out.println("Listenizde bu elaman zaten var");
                return;
            } else if (karsilastir<0) {
                // yeni deger iterator.next den daha büyükse
            } else if (karsilastir>0) {
                iterator.previous();
                iterator.add(yeni);
                return;
            }

        }
        iterator.add(yeni);
    }
    public static void main(String[] args) {

        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
        sirali_ekle(gidilecek_yerler, "Postane");
        sirali_ekle(gidilecek_yerler, "Market");
        sirali_ekle(gidilecek_yerler,"Okul");
        sirali_ekle(gidilecek_yerler, "Züccaciye");

        bastir(gidilecek_yerler); // alfabetik olarak siralladi...

        /*gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");

        bastir(gidilecek_yerler);
        System.out.println("-------------------------------");
        //gidilecek_yerler.add(4,"Alisveris Merkezi");
        gidilecek_yerler.remove(3);
        bastir(gidilecek_yerler);
         */


    }
}
