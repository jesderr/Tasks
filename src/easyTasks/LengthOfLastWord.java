package easyTasks;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        StringBuilder string = new StringBuilder(s);
        string.reverse();
        int answer = 0;
        for (int i = 0; i < string.length(); i++) {
           if(string.charAt(i) == ' '){
               if(answer != 0){
                   return answer;
               }
               string.deleteCharAt(i);
               i = 0;

           }
           if(string.charAt(i) != ' '){
                answer++;
           }
        }
        return answer;
//            s = s.trim();
//            int x = s.lastIndexOf(' ');
//            return s.length()-(x+1);
        }
    }
