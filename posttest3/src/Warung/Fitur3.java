package Warung;

public class Fitur3 extends User {

    public Fitur3(int nomorAntrian, Object pelangganObject, String pelangganBaru) {
        super(null, pelangganBaru, nomorAntrian, pelangganObject);
    }

    void konfirmasiUpdate() {
        System.out.println("Apakah anda yakin ingin melakukan update pelanggan dibawah ini ?");
        System.out.println("Nomor Antrian " + getNomorAntrian());
        System.out.println("Nama pelanggan lama " + getPelangganObject());
        System.out.println("Nama pelanggan baru " + getPelangganBaru());
        System.out.println("1. Yakin");
        System.out.println("2. Tidak");
    }
}
