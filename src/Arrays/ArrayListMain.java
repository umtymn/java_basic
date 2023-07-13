package Arrays;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Müslüm Gürses");
        arrayList.add("Cansever");
        arrayList.add("Murat kekili");
        arrayList.add("Ferdi Tayfur");
        arrayList.add("Cansever");


       // System.out.println(arrayList.get(1));
        // System.out.println(arrayList.size()); // arrayList in eleman sayisini bulma

        //arrayList.remove("Müslüm Gürses"); // arrayList ten eleman silme. iki türlü silinebilir. Obje ile veya index numarasi ile

        //System.out.println("Cansever in index numarasi : " + arrayList.indexOf("Cansever"));// indexof methodu array elamanlarinin bastan baslayarak bakar.

        //System.out.println("Cansever in son index numarasi : " + arrayList.lastIndexOf("Cansever"));// lastindexof methodu array elamanlarinin sondan baslayarak bakar.

        //System.out.println(arrayList.indexOf("Ajdar")); // array de olmayan birseyi cagirdigimizda -1 sonucunu verir.

        //arrayList.set(4, "Mahmut Tuncer"); array elamanlarini güncelleme, degistirme


        for (int i =0; i<arrayList.size(); i++ ){//arrayList in elamanlarini yazdirma
            System.out.println(arrayList.get(i));
        }

    }

}
