package mediumTasks;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> word = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if(!word.contains(s.charAt(i))){
                word.add(s.charAt(i));
                answer++;
            }
            //dodelat s pwwkew
        }
        word.clear();
        return answer;
    }
}
