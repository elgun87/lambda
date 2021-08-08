package streams.non_terminal_methods.map;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Demo_1 {
    @Test
    public void example_1() {
        /*
        convert all words to Uppercase
         */
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        vehicles.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        /*
        convert first letter to uppercase
         */
        vehicles.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).forEach(System.out::println);
    }


    @Test
    public void example_2() {
        /*
        todo Requirement
        find all elements length and store them in another collection
        then find biggest 2 word from the list
         */
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<Integer> lengthElements = vehicles.stream().map(s -> s.length()).sorted().collect(Collectors.toList());//get all elements length and sort them
        int max1 = lengthElements.get(lengthElements.size() - 1);//first biggest length
        int max2 = lengthElements.get(lengthElements.size() - 2);//second biggest length
        vehicles.stream().filter(s -> s.length() == max1 || s.length() == max2).forEach(System.out::println);//get two biggest words from list



    }

    @Test
    public void example_3(){
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        numbers.stream().map(s -> s * 3).forEach(System.out::println);
    }

    @Test
    public void filter_map_together(){
        /*
        todo get all even numbers and then multiple them by 2
        using filter and map combination
         */
        List<Integer> numbers = Arrays.asList(2,12,4,46,8,89,63,5,4,7,89,236,96);
        numbers.stream().filter(s -> s % 2 == 0).map(s -> s * 2).forEach(System.out::println);
    }
}
