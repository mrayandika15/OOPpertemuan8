package pertemuan5latihan2;

public class Main {
    
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        
        persegi.sisi = 10;
        persegi.Luas();
        persegi.Keliling();
        
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 20;
        persegiPanjang.Luas();
        persegiPanjang.Keliling();
    }
}
