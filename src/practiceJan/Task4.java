package practiceJan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int filters = Integer.parseInt(reader.readLine());

        List<Integer> filterCharacteristics = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numberFilter = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> lengthFilter = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Node root = new Node(filterCharacteristics.get(0),1);
        for (int i = 1; i <= filterCharacteristics.size(); i++) {
            Node node = new Node(filterCharacteristics.get(i),lengthFilter.get(i));
            Node curNode = root;
            for (int j = 0; j < numberFilter.size(); j++) {
                if(curNode.length == numberFilter.get(j)){
                    curNode.child.add(node);
                }else{
                }
            }
        }


    }
    public static class Node {
        public int value;
        public int length;
        List<Node> child = new ArrayList<>();

        public Node(int value, int length) {
            this.value = value;
            this.length = length;
        }
    }
}



