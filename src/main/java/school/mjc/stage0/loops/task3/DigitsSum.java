package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if(t < 0){t *= -1;}
        String str = "" + t;
        int sum = 0; 
        for (int i = 0; i < str.length(); i++){
            char chr = str.charAt(i);
            int digit = Character.getNumericValue(chr);
            sum += digit;
        }
        printSum(sum);
    }
    public void printSum(int sum){
        System.out.println(sum);
    }
}
