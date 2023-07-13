package Arrays;

import java.util.Scanner;

public class Giris {

    public static void arrayi_bastir(int [] array){
        for (int i =0; i<array.length; i++){
            System.out.println("Element "+ (i+1)+ ": "+ array[i]);
        }
    }
    public static double arrayin_ortalamasi(int [] array){
        int toplam= 0;
        for (int i=0; i< array.length; i++) {
            toplam += array[i];
        }
        return ((double)toplam/array.length);

    }
    public static void main(String[] args) {
       // int [] a= {30, 40, 50};
        //System.out.println(a[1]);
       // System.out.println(a[6]); // hata verir

        //*********************

        /*
        int []a=new int[5];
        for (int i=0;i<5 ; i++){
            a[i]=i*4 + 2;
            System.out.println(a[i]);
        }*/

        /*
        int []a=new int[5];
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen array icin deger giriniz: ");

        for (int i=0;i<5 ; i++){
            a[i]= scanner.nextInt();

        }
        System.out.println("******************************");
        for (int i=0;i<5 ; i++){
            System.out.println(a[i]);

        }
        System.out.println("Arrayin uzunlugu : "+ a.length); // arrayin uzunlugunu bulma1
        */

        int [] b= {10, 20, 30, 40};
        arrayi_bastir(b);
        System.out.println("Arrayin ortalamasi : " + arrayin_ortalamasi(b));
    }
}
