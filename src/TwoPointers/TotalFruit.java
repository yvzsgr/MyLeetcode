package TwoPointers;

//What is the length of longest subarray that contains up to two distinct fruit

public class TotalFruit {


    public int totalFruit(int[] tree) {
        // track last two fruits seen
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currMax = 0;
        int max = 0;

        for (int fruit : tree) {
            if (fruit == lastFruit || fruit == secondLastFruit)
                currMax++;
            else
                currMax = lastFruitCount + 1; // last fruit + new fruit

            if (fruit == lastFruit)
                lastFruitCount++;
            else
                lastFruitCount = 1;

            if (fruit != lastFruit) {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            max = Math.max(max, currMax);
        }

        return max;
    }
}
