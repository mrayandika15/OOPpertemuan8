package pertemuan4;

public class Latihan3 {
    
    public static void main(String[] args) {
        int angka = 1;
        for(int baris=0;baris<5;baris++){
            for(int kolom=0;kolom<baris;kolom++){
                System.out.print(angka);
                angka++;
            }
            System.out.println("");
        }
    }
}
