package Easy;

public class ExcelSheet {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            System.out.println(n);
            result.insert(0, (char)('A' + n % 26));
            System.out.println(result.toString());
            n /= 26;

            System.out.println(n);
        }

        return result.toString();
    }

    //this one is title to number

    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }


}
