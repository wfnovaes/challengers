package algorithm.peakAndValley;


/*
 * We have a track course with peaks and valleys. Each elevation point is
 * represented as an array element. For example: [0, 1, 5, 7, 8, 6, 2, 0] is a course
 * with one ascent from the sea level and one descent back to the sea level.
 * Given random course data, please calculate total elevation gain, the biggest
 * climb, and the biggest drop.
 *
 * Input: [0, 1, 5, 3, 7, 9, 6, 2, 0]
 * Output: [11, 6, 9]
 *
 * Input: [5, 2, 0, -3, 3, 6, 5, 7, 10]
 * Output: [14, 9, 8]
 *
 * Input:[0,3,2,7]
 * Output: [8,5,2]
 *
 */

public class PeakValley {

    public static int[] resolve(int[] elevations) {
        if (elevations.length == 0) throw new IllegalArgumentException("the argument is invalid.");
        if (elevations.length == 1) return new int[] {0,0,0};

        int t_peaks=0;
        int elevationGain=0;
        int t_valleys=0;

        int peaks=0;
        int valleys=0;
        for(int x = 1; x < elevations.length; x++ ) {
            int currentValue = elevations[x];

            int lastValue = elevations[x-1];
            int difference = currentValue-lastValue;
            if (difference > 0) {
                valleys = 0;
                peaks += difference;
                elevationGain += difference;
                if (peaks > t_peaks) t_peaks = peaks;
            } else {
                peaks = 0;
                valleys += difference * -1;
                if (valleys > t_valleys) t_valleys = valleys;
            }
        }
        return new int[]{elevationGain, t_peaks, t_valleys};
    }

}
