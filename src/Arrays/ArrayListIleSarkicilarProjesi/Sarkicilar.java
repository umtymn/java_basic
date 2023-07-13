package Arrays.ArrayListIleSarkicilarProjesi;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public void sarkicilari_bastir(){
        System.out.println("Sarkici listesinde " + sarkici_listesi.size() + " kadar sarkici var");

        for (int i=0; i<sarkici_listesi.size(); i++){
            System.out.println((i+1) + ".Sarkici : " + sarkici_listesi.get(i));
        }

    }
    public void sarkici_ekle(String isim){
        sarkici_listesi.add(isim);
        System.out.println("Sarkici Listesi güncelllendi");
    }

    public void sarkici_guncelle(String yeni_isim, int pozisyon){
        sarkici_listesi.set(pozisyon, yeni_isim);
        System.out.println("sarkici listesi güncellendi");
    }

    public void sarkici_sil(int pozisyon){
        String isim = sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim + " isimli sarkici listeden silindi..");
    }

    public void sarkici_ara(String sarkici_ismi){
        int poziyon= sarkici_listesi.indexOf(sarkici_ismi);
        if (poziyon>=0){
            System.out.println("Sarkici bulundu");
            System.out.println(sarkici_ismi + " isimli sarkici "+ (poziyon + 1) + " . poziyonda...");
        }else {
            System.out.println("sarkici bulunamadi...");
        }

    }

}
