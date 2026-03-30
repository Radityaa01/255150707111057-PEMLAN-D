import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nilai 1 (string) : ");
        String nil1 = in.next();
        System.out.print("masukkan nilai 2 (string) : ");
        String nil2 = in.next();

        Aritmatika a = new Aritmatika();

        double hasil = a.hitungPembagian(nil1, nil2);
        System.out.println("hasil pembagian adalah : " + hasil);
    }
}