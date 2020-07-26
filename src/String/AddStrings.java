package String;//Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
//Let's assume the input are below
//String first = "123";
//String second = "348";
//  3+8 --> sum = 11 carry -->1 and append -->1
//  2+4+1 --> sum 7  carry -->0 amd append -->7
//  3+1   --> sum 4 carry --> 0 and append 4
// then reverse string and you will get 471

//edge cases
//   - check when the length of the string different  "23" and "348"
//   - clarify whether there is 0 in front of the number or not




public class AddStrings {

    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) { //this allows until the bigger number goes to end
            int n1 = 0, n2 = 0;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
            }
            if (j >= 0) {
                n2 = num2.charAt(j) - '0';
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
