
import easyTasks.*;
import mediumTasks.DivideTwoIntegers;
import mediumTasks.FindIndexOfFirstOccurrenceString;
import mediumTasks.LongestSubstringWithoutRepeatingCharacters;
import mediumTasks.ReverseInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
    }
}



/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Long> listOfNumbers = new ArrayList<>();
        List<String> listOfRandomNumbers = new ArrayList<>();

        System.out.println("Say number : ");
        long firstValue = Integer.parseInt(reader.readLine());

        long number = firstValue;
        if (firstValue < 1000 || firstValue > 10000) {
            System.out.println("Mistake");
        } else {
            listOfNumbers.add(number);
            listOfRandomNumbers.add("0," + number);
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                number *= number;
                number = number / 100 % 10000;

                if (number == firstValue || listOfNumbers.contains(number)) {
                    break;
                }
                listOfRandomNumbers.add("0," + number);
                listOfNumbers.add(number);
            }
            System.out.println("Number of numbers in the pseudosequence : " + listOfNumbers.size());
        }
        for (Long value : listOfNumbers) {
            System.out.println("Number is : " + value);
        }
        System.out.println("--------");
        for (String value : listOfRandomNumbers) {
            System.out.println("Random number is : " + value);
        }
 *//*


 */
/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Long> listOfNumbers = new ArrayList<>();
        List<String> listOfRandomNumbers = new ArrayList<>();

        System.out.println("Say number : ");
        long firstValue = Integer.parseInt(reader.readLine());

        System.out.println("Say core : ");
        long core = Integer.parseInt(reader.readLine());


        if (firstValue < 1000 || firstValue > 10000) {
            System.out.println("Mistake");
        } else {
            long number = firstValue;
            listOfNumbers.add(number);
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                number = listOfNumbers.get(i) * core;
                long randomNumber = number;
                number = number % 10000;

                if (number == firstValue || listOfNumbers.contains(number)) {
                    break;
                }
                listOfRandomNumbers.add("0," + randomNumber/100%10000);
                listOfNumbers.add(number);
            }
            System.out.println("Number of numbers in the pseudosequence : " + listOfNumbers.size());
        }
        for (Long value : listOfNumbers) {
            System.out.println("Number is : " + value);
        }
        System.out.println("--------");
        for (String value : listOfRandomNumbers) {
            System.out.println("Random number is : " + value);
        }
 */
