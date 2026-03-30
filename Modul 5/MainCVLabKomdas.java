import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MainCVLabKomdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // format rupiah Indonesia
        NumberFormat rupiah = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("========================================");
        System.out.println("       CV. LABKOMDAS - Penjualan Jaket");
        System.out.println("========================================");

        System.out.println("\nHarga Satuan (Normal):");
        System.out.println("Jaket A : Rp " + rupiah.format(CVLabKomdas.HARGA_A));
        System.out.println("Jaket B : Rp " + rupiah.format(CVLabKomdas.HARGA_B));
        System.out.println("Jaket C : Rp " + rupiah.format(CVLabKomdas.HARGA_C));

        System.out.println("\nCatatan : Diskon berlaku jika beli > 100 buah");
        System.out.println("Jaket A : Rp " + rupiah.format(CVLabKomdas.DISKON_A) + " / biji");
        System.out.println("Jaket B : Rp " + rupiah.format(CVLabKomdas.DISKON_B) + " / biji");
        System.out.println("Jaket C : Rp " + rupiah.format(CVLabKomdas.DISKON_C) + " / biji");
        System.out.println("----------------------------------------");

        // input
        System.out.print("Masukkan jumlah Jaket A yang dibeli : ");
        int a = input.nextInt();
        System.out.print("Masukkan jumlah Jaket B yang dibeli : ");
        int b = input.nextInt();
        System.out.print("Masukkan jumlah Jaket C yang dibeli : ");
        int c = input.nextInt();

        int hargaA = CVLabKomdas.getHargaA(a);
        int hargaB = CVLabKomdas.getHargaB(b);
        int hargaC = CVLabKomdas.getHargaC(c);

        int totalA = a * hargaA;
        int totalB = b * hargaB;
        int totalC = c * hargaC;

        int grandTotal = totalA + totalB + totalC;

        System.out.println("\n========================================");
        System.out.println("           STRUK PEMBELIAN");
        System.out.println("========================================");

        // Jaket A
        System.out.println("Jaket A : " + a + " buah");
        if (a > 100)
            System.out.println("[DISKON] Harga : Rp " + rupiah.format(hargaA) + "/biji");
        else
            System.out.println("Harga : Rp " + rupiah.format(hargaA) + "/biji");
        System.out.println("Total : Rp " + rupiah.format(totalA));

        // Jaket B
        System.out.println("\nJaket B : " + b + " buah");
        if (b > 100)
            System.out.println("[DISKON] Harga : Rp " + rupiah.format(hargaB) + "/biji");
        else
            System.out.println("Harga : Rp " + rupiah.format(hargaB) + "/biji");
        System.out.println("Total : Rp " + rupiah.format(totalB));

        // Jaket C
        System.out.println("\nJaket C : " + c + " buah");
        if (c > 100)
            System.out.println("[DISKON] Harga : Rp " + rupiah.format(hargaC) + "/biji");
        else
            System.out.println("Harga : Rp " + rupiah.format(hargaC) + "/biji");
        System.out.println("Total : Rp " + rupiah.format(totalC));

        System.out.println("----------------------------------------");
        System.out.println("GRAND TOTAL : Rp " + rupiah.format(grandTotal));
    }
}