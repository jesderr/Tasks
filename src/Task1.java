import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sequence = reader.readLine();
        Set<Character> unrepeatedChars = new HashSet<>();

        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.length() < i + 10) {
                break;
            }
            String substring = sequence.substring(i, i + 10);

            boolean hasDuplicates = false;
            unrepeatedChars.clear();
            for (int j = 0; j < substring.length(); j++) {
                if (substring.charAt(j) == '?') {
                    continue;
                }
                if (!unrepeatedChars.add(substring.charAt(j))) {
                    hasDuplicates = true;
                    break;
                }
            }

            if (hasDuplicates) {
                continue;
            }

            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
