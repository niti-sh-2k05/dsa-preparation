import java.util.*;
class max_min {
    public static void main(String args[]) {
        int[] ar = { 10, 20, 34, 54, 76, 34, 65 };
        int max = ar[0];
        int min = ar[0];

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }
}