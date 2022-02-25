package lambda_expression;

import constant.Constant;

import java.util.function.Consumer;

public class LambdaExpressionWithConsumer {
    public static void printName(){
        Consumer<String> stringConsumer = System.out::println;
        Constant.NAMES.forEach(stringConsumer);
    }

    public static void main(String[] args) {
        LambdaExpressionWithConsumer.printName();
    }
}
