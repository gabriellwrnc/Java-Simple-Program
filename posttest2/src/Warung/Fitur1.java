package Warung;

public class Fitur1 {
    private String pelanggan;

    public Fitur1(String Pelanggan) {
        this.pelanggan = Pelanggan;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    void fitur1Sukses() {
        System.out.println(pelanggan + " Telah masuk kedalam antrian");
    }
}
