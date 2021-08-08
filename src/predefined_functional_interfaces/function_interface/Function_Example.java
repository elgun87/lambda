package predefined_functional_interfaces.function_interface;

import org.junit.Test;
import predefined_functional_interfaces.predicate_interface.Employee;

import java.util.function.Function;
import java.util.function.Predicate;

public class Function_Example {

    @Test
    public void example_1(){
        /*
    If you want to pass some value and  get a return use Function interface.
    it has single apply() abstract method
    takes 2 argument.one is type as argument and second return type
     */

        Function<Integer,Integer> function = each -> each * each;
        System.out.println(function.apply(2));
    }

    @Test
    public void example_2(){
        /*
        if employye experience more than 2 year increase salary
         */
        Employee employee = new Employee("Mike",55000,3);
        Function<Employee,Integer> function = each -> each.salary * 2;
        Predicate <Employee> predicate = each -> each.experience > 2;

        if(predicate.test(employee)){
            employee.salary = function.apply(employee);
        }
        System.out.println(employee.salary);

    }

}
