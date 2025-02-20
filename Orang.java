public class Orang {
    String nama;
    int umur;
    String alamat;
    
    public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public void tampilkanIdentitas() {
        System.out.println("Halo nama saya adalah " + this.nama + " umur saya " + this.umur + " rumah saya di " + this.alamat);
    }

    public static void main (String[] args) {
        Orang boba = new Orang("Boba", 21, "Karawang");
        boba.tampilkanIdentitas();
    }
}

