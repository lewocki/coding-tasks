package coding.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrandParadTask {

    private static int winRatio = 10;
    private static final Random RANDOM = new Random();
    private static List<Integer> slotContent = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

    /**
     *
     */
    public static void main(String[] args) {
        System.out.println(spin());
        System.out.println(spin());
        System.out.println(spin());
        System.out.println(spin());
        System.out.println(spin());
        System.out.println(spin());
        System.out.println(spin());
    }


    public static List<Integer> spin() {
        int randomValue = RANDOM.nextInt(1000);
        List<Integer> result = new ArrayList<>();
        if (randomValue <= winRatio) {
            int index = RANDOM.nextInt(15);
            result.add(slotContent.get(index));
            result.add(slotContent.get(index));
            result.add(slotContent.get(index));
            System.out.println("YOU WIN!!!");
        } else {
            result.add(slotContent.get(RANDOM.nextInt(15)));
            result.add(slotContent.get(RANDOM.nextInt(15)));
            result.add(slotContent.get(RANDOM.nextInt(15)));
        }
        return result;
    }

    /*

  Using https://sports.williamhill.com/betting/en-gb as your base url,
Navigate to the Football daily list page via the popular section in the left hand sidebar.
Assert that the "Today" tab is active
     */


}
