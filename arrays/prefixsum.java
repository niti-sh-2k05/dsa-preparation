import java.util.*;

public class prefixsum {
    public static void main(String args[]) {
        int[] ar = { 2, 4, 6, 3, 4, 5 };
        int n = ar.length;
        int[] prefixsum = new int[n];

        prefixsum[0] = ar[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + ar[i];
        }
        for (int val : prefixsum) {
            System.out.print(val + " ");
        }
        System.out.println();
        // range values
        int l = 1;
        int r = 4;

        if (l == 0) {
            System.out.println(prefixsum[r]);
        } else {
            System.out.println(prefixsum[r] - prefixsum[l - 1]);
        }
    }
}