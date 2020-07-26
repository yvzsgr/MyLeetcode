public class IsPalindrome {
    public boolean isPalindrome(int x){
        int reverseX = 0;
        int input = x;
        while(x>0){
            reverseX = reverseX*10 + (x % 10);
            System.out.println(reverseX);
            x = x/10;
        }
        return reverseX==input;
    }
}
