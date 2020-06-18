package pertemuan4agregasi;

public class Jurusan {
    private int kd_jurusan;
    private String nm_jurusan;
    private Mahasiswa mhs;

    public int getKd_jurusan() {
        return kd_jurusan;
    }

    public void setKd_jurusan(int kd_jurusan) {
        this.kd_jurusan = kd_jurusan;
    }

    public String getNm_jurusan() {
        return nm_jurusan;
    }

    public void setNm_jurusan(String nm_jurusan) {
        this.nm_jurusan = nm_jurusan;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }
}
