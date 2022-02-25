package functional_interface;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void print(String value){
        Consumer<String> print = System.out::println;
        print.accept(value);
    }

    public static void printGreet(String greet){
        Consumer<String> s1 = x -> System.out.println(x + " Long");
        Consumer<String> s2 = x -> System.out.println(x + " Thanh");
        s1.andThen(s2).accept(greet);
    }

    public static void main(String[] args) {
        ConsumerInterface.print("Long");
        ConsumerInterface.printGreet("Hello");
    }
}
