package pertemuan4latihan;

public class Harian {
  
    public void print(String hari,Data data){
        System.out.println("Jadwal "+hari);
        System.out.println("Nama : "+data.mahasiswa.getNama());
        System.out.println("Kelas : "+data.mahasiswa.getNrp());
        System.out.println("Jurusan : "+data.mahasiswa.getJurusan());
        System.out.println("Meminjam Buku");
        System.out.println("Nama Buku: "+data.buku.getNama());
        System.out.println("Kode Buku : "+data.buku.getKode_buku());
        System.out.println("Penerbit : "+data.buku.getPenerbit());
        System.out.println("Tahun : "+data.buku.getTahun());
        System.out.println("==============================================");
    }
}
