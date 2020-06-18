package pertemuan4;

import java.util.Scanner;

public class contohDuaDimensiArray {
    
    public static void main(String[] args) {
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);
        
        for(int baris=0;baris<meja.length;baris++){
            for(int kolom=0;kolom<meja[baris].length;kolom++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d)",baris,kolom);
                meja[baris][kolom] = scan.nextLine();
            }
        }
        
        System.out.println("-----------------------------------");
        
        for(int baris=0;baris<meja.length;baris++){
            for(int kolom=0;kolom<meja[baris].length;kolom++){
                System.out.format("|%s|", meja[baris][kolom]);
            }
            System.out.println("");
        }
    }
    
}
