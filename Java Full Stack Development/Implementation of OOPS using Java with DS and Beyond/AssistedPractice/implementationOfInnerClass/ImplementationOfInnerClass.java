package JavaDeepDiveBuildingBlocks.AssistedPractice.implementationOfInnerClass;



/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 15:32
 */


public class ImplementationOfInnerClass {

    class InnerClass {
        int a;
        void print1() {
            System.out.println("Member Inner Class invoked.");
        }
    }

    void print2() {
        // local inner class as only exists in this print2 method.
        class InnerClass2{
            void print3() {
                System.out.println("Local Inner Class invoked.");
            }
        }
        InnerClass2 IC1 = new InnerClass2();
        IC1.print3();
    }




    public static void main(String[] args) {

        // creating object of Member Inner Class
        ImplementationOfInnerClass OC = new ImplementationOfInnerClass();
        ImplementationOfInnerClass.InnerClass IC2 = OC.new InnerClass();
        IC2.print1();

        //invoking Local Inner Class
        OC.print2();


        // creating object of Anonymous Inner Class
        AbstractClass AIC = new AbstractClass() {
            @Override
            void print4() {
                System.out.println("Anonymous Inner Class invoked.");
            }
        };
        AIC.print4();
    }

}
