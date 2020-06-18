package pertemuan4agregasi;

public class RelasiAgregasi {
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Muhamad Haikal");
        mahasiswa.setNRP("152018130");
        mahasiswa.setKelas("D");
        
        Jurusan jurusan = new Jurusan();
        jurusan.setMhs(mahasiswa);
        
        System.out.println(mahasiswa.getNama());
        System.out.println(jurusan.getMhs().getNama());
    }   
}
