package recursion;

public class rec3 {

    static void rev(int[] ar, int l, int r) {

        if (l >= r)
            return;
        int temp = ar[l];
        ar[l] = ar[r];
        ar[r] = temp;
        rev(ar, l + 1, r - 1);
    }

    static int fibonoccii(int n) {
        if (n <= 1)
            return n;
        int flast = fibonoccii(n - 1);
        int slast = fibonoccii(n - 2);
        return flast + slast;
    }

    public static void main(String[] args) {
        int[] ar = { 4, 5, 3, 2, 1, 9 };
        rev(ar, 0, ar.length - 1);
        for (int num : ar)
            System.out.print(num + " ");
        System.out.println();
        System.out.println(fibonoccii(4));
    }
}
