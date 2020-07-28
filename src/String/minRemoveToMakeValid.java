package String;

import java.util.Stack;

public class minRemoveToMakeValid {
    public String minRemoveToMakeValid(String s) {

        //this solution is using stack. This has good trick by using * as placeholder.
        // In real life, we do not know whether given string consist of * or not
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == '(') st.add(i);
            if (sb.charAt(i) == ')') {
                if (!st.empty()) st.pop();
                else sb.setCharAt(i, '*');//nice trick
            }
        }
        while (!st.empty())
            sb.setCharAt(st.pop(), '*');
        return sb.toString().replaceAll("\\*", "");


        //this solution is without space holder but using deleteChar which cost O(N) and make this solution O(N2)
//        StringBuilder sb = new StringBuilder(s);
//        Stack<Integer> st = new Stack();
//        for (int i = 0; i < sb.length(); ++i) {
//            if (sb.charAt(i) == '(') st.add(i + 1);
//            if (sb.charAt(i) == ')') {
//                if (!st.empty() && st.peek() >= 0) st.pop();
//                else st.add(-(i + 1));
//            }
//        }
//        while (!st.empty())
//            sb.deleteCharAt(Math.abs(st.pop()) - 1);
//        return sb.toString();

        //another solution without place holder and deleteChar
//        StringBuilder sb = new StringBuilder(s), sb1 = new StringBuilder();
//        Stack<Integer> st = new Stack();
//        for (int i = 0; i < sb.length(); ++i) {
//            if (sb.charAt(i) == '(') st.add(i + 1);
//            if (sb.charAt(i) == ')') {
//                if (!st.empty() && st.peek() >= 0) st.pop();
//                else st.add(-(i + 1));
//            }
//        }
//        for(int i = 0, j = 0; i < sb.length(); ++i) {
//            if (j >= st.size() || i != Math.abs(st.elementAt(j)) - 1) {
//                sb1.append(sb.charAt(i));
//            } else ++j;
//        }
//        return sb1.toString();


        //This solution is not using Stack,
//        StringBuilder sb = new StringBuilder();
//        int open = 0;
//        for (char c : s.toCharArray()) {
//            if (c == '(')
//                open++;
//            else if (c == ')') {
//                if (open == 0) continue;
//                open--;
//            }
//            sb.append(c);
//        }
//
//        StringBuilder result = new StringBuilder();
//        for (int i = sb.length() - 1; i >= 0; i--) {
//            if (sb.charAt(i) == '(' && open-- > 0) continue;
//            result.append(sb.charAt(i));
//        }
//
//        return result.reverse().toString();

    }
}
