package streams.non_terminal_methods.flat_map;

import org.junit.Test;
import predefined_functional_interfaces.predicate_interface.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flat_Map_Demo {
    @Test
    public void example_1() {
        //map
        List<Integer> list_1 = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> list_2 = list_1.stream().map(s -> s + 10).collect(Collectors.toList());

        System.out.println(list_2);
    }

    @Test
    public void example_2() {
        List<Integer> list_1 = Arrays.asList(1, 2);
        List<Integer> list_2 = Arrays.asList(3, 4);
        List<Integer> list_3 = Arrays.asList(5, 6);

        List<List<Integer>> finalList = Arrays.asList(list_1, list_2, list_3);

        //flatMap() will read each collection and add them to stream so in there 3 stream
        finalList.stream().flatMap(s -> s.stream().filter(each -> each % 2 != 0)).forEach(m -> System.out.println(m));

        //return single list
        List<Integer> singleList = finalList.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(singleList);

        //add 3 to each number
        finalList.stream().flatMap(s -> s.stream()).map(each -> each + 3).forEach(x -> System.out.print(x + " "));
        System.out.println();

        //multiple by 2 and return as collection
        List<Integer> modifiedList = finalList.stream().flatMap(n -> n.stream().map(s -> s * 2)).collect(Collectors.toList());
        System.out.println(modifiedList + " -- each element multiplied by 2");
    }

    @Test
    public void example_3() {
        /*
        get 3 list of of integer
        print all elements using traditional loop
        print all elements using stream
         */
        List<String> teamA = Arrays.asList("Scott", "Davi", "Jon");
        List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
        List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");

        List<List<String>> all_team = Arrays.asList(teamA, teamB, teamC);

        //traditional loop
        for (int i = 0; i < all_team.size(); i++) {
            for (int j = 0; j < all_team.get(i).size(); j++) {
                System.out.print(all_team.get(i).get(j) + " ");
            }
        }
        System.out.println();

        //stream
        System.out.println("------------using stream------------------");
        all_team.stream().flatMap(m -> m.stream()).forEach(each -> System.out.print(each + " "));
        System.out.println();

        //get all strings which length more than 3
        System.out.println("------using stream get all string length more than 3-------");
        all_team.stream().flatMap(f -> f.stream().filter(n -> n.length() > 3)).forEach(each -> System.out.print(each + " "));

    }

    @Test
    public void example_with_custome_objects() {
        Employee employee1 = new Employee("Mike",65000,1);
        Employee employee2 = new Employee("John",101000,6);
        Employee employee3 = new Employee("Kate",98000,5);
        Employee employee4 = new Employee("Howard",74000,4);
        Employee employee5 = new Employee("Jack",36000,1);
        Employee employee6 = new Employee("Pablo",150000,6);
        List<Employee> company_1 = Arrays.asList(employee1,employee2);
        List<Employee> company_2 = Arrays.asList(employee3,employee4);
        List<Employee> company_3 = Arrays.asList(employee5,employee6);

        List<List<Employee>> all_employee = Arrays.asList(company_1,company_2,company_3);
        System.out.println("get all employees name and salary which experience more than 4 year");
        all_employee.stream().flatMap(fm -> fm.stream().filter(f -> f.experience > 4)).forEach(each -> System.out.println(each.name + " " + each.salary));
        System.out.println("----------------------------------------------------------");
        System.out.println("get all employees name");
        all_employee.stream().flatMap(s -> s.stream()).forEach(employee -> System.out.println(employee.name));

    }
}
