package Warung;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Antrian {
    static ArrayList<String> antrian = new ArrayList<>();
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    public static void main(String[] args) throws IOException {

        while (true) {
            User user = new User(null, null, 0, null, 0);

            user.outputSambutan();
            user.outputFitur();

            int menu = Integer.parseInt(br.readLine());
            if (menu == 1) {

                user.tanyaInputPelanggan();
                String pelanggan = br.readLine();
                Fitur1 objFitur1 = new Fitur1(pelanggan);
                antrian.add(objFitur1.getPelanggan());
                objFitur1.footerFitur();
            } else if (menu == 2) {
                int totalPelanggan = antrian.size();
                Fitur2 objFitur2 = new Fitur2(totalPelanggan);
                objFitur2.footerFitur();

                for (int i = 0; i < totalPelanggan; i++) {
                    int n = i;
                    n++;
                    System.out.println(n + ". " + antrian.get(i));
                }
            } else if (menu == 3) {
                while (true) {
                    user.tanyaUpdateAntrian();
                    int inputNomorAntrian = Integer.parseInt(br.readLine());
                    int idxAntrian = inputNomorAntrian - 1;

                    user.tanyaUpdatePelanggan();
                    String pelangganBaru = br.readLine();

                    Fitur3 objFitur3 = new Fitur3(inputNomorAntrian, antrian.get(idxAntrian), pelangganBaru);

                    objFitur3.footerFitur();
                    int konfirmasi = Integer.parseInt(br.readLine());
                    if (konfirmasi == 1) {
                        antrian.set(idxAntrian, pelangganBaru);
                        objFitur3.setPelangganBaru(pelangganBaru);
                        objFitur3.setNomorAntrian(inputNomorAntrian);
                        objFitur3.setPelangganObject(antrian.get(idxAntrian));
                        break;
                    }
                }
            } else if (menu == 4) {
                while (true) {
                    user.tanyaHapusAntrian();
                    int inputNomorAntrianHapus = Integer.parseInt(br.readLine());
                    int idxAntrianHapus = inputNomorAntrianHapus - 1;

                    Fitur4 objFitur4 = new Fitur4(inputNomorAntrianHapus, antrian.get(idxAntrianHapus));

                    objFitur4.footerFitur();
                    int konfirmasi = Integer.parseInt(br.readLine());
                    if (konfirmasi == 1) {
                        antrian.remove(idxAntrianHapus);
                        break;
                    }
                }
            } else if (menu == 5) {
                System.exit(0);
                System.out.println("Terimakasih");
            } else {
                System.out.println("Menu tidak tersedia");
                System.exit(menu);
            }
        }

    }
}
