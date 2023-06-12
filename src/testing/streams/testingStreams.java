package testing.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class testingStreams {
    public static void main(String[] args) {
//        Stream.of("bar", "foo","values").map(String::length).forEach(System.out::println);

//        Stream.of("bar", "foo").flatMapToInt(String::chars)
//                .forEach(x -> System.out.println((char) x));

//        List<List<String>> listOfString = List.of(List.of("foo", "bar", "baz"),
//                List.of("foo1", "bar2", "ba3"),
//                List.of("JAVA", "bar", "baz"));
//        System.out.println(listOfString.stream()
//                .flatMap(List::stream)
//                .peek(System.out::println)
//                .anyMatch("JAVA"::equals));
//        List<String> list1 = new ArrayList<>();
//        list1.add(" ");
//        list1.add(" fsd");
//        list1.add("123fd");
//
//        list1 = processList(list1);
//
//        for (String s : list1) {
//            System.out.println(s);
//        }

        System.out.println("Chars = " + strChars("AaAaAaAaAaAa"));

    }

    public static List<String> processList(List<String> list) {
        return list.stream()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }

    public static int strChars(String str){
        return (int) str.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(testingStreams::strChars));
    }


//    public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
//        return stream.reduce(new ArrayList<O>(), (acc, x) -> {
//            List<O> newAcc = new ArrayList<>(acc);
//            newAcc.add(mapper.apply(x));
//            return newAcc;
//        }, (List<O> left, List<O> right) -> {
//            List<O> newLeft = new ArrayList<>(left);
//            newLeft.addAll(right);
//            return newLeft;
//        });
//    }
}
