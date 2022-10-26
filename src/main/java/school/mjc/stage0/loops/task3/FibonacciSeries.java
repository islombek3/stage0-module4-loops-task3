package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int val = 0;
        int[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        for (int i = 0; i < lastFibonacci; i++){
            val = fib[i];
            System.out.println(val);
        } 
    }
}
