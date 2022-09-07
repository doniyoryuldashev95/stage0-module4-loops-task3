package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = 0;
        if (firstBoarder==secondBoarder){
            System.out.println(firstBoarder);
        } else if (firstBoarder>0&&secondBoarder>0){
            for (int i = firstBoarder; i <= secondBoarder ; i++) {
                result += i;
            }
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
