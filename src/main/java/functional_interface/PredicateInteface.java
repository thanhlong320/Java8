package functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateInteface {
    public static void printNameStartWithNguyen(){
        List<String> studentNames = Arrays.asList("Nguyen Thanh Long", "Nguyen Phuoc Khanh",
                "Phung Minh Dat", "Ta Anh Kiet", "Nguyen Van Viet");
        Predicate<String> nameStartWithNguyen = (name) -> name.startsWith("Nguyen");
        for (String name: studentNames){
            if (nameStartWithNguyen.test(name)){
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        PredicateInteface.printNameStartWithNguyen();
    }
}
