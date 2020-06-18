package pertemuan5latihan;

public class Duck extends KomponenAbstrak{

    @Override
    void Mnama() {
        System.out.println("Bebek");
    }

    @Override
    void Mbreed() {
        System.out.println("Cirebon");
    }

    @Override
    void Mumur() {
        System.out.println(1);
    }

    @Override
    void Msuara() {
        System.out.println("Kwek..kwek..kwek..");
 
    }
}
