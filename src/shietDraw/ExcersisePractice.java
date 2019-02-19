package shietDraw;

import java.util.Arrays;

public class ExcersisePractice {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 12, 3, 9, 5, 2, 1};
        boolean ifChanges = true;
        do {
            ifChanges = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                int helpfulNumber = 0;
                if (numbers[i] > numbers[i + 1]) {
                    helpfulNumber = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = helpfulNumber;
                    ifChanges = true;
                }
            }
        } while (ifChanges);
        System.out.println(Arrays.toString(numbers));
    }

}
