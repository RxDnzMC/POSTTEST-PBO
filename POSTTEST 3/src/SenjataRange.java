public class SenjataRange extends Senjata {
    private int jarakTembak; // Atribut khusus Range

    public SenjataRange(String nama, int damage, int jarakTembak) {
        super(nama, "Range (Jarak Jauh)", damage);
        this.jarakTembak = jarakTembak;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jarak Tembak: " + jarakTembak + " meter");
        System.out.println("--------------------");
    }
}