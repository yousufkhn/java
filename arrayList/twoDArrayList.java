import java.util.Scanner;
import java.util.ArrayList;

public class twoDArrayList {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();

        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < r; i++) {
            array.add(new ArrayList<Integer>());
            for (int j = 0; j < c; j++) {
                array.get(i).add(j, input.nextInt());
            }
        }

        System.out.println(array);

    }
}
