
public class Alien implements MakhlukHidup {
    private String planetAsal;
    private int jumlahTentakel;

    // Konstruktor Alien
    public Alien(String planetAsal, int jumlahTentakel) {
        this.planetAsal = planetAsal;
        this.jumlahTentakel = jumlahTentakel;
    }

    @Override
    public void makan() {
        System.out.println("Alien makan dengan menyerap energi kosmik.");
    }

    @Override
    public void berjalan() {
        System.out.println("Alien berjalan melayang tanpa kaki.");
    }

    @Override
    public void bersuara() {
        System.out.println("Alien bersuara dengan frekuensi ultrasonik.");
    }

    public void tampilkanPlanetAsal() {
        System.out.println("Planet asal: " + this.planetAsal);
    }

    public void tampilkanTentakel() {
        System.out.println("Jumlah tentakel: " + this.jumlahTentakel);
    }
}
