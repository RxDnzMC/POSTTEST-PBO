public class Senjata {
    protected String nama;
    protected int damage;

    public Senjata(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }

    //Upgrade otomatis
    public void upgrade() {
        this.damage += 5;
    }

    //Upgrade dengan nilai spesifik
    public void upgrade(int tambahan) {
        this.damage += tambahan;
    }

    //Method yang dioverride
    public void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Damage : " + damage);
    }
}