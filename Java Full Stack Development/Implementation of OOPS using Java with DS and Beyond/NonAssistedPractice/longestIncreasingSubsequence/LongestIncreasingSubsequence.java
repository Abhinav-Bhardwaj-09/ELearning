package NonAssistedPractice.longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 26/07/22
 * Time: 16:03
 */

public class LongestIncreasingSubsequence {
    public static ArrayList<Integer> longestIncreasingSubsequence(int[] Arr){
        ArrayList subsequence = new ArrayList();        // for storing running sequence
        ArrayList longestSubsequence = new ArrayList();     // for storing longest one

        int tempMax;
        int maxCount = 0;

        for(int index1 = 0; index1 < Arr.length; index1++) {
            tempMax = Integer.MIN_VALUE;

            for(int index2 = index1; index2 < Arr.length; index2++) {
                if(Arr[index2] > tempMax) {
                    subsequence.add(Arr[index2]);
                    tempMax = Arr[index2];
                }
            }

            if(maxCount < subsequence.size()) {
                maxCount = subsequence.size();
                longestSubsequence = new ArrayList(subsequence);        // as now current subsequence is greater than previous longest one
            }

            subsequence.clear();        // for next iteration
        }
        return longestSubsequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of the list: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Elements of the list in the space seperated format: ");
        for (int index = 0; index < size; index++){
            arr[index] = scanner.nextInt();
        }

        ArrayList<Integer> LongestIncSubsequence= longestIncreasingSubsequence(arr);
        System.out.print("Longest Subsequence of length, " + LongestIncSubsequence.size() + ", is : ");
        System.out.println(LongestIncSubsequence);
    }
}
