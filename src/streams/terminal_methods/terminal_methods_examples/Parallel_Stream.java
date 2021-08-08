package streams.terminal_methods.terminal_methods_examples;

import org.junit.Test;
import predefined_functional_interfaces.predicate_interface.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parallel_Stream {
    @Test
    public void example_1(){
        //mo paralele stream in this example
        Employee employee1 = new Employee("Mike",65000);
        Employee employee2 = new Employee("John",75000);
        Employee employee3 = new Employee("Tyler",48000);
        Employee employee4 = new Employee("Jack",53000);
        Employee employee5 = new Employee("Daniel",51000);
        Employee employee6 = new Employee("Jessy",59000);
        Employee employee7 = new Employee("Marcos",68000);

        //Todo filter which employees salary more than 55k

        List<Employee> employeeList = Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7);
        List<Employee> modifiedEmployeeList = employeeList.stream().filter(s -> s.salary > 55000).limit(3).collect(Collectors.toList());
        System.out.println(modifiedEmployeeList.size());
        modifiedEmployeeList.forEach(e -> System.out.println(e.name));

        //Example with parallel stream
        employeeList.parallelStream().filter(s -> s.salary > 60000).forEach(each -> System.out.println(each.name + " " + each.salary));
    }

}
