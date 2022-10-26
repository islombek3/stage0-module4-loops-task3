package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        for (int i = 100; i > 2; i--){
            if (first % i == 0 && second % i == 0){
                int gcd = i;
                System.out.println(gcd);
                break;
            }
        }
    }
}
