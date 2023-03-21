package Warung;

public class Fitur4 extends User {
    public Fitur4(int nomorAntrian, Object pelangganObject) {
        super(null, null, nomorAntrian, pelangganObject);
    }

    void konfirmasiHapus() {
        System.out.println("Apakah anda yakin ingin melakukan penghapusan pada pelanggan dibawah ini ?");
        System.out.println("Nomor Antrian " + getNomorAntrian());
        System.out.println("Nama pelanggan " + getPelangganObject());
        System.out.println("1. Yakin");
        System.out.println("2. Tidak");
    }
}
