import java.util.*;

import java.util.*;

public class balanced_parenthesis {
    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();
        String s = "{}[]()";

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {
                char open = st.peek();
                char close = ch;
                if (open == '{' && close == '}' || open == '[' && close == ']' || open == '(' && close == ')') {
                    st.pop();
                } else {
                    break;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

// import java.util.*;

// class Program {
// public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
// }
// }