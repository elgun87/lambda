package predefined_functional_interfaces.function_interface;

import org.junit.Test;

import java.util.function.Function;

public class FunctionChaining {
    @Test
    public void example_combining_function(){
        /*
        andThen() and compose() is for chaining the function interface
         */
        Function <Integer,Integer> f1 = each -> each * 2;

        Function <Integer,Integer> f2 = each -> each * each;

        //todo first it performs f1 apply() then return value will pass to f2 then perfom f2
        System.out.println(f1.andThen(f2).apply(3) + " andThen()");

        //todo compose will execute f2 first then return value will be passed to f1 and execute f1
        System.out.println(f1.compose(f2).apply(3) + " compose()");

    }
}
