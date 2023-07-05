package day01_javayaGiris;

import java.util.Scanner;

public class InputAlma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir yazi giriniz");
        String yazi= scanner.nextLine();
        System.out.println("yaziniz: " + yazi);
    }
}
