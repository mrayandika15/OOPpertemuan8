package pertemuan2;

import java.util.Scanner;

public class Latihan {
    
    public static void main(String[] args){
        Float ip1,ip2,ip3,ip4,ip5,ip6,ip7,ip8,ipk;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan IP Semester 1 : ");
        ip1 = keyboard.nextFloat();
            
        System.out.print("Masukan IP Semester 2 : ");
        ip2 = keyboard.nextFloat();
        
        System.out.print("Masukan IP Semester 3 : ");
        ip3 = keyboard.nextFloat();
        
        System.out.print("Masukan IP Semester 4 : ");
        ip4 = keyboard.nextFloat();
        
        System.out.print("Masukan IP Semester 5 : ");
        ip5 = keyboard.nextFloat();
        
        System.out.print("Masukan IP Semester 6 : ");
        ip6 = keyboard.nextFloat();
        
        System.out.print("Masukan IP Semester 7 : ");
        ip7 = keyboard.nextFloat();
        
        System.out.print("Masukan IP Semester 8 : ");
        ip8 = keyboard.nextFloat();
        
        ipk = (ip1+ip2+ip3+ip4+ip5+ip6+ip7+ip8)/8;
        
        if (ipk >= 3.80) {
            System.out.println("IPK anda : "+ipk);
            System.out.println("Anda Summa Cum Laude");
        }
        else if (ipk >= 3.60 && ipk <= 3.79) {
            System.out.println("IPK anda : "+ipk);
            System.out.println("Anda Magna Cum Laude");
        }
        else if (ipk >= 3.40 && ipk <= 3.59) {
            System.out.println("IPK anda : "+ipk);
            System.out.println("Anda Cum Laude");
        }
        else if (ipk >= 3.20 && ipk <= 3.39) {
            System.out.println("IPK anda : "+ipk);
            System.out.println("Anda High Merit");
        }
        else if (ipk >= 3.00 && ipk <= 3.19) {
            System.out.println("IPK anda : "+ipk);
            System.out.println("Anda Merit");
        }
        else {
            System.out.println("IPK anda : "+ipk);
            System.out.println("Anda biasa aja");
        }
    }
}
    

