package AssistedPractice.stringStringBufferStringBuilder;


import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 20:33
 */


public class StringStringBufferStringBuilder {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        String s = new String ("AABCDDDefFFG");     // Initializing a string
        String s1 = new String("AbcDeFGhIjkLMNopQrSTuvwxYZ");   // Initializing a string
        System.out.println("String 's1': " + s1);


        System.out.print("Input a string: ");
        String s2 = SC.next();  // Taking String as input from the user
        System.out.println("String you inserted : " + s2);


        String s3 = s1.toUpperCase();   // converting s1 string to the upper case
        System.out.println("String 's1' in UPPER case: " + s3);

        String s4 = s1.substring(5);    //  Substring from String s1
        System.out.println("Substring of String 's1' (starting from index 5) : " + s4);


        System.out.println("String 's' : " + s);
        s = s.replace('A', 'Z');        // replacing A with Z
        s = s.replace('B', 'Y');        // replacing B with Y
        s = s.replace('C', 'X');        // replacing C with X
        System.out.println("String 's' after replacing A, B, C with Z, Y, X respectively : " + s);






    }
}
