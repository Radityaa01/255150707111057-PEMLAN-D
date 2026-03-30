public class CVLabKomdas {

    public static final int HARGA_A = 100000;
    public static final int HARGA_B = 125000;
    public static final int HARGA_C = 175000;

    public static final int DISKON_A = 95000;
    public static final int DISKON_B = 120000;
    public static final int DISKON_C = 160000;

    public static int getHargaA(int jumlah) {
        return (jumlah > 100) ? DISKON_A : HARGA_A;
    }

    public static int getHargaB(int jumlah) {
        return (jumlah > 100) ? DISKON_B : HARGA_B;
    }

    public static int getHargaC(int jumlah) {
        return (jumlah > 100) ? DISKON_C : HARGA_C;
    }
}