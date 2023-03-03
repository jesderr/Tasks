import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int m = Integer.parseInt(s[1]);

        List<Integer> states = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = 0;
        for (int i = 0; i < m; i++) {
            String[] t = reader.readLine().split(" ");
            int t1 = Integer.parseInt(t[0]);
            int t2 = Integer.parseInt(t[1]);

            if (states.get(t1 - 1) != states.get(t2 - 1)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
