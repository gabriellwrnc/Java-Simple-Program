package Warung;

public class Fitur3 {
    private int nomorAntrian;
    private String pelangganBaru;
    private Object pelanggan;

    public Fitur3(int NomorAntrian, Object Pelanggan, String PelangganBaru) {
        this.nomorAntrian = NomorAntrian;
        this.pelanggan = Pelanggan;
        this.pelangganBaru = PelangganBaru;
    }

    public Object getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Object pelanggan) {
        this.pelanggan = pelanggan;
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

    void konfirmasiUpdate() {
        System.out.println("Apakah anda yakin ingin melakukan update pelanggan dibawah ini ?");
        System.out.println("Nomor Antrian " + getNomorAntrian());
        System.out.println("Nama pelanggan lama " + getPelanggan());
        System.out.println("Nama pelanggan baru " + getPelangganBaru());
        System.out.println("1. Yakin");
        System.out.println("2. Tidak");
    }
}
