package mediumTasks;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if ((int) dividend / divisor == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        if ((int) dividend / divisor == Integer.MAX_VALUE) {
            return Integer.MIN_VALUE;
        }//??
        return (int) dividend / divisor;
    }
}
