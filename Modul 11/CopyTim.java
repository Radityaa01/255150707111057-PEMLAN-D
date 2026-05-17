public class CopyTim {
    public static void main(String[] args) {
        int[] tinggiB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};
        int[] beratB  = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

        int[] tinggiC = tinggiB.clone();
        int[] beratC  = beratB.clone();

        System.out.println("=== Data Tim C (Copy dari Tim B) ===");
        System.out.printf("%-10s %10s %10s\n", "Pemain", "Tinggi", "Berat"); // header
        for(int i=0; i<tinggiC.length; i++){
            System.out.printf("%-10s %10d %10d\n", "Pemain "+(i+1), tinggiC[i], beratC[i]);
        }
    }
}
