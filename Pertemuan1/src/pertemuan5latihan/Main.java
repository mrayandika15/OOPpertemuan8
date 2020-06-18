package pertemuan5latihan;

public class Main {
    public static void main(String[] args) {
        Menampilkan menampilkan = new Menampilkan();
        Duck duck = new Duck();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        menampilkan.tampilanawal();
        duck.Mnama();
        duck.Mbreed();
        duck.Mumur();
        duck.Msuara();
        System.out.println("======================");
        dog.Mnama();
        dog.Mbreed();
        dog.Mumur();
        dog.Msuara();
        System.out.println("======================");
        cat.Mnama();
        cat.Mbreed();
        cat.Mumur();
        cat.Msuara();
    }
    
}
