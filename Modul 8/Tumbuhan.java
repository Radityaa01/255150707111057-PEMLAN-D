
public class Tumbuhan implements MakhlukHidup {
    private String jenis;
    private int tinggi;

    // Konstruktor Tumbuhan
    public Tumbuhan(String jenis, int tinggi) {
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    @Override
    public void makan() {
        System.out.println("Tumbuhan makan dengan fotosintesis menggunakan cahaya matahari.");
    }

    @Override
    public void berjalan() {
        System.out.println("Tumbuhan tidak bisa berjalan, hanya tumbuh di tempat.");
    }

    @Override
    public void bersuara() {
        System.out.println("Tumbuhan tidak bersuara, hanya berdesir saat tertiup angin.");
    }

    public void tampilkanJenis() {
        System.out.println("Jenis tumbuhan: " + this.jenis);
    }

    public void tampilkanTinggi() {
        System.out.println("Tinggi tumbuhan: " + this.tinggi + " cm");
    }
}
