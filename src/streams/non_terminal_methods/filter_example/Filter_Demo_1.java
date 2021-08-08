package streams.non_terminal_methods.filter_example;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Filter_Demo_1 {
    @Test
    public void example_1() {
        /*
        use filter to get all even numbers
        uses Predict functional interface
         */
        List<Integer> numberList = Arrays.asList(10, 15, 30, 25, 20);
        List<Integer> evenNumbers = numberList.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers + " even numbers");
        System.out.println("--------------------");

        /*
        print all even numbers using Consumer functional interface
         */

        numberList.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

        System.out.println("--------------------");
        //another way to print out
        numberList.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

    }

    @Test
    public void example_2() {
        /*
        filter with multiple conditions
        get all elements which are even and greater than 4
         */

        List<Integer> numberList = Arrays.asList(10, 15, 30, 25, 20, 42, 6, 12, 13, 17, 18);
        numberList.stream().filter(s -> s % 2 == 0).filter(s -> s > 4).sorted().forEach(System.out::println);

    }

    @Test
    public void getFrequencyOfChars() {
        /*
         * Create a method that will accept a String and print out the frequency of every character in the String
         * Hint: use maps to keep track of the frequency. Go through the String using only one loop
         *Ex:
         * Input: "apple"
         * Output:
         * a = 1
         * p = 2
         * l = 1
         * e = 1
         */
        String str = "apple";
        List<String> letters = Arrays.asList(str.split(""));
        letters.stream().distinct().forEach(s -> System.out.println("Frequency of " + s + " is " + Collections.frequency(letters, s)));
    }

    @Test
    public void removeNullValues(){
        List<String> words = Arrays.asList("hello","java",null,"is",null,"fun");
        List<String> listWithoutNullValues = words.stream().filter(s -> s != null).collect(Collectors.toList());
        System.out.println(listWithoutNullValues);
    }
}
