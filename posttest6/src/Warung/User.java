package Warung;

public class User implements Tampilan {
    protected String pelanggan, pelangganBaru;
    protected int nomorAntrian;
    protected Object pelangganObject;
    protected int totalPelanggan;

    protected User(String pelanggan, String pelangganBaru, int nomorAntrian, Object pelangganObject,
            int totalPelanggan) {
        this.pelanggan = pelanggan;
        this.pelangganBaru = pelangganBaru;
        this.nomorAntrian = nomorAntrian;
        this.pelangganObject = pelangganObject;
        this.totalPelanggan = totalPelanggan;
    }

    protected String getPelanggan() {
        return pelanggan;
    }

    protected void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    protected Object getPelangganObject() {
        return pelangganObject;
    }

    protected void setPelangganObject(Object pelangganObject) {
        this.pelangganObject = pelangganObject;
    }

    protected int getNomorAntrian() {
        return nomorAntrian;
    }

    protected void setNomorAntrian(int nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
    }

    protected String getPelangganBaru() {
        return pelangganBaru;
    }

    protected void setPelangganBaru(String pelangganBaru) {
        this.pelangganBaru = pelangganBaru;
    }

    protected int getTotalPelanggan() {
        return totalPelanggan;
    }

    protected void setTotalPelanggan(int totalPelanggan) {
        this.totalPelanggan = totalPelanggan;
    }

    @Override
    public void outputSambutan() {
        System.out.println("Selamat Datang di Bulek Sayang");
        System.out.println("Silahkan masukkan antrian");
    }

    @Override
    public void outputFitur() {
        System.out.println("1. Masukkan Nama Pelanggan");
        System.out.println("2. Lihat Antrian");
        System.out.println("3. Update Antrian");
        System.out.println("4. Hapus Antrian");
        System.out.println("5. Selesai");
        System.out.print("Masukkan Pilihan : ");
    }

    @Override
    public void footerFitur() {
        System.out.println("Hasil fitur");
    }

    @Override
    public void tanyaInputPelanggan() {
        System.out.println("Penambahan pelanggan ");
        System.out.print("Masukkan Nama Pelanggan : ");
    }

    @Override
    public void tampilanOutput() {
        System.out.println("Menu melihat pelanggan");
    }

    @Override
    public void tanyaUpdateAntrian() {
        System.out.print("Masukkan Nomor Antrian : ");
    }

    @Override
    public void tanyaUpdatePelanggan() {
        System.out.print("Masukkan Nama Pelanggan yang Baru : ");
    }

    @Override
    public void tanyaHapusAntrian() {
        System.out.print("Masukan Nomor Antrian yang Ingin Dihapus : ");
    }

}
