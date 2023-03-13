import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.stream.IntStream;


//    public List<Integer> addToArrayForm(int[] num, int k) {
//        List<Integer> answer = new ArrayList<>();
//        int curAns = 0;
//        for (int i = 0; i < num.length; i++) {
//            curAns += num[i] * Math.pow(10, num.length - i - 1);
//        }
//        curAns += k;
//
//        while (curAns != 0) {
//            answer.add(curAns % 10);
//            curAns /= 10;
//        }
//
//        Collections.reverse(answer);
//        return answer;
//    }


/*

        boolean nonGrowth = heights.stream().allMatch(x -> x <= (heights.get(heights.indexOf(x)+1)));

        boolean nonDecreasing = heights.stream().allMatch(x -> x >= (heights.get(heights.indexOf(x)+1)));

 */
public class Solution {

}


//Concatenation of Array(task 1)
//    public int[] getConcatenation(int[] nums) {
//        int[] ans = new int[nums.length * 2];
//        System.arraycopy(nums, 0, ans, 0, nums.length);
//        System.arraycopy(nums, 0, ans, nums.length, nums.length);
//        return ans;
//    }

//Build Array from Permutation(task 2)
//    public int[] buildArray(int[] nums) {
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = nums[nums[i]];
//        }
//        return ans;
//    }


//task 3
//    public double[] convertTemperature(double celsius) {
//        double[] ans = new double[2];
//        ans[0] = celsius + 273.15;
//        ans[1] = celsius * 1.8 + 32;
//        return ans;
//    }


//dodelat
//    public int subarrayLCM(int[] nums, int k) {
//        int ans = 0;
//        List<Integer> listRes = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            int cur = 0;
//            ans = nums[i];
//            for (int j = 0; j < nums.length; j++) {
//                if(ans/nums[j] == 0){
//                    break;
//                }
//                cur++;
//            }
//            listRes.add(cur);
//        }
//        int max = Integer.MIN_VALUE;
//        for (Integer result: listRes  ) {
//            if(max < result){
//                max = result;
//            }
//        }
//        return max;
//    }


//Final Value of Variable After Performing Operations (task 5)
//    public int finalValueAfterOperations(String[] operations) {
//        int ans = 0;
//        for (int i = 0; i < operations.length; i++) {
//            String cur = operations[i];
//            char[] curChars = cur.toCharArray();
//            for (char curChar : curChars) {
//                if (curChar == '+') {
//                    ans = ans + 1;
//                    break;
//                }
//                if(curChar == '-'){
//                    ans = ans - 1;
//                    break;
//                }
//            }
//        }
//        return ans;
//    }


//task 6 mojno napisat lyche
//int ans = 0;
//        for (int i = 0; i < nums.length; i++) {
//        for (int j = 0; j < nums.length; j++) {
//        if(nums[i] == nums[j] && i < j){
//        ans++;
//        }
//        }
//        }
//        return ans;

//task 7
//    public int[] runningSum(int[] nums) {
////        int[] ans = new int[nums.length];
////        for (int i = 0; i < nums.length; i++) {
////            if(i == 0){
////                ans[i] = nums[i];
////                continue;
////            }
////            for (int j = 0; j < i; j++) {
////                ans[i] = ans[j] + nums[i];
////            }
////        }
////        return ans;
//        int[] a = new int[nums.length];
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += nums[i];
//            a[i] = sum;
//        }
//        return a;
//    }


//(18.02.23)task 8
//public int subtractProductAndSum(int n) {
//        int sum = 0;
//        int prod = 1;
//        while(n!= 0){
//            int curNumber = n %10;
//
//            sum += curNumber;
//            prod *= curNumber;
//            n /=10;
//        }
//        return prod - sum;
//    }

//task 9
//public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int cur = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[i] > nums[j]){
//                    cur++;
//                }
//            }
//            ans[i] = cur;
//        }
//        return ans;
//    }




//task 11 1678. Goal Parser Interpretation
//public String interpret(String command) {
////        StringBuilder answer = new StringBuilder("");
////        for (int i = 0; i < command.length(); i++) {
////            if(command.charAt(i) == 'G'){
////                answer.append('G');
////            }
////            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
////                answer.append('o');
////            }
////            if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
////                answer.append("al");
////            }
////        }
//        return command.replace("()","o").replace("(al)","al");
//    }


//1389. Create Target Array in the Given Order task 12
//public int[] createTargetArray(int[] nums, int[] index) {
//        List<Integer> ans = new ArrayList<>(index.length);
//        int[] answer = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ans.add(index[i] , nums[i]);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            answer[i] = ans.get(i);
//        }
//        return answer;
//    }

