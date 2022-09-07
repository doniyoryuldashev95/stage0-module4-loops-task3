
package school.mjc.stage0.loops.task3;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        printGCD(25,30);
    }
    public static void printGCD(int first, int second) {

//        printGCDC(first,second);
        int firstA = first;
        int a = first;
        int b = second;
        for (int i = 0; i < first+second; i++) {
            if (b==0){
                System.out.println(firstA);
                break;
            } else {
                a = b;
                b = firstA%b;
                firstA = a;
            }
        }
    }
//    public static int printGCDC(int a, int b){
//        System.out.println(a+" "+b);
//        return (b == 0)? a:printGCDC(b, a%b);
//    }
}

