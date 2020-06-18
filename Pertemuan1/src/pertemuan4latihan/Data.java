package pertemuan4latihan;

public class Data {
    
    protected Mahasiswa mahasiswa = new Mahasiswa();
    protected Buku buku = new Buku();
    
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
    public void daftarData (){
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Muhamad Haikal");
        mahasiswa1.setNrp("152018130");
        mahasiswa1.setJurusan("Teknik Informatika");
        
        Buku buku1 = new Buku();
        buku1.setKode_buku("0001");
        buku1.setNama("Buku Koding");
        buku1.setPenerbit("Haikal ganteng");
        buku1.setTahun(2000);
        
        Data senin = new Data();
        senin.setMahasiswa(mahasiswa1);
        senin.setBuku(buku1);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNama("Ihsan Saiful Hadi");
        mahasiswa2.setNrp("152018136");
        mahasiswa2.setJurusan("Teknik Informatika");
        
        Buku buku2 = new Buku();
        buku2.setKode_buku("0002");
        buku2.setNama("Buku Bios");
        buku2.setPenerbit("Haikal keren");
        buku2.setTahun(2001);
        
        Data selasa = new Data();
        selasa.setMahasiswa(mahasiswa2);
        selasa.setBuku(buku2);
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.setNama("Firly Taufikurohman");
        mahasiswa3.setNrp("152018109");
        mahasiswa3.setJurusan("Teknik Informatika");
       
        Buku buku3 = new Buku();
        buku3.setKode_buku("0003");
        buku3.setNama("Buku Indonesia");
        buku3.setPenerbit("Haikal cantik");
        buku3.setTahun(2002);
        
        Data rabu = new Data();
        rabu.setMahasiswa(mahasiswa3);
        rabu.setBuku(buku3);
        
        Harian harian = new Harian();
        harian.print("Senin",senin);
        harian.print("Selasa",selasa);
        harian.print("Rabu",rabu);
        
    }
}
