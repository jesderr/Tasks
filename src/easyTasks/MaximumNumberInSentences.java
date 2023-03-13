package easyTasks;

public class MaximumNumberInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (String sentence : sentences) {
            String[] cur = sentence.split(" ");
            if (cur.length > max) {
                max = cur.length;
            }
        }
        return max;
    }
}
