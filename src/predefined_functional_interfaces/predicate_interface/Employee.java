package predefined_functional_interfaces.predicate_interface;

public class Employee {
    public String name;
    public int salary;
    public int experience;

    public Employee(String name,int salary,int experience){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "\nname= " + name +
                "\nsalary= " + salary;
    }
}
