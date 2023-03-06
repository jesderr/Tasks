package easyTasks;

public class ReverseString {
    public void reverseString(char[] s) {
        StringBuilder s1 = new StringBuilder(String.valueOf(s)).reverse();
        for (int i = 0; i < s.length; i++) {
            s[i] = s1.charAt(i);
        }
    }
}
