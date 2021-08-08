package predefined_functional_interfaces.consumer;

import org.junit.Test;

import java.util.function.Consumer;

public class Consumer_Chaining_Example {
    @Test
    public void example_1(){
        /*
        exxample for Consumer Chaining
         */
        Consumer <String> c1 = s -> System.out.println(s + " is White");

        Consumer <String> c2 = s -> System.out.println(s + " is having four legs");

        Consumer <String> c3 = s -> System.out.println(s + " is eating grass");

        c1.accept("Cow");
        c2.accept("Cow");
        c3.accept("Cow");
        System.out.println("------------------");
        //todo below code is example for Consumer Chaining
        c1.andThen(c2).andThen(c3).accept("Rabbit");
        System.out.println("------------------");
        //todo another for Consumer Chaining
        Consumer <String> c4 = c1.andThen(c2).andThen(c3);
        c4.accept("Dear");

    }
}
