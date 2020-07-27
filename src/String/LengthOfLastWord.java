package String;//Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
//return the length of last word (last word means the last appearing word if we loop from
//left to right) in the string.

//If the last word does not exist, return 0.

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String [] strArray = s.split(" ");
        if(strArray.length == 0) return 0;
        return strArray[strArray.length-1].length();
    }
}
