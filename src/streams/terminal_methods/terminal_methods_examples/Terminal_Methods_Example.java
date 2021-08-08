package streams.terminal_methods.terminal_methods_examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
IN THIS CLASS I COVERED BELOW TERMINAL METHODS:
1-DISTINCT()
2-COUNT()
3-LIMIT()
4-MIN()
5-REDUCE()
 */
public class Terminal_Methods_Example {
    @Test
    public void find_unique_elements() {
        /*
        distinct is non terminal methods which returns non duplicate elements
        remove duplicates
         */
        List<String> vehichles = Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");
        vehichles.stream().distinct().forEach(e -> System.out.print(e + " "));
        System.out.println("------------------------------------------------");

        /*
        count() is terminal method and it returns long data type
        get the count of unique element in the list
         */

        long count = vehichles.stream().distinct().count();
        System.out.println(count + " count Of unique elements of list");
        System.out.println("------------------------------------------------");
        /*
        limit() specifies the size how many element you want to get
         */
        List<String> list = vehichles.stream().limit(3).collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void example_1() {
        /*
        find how many even numbers in the list
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long countOfEvenNumbers = numbers.stream().filter(s -> s % 2 == 0).count();
        System.out.println("count of even numbers is " + countOfEvenNumbers);
    }

    @Test
    public void get_min_max() {
        /*
        min() returns Optional type
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> min = numbers.stream().min((vale1, vale2) -> {
            return vale1.compareTo(vale2);
        });
        System.out.println(min.get());
    }

    @Test
    public void reduce_example() {
        /*
        reduce() - will combine the objects in one single stream (object)
        in below example it will combine all elements in single collections and returns as Optional
         */
        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");
        Optional<String> str = stringList.stream().reduce((value, combinevalue) -> {
            return value + combinevalue;
        });

        System.out.println(str.get());
    }


}