//1662. Check If Two String Arrays are Equivalent task 13 ( 20.02.23)
//public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String wordFormWord1 = "";
//        String wordFormWord2 = "";
//
//        for (int i = 0; i < word1.length; i++) {
//            wordFormWord1 += word1[i];
//        }
//        for (int i = 0; i < word2.length; i++) {
//            wordFormWord2 += word2[i];
//        }
//
//        return wordFormWord1.equals(wordFormWord2);
//    }


//1816. Truncate Sentence task 14 (easy)
//public String truncateSentence(String s, int k) {
//        String[] sb = s.split(" ");
//        StringBuilder ans = new StringBuilder();
//
//        if(s.length() == k || k == 0){
//            return s;
//        }
//
//        for (int i = 0; i < k; i++) {
//            ans.append(sb[i]);
//            if(i < k - 1){
//                ans.append(" ");
//            }
//        }
//
//        return ans.toString();
//    }


//ploxo task 15 easy
//public int countKDifference(int[] nums, int k) {
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i < j && Math.abs(nums[i]- nums[j]) == k){
//                    sum++;
//                }
//            }
//        }
//        return sum;
//    }


//task 16 easy
// public boolean isHappy(int n) {
//        Set<Integer> numbers = new HashSet<>();
//
//        while (n > 9) {
//            int news = 0;
//            while (n > 0) {
//                int n1 = n % 10;
//                news += (n1) * (n1);
//                n /= 10;
//            }
//            if (numbers.contains(news)) {
//                return false;
//            } else {
//                numbers.add(news);
//            }
//            n = news;
//        }
//
//        return n == 1 || n == 7;
//    }


//task 17 easy
//public int searchInsert(int[] nums, int target) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//        list.add(target);
//        list.sort(Integer::compareTo);
//
//        return list.indexOf(target);
//    }


//task 18 hard
// public double findMedianSortedArrays(int[] nums1, int[] nums2) {
////        List<Integer> list = new ArrayList<>(nums1.length);
////        List<Integer> list1 = new ArrayList<>( nums2.length);
////
////        list.addAll(list1);
////        Collections.sort(list);
////
////        if (list.size() % 2 == 0) {
////            double a = list.get(list.size() / 2) + list.get(list.size() / 2 - 1);
////            return a / 2;
////        }
////        return list.get(list.size() / 2);
//
//
//        int[] c = new int[nums1.length + nums2.length];
//        System.arraycopy(nums1, 0, c, 0, nums1.length);
//        System.arraycopy(nums2, 0, c, nums1.length, nums2.length);
//        Arrays.sort(c);
//        if (c.length % 2 == 0) {
//            double a = c[c.length / 2] + c[c.length / 2 - 1];
//            return a / 2;
//        }
//        return c[c.length/2];
//    }


//task 19 540. Single Element in a Sorted Array ( 22.02.23) medium
//public int singleNonDuplicate(int[] nums) {
//
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i > 0 && set.contains(nums[i])) {
//                set.remove(nums[i]);
//                continue;
//            }
//            set.add(nums[i]);
//        }
//        int ans = set.stream().findFirst().get();
//
//        return ans;
//    }



//7. Reverse Integer task 20 medium
//public int reverse(int x) {
//        List<Integer> answer = new ArrayList<>();
//        int curAns = 0;
//        while (x != 0) {
//            answer.add(x % 10);
//            x /= 10;
//        }
//
//        for (int i = 0; i < answer.size(); i++) {
//            curAns += answer.get(i) * Math.pow(10, answer.size() - i - 1);
//        }
//
//        if (curAns >= Integer.MAX_VALUE || curAns <= Integer.MIN_VALUE) {
//            curAns = 0;
//        }
//
//        return curAns;
//    }


//public int singleNonDuplicate(int[] nums) {
////
////        Set<Integer> set = new HashSet<>();
////
////        for (int i = 0; i < nums.length; i++) {
////            if (i > 0 && set.contains(nums[i])) {
////                set.remove(nums[i]);
////                continue;
////            }
////            set.add(nums[i]);
////        }
////        int ans = set.stream().findFirst().get();
////
////        return ans;
//
//        //int temp = 0;
//        //        for (int i = 0; i < nums.length; i++) {
//        //            temp ^= nums[i];
//        //        }
//        //        return temp;
//
//        int temp = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if(temp == nums[i]){
//                temp = nums[i+1];
//                i++;
//            }else{
//               break;
//            }
//        }
//        return temp;
//    }