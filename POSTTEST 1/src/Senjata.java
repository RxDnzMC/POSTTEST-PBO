public class Senjata {
    public String nama;
    public String tipe;
    public int damage;

    // buat bikin senjata baru
    public Senjata(String nama, String tipe, int damage) {
        this.nama = nama;
        this.tipe = tipe;
        this.damage = damage;
    }

    // buat nampilin info senjata
    public void info() {
        System.out.println("Nama   : " + nama);
        System.out.println("Tipe   : " + tipe);
        System.out.println("Damage : " + damage);
        System.out.println("--------------------");
    }
}