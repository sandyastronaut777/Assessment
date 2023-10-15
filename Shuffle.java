//Q.1: Create an array with the values(1, 2, 3, 4, 5, 6, 7) and shuffle it.

//Code: 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        Collections.shuffle(list);

        array = list.toArray(new Integer[0]);

        System.out.println("Shuffled array: " + Arrays.toString(array));
    }
}

