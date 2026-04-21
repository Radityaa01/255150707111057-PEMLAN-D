
public class Hewann implements MakhlukHidup { 
    private String nama; 
    private int umur; 

    // Konstruktor dengan parameter nama dan umur
    public Hewann(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override 
    public void makan() { 
        System.out.println("Makan pakai tangan dan mulut"); 
    } 
    @Override 
    public void berjalan() { 
        System.out.println("Jalan pakai 4 kaki"); 
    } 
    @Override 
    public void bersuara() { 
        System.out.println("Suaranya nggak jelas"); 
    } 

    public void tampilkanNama() {
        System.out.println("Nama hewan: " + this.nama);
    }

    public void tampilkanUmur() {
        System.out.println("Umur hewan: " + this.umur);
    }
}
