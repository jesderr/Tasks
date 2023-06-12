package PracticeMay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int requiredReviews = numbers.get(0) * numbers.get(2);
        int time = (int) Math.ceil(requiredReviews / (double) numbers.get(1));
        System.out.println(time);
    }
}
