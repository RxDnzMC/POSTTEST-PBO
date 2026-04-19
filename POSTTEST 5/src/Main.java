import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Senjata> listSenjata = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- FORGEMASTER PRO (Abstract & Interface) ---");
            System.out.println("1. Tambah Senjata Melee");
            System.out.println("2. Tambah Senjata Range");
            System.out.println("3. Lihat Inventaris & Tes Serang (Abstract)");
            System.out.println("4. Upgrade Senjata (Overload)");
            System.out.println("5. Tempa Ulang / Reforge (Interface)");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            int menu = input.nextInt(); input.nextLine();

            if (menu == 1) {
                System.out.print("Nama Pedang: "); String n = input.nextLine();
                System.out.print("Damage: "); int d = input.nextInt(); input.nextLine();
                System.out.print("Bahan: "); String m = input.nextLine();
                listSenjata.add(new SenjataMelee(n, d, m));
            }
            else if (menu == 2) {
                System.out.print("Nama Busur: "); String n = input.nextLine();
                System.out.print("Damage: "); int d = input.nextInt();
                System.out.print("Jarak: "); int j = input.nextInt();
                listSenjata.add(new SenjataRange(n, d, j));
            }
            else if (menu == 3) {
                for (Senjata s : listSenjata) {
                    s.tampilkanInfo();
                    s.serang(); // Memanggil abstract method
                }
            }
            else if (menu == 4) {
                System.out.print("Nomor senjata: "); int idx = input.nextInt() - 1;
                listSenjata.get(idx).upgrade();
                System.out.println("Upgrade berhasil!");
            }
            else if (menu == 5) {
                System.out.print("Nomor senjata: "); int idx = input.nextInt() - 1;
                Senjata s = listSenjata.get(idx);
                // Casting ke interface
                if (s instanceof IForgeable) {
                    IForgeable f = (IForgeable) s;
                    f.cekKualitas();
                    f.reforge("Titanium / Super String");
                }
            }
            else if (menu == 6) break;
        }
    }
}