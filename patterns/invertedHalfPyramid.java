import java.util.*;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
