package Warung;

public class Fitur2 extends User {
    public Fitur2(int totalPelanggan) {
        super(null, null, 0, null, totalPelanggan);
    }

    @Override
    public void footerFitur() {
        System.out.println("Jumlah pelanggan Terkini: " + getTotalPelanggan());

    }
}
