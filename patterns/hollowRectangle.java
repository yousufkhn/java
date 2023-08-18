import java.util.*;

public class hollowRectangle {
    public static void main(String[] args) {
        String x = "X ";
        String space = "  ";
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int width = input.nextInt();

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                System.out.println(x.repeat(width));
            } else {
                System.out.println(x + space.repeat(width - 2) + x);
            }
        }
    }
}
