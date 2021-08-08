package functional_interface;
@FunctionalInterface
public interface Cab {
    //@todo any interface which have single abstract methods they are Functional Interface
    //@todo if you want specify explicit that this Functional Interaface you need to mention that interface with @FunctionalInterface
    //@todo after you mention with that annotations you will not be able to define second abstratc method
    void call();

}
