//encapsulation syntax 

public class Mahasiswa {
    private String nama;
    private long nim;
    private String jurusan;
    private long angkatan;

    public Mahasiswa(String nama, String nim, String jurusan, String angkatan) {
        this.nama = nama;
        this.nim = Long.parseLong(nim);
        this.jurusan = jurusan;
        this.angkatan = Long.parseLong(angkatan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getNim(){
        return nim;
    }

    public void setNim(long nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }


    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public long getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String toString() {
        return "\nNama: " + nama + " \nNIM: " + nim + " \nJurusan: " + jurusan + " \nAngkatan: " + angkatan; 
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Boba", "666", "Informatika", "23");
        System.out.println("Data Mahasiswa");
        System.out.println("==============================");
        System.out.println(mhs);
        System.out.println("\n==============================");
    }
}
