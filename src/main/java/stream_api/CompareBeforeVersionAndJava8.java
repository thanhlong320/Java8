package stream_api;

import constant.Constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareBeforeVersionAndJava8 {
    public static void printNameUsingBeforeVersion(String startWord){
        List<String> result = new ArrayList<>();
        for (String name : Constant.NAMES){
            if (name.startsWith(startWord)){
                result.add(name);
            }
        }
        for (String name : result){
            System.out.println(name);
        }
    }

    public static void printNameUsingJava8(String startWord){
        List<String> result = Constant.NAMES.stream().filter(name->name.startsWith(startWord)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    public static void main(String[] args) {
        CompareBeforeVersionAndJava8.printNameUsingBeforeVersion("Nguyen");
        CompareBeforeVersionAndJava8.printNameUsingJava8("Nguyen");
    }
}
