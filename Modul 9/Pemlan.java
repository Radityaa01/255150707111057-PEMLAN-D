class Pemlan extends MataKuliah {
    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.1) + (kuis * 0.4) + (uts * 0.25) + (uas * 0.25);
    }
}
