package easyTasks;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        StringBuilder s =new StringBuilder(String.valueOf(x));
        s.reverse();
        if(Long.parseLong(String.valueOf(s)) > Integer.MAX_VALUE){
            return false;
        }
        return Integer.parseInt(String.valueOf(s)) == x;
    }
}
