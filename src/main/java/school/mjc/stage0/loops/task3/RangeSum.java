package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int i = 0, sum = 0;
        for (i = firstBoarder; i < secondBoarder + 1; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
