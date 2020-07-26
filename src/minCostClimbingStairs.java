public class minCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int firstStep = cost[0];
        int secondStep = cost[1];
        int result = Math.min(firstStep, secondStep);

        for (int i = 2; i <= cost.length; i++) {
            int c = (i == cost.length)? 0: cost[i];
            result = Math.min(firstStep, secondStep) + c;
            //result = Math.min(firstStep + c, secondStep + c);
            firstStep = secondStep;
            secondStep = result;
        }

        return result;
    }


}
