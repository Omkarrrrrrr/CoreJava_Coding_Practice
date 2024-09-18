public class PyramidPattern {
    public static void main(String[] args) {
        int levels = 4;
        for (int i = 1; i <= levels; i++) {
            for (int j = levels; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
