package pertemuan4asosiasi;

public class Asosiasi{
    
    private static String mobil;
    
    public static void main(String[] args) {
        mobil = "toyo";
        System.out.println(mobil);
        
        Mesin mesin = new Mesin();
        
        System.out.println(mesin.part);
        mesin.mesin();
    }
}