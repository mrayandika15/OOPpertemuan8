/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ContohSwitchCase {
    
    public static void main(String[] args){
       String lampu;
       Scanner keyboard = new Scanner(System.in);
       
        System.out.println("Masukan warna : ");
        lampu = keyboard.nextLine();
        
        switch (lampu){
            case "Merah":
                System.out.println("Lampu berwarna Merah");
                break;
            case "Kuning":
                System.out.println("Lampu berwarna Kuning");
                break;
            case "Hijau":
                System.out.println("Lampu berwarna Hijau");
                break;
            default:
                System.out.println("Warna lampu salah");
        }
    }
    
}
