package pertemuan4;

public class Latihan2 {

    public static void main(String[] args) {
        
        for(int baris=0;baris<5;baris++){
            for(int kolom=0;kolom<baris;kolom++){
                System.out.print(" ");
            }
            for(int kolom=0;kolom<(9-baris*2);kolom++){
                System.out.print(kolom+1);
            }
            System.out.println("");
        }
    }
}
