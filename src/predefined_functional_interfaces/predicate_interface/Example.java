package predefined_functional_interfaces.predicate_interface;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;


public class Example {

    /*
    Predicate is Predefined functional interface which we can use when we wright lambda expression
    it has only one abstract class boolean test() which return boolean
    when u have conditional check use this interface.
    todo Predicate always take one parametr returns boolen.If we have cinditional checks in our programing
    todo Predicate is more welcome to use.
     */

    @Test
    public void predictae_example() {
        /*
        using predicate interface create lambda expression to compare integer since predicate interface has test()
        which will return true or false
         */
        Predicate<Integer> p = each -> (each > 10);
        boolean flag = p.test(3);
        System.out.println(flag);
    }

    @Test
    public void example_2() {
        /*
        check if the given string length is greater than 4 or not
         */
        Predicate<String> predicate = str -> (str.length() > 3);
        System.out.println(predicate.test("abs"));
        System.out.println(predicate.test("java is fun"));

        //todo using Predicate interafec with lambda expression
        List<String> list = Arrays.asList("Hello", "world", "Java", "abs", "we", "i", "go");
        Object arr[] = list.stream().filter(each -> each.length() > 3).toArray();
        System.out.println(Arrays.toString(arr));

    }

    @Test
    
    public void example_3() {
        /*
        get string which length greater than 3 from list using Predicate interface
        using traditional loop
         */
        List<String> list = Arrays.asList("Hello", "world", "Java", "abs", "we", "i", "go", "cybertek");
        Predicate<String> predicate = (each) -> (each.length() > 5);
        for (int i = 0; i < list.size(); i++) {
            if (predicate.test(list.get(i))) {
                System.out.println(list.get(i));
            }
        }
    }

    @Test
    public void find_biggest() {
        /*
        specifying multiple conditions with predicate
         */
        Integer[] numbers = {1, 4, 45, 89, 12, 0, 85};
        Predicate<Integer> predicate = (each) -> (each > 2);
        predicate = (each) -> (each % 2 == 0);
    }

    @Test
    public void example_with_objects() {
        /*
        lambda expression will take employee as parametr and should return if salary is more than 65 k and experience more 3
         */
        Employee employee1 = new Employee("Ahmed", 62000, 2);
        Employee employee2 = new Employee("Mike", 59000, 4);
        Employee employee3 = new Employee("Tim", 61000, 3);
        Employee employee4 = new Employee("Tony", 57000, 6);

        Employee[] employees = {employee1,employee2,employee3,employee4};
        Predicate <Employee> predicate = each -> (each.salary > 55000 && each.experience > 3);
        for(Employee each : employees){
            if(predicate.test(each)){
                System.out.println(each.name);
            }
        }
    }

    @Test
    public void join_multiple_predicates(){
        /*
        Joining predicates
        predicate1 = check if number is even
        predicate2 = check greater than 50
         */
        int [] arr = {5,15,20,25,30,35,40,45,50,55,60,65};
        Predicate <Integer> predicate1 = (each) -> (each % 2 == 0);
        Predicate <Integer> predicate2 = (each) -> (each > 50);

        for(int each : arr){
            if(predicate1.and(predicate2).test(each)){
                System.out.println(each);
            }
        }

    }

    @Test
    public void fin_ra_task_with_predicate(){
        int arr [] = new int[30];
        for(int i = 0;i < 30;i++){
            arr[i] = (i+1);
        }
        Predicate <Integer> Fin = each -> each % 3 == 0;
        Predicate <Integer> Ra = each -> each % 5 == 0;

        for(int each : arr){
            if(Fin.and(Ra).test(each)){
                System.out.println("FinRa " + each);
            }else if(Fin.test(each)){
                System.out.println("Fin " + each);
            }else if (Ra.test(each)){
                System.out.println("Ra " + each);
            }
        }
    }

    @Test
    public void example_4(){
        /*
        to join the predicates we use and operator
        also we use or operator
        also negate operator returns opposite lets say if it false return true
         */

        int [] arr = {5,15,20,25,30,35,40,45,50,55,60,65};
        Predicate <Integer> predicate1 = (each) -> (each % 2 == 0);
        for(int each : arr){
            if(predicate1.negate().test(each)){
                System.out.println(each);
            }
        }
    }

}
