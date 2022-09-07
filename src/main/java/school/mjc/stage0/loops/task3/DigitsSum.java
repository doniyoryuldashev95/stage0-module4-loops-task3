package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numberToString = String.valueOf(t);
        int numb = t;
        int result = 0;
        for (int i = 0; i < numberToString.length(); i++) {
            result+=numb%10;
            numb/=10;
        }
        if (result<0){
            result*=-1;
        }
        System.out.println(result);

    }
}
