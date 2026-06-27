import java.util.*;

import java.util.*;

public class selection_sort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = inp.nextInt();
        inp.close();

        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[minindex]) {
                    minindex = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[minindex];
            ar[minindex] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
    }
}
