package Interface_1.General_Info.YurtdisiCikisProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String sartlar= "Yurtdisi Cikis Kurallari... \n" +
                "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor \n" +
                "15 Tl harc bedelni tam olarak ödemeniz gerekiyor \n" +
                "Gideceginiz ülkeye vezenizin bulunmasi gerekiyor.";
        String message= "Yurtdisi sartlarindan hespsini saglamaniz gerekiyor";

        while (true){
            System.out.println("Sabiha Gökcen havalanina Hosgeldiniz... ");
            System.out.println("****************************");
            System.out.println(sartlar);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ne kadar harc yatirdiniz ? ");
            int harc= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Vizeniz var mi? (evet veya hayir)");
            String vize= scanner.nextLine();
            System.out.println("Siyasi yasaginiz var mi? (evet veya hayir)");
            String yasak= scanner.nextLine();
            Yolcu yolcu1 = new Yolcu(harc,vize, yasak);
            System.out.println("Siyasi yasak Kontolü yapiliyor...");
            Thread.sleep(3000);

            if (yolcu1.siyasiYasakKontrol2()==true){
                System.out.println(message);
                continue;
            }
            System.out.println("Kontol yapiliyor...");
            Thread.sleep(3000);
            if (yolcu1.harcKontrol2()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Kontolü yapiliyor...");
            Thread.sleep(3000);
            if (yolcu1.vizeKontrol2()==false){
                System.out.println(message);
                continue;
            }
            break;

        }

    }
}
