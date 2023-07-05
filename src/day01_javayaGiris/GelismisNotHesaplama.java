package day01_javayaGiris;

import java.util.Scanner;

public class GelismisNotHesaplama {
    public static void main(String[] args) {
        System.out.print("Ilk vize notunu giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int vize1= scanner.nextInt();
        System.out.print("Ikinci vize notunu giriniz: ");
        int vize2= scanner.nextInt();
        System.out.print("Final notunu giriniz: ");
        int finalNotu= scanner.nextInt();
        double ortalama= (vize1*30)/100 + (vize2*30)/100 + (finalNotu*40)/100;

        if (ortalama>=90){
            System.out.println("AA");
        } else if (ortalama>=85) {
            System.out.println("BA");
        } else if (ortalama>=80) {
            System.out.println("BB");
        } else if (ortalama>=80) {
            System.out.println("BB");
        }else if (ortalama>=75) {
            System.out.println("CB");
        }else if (ortalama>=70) {
            System.out.println("CC");
        }else if (ortalama>=65) {
            System.out.println("DC");
        }else if (ortalama>=60) {
            System.out.println("DD");
        }else if (ortalama>=55) {
            System.out.println("FD");
        }else {
            System.out.println("FF");
        }
    }
}
