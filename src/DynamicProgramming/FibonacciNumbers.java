package DynamicProgramming;

public class FibonacciNumbers {
    //dynamic programming top down approach, recursive plus dp
    int[] fib_cache = new int[31];

    public int fib(int N)
    {
        if(N <= 1)
            return N;
        else if(fib_cache[N] != 0)
            return fib_cache[N];
        else
            return fib_cache[N] = fib(N - 1) + fib(N - 2);
    }

    //dynamic programming bottom up approach
//    public int fib(int N)
//    {
//        if(N <= 1)
//            return N;
//
//        int[] fib_cache = new int[N + 1];
//        fib_cache[1] = 1;
//
//        for(int i = 2; i <= N; i++)
//        {
//            fib_cache[i] = fib_cache[i - 1] + fib_cache[i - 2];
//        }
//        return fib_cache[N];
//    }

    //recursive solution
//    public int fib(int N)
//    {
//        if(N <= 1)
//            return N;
//        else
//            return fib(N - 1) + fib(N - 2);
//    }

    //iterative solution
//    public int fib(int N)
//    {
//        if(N <= 1)
//            return N;
//
//        int a = 0, b = 1;
//
//        while(N-- > 1)
//        {
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }
//        return b;
//    }


}
