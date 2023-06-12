package PracticeMay;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[4];

        for (int i = 0; i < 4; i++) {
            heights[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 3; i++) {
            if (heights[i] > heights[i + 1]) {
                ascending = false;
            } else if (heights[i] < heights[i + 1]) {
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

