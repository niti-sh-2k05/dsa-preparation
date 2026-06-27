import java.util.*;
public class second_largest {
    public static void main(String args[]) {
        int[] ar = { 23, 45, 76, 23, 73 };
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > fmax) {
                fmax = ar[i];
            }
            if (ar[i] > smax && ar[i] != fmax) {
                smax = ar[i];
            }
        }
        System.out.println("Second largest element is: " + smax);
    }
}
