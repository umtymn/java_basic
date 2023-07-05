package day01_javayaGiris;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ilk kenari giriniz:");
        int ilkKenar= scanner.nextInt();
        System.out.print("Lütfen ikinci kenari giriniz:");
        int ikinciKenar= scanner.nextInt();
        double hipoTenus= Math.sqrt(ilkKenar * ilkKenar + ikinciKenar*ikinciKenar);
        System.out.println(hipoTenus);
    }
}
