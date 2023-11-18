import java.util.Collections;
import java.util.ArrayList;

class reverseArrayList {
    public static void main(String args[]) {
        ArrayList<String> originalList = new ArrayList<String>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Grapes");

        System.out.println("Original List: " + originalList);

        Collections.reverse(originalList);

        System.out.println("Reversed List: " + originalList);

    }

}