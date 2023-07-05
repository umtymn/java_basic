package day01_javayaGiris;

import java.util.Scanner;

public class Döngüler {
    public static void main(String[] args) {

       /*for (int i=0; i <5; i++){
           System.out.println(i);
       }
       */

      /* int k=0;
       while (k<10){
           System.out.println("k: " + k);
           k++;
       }*/


       /* System.out.print("Lütfen bir sayi giriniz: ");
        Scanner scanner= new Scanner(System.in);
        int sayi= scanner.nextInt();
        int faktoriyel=1;
        System.out.println("sayi: " + sayi);

        while(sayi>0){
            faktoriyel*= sayi;
            sayi--;
        }
        System.out.println(faktoriyel);*/

        System.out.println("lütfen bir sayi giriniz: ");
        Scanner scanner= new Scanner(System.in);
        int sayi= scanner.nextInt();

        int toplam= 0;

        do {
            toplam += sayi % 10;
            sayi = sayi/10;
        }while(sayi>0);

        System.out.println("rakamlarin toplami: " + toplam);

    }

}
