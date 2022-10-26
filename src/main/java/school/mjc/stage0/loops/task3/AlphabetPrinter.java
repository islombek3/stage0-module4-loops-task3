package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < abc.length(); i++){
            char c = abc.charAt(i);
            System.out.println(c);
        }
    }
}
