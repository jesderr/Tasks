import easyTasks.*;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Денис");
        stringToBinary("денис");
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

