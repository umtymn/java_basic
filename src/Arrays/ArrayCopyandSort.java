package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyandSort {
    public static int[] arrayi_doldur(int sayi){
        Scanner scanner= new Scanner(System.in);
        int [] cikti= new int[sayi];

        for (int i=0;i<sayi; i++){
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }

    public static void arrayi_bastir(int [] array){
        for (int i= 0; i<array.length; i++){
            System.out.println("Element " + (i +1) + ": " + array[i]);
        }
    }

    public static void array_sort(int [] array){
        Arrays .sort( array);
        arrayi_bastir(array);
    }
    public static void main(String[] args) {

        //int [] a = arrayi_doldur(5);
        // arrayi_bastir(a);
        //array_sort(a);

        int [] x= {1,2,3,4,5};
        int [] y= {1,2,3,4,5};

        if (Arrays.equals(x,y)){
            System.out.println("esitler");
        }else {
            System.out.println("esit degiller");
        }


    }
}
