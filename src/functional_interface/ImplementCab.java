package functional_interface;

public class ImplementCab implements Cab {
    public void call() {
        System.out.println("can i get a Cab please....");
    }

    /*
    @todo in main method we can create lambda expression from Cab Functional Interface and we dont need above implemention anymore.
    @todo look CabDuration Class

     Cab cab = ()-> System.out.println("please call cab");
     cab.call();

     */


}
