public class Senjata {
    protected String nama;
    protected String tipe;
    protected int damage;

    public Senjata(String nama, String tipe, int damage) {
        this.nama = nama;
        this.tipe = tipe;
        this.damage = damage;
    }

    // Getter dan Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getTipe() { return tipe; }
    public void setTipe(String tipe) { this.tipe = tipe; }
    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public void info() {
        System.out.println("Nama   : " + nama);
        System.out.println("Tipe   : " + tipe);
        System.out.println("Damage : " + damage);
    }
}