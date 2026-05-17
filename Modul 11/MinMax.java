import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] tinggiA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
        int[] beratA  = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};
        int[] tinggiB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};
        int[] beratB  = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

        Arrays.sort(tinggiA);
        Arrays.sort(beratA);
        Arrays.sort(tinggiB);
        Arrays.sort(beratB);

        System.out.printf("Tinggi Tim A -> Min:%5d | Max:%5d\n", tinggiA[0], tinggiA[tinggiA.length-1]);
        System.out.printf("Berat  Tim A -> Min:%5d | Max:%5d\n", beratA[0], beratA[beratA.length-1]);
        System.out.printf("Tinggi Tim B -> Min:%5d | Max:%5d\n", tinggiB[0], tinggiB[tinggiB.length-1]);
        System.out.printf("Berat  Tim B -> Min:%5d | Max:%5d\n", beratB[0], beratB[beratB.length-1]);
    }
}
