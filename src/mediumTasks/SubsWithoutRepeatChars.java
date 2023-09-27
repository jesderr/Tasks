package mediumTasks;

import java.util.HashSet;
import java.util.Set;

public class SubsWithoutRepeatChars {
    public int lengthOfLongestSubstring(String s) {
        /*
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            int curI = i;
            StringBuilder curWord = new StringBuilder();
            while(curI < s.length() && !curWord.toString().contains(s.substring(curI, curI+1))){
                curWord.append(s.charAt(curI));
                curI++;
            }
            if (curWord.length() > answer) {
                answer = curWord.length();
            }
        }
        return answer;
*/

        int answer = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char r = s.charAt(right);

            while (set.contains(r)) {
                char l = s.charAt(left);
                set.remove(l);
                left++;
            }

            set.add(r);
            answer = Math.max(answer, right - left + 1);
        }

        return answer;

    }
}
