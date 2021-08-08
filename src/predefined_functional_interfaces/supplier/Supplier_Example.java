package predefined_functional_interfaces.supplier;

import org.junit.Test;
import predefined_functional_interfaces.predicate_interface.Employee;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Example {
    /*
    Does not take any argument,does some actions and returns some type
     */

    @Test
    public void example_1(){
        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());

        Supplier<Employee> s2 = () -> new Employee("Mike",65000);
        System.out.println(s2.get().name);
    }
}
