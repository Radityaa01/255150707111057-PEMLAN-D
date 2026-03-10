import java.util.*;
public class BankMain {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BankIndo bank = new BankIndo(
      "Raditya Maulana Ahmad",
      "1234567890",
      "password_123",
      8000000
    );

    int pilihan;
    do {
      System.out.println("=== Menu Bank ===");
      System.out.println("1. Cek Saldo");
      System.out.println("2. Tambah Saldo");
      System.out.println("3. Ambil Saldo");
      System.out.println("4. Tampilkan Info Nasabah");
      System.out.println("5. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = input.nextInt();
      input.nextLine(); 

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan password: ");
          String password = input.nextLine();
          if (bank.cekPassword(password)) {
            bank.displayInfo();
          } else {
            System.out.println("Password salah.");
          }
          break;
        case 2:
          System.out.print("Masukkan jumlah yang ingin ditambahkan: ");
          double jumlahTambah = input.nextDouble();
          bank.tambahSaldo(jumlahTambah);
          break;
        case 3:
          System.out.print("Masukkan jumlah yang ingin diambil: ");
          double jumlahAmbil = input.nextDouble();
          input.nextLine(); // Clear the newline
          System.out.print("Masukkan kata sandi: ");
          String kataSandi = input.nextLine();
          if (bank.cekPassword(kataSandi)) {
            bank.ambilSaldo(jumlahAmbil);
          } else {
            System.out.println("Kata sandi salah.");
          }
          break;
        case 4:
          bank.displayInfo();
          break;
        case 5:
          System.out.println("Terima kasih telah menggunakan layanan kami.");
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }
    } while (pilihan != 5);
}
}