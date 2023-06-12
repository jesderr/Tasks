package PracticeMay;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        String word = reader.readLine();
        boolean[] contains = new boolean[4];

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if (ch == 'a') contains[0] = true;
            else if (ch == 'b') contains[1] = true;
            else if (ch == 'c') contains[2] = true;
            else contains[3] = true;
        }

        if (!contains[0] || !contains[1] || !contains[2] || !contains[3]) {
            System.out.println("-1");
            return;
        }

        int[] freq = new int[4];
        int minLen = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < length; right++) {
            freq[word.charAt(right) - 'a']++;
            while (freq[word.charAt(left) - 'a'] > 1) {
                freq[word.charAt(left++) - 'a']--;
            }
            if (freq[0] > 0 && freq[1] > 0 && freq[2] > 0 && freq[3] > 0) {
                int len = right - left + 1;
                minLen = Math.min(minLen, len);
            }
        }
        System.out.println(minLen);
    }
}
