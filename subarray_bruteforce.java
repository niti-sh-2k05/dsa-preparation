package arrays;

public class subarray_bruteforce {
    public static void main(String[] args) {

        int ar[] = { 2, 5, 1, 7, 10 };
        int n = ar.length;
        int limit = 14;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += ar[j];

                if (sum < limit) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(ar[k] + " ");
                    }
                    System.out.println(" | Sum = " + sum);
                }
            }
        }
    }
}
