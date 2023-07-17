package InnerClasses.StaticOlmayanInnerClasslar;


import java.util.Scanner;

public class Matematik {
    Scanner scanner = new Scanner(System.in);
    private double PI= Math.PI;

    public class Alan{

        public class Daire{
            public void DaireAlanHesapla(){
                System.out.println("Lütfen dairenin yaricapini giriniz : ");
                int yaricap= scanner.nextInt();
                double alan= PI* yaricap* yaricap;
                System.out.println("girdiginiz dairenin alani : " + alan);
            }
        }

    }
    public class Faktoriyel{
        public void faktoriyelHesapla(){
            System.out.println("Lütfen bir sayi giriniz : ");
            int sayi= scanner.nextInt();
            int fact=1;

            for (int i =2; i<=sayi; i++){
                fact*=i;
            }
            System.out.println("Girdiginiz "+ sayi+ " sinin faktoriyeli " + fact+ "  dir");
        }
    }

    public class Asal{

        public boolean AsalMi(){
            System.out.println("Lütfen bir sayi giriniz: ");
            int sayi= scanner.nextInt();

            for (int i= 2; i<sayi; i++){
                if (sayi%i==0){
                    return false;
                }
            }
            return true;
        }
    }



}
