package pertemuan5latihan2;

public class PersegiPanjang extends Sisi{
    
    void Luas(){
        int hasil = panjang * lebar;
        System.out.println("Panjang: "+panjang);
        System.out.println("Lebar: "+lebar);
        System.out.println("Hasil Luas Persegi Panjang: "+hasil);
        System.out.println("================================");
    }
    
    void Keliling(){
        int hasil = (2 * panjang) + (2 * lebar);
        System.out.println("Panjang: "+panjang);
        System.out.println("Lebar: "+lebar);
        System.out.println("Hasil Keliling Persegi Panjang: "+hasil);
        System.out.println("================================");
    }
    
}
