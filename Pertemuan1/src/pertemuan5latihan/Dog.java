package pertemuan5latihan;

public class Dog extends KomponenAbstrak {
    
    @Override
    void Mnama() {
        System.out.println("Anjing");
    }

    @Override
    void Mbreed() {
        System.out.println("Cihuahua");
    }

    @Override
    void Mumur() {
        System.out.println(10);
    }

    @Override
    void Msuara() {
        System.out.println("Guk..guk..guk..");
    }
    
}
