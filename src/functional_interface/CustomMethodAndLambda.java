package functional_interface;

import org.junit.Test;

public class CustomMethodAndLambda {

    /** @// TODO: 7/19/2021
    @todo define which statment are valid
    n -> return n * n; - when use return must use {} so this not valid statement
    n -> { return n * n;} - this valid
    n -> { return n * n }; - missing ; after n * n - invalid
    n -> { n * n ;}; - no return keyword so invalid
    n -> n * n ; this valid no return so curly brakcets are optional
     */

    @Test
    public void customeLambda_1() {
        //Creta object from CabDuration.
        //Below code cabDuration holds object of CabDuration
        Cab cabDuration = new ImplementCab();//@todo polymorphism happened here
        cabDuration.call();

        //@todo we can avoid that much line of code simply making labmda expression from Cab functional Interface
        Cab cab = ()-> System.out.println("please call cab");
        cab.call();

        cab = ()-> System.out.println("i am second labda expression");
        cab.call();

        Runnable runnable = () -> System.out.println("runn brother");
        runnable.run();
    }


}
