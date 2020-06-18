package pertemuan5kedua;

public class Mobil implements KomponenInterface{

    @Override
    public void mesin() {
        System.out.println("Kecepatan Mobil: "+kecepatan);
    }

    @Override
    public void design() {
        System.out.println("Mobil: "+model);
    }
    
    
}
