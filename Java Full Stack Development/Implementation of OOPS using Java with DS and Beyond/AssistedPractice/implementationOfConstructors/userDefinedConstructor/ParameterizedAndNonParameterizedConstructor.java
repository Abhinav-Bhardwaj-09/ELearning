package AssistedPractice.implementationOfConstructors.userDefinedConstructor;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 15:17
 */


public class ParameterizedAndNonParameterizedConstructor {
    int a;
    String b;

    public ParameterizedAndNonParameterizedConstructor() {
    }

    // constructor Overloading
    public ParameterizedAndNonParameterizedConstructor(int a, String b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        if(b==null) {
            System.out.println("Object created by calling Non-Parameterized constructor.");
        }
        else {
            System.out.println("Object created by calling Non-Parameterized constructor (Here, it is also a case of " + b + " as two constructors with different signature are present )");
        }

    }

    public static void main(String[] args) {
        ParameterizedAndNonParameterizedConstructor NPC = new ParameterizedAndNonParameterizedConstructor();
        ParameterizedAndNonParameterizedConstructor PC = new ParameterizedAndNonParameterizedConstructor(1, "Constructor Overloading");

        NPC.display();
        PC.display();
    }
}
