public class Mahasiswa {
    String nama;
    long nim;
    String jurusan;
    long angkatan;

    public Mahasiswa(String nama, int nim, String jurusan, int angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }
    
    public void tampilkanIdentitasMahasiswa() {
        System.out.println("================================");
        System.out.println("Identitas Mahasiswa");
        System.out.println("\nNama: " + nama);
        System.out.println("\nNIM: " + nim);
        System.out.println("\nJurusan: " + jurusan);
        System.out.println("\nAngkatan: " + angkatan);
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Bondan Banuaji", 231351030, "Teknik Informatika", 23);
        mhs1.tampilkanIdentitasMahasiswa();
    }
}
