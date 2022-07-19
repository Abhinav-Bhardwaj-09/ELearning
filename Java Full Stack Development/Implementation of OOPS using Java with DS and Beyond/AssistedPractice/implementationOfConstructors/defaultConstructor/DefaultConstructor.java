package AssistedPractice.implementationOfConstructors.defaultConstructor;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 15:09
 */


public class DefaultConstructor {
    int a;

    public static void main(String[] args) {
        System.out.println("\nCalling default constructor.");
        DefaultConstructor DC = new DefaultConstructor();
        System.out.println("Value of a = " + DC.a + " (initialised by default constructor)");

    }
}
