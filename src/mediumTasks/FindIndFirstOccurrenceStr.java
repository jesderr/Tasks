package mediumTasks;

public class FindIndFirstOccurrenceStr {
    public int strStr(String haystack, String needle) {

        if (!haystack.contains(String.valueOf(needle.charAt(0)))) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }

        return -1;
    }
}
