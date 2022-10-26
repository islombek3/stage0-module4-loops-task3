package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber < 0){ 
            System.out.println(0); 
        } else {
            String nine = "9"; //min
            String val = nine.repeat(lengthOfLastNumber); //max
            int sum = 0;
            for (int i = val.length(); i >= nine.length(); i--){
                String s = nine.repeat(i);
                int a = Integer.parseInt(s);
                sum += a;
            }
            System.out.println(sum);
        }
    }
}
