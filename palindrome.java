package strings;

public class palindrome {
    public static void main(String[] args) {
        boolean ispalindrome = true;
        String wrd = "madam";
        for (int i = 0; i < wrd.length() / 2; i++) {
            if (wrd.charAt(i) != wrd.charAt(wrd.length() - 1 - i)) {
                ispalindrome = false;
                break;
            }
        }
        System.out.println(ispalindrome);
    }
}
