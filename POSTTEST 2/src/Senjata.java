public class Senjata {
    // ini Access Modifier 'private' (Encapsulation)
    private String nama;
    private String tipe;
    private int damage;

    // Constructor tetap dibikin public agar bisa dipanggil di Main.java
    public Senjata(String nama, String tipe, int damage) {
        this.nama = nama;
        this.tipe = tipe;
        this.damage = damage;
    }

    // ini Method Getter
    public String getNama() {
        return nama;
    }

    public String getTipe() {
        return tipe;
    }

    public int getDamage() {
        return damage;
    }

    // ini Method Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void info() {
        System.out.println("Nama   : " + this.nama);
        System.out.println("Tipe   : " + this.tipe);
        System.out.println("Damage : " + this.damage);
        System.out.println("--------------------");
    }
}