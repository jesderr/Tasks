import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int from = Integer.MIN_VALUE;
        int to = Integer.MAX_VALUE;
        int delta = 0;
        for (int i = 0; i < n; ++i) {
            String[] s = reader.readLine().split(" ");
            int d = Integer.parseInt(s[0]);
            delta += d;
            if(s[1].equals("0+")){
                if (-delta > from) {
                    from = -delta;
                }
            }else {
                to = -delta;
            }
        }
        if(to == Integer.MAX_VALUE){
            System.out.println("inf");
            return;
        }

        int max = Integer.MIN_VALUE;
        for (int i = to-1; i >= from; --i) {
            int localMax = delta + i;
            if(localMax > max){
                max = localMax;
            }
        }

        System.out.println(max);
    }
}
