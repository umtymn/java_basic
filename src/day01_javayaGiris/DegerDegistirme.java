package day01_javayaGiris;

import java.util.Scanner;

public class DegerDegistirme {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;

        System.out.print("Lütfen bir sayi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        sayi1= scanner.nextInt();
        System.out.println("degismeden önce: " + sayi1);

        System.out.print("Lütfen bir ikinci sayiyi giriniz: ");
        sayi2= scanner.nextInt();
        System.out.println("degismeden önce: " + sayi2);

        int degisken= sayi1;
        sayi1=sayi2;
        sayi2=degisken;
        System.out.println("degistikten sonra: " + sayi1 + " " + sayi2);
    }
}
