package Warung;

public class User {
    protected String pelanggan, pelangganBaru;
    protected int nomorAntrian;
    protected Object pelangganObject;
    protected int totalPelanggan;

    public User(String pelanggan, String pelangganBaru, int nomorAntrian, Object pelangganObject, int totalPelanggan) {
        this.pelanggan = pelanggan;
        this.pelangganBaru = pelangganBaru;
        this.nomorAntrian = nomorAntrian;
        this.pelangganObject = pelangganObject;
        this.totalPelanggan = totalPelanggan;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Object getPelangganObject() {
        return pelangganObject;
    }

    public void setPelangganObject(Object pelangganObject) {
        this.pelangganObject = pelangganObject;
    }

    public int getNomorAntrian() {
        return nomorAntrian;
    }

    public void setNomorAntrian(int nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
    }

    public String getPelangganBaru() {
        return pelangganBaru;
    }

    public void setPelangganBaru(String pelangganBaru) {
        this.pelangganBaru = pelangganBaru;
    }

    public int getTotalPelanggan() {
        return totalPelanggan;
    }

    public void setTotalPelanggan(int totalPelanggan) {
        this.totalPelanggan = totalPelanggan;
    }

    public void outputSambutan() {
        System.out.println("Selamat Datang di Bulek Sayang");
        System.out.println("Silahkan masukkan antrian");
    }

    public void outputFitur() {
        System.out.println("1. Masukkan Nama Pelanggan");
        System.out.println("2. Lihat Antrian");
        System.out.println("3. Update Antrian");
        System.out.println("4. Hapus Antrian");
        System.out.println("5. Selesai");

        System.out.print("Masukkan Pilihan : ");
    }

    public void footerFitur() {
        System.out.println("Hasil fitur");
    }

    // 1
    void tanyaInputPelanggan() {
        System.out.println("Penambahan pelanggan ");
        System.out.print("Masukkan Nama Pelanggan : ");
    }

    // 2
    void tampilanOutput() {
        System.out.println("Menu melihat pelanggan");
    }

    // 3
    void tanyaUpdateAntrian() {
        System.out.print("Masukkan Nomor Antrian : ");
    }

    void tanyaUpdatePelanggan() {
        System.out.print("Masukkan Nama Pelanggan yang Baru : ");
    }

    // 4
    void tanyaHapusAntrian() {
        System.out.print("Masukan Nomor Antrian yang Ingin Dihapus : ");
    }
}
