public class Kegiatan {
    String Subjek;
    String Predikat;
    String Objek;
    String Keterangan;

    public Kegiatan(String Subjek, String Predikat, String Objek, String Keterangan) {
        this.Subjek = Subjek;
        this.Predikat = Predikat;
        this.Objek = Objek;
        this.Keterangan = Keterangan;
    }

    public void tampilkanKegiatan() {
        System.out.println(
                this.Subjek + this.Predikat + this.Objek + this.Keterangan);
    }

    public static void main(String[] args) {
        Kegiatan kegiatan = new Kegiatan("Dinda", "Memetik", "Bunga", "Di taman");
        kegiatan.tampilkanKegiatan();
    }
}