package recursion;

public class rec2 {

    static int f(int n) {
        if (n == 0)
            return 0;
        return n + f(n - 1);
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    static void summ(int n, int sum) {
        sum += n;
        if (n == 1) {
            System.out.println(sum);
            return;
        }
        summ(n - 1, sum);
    }

    public static void main(String[] args) {
        summ(5, 0);
        System.out.println(f(5));
        System.out.println(factorial(5));
    }
}
