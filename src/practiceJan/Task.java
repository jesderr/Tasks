package practiceJan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Task {
    /*
    for (int i = 0; i < number; i++) {
            int runners = Integer.parseInt(reader.readLine());
            for (int j = 0; j < runners; j++) {
                int time = Integer.parseInt(reader.readLine());
            }
        }

        String[] numbers = reader.readLine().split("(?<=\\G.{5})");

            System.out.println(Arrays.toString(numbers));
     */

    public void task2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество наборов: ");
        int number = Integer.parseInt(reader.readLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Введите количество товаров: ");
            int numberOfProduct = Integer.parseInt(reader.readLine());
            String[] numbers = reader.readLine().split(" ");
            HashMap<Integer, Integer> map = new HashMap();
            for (int j = 0; j < numbers.length; j++) {
                int c = Integer.parseInt(numbers[j]);
                int num = 0;
                for (String s : numbers) {
                    int c1 = Integer.parseInt(s);
                    if (c == c1) {
                        num++;
                    }
                }
                map.put(c, num);
            }

            System.out.println(map);
            ArrayList<Integer> values = new ArrayList<>(map.values());
            System.out.println("Значения: " + values);

            //                System.out.println(map);
//

            //как вычитать подумать.






            /* ZADANIE B
                static final int[] arrayForKeys = new int[]{1, 2, 3, 4};
    static final int[] arrayForVals = new int[]{4, 3, 2, 1};

            String[] numbers = reader.readLine().split(" ");
            HashMap<Integer, Integer> map = new HashMap();
            for (int j = 0; j < numbers.length; j++) {
                int c = Integer.parseInt(numbers[j]);
                int num = 0;
                for (String s : numbers) {
                    int c1 = Integer.parseInt(s);
                    if (c == c1) {
                        num++;
                    }
                }
                map.put(c, num);
            }
            ArrayList<Integer> values = new ArrayList<>(map.values());
            ArrayList<Integer> keys = new ArrayList<>(map.keySet());

            if (arrayForKeys.length == keys.size()) {
                for (int j = 0; j < arrayForKeys.length; j++) {
                    if (arrayForKeys[j] != keys.get(j) || arrayForVals[j] != values.get(j)) {
                        System.out.println("NO");
                        return;
                    }
                }
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
             */

            /*
            int runners = Integer.parseInt(reader.readLine());

            String[] time = reader.readLine().split(" ");

            int[] listOfTime = new int[time.length];

            for (int j = 0; j < time.length; j++) {
                listOfTime[j] = Integer.parseInt(time[j]);
            }

            Arrays.sort(listOfTime);
            int[] copyOfList = Arrays.copyOf(listOfTime, listOfTime.length);

            Map<Integer, Integer> map = new HashMap<>();


            for (int j = 0; j < listOfTime.length; j++) {

            }


             */

        }
    }
}
