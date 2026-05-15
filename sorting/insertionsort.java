package sorting;

public class insertionsort {
    public static void main(String[] args) {
        int[] ar = { 8, 92, 76, 34, 23, 21 };
        int n = ar.length;
        for (int i = 1; i < n; i++) {
            int key = ar[i];
            int j = i - 1;

            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;
        }
        for (int num : ar)
            System.out.print(num + " ");
    }
}