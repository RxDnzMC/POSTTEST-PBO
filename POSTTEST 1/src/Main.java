import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Senjata> gudang = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int menu;

        while (true) {
            System.out.println("\n--- INVENTARIS SENJATA MEDIEVAL ---");
            System.out.println("1. Tambah Senjata");
            System.out.println("2. Lihat Semua Senjata");
            System.out.println("3. Edit Senjata");
            System.out.println("4. Hapus Senjata");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); //untuk gak error pas input string setelah int

            if (menu == 1) {
                System.out.print("Masukkan Nama Senjata: ");
                String nama = input.nextLine();
                System.out.print("Masukkan Tipe (Pedang/Panah/Kapak): ");
                String tipe = input.nextLine();
                System.out.print("Masukkan Damage: ");
                int dmg = input.nextInt();

                Senjata senjataBaru = new Senjata(nama, tipe, dmg);
                gudang.add(senjataBaru);
                System.out.println("Berhasil ditambah");

            } else if (menu == 2) {
                if (gudang.isEmpty()) {
                    System.out.println("Gudang lagi kosong.");
                } else {
                    System.out.println("\nDaftar Senjata:");
                    for (int i = 0; i < gudang.size(); i++) {
                        System.out.println("No: " + (i + 1));
                        gudang.get(i).info();
                    }
                }

            } else if (menu == 3) {
                System.out.print("Masukkan nomor senjata yang mau diedit: ");
                int index = input.nextInt() - 1;
                input.nextLine();

                if (index >= 0 && index < gudang.size()) {
                    System.out.print("Nama baru: ");
                    gudang.get(index).nama = input.nextLine();
                    System.out.print("Tipe baru: ");
                    gudang.get(index).tipe = input.nextLine();
                    System.out.print("Damage baru: ");
                    gudang.get(index).damage = input.nextInt();
                    System.out.println("Data berhasil diubah!");
                } else {
                    System.out.println("Nomor tidak ketemu");
                }

            } else if (menu == 4) {
                System.out.print("Masukkan nomor senjata yang mau dihapus: ");
                int index = input.nextInt() - 1;

                if (index >= 0 && index < gudang.size()) {
                    gudang.remove(index);
                    System.out.println("Senjata berhasil dibuang");
                } else {
                    System.out.println("Nomor tidak ketemu");
                }

            } else if (menu == 5) {
                System.out.println("Keluar dari program");
                break;
            } else {
                System.out.println("Pilihan anda salah!");
            }
        }
    }
}