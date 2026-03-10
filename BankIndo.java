 class BankIndo {
 private double saldo;
 private String nama;
 private String noRekening;
 private String password;


 public BankIndo(String nama, String noRekening, String password, double saldo) {
     this.nama = nama;
     this.noRekening = noRekening;
     this.password = password;
     this.saldo = saldo;
 }
 public boolean cekPassword(String inputPassword) {
     return this.password.equals(inputPassword);
 }
  public void tambahSaldo(double jumlah) {
      saldo += jumlah;
      System.out.println("Saldo berhasil ditambahkan.");
      System.out.println("Saldo saat ini: " + saldo);
  }
  public void ambilSaldo(double jumlah) {
      if (jumlah > saldo) {
          System.out.println("Saldo tidak mencukupi.");
      } else {
          saldo -= jumlah;
          System.out.println("Saldo berhasil diambil.");
          System.out.println("Saldo saat ini: " + saldo);
      }
  }
  public void displayInfo() {
      System.out.println("Nama Nasabah: " + nama);
      System.out.println("No Rekening: " + noRekening);
      System.out.println("Saldo: " + saldo);
  }
}


// nama min 4 huruf //
  // no rekenging tidak boleh lebih dari 10 karakter//
  //passaword min 8 karakter harus ada karakter undsecore//
  // saat pengambilan saldo harus ada kata snadi yang di masukan//
  // saat pengambilan tidak boleh lebih dari saldo//
