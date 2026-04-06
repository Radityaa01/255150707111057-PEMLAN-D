import java.time.LocalDate;
import java.time.Period;

class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) return 50;
        else if (ipk > 3.5 && ipk <= 4.0) return 75;
        else return 0;
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2); 
        char prodiCode = nim.charAt(6);
        switch (prodiCode) {
            case '2': return "Teknik Informatika, " + angkatan;
            case '3': return "Teknik Komputer, " + angkatan;
            case '4': return "Sistem Informasi, " + angkatan;
            case '6': return "Pendidikan Teknologi Informasi, " + angkatan;
            case '7': return "Teknologi Informasi, " + angkatan;
            default: return "Prodi tidak diketahui, " + angkatan;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            String.format(
                "nim           : %s\n" +
                "ipk           : %.1f\n" +
                "status        : %s",
                nim, ipk, getStatus()
            );
    }
}

