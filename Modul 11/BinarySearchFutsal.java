import java.util.*;

public class BinarySearchFutsal {
    // Fungsi Binary Search
    public static int binarySearchCount(List<Integer> list, int target) {
        int count = 0;
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (list.get(mid) == target) {
                count++;
                // cek ke kiri
                int i = mid - 1;
                while (i >= 0 && list.get(i) == target) {
                    count++;
                    i--;
                }
                // cek ke kanan
                int j = mid + 1;
                while (j < list.size() && list.get(j) == target) {
                    count++;
                    j++;
                }
                break;
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Data Tim A
        List<Integer> tinggiA = Arrays.asList(168,170,165,168,172,170,169,165,171,166);
        List<Integer> beratA  = Arrays.asList(50,60,56,55,60,70,66,56,72,56);

        // Data Tim B
        List<Integer> tinggiB = Arrays.asList(170,167,165,166,168,175,172,171,168,169);
        List<Integer> beratB  = Arrays.asList(66,60,59,58,58,71,68,68,65,60);

        // Sort data sebelum Binary Search
        Collections.sort(tinggiA);
        Collections.sort(beratA);
        Collections.sort(tinggiB);
        Collections.sort(beratB);

        // b) Cari jumlah pemain Tim B dengan tinggi 168 dan 160
        int count168B = binarySearchCount(tinggiB, 168);
        int count160B = binarySearchCount(tinggiB, 160);

        // c) Cari jumlah pemain Tim A dengan berat 56 dan 53
        int count56A = binarySearchCount(beratA, 56);
        int count53A = binarySearchCount(beratA, 53);

        // d) Cek kesamaan data antara Tim A dan Tim B
        Set<Integer> setTinggiA = new HashSet<>(tinggiA);
        Set<Integer> setBeratA  = new HashSet<>(beratA);
        Set<Integer> setTinggiB = new HashSet<>(tinggiB);
        Set<Integer> setBeratB  = new HashSet<>(beratB);

        setTinggiA.retainAll(setTinggiB); // cari irisan tinggi
        setBeratA.retainAll(setBeratB);   // cari irisan berat

        // Output rapi
        System.out.println("=== Hasil Binary Search ===");
        System.out.printf("Jumlah pemain Tim B dengan tinggi 168 cm : %2d\n", count168B);
        System.out.printf("Jumlah pemain Tim B dengan tinggi 160 cm : %2d\n", count160B);
        System.out.printf("Jumlah pemain Tim A dengan berat 56 kg   : %2d\n", count56A);
        System.out.printf("Jumlah pemain Tim A dengan berat 53 kg   : %2d\n", count53A);

        System.out.println("\n=== Kesamaan Data Tim A dan Tim B ===");
        System.out.printf("Tinggi yang sama : %s\n", setTinggiA.isEmpty() ? "Tidak ada" : setTinggiA);
        System.out.printf("Berat  yang sama : %s\n", setBeratA.isEmpty() ? "Tidak ada" : setBeratA);
    }
}
