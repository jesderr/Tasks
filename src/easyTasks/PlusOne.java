package easyTasks;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1] += 1;
        for (int i = digits.length-1; i > 0 ; i--) {
            if(digits[i] == 10){
                digits[i-1] += 1;
                digits[i] = 0;
            }
        }
        if(digits[0] == 10){
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
