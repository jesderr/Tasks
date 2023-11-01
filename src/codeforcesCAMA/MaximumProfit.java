package codeforcesCAMA;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] checks = new int[n];

        for (int i = 0; i < n; i++) {
            checks[i] = scanner.nextInt();
        }
        Arrays.sort(checks);

        int maxTotalValue = 0;
        for (int i = n - 1; i >= n - k; i--) {
            maxTotalValue += checks[i];
        }

        System.out.println(maxTotalValue);
    }
}


