public class SenjataRange extends Senjata {
    private int jarak;

    public SenjataRange(String nama, int damage, int jarak) {
        super(nama, damage);
        this.jarak = jarak;
    }

    //override
    @Override
    public void tampilkanInfo() {
        System.out.println("[Tipe: Range]");
        super.tampilkanInfo();
        System.out.println("Jarak  : " + jarak + " meter");
        System.out.println("--------------------");
    }
}