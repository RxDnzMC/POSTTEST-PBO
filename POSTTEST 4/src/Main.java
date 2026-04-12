import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Senjata> listSenjata = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- FORGEMASTER (POLYMORPHISM test) ---");
            System.out.println("1. Tambah Senjata Melee");
            System.out.println("2. Tambah Senjata Range");
            System.out.println("3. Lihat Inventaris (tes Override)");
            System.out.println("4. Upgrade Senjata (tes Overload)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int menu = input.nextInt(); input.nextLine();

            if (menu == 1) {
                System.out.print("Nama Pedang: "); String n = input.nextLine();
                System.out.print("Damage: "); int d = input.nextInt(); input.nextLine();
                System.out.print("Bahan (Besi/Baja): "); String m = input.nextLine();
                listSenjata.add(new SenjataMelee(n, d, m));
            }
            else if (menu == 2) {
                System.out.print("Nama Busur: "); String n = input.nextLine();
                System.out.print("Damage: "); int d = input.nextInt();
                System.out.print("Jarak Tembak (m): "); int j = input.nextInt();
                listSenjata.add(new SenjataRange(n, d, j));
            }
            else if (menu == 3) {
                for (Senjata s : listSenjata) {
                    s.tampilkanInfo(); // panggil method yang di-override
                }
            }
            else if (menu == 4) {
                System.out.print("Pilih nomor senjata: ");
                int idx = input.nextInt() - 1;
                System.out.print("Tipe Upgrade (1: Biasa+5, 2: Custom): ");
                int tipe = input.nextInt();
                if (tipe == 1) listSenjata.get(idx).upgrade(); // overload 1
                else {
                    System.out.print("Masukkan bonus damage: ");
                    int bonus = input.nextInt();
                    listSenjata.get(idx).upgrade(bonus); // overload 2
                }
                System.out.println("Senjata berhasil diperkuat!");
            }
            else if (menu == 5) break;
        }
    }
}