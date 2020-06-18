package pertemuan2;

import java.util.Scanner;

public class Latihan2 {
    
    public static void main (String[] args){
        String hari;
        Scanner keyboard = new Scanner(System.in);       
        System.out.print("Masukan Hari anda : ");
        hari = (keyboard.nextLine()).toUpperCase();
        
        switch (hari){
            case "SENIN":
                System.out.println("Olahraga");
                System.out.println("Matematika");
                System.out.println("Bahasa Indonesia");
                break;
            case "SELASA":
                System.out.println("OOP");
                System.out.println("PEMDAS");
                System.out.println("PCD");
                break;
            case "RABU":
                System.out.println("IMK");
                System.out.println("Matematika Teknik");
                System.out.println("Bahasa Inggris");
                break;
            case "KAMIS":
                System.out.println("IPA");
                System.out.println("IPS");
                System.out.println("Bahasa Konoha");
                break;
            case "JUMAT":
                System.out.println("Agama");
                System.out.println("Alat Musik");
                System.out.println("Bernyanyi nyanyi");
                break;
            default:
                System.out.println("Tidak ada hari itu ya bapak");
        }
    }
    
}
