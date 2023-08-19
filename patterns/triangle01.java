import java.util.*;

public class triangle01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int toggle = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(toggle + " ");
                toggle = (toggle == 0 ? 1 : 0);
            }
            System.out.println();
        }
        input.close();
    }
}
