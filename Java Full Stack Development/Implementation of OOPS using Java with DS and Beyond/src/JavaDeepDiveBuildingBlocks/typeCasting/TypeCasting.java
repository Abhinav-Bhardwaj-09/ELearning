package JavaDeepDiveBuildingBlocks.typeCasting;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 13/07/22
 * Time: 23:30
 */


public class TypeCasting {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("<-------Implicit Type Casting------->");

        char a = 'A';
        int b = a;
        float c = a;
        long d = a;
        double e = a;

        System.out.println("Value stored in a: " + a);
        System.out.println("Value stored in b: " + b);
        System.out.println("Value stored in c: " + c);
        System.out.println("Value stored in d: " + d);
        System.out.println("Value stored in e: " + e);

        System.out.println("<-------****------->");
        System.out.println("\n");


        System.out.println("<-------Explicit Type Casting------->");

        double A = 97;
        long B = (long) A;
        float C = (float) B;
        int D = (int) C;
        char E = (char) D;

        System.out.println("Value stored in A: " + A);
        System.out.println("Value stored in B: " + B);
        System.out.println("Value stored in C: " + C);
        System.out.println("Value stored in D: " + D);
        System.out.println("Value stored in E: " + E);

        System.out.println("<-------****------->");

    }
}
