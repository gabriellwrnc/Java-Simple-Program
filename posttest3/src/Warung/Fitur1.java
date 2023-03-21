package Warung;

public class Fitur1 extends User {
    public Fitur1(String pelanggan) {
        super(pelanggan, null, 0, null);
    }

    void fitur1Sukses() {
        System.out.println(getPelanggan() + " Telah masuk kedalam antrian");
    }
}
