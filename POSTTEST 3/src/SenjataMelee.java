public class SenjataMelee extends Senjata {
    private double panjangBilah; // Atribut khusus Melee

    public SenjataMelee(String nama, int damage, double panjangBilah) {
        super(nama, "Melee (Jarak Dekat)", damage);
        this.panjangBilah = panjangBilah;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Panjang Bilah: " + panjangBilah + " cm");
        System.out.println("--------------------");
    }
}