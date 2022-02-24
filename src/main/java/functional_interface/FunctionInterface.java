package functional_interface;

import java.util.function.Function;

public class FunctionInterface {
    public static void printDouleLengthOfString(String input){
        Function<String, Integer> func = x -> x.length();
        Function<Integer, Integer> func2 = x -> x * 2;
        Integer result = func.andThen(func2).apply(input);
        System.out.println(result);
    }

    public static void main(String[] args) {
        FunctionInterface.printDouleLengthOfString("Long");
    }
}
