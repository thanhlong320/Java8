package functional_interface;

import constant.Constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateInteface {
    public static void printNameStartWithNguyen(){
        Predicate<String> nameStartWithNguyen = (name) -> name.startsWith("Nguyen");
        for (String name: Constant.NAMES){
            if (nameStartWithNguyen.test(name)){
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        PredicateInteface.printNameStartWithNguyen();
    }
}
