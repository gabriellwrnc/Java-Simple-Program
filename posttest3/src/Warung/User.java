package Warung;

public class User {
    protected String pelanggan, pelangganBaru;
    protected int nomorAntrian;
    protected Object pelangganObject;

    public User(String pelanggan, String pelangganBaru, int nomorAntrian, Object pelangganObject) {
        this.pelanggan = pelanggan;
        this.pelangganBaru = pelangganBaru;
        this.nomorAntrian = nomorAntrian;
        this.pelangganObject = pelangganObject;
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
}
