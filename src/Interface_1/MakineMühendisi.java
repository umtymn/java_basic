package Interface_1;

public class MakineMühendisi implements IMuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMühendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void adli_sicil_kaydi() {
        if (adli_sicil){
            System.out.println("Adli sicil kaydim vardir.");
        }else {
            System.out.println("Adli sicil kaydim yoktur.");
        }
    }

    @Override
    public void askerlik_durumu() {
        if (askerlik){
            System.out.println("Askerligimi yaptim.");
        }else {
            System.out.println("Askerligimi henüz yaomadim.");
        }
    }

    @Override
    public String mezuniyet_ortalmasi(double derece) {
        return "Mezuniyet ortalamam: " + derece;
    }

    @Override
    public void calistigi_yerler(String[] array) {
        if (array.length==0){
            System.out.println("Herhangi bir is tecrübem yoktur.");
        }else {
            System.out.println("Makine mühendisi olarak su sirketlerde calistim");
            for (String s:array
                 ) {
                System.out.println(s);
            }

        }

    }

    public void referans_getir(String [] array){
        if (array.length==0){
            System.out.println("Herhangi bir referansim bulunmuyor.");
        }else {
            System.out.println("Referanslarim : ");
            for (String s:array
            ) {
                System.out.println(s);
            }
        }
    }
}
