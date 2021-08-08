package functional_interface;

public class Single {
    private Single(){};
    int age;

    private static Single single = new Single();

    public static Single getSingle(){
        return single;
    }

}
