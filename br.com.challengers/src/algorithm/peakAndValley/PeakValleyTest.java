package algorithm.peakAndValley;

import java.util.Arrays;

public class PeakValleyTest {

    public static void main(String[] args) {
        System.out.println("Peak and valley resolver: should response = 11, 6, 9 " + Arrays.toString(PeakValley.resolve(new int[]{0, 1, 5, 3, 7, 9, 6, 2, 0})));
        System.out.println("Peak and valley resolver: should response = 14, 9, 8 " + Arrays.toString(PeakValley.resolve(new int[]{5, 2, 0, -3, 3, 6, 5, 7, 10})));
        System.out.println("Peak and valley resolver: should response = 8,5,1 " + Arrays.toString(PeakValley.resolve(new int[]{0, 3, 2, 7})));
    }

}
