package day01_javayaGiris;

import java.util.Scanner;

public class Faiz_uygulamasi {
    public static void main(String[] args) {
        double faiz_orani=0.06;
        int anapara, vade;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen anaparanizi giriniz: ");
        anapara= scanner.nextInt();
        System.out.print("Lütfen vadenizi giriniz: ");
        vade=scanner.nextInt();
        double toplamPara =anapara;

        for (int i=1; i<=vade; i++){

            toplamPara = toplamPara + (toplamPara*faiz_orani);
            System.out.println(i + ". yildaki paraniz =" + (int)toplamPara);
        }

    }

}
