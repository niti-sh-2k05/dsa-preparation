import java.util.*;

public class sliding_brutforce {

    public static void main(String args[]) {
        int[] ar = { 12, 43, 56, 78, 32, 45 };
        int target = 134;

        int n = ar.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] + ar[j] == target) {
                    System.out.print(i + " " + j);
                }
            }
        }
    }
}