package arrays;

public class check_sort {
    public static void main(String args[]) {
        int[] ar = { 23, 65, 76, 89 };

        boolean flag = true;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < ar[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
