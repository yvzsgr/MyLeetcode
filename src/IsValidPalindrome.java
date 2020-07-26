public class IsValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        s = s.replaceAll("\\s","");
        System.out.println(s);
        if(s.length() == 0) return true;
        int forwardPointer = 0;
        int backwardPointer = s.length()-1;
        while(backwardPointer>forwardPointer){
            if(!(s.charAt(forwardPointer) == s.charAt(backwardPointer))){
                return false;
            }
            backwardPointer--;
            forwardPointer++;
        }
        return true;
    }
}
