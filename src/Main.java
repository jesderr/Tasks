import easyTasks.*;
public class Main {
    public static void main(String[] args) throws Exception {
            HammingWeight h =new HammingWeight();
            System.out.println(h.hammingWeight(000000000000000000101010101));

    }

    static public String stringToBinary(String s) {
        return s
                .chars()
                .collect(StringBuilder::new,
                        (sb, c) -> sb.append(Integer.toBinaryString(c)).append(' '),
                        StringBuilder::append)
                .toString();
    }
}

