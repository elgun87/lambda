package functional_interface;
/*
This class will show how to create and invoke lambda expression
 */
import org.junit.Test;

//@todo Functional Interface 1
@FunctionalInterface
interface PrintInfo {
    void connect(String str,String str2);
}

//@todo Functional Interface 2
@FunctionalInterface
interface Addition{
    int addElements(int a,int b);
}

//@todo Functional Interface 3
@FunctionalInterface
interface Taxi{
    String orderCab(String pickUpLocation,String dropOffLocation);
}

//todo Functional Interface 4
interface Order{
    void byPhone(String message);
}

public class CustomeLambdaExample_2 {
    @Test
    public void example_1(){
        PrintInfo print = (str, str2) -> System.out.println(str + " i am learning " + str2);
        print.connect("Hello","Java");
        /*
        if it is functional interface you no need to create another class to implement it
        you can simply create lambda expression from that interface and implement it
         */
    }

    @Test
    public void example_2(){
        Addition addition = (a,b) ->{return a +b;};
        int sum = addition.addElements(5,7);
        System.out.println(sum);
    }

    @Test
    public void example_3(){
        Taxi taxi = ( str,str2) -> {
            System.out.println("Customer was picked up from " + str + " and will be dropped of at " + str2);
            return ("Total price will be 20$");
        };
        System.out.println(taxi.orderCab("Pittsburgh","San Jose"));
    }

    @Test
    public void example_4(){
        Order order = (message)-> System.out.println("Can i order pizza " + message);
        order.byPhone(" - Accepted message by phone");
    }
}
