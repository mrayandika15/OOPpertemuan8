package pertemuan5latihan;

public class Cat extends KomponenAbstrak {
    
    @Override
    void Mnama() {
        System.out.println("Kucing");
    }

    @Override
    void Mbreed() {
        System.out.println("Angora");
    }

    @Override
    void Mumur() {
        System.out.println(5);
    }

    @Override
    void Msuara() {
        System.out.println("Meong..meong..meong..");
    }
    
}
