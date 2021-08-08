package predefined_functional_interfaces.consumer;

import org.junit.Test;
import predefined_functional_interfaces.predicate_interface.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumer_example {
    /*
    todo Consumer function interface will take some argument and do some actions, does not return anything
     */
    @Test
    public void demo1(){
        Consumer<String> c = each -> System.out.println(each);
        c.accept("Hello");

    }


    /*
    todo All 3 function interfaces in one example.See below method
     */

    @Test
    public void all_3_in_one(){
        /*
        create multiple Employee object store in arraylist
        take each employee object and bases on the salary calculate bonus of the employee and add to salary
        then if bonus if more than 5000 print values of employee
        1-calculate the bonus - 10% of salary is bonus
        2-check if bonus more than 5000
        3-print employee details
         */

        Employee employee1 = new Employee("Mike",65000);
        Employee employee2 = new Employee("John",60000);
        Employee employee3 = new Employee("Sarah",40000);
        Employee employee4 = new Employee("Jack",51000);

        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4);

        //Use Function interface calculate the bonus
        Function <Employee,Integer> f1 = n -> n.salary * 10 / 100;

        //Use Predict interface to check if bonus more than 5000
        Predicate <Integer> p1 = p -> p > 5000;

        //Use Consumer to print object values
        for(Employee each : employees){
            int bonus = f1.apply(each);
            if(p1.test(bonus)){
//                Consumer<Employee> c1 = c -> System.out.println("Employee name: " + c.name + "\nSalary: " + c.salary + "\nBonus: " + bonus);
                Consumer<Employee> c1 = c -> System.out.println(c.toString() + "\nbonus: " + bonus);
                c1.accept(each);
                System.out.println("-------------------");
            }
        }
    }
}
