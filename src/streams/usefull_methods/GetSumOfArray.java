package streams.usefull_methods;

import java.util.stream.IntStream;

public class GetSumOfArray {
    public static void main(String[] args) {
        //Get sum of arr in one line
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int sum = IntStream.of(arr).sum();
        System.out.println(sum);
    }
}
