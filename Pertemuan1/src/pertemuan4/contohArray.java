package pertemuan4;

import java.util.Scanner;

public class contohArray {
    
    public static void main (String[] args){
        String[] buah = new String[5];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<buah.length;i++){
            System.out.println("Buah ke - "+(i+1)+" : ");
            buah[i] = scan.nextLine();
        }
        
        System.out.println("----nrp----");
        for (String haikal:buah) {
            System.out.println(haikal);
        }
    }
}