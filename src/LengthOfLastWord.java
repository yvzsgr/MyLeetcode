public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String [] strArray = s.split(" ");
        if(strArray.length == 0) return 0;
        return strArray[strArray.length-1].length();
    }
}
