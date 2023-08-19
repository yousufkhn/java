import java.util.*;

public class halfPyramid {
    public static void main(String[] args) {
        String x = "x ";
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
