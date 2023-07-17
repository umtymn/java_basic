package InnerClasses.LocalInnerClasses;

public class Main {
    public static void main(String[] args) {
         class Alan {
            public void daireAlan(int yaricap){
                System.out.println("Dairenin alani: " + (yaricap*yaricap*Math.PI));
            }
        }
        Alan alan= new Alan();
        Alan alan2= new Alan();
        alan.daireAlan(10);
        alan.daireAlan(3);
    }
}
