package Easy;//The count-and-say sequence is the sequence of integers with the first five terms as following:
//
//        1.     1
//        2.     11
//        3.     21
//        4.     1211
//        5.     111221
//        1 is read off as "one 1" or 11.
//        11 is read off as "two 1s" or 21.
//        21 is read off as "one 2, then one 1" or 1211.

//Input: 4
//Output: "1211"
//Explanation: For n = 3 the term was "21" in which we have two groups "2" and "1", "2" can be read as "12"
//which means frequency = 1 and value = 2, the same way "1" is read as "11", so the answer is the concatenation
//of "12" and "11" which is "1211".


public class CountAndSay {

    public String countAndSay(int n) {
        StringBuilder curr=new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        for (int i=1;i<n;i++){
            prev=curr;
            curr=new StringBuilder();
            count=1;
            say=prev.charAt(0);

            for (int j=1,len=prev.length();j<len;j++){
                if (prev.charAt(j)!=say){
                    curr.append(count).append(say);
                    count=1;
                    say=prev.charAt(j);
                }
                else count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }

}
