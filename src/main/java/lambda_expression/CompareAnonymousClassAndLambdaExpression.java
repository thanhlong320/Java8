package lambda_expression;

import constant.Constant;

import java.util.function.Consumer;

public class CompareAnonymousClassAndLambdaExpression {
    public static void printNameUsingAnonymousClass(){
        System.out.println("--Print Name Using Anonymous Class--");
        Constant.NAMES.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    public static void printNameUsingLambdaExpression(){
        System.out.println("--Print Name Using Lambda Expression--");
        Constant.NAMES.forEach(System.out::println);
    }

    public static void main(String[] args) {
        CompareAnonymousClassAndLambdaExpression.printNameUsingAnonymousClass();
        CompareAnonymousClassAndLambdaExpression.printNameUsingLambdaExpression();
    }

}
