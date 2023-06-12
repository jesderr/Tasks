import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.DoubleStream;

public class PracticeDenisova {

    public double monteCarloIntegration(ArrayList<Double> listOfRandomNumbers) {
//        int n = 1000000; // количество выбранных точек
        double sum = 0.0;
        double a = 0; // нижний предел интегрирования
        double b = Double.POSITIVE_INFINITY; // верхний предел интегрирования

//        for (int i = 0; i < listOfRandomNumbers.size(); i++) {
//            double x = listOfRandomNumbers.get(i) * (b - a) + a;
//            double fx = x * Math.log(x) / (1 + x * x); // функция для интегрирования
//            sum += fx / (1 + x * x); // плотность: 1/(1+x^2)
//        }
        double[] x1 = new double[listOfRandomNumbers.size()];
        for (int i = 0; i < listOfRandomNumbers.size(); i++) {
            x1[i] = Math.tan((listOfRandomNumbers.get(i)*Math.PI)/2);
            sum += Math.PI/2 * x1[i] * Math.log(x1[i]);
        }

        //        double estimate = sum * (b - a) / listOfRandomNumbers.size();
        return (1/listOfRandomNumbers.size()) * sum;
    }


    public double monteCarloIntegrationVar1(ArrayList<Double> listOfRandomNumbers) {
//        int n = 1000000; // количество выбранных точек
        double sum = 0.0;
        double a = 0; // нижний предел интегрирования
        double b = 1; // верхний предел интегрирования

        for (int i = 0; i < listOfRandomNumbers.size(); i++) {
            double x = Math.random() * (b - a) + a;
            double fx = Math.sin(x) / x; // функция для интегрирования
            sum += fx;
        }

        double estimate = sum * (b - a) / listOfRandomNumbers.size();
        return estimate;
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


        //        ArrayList<Double> listOfRandomNumbers = new ArrayList<>();
//        long firstValue = 3123;
//        long number = firstValue;
//
//        int len = String.valueOf(firstValue).length();
//        double result = ((double) number / Math.pow(10, len));
//        listOfRandomNumbers.add(result);
//
//        ArrayList<Long> listOfNumbers = new ArrayList<>();
//        listOfNumbers.add(number);
//
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            number *= number;
//            number = number / 100 % 10000;
//
//            if (number == firstValue || listOfNumbers.contains(number)) {
//                break;
//            }
//            len = String.valueOf(number).length();
//            result = ((double) number / Math.pow(10, len));
//            listOfRandomNumbers.add(result);
//            listOfNumbers.add(number);
//        }
//        // Sort the list of random numbers in ascending order
//        Collections.sort(listOfRandomNumbers);
//        System.out.println(listOfRandomNumbers.size());
//
//        PracticeDenisova p = new PracticeDenisova();
//        System.out.println(p.monteCarloIntegration(listOfRandomNumbers));
 */
