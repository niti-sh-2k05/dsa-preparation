import java.util.*;
class kadane_algorithm {
    public static void main(String args[]) {
        int ar[] = { 5, 4, -1, 7, 8 };
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            cursum += ar[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        System.out.println(maxsum);
    }
}