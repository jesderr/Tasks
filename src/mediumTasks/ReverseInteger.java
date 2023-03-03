package mediumTasks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder answer = new StringBuilder(String.valueOf(x));
        answer.reverse();

        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i) == 0){
                answer.deleteCharAt(i);
            }
            if(answer.charAt(i) == '-'){
                answer.deleteCharAt(i);
            }
        }

        if(Long.parseLong(String.valueOf(answer)) > Integer.MAX_VALUE){

            return 0;
        }

        return x < 0 ? -(Integer.parseInt(String.valueOf(answer))) : (Integer.parseInt(String.valueOf(answer)));
    }
}
