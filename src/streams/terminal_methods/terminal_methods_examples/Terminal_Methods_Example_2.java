package streams.terminal_methods.terminal_methods_examples;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminal_Methods_Example_2 {
    List<Integer> integerList = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
    List<String> names = Arrays.asList("John", "Mary", "Kim", "David", "Smith");

    @Test
    public void example_sort() {
        /*
        sorted() - it will be sort the objects in the collection but before we need store objects inside stream
         */
        // TODO sort the objects in the collection
        List<Integer> sortedArr = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedArr + " sorted ascending order");
    }

    @Test
    public void example_sort_reverse_order() {
        //TODO sort the arrey in reverse order
        /*
        user sorted then as a parametr inside sorted use Comparator.reverseOrder()
         */
        List<Integer> sorteReverse = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorteReverse + " sorted reversed order");
    }

    @Test
    public void sort_string_example() {
        //TODO sort string of array list
        List<String> sortedName = names.stream().sorted().collect(Collectors.toList());
        System.out.println(names + " before sorted");
        System.out.println(sortedName + " sorted names list");

        List<String> reverseSorted = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted + " reverse order sorted");
    }

    /*
    anyMatc() , allMatch() , noneMatch()
    anyMatch - return true or false if any value matches
    allMatch() - will return boolean value if all matches
    noneMatch - if does not match true else false
     */

    @Test
    public void example_anyMatch() {
        //TODO find any string which contains "apple"
        Set<String> fruites = new HashSet<>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apple");
        fruites.add("More grapes");
        fruites.add("Two guavas");

        boolean flag = fruites.stream().anyMatch(s -> {
            return s.contains("apple");
        });
        System.out.println(flag);

    }

    @Test
    public void example_allMatch(){
        //TODO find if every value starts with one
        Set<String> fruites = new HashSet<>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apple");
        fruites.add("More grapes");
        fruites.add("Two guavas");

        boolean flag = fruites.stream().allMatch(s -> {
            return s.startsWith("One");
        });
        System.out.println(flag);
    }
    @Test
    public void example_noneMatch(){
        //TODO find if every value does not start with one
        Set<String> fruites = new HashSet<>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apple");
        fruites.add("More grapes");
        fruites.add("Two guavas");

        boolean flag = fruites.stream().noneMatch(s -> {
            return !s.startsWith("one");
        });
        System.out.println(flag);
    }

    @Test
    public void example_findAny_findFirst(){
        //Todo findAny() returns Optional class and returns any element
        //if collection is empty it will trhow noSuchElement exception

        List<String> list = Arrays.asList("one","two","three","one");
        Optional<String> optionalS = list.stream().findAny();
        System.out.println(optionalS.get());

        //TODO findFirst() returns frist element from collection and stores it in Optional
        Optional<String> element = list.stream().findFirst();
        System.out.println(element.get());

    }

    @Test
    public void example_concatenate_streams(){
        /*
        Stream.concat() concatenates multiple streams
         */
        List<String> animaList = Arrays.asList("Dog","Cat","Elephant");
        List<String> birdList = Arrays.asList("chicken","parrot","crow");

        Stream <String>stream1 = animaList.stream();

        Stream <String> stream2 = birdList.stream();

        List<String> finalStream = Stream.concat(stream1,stream2).collect(Collectors.toList());

        finalStream.forEach(e -> System.out.println(e));
    }

}
