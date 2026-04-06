class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * superPendapatanGaji());
    }

    private double superPendapatanGaji() {
        return super.getPendapatan() - super.getTunjangan() - (getBonus()) - (20 * 0); // simplifikasi
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            String.format("departemen    : %s", departemen);
    }
}