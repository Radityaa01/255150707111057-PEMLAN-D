public class MainMahasiswaFILKOM {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", true, "111", true);
        System.out.println(a + "\n");

        MahasiswaFILKOM b = new MahasiswaFILKOM("251501300111100", 3.8, "B", "112", false, false);
        System.out.println(b + "\n");

        Pekerja c = new Pekerja(1000, 2016, 3, 2, 4, "C", "113", true, true);
        System.out.println(c + "\n");

        Manager d = new Manager("HRD", 1000, 2017, 1, 2, 3, "D", "114", true, true);
        System.out.println(d + "\n");
    }
}