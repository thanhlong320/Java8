package functional_interface;

import java.util.function.Supplier;

public class SupplierInterface {
    public void printGreet(){
        System.out.println("Hello! I am Long");
    }

    public static String getLanguage(){
        return "Java";
    }

    public static void main(String[] args) {
        Supplier<SupplierInterface> supplier1 = SupplierInterface::new;
        SupplierInterface supplierInterface = supplier1.get();
        supplierInterface.printGreet();

        Supplier<String> supplier2 = SupplierInterface::getLanguage;
        String language = supplier2.get();
        System.out.println(language);
    }
}
