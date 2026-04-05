import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Senjata> gudang = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n--- INVENTARIS MEDIEVAL (INHERITANCE) ---");
            System.out.println("1. Tambah Senjata Melee");
            System.out.println("2. Tambah Senjata Range");
            System.out.println("3. Lihat Semua Senjata");
            System.out.println("4. Edit Senjata");
            System.out.println("5. Hapus Senjata");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama Pedang: ");
                    String nMelee = input.nextLine();
                    System.out.print("Masukkan Damage: ");
                    int dMelee = input.nextInt();
                    System.out.print("Masukkan Panjang Bilah (cm): ");
                    double panjang = input.nextDouble();
                    gudang.add(new SenjataMelee(nMelee, dMelee, panjang));
                    System.out.println("Berhasil ditambah!");
                    break;

                case 2:
                    System.out.print("Masukkan Nama Busur/Crossbow: ");
                    String nRange = input.nextLine();
                    System.out.print("Masukkan Damage: ");
                    int dRange = input.nextInt();
                    System.out.print("Masukkan Jarak Tembak (m): ");
                    int jarak = input.nextInt();
                    gudang.add(new SenjataRange(nRange, dRange, jarak));
                    System.out.println("Berhasil ditambah!");
                    break;

                case 3:
                    if (gudang.isEmpty()) {
                        System.out.println("Gudang kosong.");
                    } else {
                        for (int i = 0; i < gudang.size(); i++) {
                            System.out.println("No: " + (i + 1));
                            gudang.get(i).info();
                        }
                    }
                    break;

                case 4:
                    // Logika Edit menggunakan Setter tetap sama
                    System.out.print("Masukkan nomor yang mau diedit: ");
                    int idxEdit = input.nextInt() - 1;
                    if (idxEdit >= 0 && idxEdit < gudang.size()) {
                        input.nextLine();
                        System.out.print("Nama baru: ");
                        gudang.get(idxEdit).setNama(input.nextLine());
                        System.out.print("Damage baru: ");
                        gudang.get(idxEdit).setDamage(input.nextInt());
                        System.out.println("Data berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak ditemukan");
                    }
                    break;

                case 5:
                    System.out.print("Masukkan nomor yang mau dihapus: ");
                    int idxHapus = input.nextInt() - 1;
                    if (idxHapus >= 0 && idxHapus < gudang.size()) {
                        gudang.remove(idxHapus);
                        System.out.println("Berhasil dihapus");
                    } else {
                        System.out.println("Nomor tidak ditemukan");
                    }
                    break;
            }
        } while (menu != 6);
    }
}