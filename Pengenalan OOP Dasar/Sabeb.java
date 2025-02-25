public class Sabeb {
    String nama;
    int NIM;
    String jurusan;

    public Sabeb(String nama, int NIM, String jurusan) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String toString() {
        return "Nama: " + nama + "\nNIM: " + NIM + "\nJurusan: " + jurusan;
    }

    public static void main(String[] args) {
        Sabeb sb = new Sabeb("Budi", 123, "Informatika");
        System.out.println("Data Mahasiswa");
        System.out.println("==============================");
        System.out.println(sb);
        System.out.println("\n==============================");
    }   
}

