package Strings;

public class StirngMethods {
    public static void main(String[] args) {

        //iki türlü string yazma sekli var :

        String a= "Ümit";
        String b= new String("Ümit");

        //örneklerle arasindaki fark

        String x= "Ahmet";
        String y = "Ahmet";

        if (x==y){
            System.out.println("esitler");  // esitler seklinde cikar. Cünkü bu kullanimda ayni yerde bir obje olusturuyor
        }else {
            System.out.println("Esit degiller");
        }


        String n = new String("Ahmet");
        String m = new String("Ahmet");
        if (n==m){
            System.out.println("esitler");
        }else {
            System.out.println("Esit degiller");// burda esit degiller seklinde cikar. Cünkü iki farkli yerde iki farkli string olusturuyor.
        }

        if (n.equals(m)){
            System.out.println("esitler"); // burda esitler seklinde cikar. Cünkü equals kullandik...
        }else {
            System.out.println("esit degiller");
        }


        //System.out.println(a.length()); // string uzunluk bulma
        //System.out.println("0. index : " + b.charAt(0)); // index numrasina göre arama yapmak

        /* for (int i= 0; i<b.length(); i++){
            System.out.println(b.charAt(i));
        }
        */

        //System.out.println(b.startsWith("Üm")); // verilen ifade ile basliyor mu true/false
        //System.out.println(b.endsWith("it"));// verilen ifade ile bitiyor mu true/false

       // System.out.println(b.indexOf("t")); // index numarsini bulunur. Bastan baslar sona dogru.
        // ilk eslesmeyi görünce durur

       // System.out.println(b.lastIndexOf("t")); // index numarsini bulur. Sondan baslar basa dogru.
        // ilk eslesmeyi görünce durur

        //System.out.println(b.toLowerCase());
        //System.out.println(b.toUpperCase());

       /*
       // stringden int e cevirme

        String x = "1923";
        int y = Integer.parseInt(x);
        System.out.println(y-1);

        // int den stringe cevirme
        int x2= 1923;
        String y2= String.valueOf(x2)
        System.out.println(y2-1);

        */

    }
}
