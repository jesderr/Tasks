
import com.digdes.school.JavaSchoolStarter;
import easyTasks.*;
import mediumTasks.DivideTwoIntegers;
import mediumTasks.FindIndexOfFirstOccurrenceString;
import mediumTasks.LongestSubstringWithoutRepeatingCharacters;
import mediumTasks.ReverseInteger;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

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

