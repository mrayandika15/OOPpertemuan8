package pertemuan4;

import java.util.Scanner;

public class contohWhile {
    
    public static void main (String[] args){
        boolean running = true;
        int counter=0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while(running){
            System.out.println("Apakah anda ingin keluar ?");
            System.out.println("Jawab[YA/TIDAK]");
            jawab = scan.nextLine();
            
            if (jawab.equalsIgnoreCase("YA")){
                running = false;
            }
            counter++;
        }
        
        System.out.println("Anda Sudah Melakukan Perulangan Sebanyak : "+counter);
    }
}
