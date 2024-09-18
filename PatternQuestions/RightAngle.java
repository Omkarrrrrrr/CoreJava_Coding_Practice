public class RightAngle {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 0; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // here is code for inverted right angled triangle
        // int invertedHeight = 4;
        // for (int i = invertedHeight; i >= 1;i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }

}

