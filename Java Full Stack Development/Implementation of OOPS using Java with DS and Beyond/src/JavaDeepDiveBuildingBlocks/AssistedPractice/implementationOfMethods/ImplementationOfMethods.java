package JavaDeepDiveBuildingBlocks.AssistedPractice.implementationOfMethods;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 14:42
 */


public class ImplementationOfMethods {

    // static method with no parameter
    static void staticMethod1() {
        System.out.println("Static Method without parameter.");
    }

    // static method with parameter
    static void staticMethod2(String a) {
        System.out.println("Static Method with parameter as '" + a + "'.");
    }

    // non - static method with no parameter
    void nonStaticMethod1() {
        System.out.println("Non-Static Method without parameter.");
    }

    // non - static method with parameter
    void nonStaticMethod2(String a) {
        System.out.println("Non-Static Method with parameter as '" + a + "'.");
    }

    // with a return value
    String methodWithReturnValue() {
        return "Returned value by method";
    }
    // for method overloading
    String methodWithReturnValue(String a) {
        return "Returned value by method (in case of method overloading)";
    }

    public static void main(String[] args) {
        String returnedValue;
        System.out.println("\n");

        // as static method belongs to the class so don't need to create object to call them.
        staticMethod1();
        staticMethod2("abc");

        System.out.println();

        // as for non-static methods we need to create objects first as it belongs to the individual object.
        ImplementationOfMethods IOM = new ImplementationOfMethods();
        IOM.nonStaticMethod1();
        IOM.nonStaticMethod2("abc");

        System.out.println();

        returnedValue = IOM.methodWithReturnValue();
        System.out.println("Return value through method return value: '" + returnedValue + "'");

        returnedValue = IOM.methodWithReturnValue("abc");   // method overloading as calling method with different signature
        System.out.println("Return value through method return value: '" + returnedValue + "'");

        System.out.println();

        String s = "abcd";
        // calling a pre-defined method, i.e., length() and Integer.toString();
        returnedValue = Integer.toString(s.length());
        System.out.println("Return value through calling a predefined method (length of the string 's'): " + returnedValue + "");

        System.out.println("\n");
    }
}
