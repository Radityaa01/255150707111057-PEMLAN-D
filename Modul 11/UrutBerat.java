import java.util.Arrays;

public class UrutBerat {
    public static void main(String[] args) {
        int[] beratA = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};
        int[] beratB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

        Arrays.sort(beratA);
        Arrays.sort(beratB);

        System.out.println("=== Berat Badan Tim A Ascending ===");
        for(int i=0; i<beratA.length; i++){
            System.out.printf("%5d\n", beratA[i]);
        }

        System.out.println("\n=== Berat Badan Tim A Descending ===");
        for(int i=beratA.length-1; i>=0; i--){
            System.out.printf("%5d\n", beratA[i]);
        }

        System.out.println("\n=== Berat Badan Tim B Ascending ===");
        for(int i=0; i<beratB.length; i++){
            System.out.printf("%5d\n", beratB[i]);
        }

        System.out.println("\n=== Berat Badan Tim B Descending ===");
        for(int i=beratB.length-1; i>=0; i--){
            System.out.printf("%5d\n", beratB[i]);
        }
    }
}
