package day01_javayaGiris;

import java.util.Scanner;

public class kosullar {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas = scanner.nextInt();
        if (yas>18){
            System.out.println("Giris yapabilirsiniz");
        }
        else{
            System.out.println("Yasin kücük bebe, defolll!!!");
        }
    }
}
