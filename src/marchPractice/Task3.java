package marchPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        System.out.println(task3());
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int length = Integer.parseInt(reader.readLine());
//        StringBuilder word = new StringBuilder(reader.readLine());
//        if (length != word.length()) {
//            return -1;
//        }
//        int answer = word.length();
//
//        if(!word.toString().contains("a") || !word.toString().contains("b") ||
//                !word.toString().contains("c") || !word.toString().contains("d"){
//            answer = -1;
//        }
//
//
//        for (int i = 0; i < word.length(); i++) {
//            StringBuilder curWord = new StringBuilder();
//            int curI = i;
//
//            if(!word.substring(i,word.length()).contains("a") || !word.substring(i,word.length()).contains("b") ||
//                    !word.substring(i,word.length()).contains("c") || !word.substring(i,word.length()).contains("d")){
//                break;
//            }
//
//            while (!curWord.toString().contains("a") || !curWord.toString().contains("b") ||
//                    !curWord.toString().contains("c") || !curWord.toString().contains("d")){
//                curWord.append(word.charAt(curI));
//                curI++;
//            }
//
//            if(curWord.length() < answer){
//                answer = curWord.length();
//            }
//        }
//        System.out.println("Answer = " + answer);

//        if (word.chars().distinct().count() != 4 && length != word.length()) {
//            System.out.println(-1);
//        }
    }


    public static int task3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        String word = reader.readLine();
        int answer = length;

        if (!word.contains("a") || !word.contains("b") ||
                !word.contains("c") || !word.contains("d")) {
            return -1;
        }

        for (int i = 0; i < length; i++) {
            StringBuilder curWord = new StringBuilder();
            int curI = i;

            if (i > 4 && !word.substring(i, length).contains("a") ||
                !word.substring(i, length).contains("b") ||
                !word.substring(i, length).contains("c") ||
                !word.substring(i, length).contains("d")) {
                break;
            }

            while (!curWord.toString().contains("a") ||
                   !curWord.toString().contains("b") ||
                   !curWord.toString().contains("c") ||
                   !curWord.toString().contains("d")) {
                curWord.append(word.charAt(curI));
                curI++;
            }

            if (curWord.length() < answer) {
                answer = curWord.length();
            }
        }
        return answer;
    }
}
