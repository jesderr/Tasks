package easyTasks;

public class AddDigits {
    public int addDigits(int num) {

        int answer = 0;
        if (num / 10 == 0) {
            return num;
        }

        while (num != 0) {
            answer += num % 10;
            num /= 10;
            if (answer / 10 != 0 && num == 0) {
                num = answer;
                answer = 0;
            }
        }

        return answer;
    }
}
