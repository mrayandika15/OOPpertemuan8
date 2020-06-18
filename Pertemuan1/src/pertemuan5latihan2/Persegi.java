package pertemuan5latihan2;

public class Persegi extends Sisi{
    
    void Luas(){
        int hasil = sisi * sisi;
        System.out.println("Sisi: "+sisi);
        System.out.println("Hasil Luas Persegi: "+hasil);
        System.out.println("================================");
    }
    
    void Keliling(){
        int hasil = 4 * this.sisi;
        System.out.println("Sisi: "+sisi);
        System.out.println("Hasil Keliling Persegi: "+hasil);
        System.out.println("================================");
    }
}
