public class Unit2Task8 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < (3 - i); j++) {
                System.out.print(" ");
            }
            for (int m = 0; m < (i + 1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 0; k < 4; k++) {
            for (int n = 0; n < k; n++) {
                System.out.print(" ");
            }
            for (int l = k; l < 4; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
