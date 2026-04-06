import java.time.LocalDate;
import java.time.Period;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; 
    private String nik;
    private boolean menikah;

    public Manusia() {}

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) { this.nama = nama; }
    public void setJenisKelamin(boolean jenisKelamin) { this.jenisKelamin = jenisKelamin; }
    public void setNik(String nik) { this.nik = nik; }
    public void setMenikah(boolean menikah) { this.menikah = menikah; }

    public String getNama() {
         return nama;
         }
    public boolean getJenisKelamin() {
         return jenisKelamin; 
        }
    public String getNik() { 
        return nik; 
        }
    public boolean getMenikah() { 
        return menikah; 
        }

    public double getTunjangan() {
        if (menikah) return jenisKelamin ? 25 : 20;
        else return 15;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return String.format(
            "nama          : %s\n" +
            "nik           : %s\n" +
            "jenisKelamin  : %s\n" +
            "pendapatan    : %.1f",
            nama, nik, jenisKelamin ? "Laki-laki" : "Perempuan", getPendapatan()
        );
    }
}
