package PracticeMay;

import java.util.*;

public class Task4 {
    public static boolean isBoring(Map<Integer, Integer> freq) {
        Set<Integer> values = new HashSet<>(freq.values());
        if (values.size() == 1) return true;
        if (values.size() > 2) return false;
        int cnt1 = 0, cnt2 = 0;
        int num1 = values.iterator().next();
        int num2 = num1;
        for (int val : freq.values()) {
            if (val == num1) cnt1 += 1;
            else if (val == num2) cnt2 += 1;
            else return false;
        }
        int maxCnt = Math.max(cnt1, cnt2);
        int minCnt = Math.min(cnt1, cnt2);
        return maxCnt - minCnt <= 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int maxL = 2;
        for (int l = 2; l <= n; l++) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < l; i++) {
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }
            boolean foundSubset = false;
            for (int i = 0; i < l - 1; i++) {
                int removed = a[i];
                freq.put(removed, freq.get(removed) - 1);
                if (isBoring(freq)) {
                    foundSubset = true;
                    break;
                }
                freq.put(removed, freq.get(removed) + 1);
            }
            if (foundSubset) {
                maxL = l;
            }
        }
        System.out.println(maxL);
    }
}

