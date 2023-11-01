package codeforcesCAMA;

import java.util.Scanner;

public class SavingTheCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case "Spock" -> System.out.println("Pertenece a Star Trek.");
            case "Yoda" -> System.out.println("Pertenece a Star Wars.");
            case "Frodo" -> System.out.println("No pertenece ni a Star Wars ni a Star Trek.");
            default -> System.out.println("Mistake");
        }
        sc.close();
    }
}
