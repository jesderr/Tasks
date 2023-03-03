package easyTasks;

import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        List<Integer> list = new LinkedList<>();
        while(x != 0){
            list.add(x%10);
            x /= 10;
        }
        //????


        return false;
    }
}
