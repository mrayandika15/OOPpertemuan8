/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author ASUS
 */
public class Pertemuan1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        hitung();
    }
    
    public static void hitung() {
        int persegipanjang,panjang,lebar,nrp;
        String nama;
        
        panjang = 20;
        lebar = 10;
        nrp = 152018118;
        nama = "Ghozy Imaduddin";
        persegipanjang = panjang * lebar;
        
        System.out.println(nama);
        System.out.println(nrp);
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("Hasil : "+persegipanjang);
    }
    
}
