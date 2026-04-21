
import java.util.Scanner;

public class MainIdentitas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input untuk Manusia
        System.out.print("Masukkan nama manusia: ");
        String namaManusia = input.nextLine();
        System.out.print("Masukkan umur manusia: ");
        int umurManusia = input.nextInt();
        input.nextLine();
        Manusiaa m = new Manusiaa(namaManusia, umurManusia);

        // Input untuk Hewan
        System.out.print("Masukkan nama hewan: ");
        String namaHewan = input.nextLine();
        System.out.print("Masukkan umur hewan: ");
        int umurHewan = input.nextInt();
        input.nextLine();
        Hewann h = new Hewann(namaHewan, umurHewan);

        // Input untuk Robot
        System.out.print("Masukkan model robot: ");
        String modelRobot = input.nextLine();
        System.out.print("Masukkan tahun produksi robot: ");
        int tahunRobot = input.nextInt();
        input.nextLine();
        Robot r = new Robot(modelRobot, tahunRobot);

        // Input untuk Alien
        System.out.print("Masukkan planet asal alien: ");
        String planetAlien = input.nextLine();
        System.out.print("Masukkan jumlah tentakel alien: ");
        int tentakelAlien = input.nextInt();
        input.nextLine();
        Alien a = new Alien(planetAlien, tentakelAlien);

        // Input untuk Tumbuhan
        System.out.print("Masukkan jenis tumbuhan: ");
        String jenisTumbuhan = input.nextLine();
        System.out.print("Masukkan tinggi tumbuhan (cm): ");
        int tinggiTumbuhan = input.nextInt();
        Tumbuhan t = new Tumbuhan(jenisTumbuhan, tinggiTumbuhan);

        System.out.println("\n=== Data Manusia ===");
        m.makan();
        m.berjalan();
        m.bersuara();
        m.tampilkanNama();
        m.tampilkanUmur();

        System.out.println("\n=== Data Hewan ===");
        h.makan();
        h.berjalan();
        h.bersuara();
        h.tampilkanNama();
        h.tampilkanUmur();

        System.out.println("\n=== Data Robot ===");
        r.makan();
        r.berjalan();
        r.bersuara();
        r.tampilkanModel();
        r.tampilkanTahunProduksi();

        System.out.println("\n=== Data Alien ===");
        a.makan();
        a.berjalan();
        a.bersuara();
        a.tampilkanPlanetAsal();
        a.tampilkanTentakel();

        System.out.println("\n=== Data Tumbuhan ===");
        t.makan();
        t.berjalan();
        t.bersuara();
        t.tampilkanJenis();
        t.tampilkanTinggi();

        input.close();
    }
}
