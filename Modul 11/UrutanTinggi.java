import java.util.Arrays;

public class UrutanTinggi {
    public static void main(String[] args) {
        int[] tinggiA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
        int[] tinggiB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};

        Arrays.sort(tinggiA);
        Arrays.sort(tinggiB);

        System.out.println("=== Tinggi Badan Tim A Ascending ===");
        for(int i=0; i<tinggiA.length; i++){
            System.out.printf("%5d\n", tinggiA[i]); // %5d = lebar 5, rata kanan
        }

        System.out.println("\n=== Tinggi Badan Tim A Descending ===");
        for(int i=tinggiA.length-1; i>=0; i--){
            System.out.printf("%5d\n", tinggiA[i]);
        }

        System.out.println("\n=== Tinggi Badan Tim B Ascending ===");
        for(int i=0; i<tinggiB.length; i++){
            System.out.printf("%5d\n", tinggiB[i]);
        }

        System.out.println("\n=== Tinggi Badan Tim B Descending ===");
        for(int i=tinggiB.length-1; i>=0; i--){
            System.out.printf("%5d\n", tinggiB[i]);
        }
    }
}
