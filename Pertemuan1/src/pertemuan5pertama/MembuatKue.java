package pertemuan5pertama;

public class MembuatKue extends Komponen {

    @Override
    void bahan_bahan(){
        String bahan1="Terigu";
        String bahan2="Gula";
        String bahan3="Telur";
        System.out.println("=======BAHAN-BAHAN========");
        System.out.println("1. "+bahan1);
        System.out.println("2. "+bahan2);
        System.out.println("3. "+bahan3);
        
    }

    @Override
    void peralatan() {
        String alat1="Oven";
        String alat2="Mixer";
        String alat3="Loyang";
        System.out.println("========ALAT-ALAT========");
        System.out.println("1. "+alat1);
        System.out.println("2. "+alat2);
        System.out.println("3. "+alat3);
    }

    @Override
    void proses_pembuatan() {
        System.out.println("=====PROSES=====");
        System.out.println("1. Aduk dan Campurkan Bahan");
        System.out.println("2. Masukan pada loyang");
        System.out.println("3. Oven sampai matang");
        System.out.println("4. Diamkan dioven , lalu order gofood");
    }
}
