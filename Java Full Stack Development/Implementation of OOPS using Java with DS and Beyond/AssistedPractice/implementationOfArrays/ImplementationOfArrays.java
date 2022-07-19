package AssistedPractice.implementationOfArrays;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 16:12
 */


public class ImplementationOfArrays {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Size of array : ");
        int size = SC.nextInt();
        int arr [] = new int[size]; // initialising array of the given size.

        System.out.println("Enter space separated elements of array.");
        for (int index = 0; index < size; index++) {
            arr[index] = SC.nextInt();  // taking input from the user as elements for the array
        }

        System.out.println("Printing elements of array of length '" + arr.length + "' in the same order you inserted.");
        for (int index = 0; index < size; index++) {
            System.out.print(arr[index] + " ");
        }

    }

}
