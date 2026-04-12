public class SenjataMelee extends Senjata {
    private String material;

    public SenjataMelee(String nama, int damage, String material) {
        super(nama, damage);
        this.material = material;
    }

    //OVERRIDE
    @Override
    public void tampilkanInfo() {
        System.out.println("[Tipe: Melee]");
        super.tampilkanInfo();
        System.out.println("Bahan  : " + material);
        System.out.println("--------------------");
    }
}