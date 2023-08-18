import java.util.*;

class fizzBuzz {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}