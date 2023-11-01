package codeforcesCAMA;

import java.util.ArrayList;
import java.util.Scanner;

public class jbum {
    public static void main(String[] args) {
        //TODO: xz chto ne tak
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> discs = new ArrayList<>();
        int minutes = 0;

        while (n > 0) {
            int lowestBit = Integer.lowestOneBit(n);
            discs.add(lowestBit);
            n -= lowestBit;
            minutes++;
        }

        System.out.println(minutes);
        for (int i = 0; i < minutes; i++) {
            System.out.print(discs.get(i));
            if (i < minutes - 1) {
                System.out.print(" ");
            }
        }

    }
}
