package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int ul_sum_10 = 1, sum;
        if (lengthOfLastNumber<0){
            System.out.println(0);
        } else {
            for (int i = 0; i < lengthOfLastNumber; i++) {
                ul_sum_10 = ul_sum_10 * 10;
            }
            sum = (10 * (ul_sum_10 - 1)) / 9 - lengthOfLastNumber;
            System.out.println(sum);
        }
    }
}
