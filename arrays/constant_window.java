import java.util.*;
public class constant_window {
    public static void main(String[] args) {
        int ar[] = { -1, 2, 3, 3, 4, 5, -1 };
        int n = ar.length;

        int k = 4;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + ar[i];
        }
        int maxsum = sum;

        for (int i = k; i < n; i++) {
            sum = sum + ar[i] - ar[i - k];
            maxsum = Math.max(sum, maxsum);
        }
        System.out.println(maxsum);
    }
}
