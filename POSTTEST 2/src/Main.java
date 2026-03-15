import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Senjata> gudang = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int menu;

        while (true) {
            System.out.println("\n--- INVENTARIS MEDIEVAL ---");
            System.out.println("1. Tambah Senjata");
            System.out.println("2. Lihat Semua Senjata");
            System.out.println("3. Edit Senjata (Gunakan Setter)");
            System.out.println("4. Hapus Senjata");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan Nama Senjata: ");
                String nama = input.nextLine();
                System.out.print("Masukkan Tipe: ");
                String tipe = input.nextLine();
                System.out.print("Masukkan Damage: ");
                int dmg = input.nextInt();

                gudang.add(new Senjata(nama, tipe, dmg));
                System.out.println("Berhasil ditambah");

            } else if (menu == 2) {
                if (gudang.isEmpty()) {
                    System.out.println("Gudang kosong.");
                } else {
                    for (int i = 0; i < gudang.size(); i++) {
                        System.out.println("No: " + (i + 1));
                        gudang.get(i).info();
                    }
                }

            } else if (menu == 3) {
                System.out.print("Masukkan nomor yang mau diedit: ");
                int index = input.nextInt() - 1;
                input.nextLine();

                if (index >= 0 && index < gudang.size()) {
                    System.out.print("Nama baru: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Tipe baru: ");
                    String tipeBaru = input.nextLine();
                    System.out.print("Damage baru: ");
                    int dmgBaru = input.nextInt();

                    // ini Setter untuk mengubah data
                    gudang.get(index).setNama(namaBaru);
                    gudang.get(index).setTipe(tipeBaru);
                    gudang.get(index).setDamage(dmgBaru);

                    System.out.println("Data berhasil diubah melalui Setter!");
                } else {
                    System.out.println("Nomor tidak ditemukan");
                }

            } else if (menu == 4) {
                System.out.print("Masukkan nomor yang mau dihapus: ");
                int index = input.nextInt() - 1;
                if (index >= 0 && index < gudang.size()) {
                    gudang.remove(index);
                    System.out.println("Berhasil dihapus");
                }
            } else if (menu == 5) {
                break;
            }
        }
    }
}