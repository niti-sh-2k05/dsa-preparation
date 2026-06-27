import java.util.*;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        String wrd = "Hello world";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wrd.length(); i++) {
            st.push(wrd.charAt(i));
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
    }
}