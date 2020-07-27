import DynamicProgramming.CoinsChange;

//234
//4567

public class Main {
    public static void main (String [] args) {
         CoinsChange change = new CoinsChange();
         change.coinChange(new int []{1,3,5,15}, 21);
    }
}
