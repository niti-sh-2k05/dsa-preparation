package recursion;

public class rec_intro {
    static int cnt = 0;

    static void func() {

        if (cnt == 5) {
            return;
        }
        System.out.println(cnt);
        cnt++;
        func();
    }

    static void name(int n, int s) {
        if (n > s)
            return;
        System.out.println("My name");
        name(n + 1, s);
    }

    static void f(int n, int s) {
        if (n < 0)
            return;
        f(n - 1, s);// if mentioned not to use n+1 ->we use backtracking
        System.out.println(n);
    }

    static void nonlinear(int n) {
        if (n == 0) {
            return;
        }
        nonlinear(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        func();
        name(0, 4);
        f(3, 3);
        nonlinear(5);
    }
}
