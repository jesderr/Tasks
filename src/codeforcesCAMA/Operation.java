package codeforcesCAMA;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte first = sc.nextByte();
        byte second = sc.nextByte();
        int max = first + second;

        if (max < first * second) {
            max = first * second;
        }
        System.out.println(max);
    }

}
