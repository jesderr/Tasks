import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int processors = Integer.parseInt(reader.readLine());

        List<Integer> processorsSpeed = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < processorsSpeed.size(); i++) {
            int cur = processorsSpeed.get(i);
            int sum = 0;
            for (int j = 0; j < processorsSpeed.size(); j++) {
                if(processorsSpeed.get(j)/cur == 0){
                    continue;
                }
                int residue = processorsSpeed.get(j)%cur;
                if(residue == 0){
                    sum += processorsSpeed.get(j);
                }else{
                    int a = processorsSpeed.get(j)/cur;
                    int b = a * cur;
                    sum += b;
                }
            }
            sums.add(sum);
        }

        int max = Integer.MIN_VALUE;
        for(Integer sumCur : sums){
            if(sumCur > max){
                max = sumCur;
            }
        }

        System.out.println(max);

    }
}
