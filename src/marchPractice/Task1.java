package marchPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Short> heights = Arrays.stream(reader.readLine().split(" "))
                .map(Short::parseShort)
                .collect(Collectors.toList());

        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < 3; i++) {
            if (heights.get(i) > heights.get(i+1)) {
                ascending = false;
            } else if (heights.get(i) < heights.get(i+1)) {
                descending = false;
            }
        }

        if (ascending || descending) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
