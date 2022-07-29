package virtualKeyForYourRepositories;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 29/07/22
 * Time: 20:55
 */


public class Main {
    static final String path = "./src/FileDirectory/";

    static void welcomeSection() {
        System.out.println();
        System.out.println("*************************************************");
        System.out.println("            Company Lockers Pvt. Ltd.      ");
        System.out.println("             Project:- LockedMe.com        ");
        System.out.println("*************************************************\n");
    }


    static void exitSection() {
        System.out.println("*************************************************");
        System.out.println("    Thanks for using LockedMe.com Project        ");
        System.out.println("*************************************************");
    }

    public static void main(String[] args) {
        welcomeSection();

        OperationsOverFileDirectory obj = new OperationsOverFileDirectory(path);
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Choose options according to the desired operation.\n");
            System.out.println("\tTo CREATE a new file, choose 1.");
            System.out.println("\tTo SHOW all the files in the current directory, choose 2.");
            System.out.println("\tTo SEARCH for a file, choose 3.");
            System.out.println("\tTo DELETE a file, choose 4.");
            System.out.println("\tTo EXIT from the program, choose 5.\n");

            System.out.print("Enter your choice according to your desired operations: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    obj.createNewFile(path);
                    break;
                case 2:
                    obj.showFiles();
                    break;
                case 3:
                    ArrayList<String> filesList = obj.searchFile();

                    if (filesList.size() > 0) {
                        System.out.println("\nFiles present with the matching names '" + filesList + "'\n");
                    }
                    else {
                        System.out.println("No such file exists.");
                    }

                    break;
                case 4:
                    obj.deleteFiles(path);
                    break;
                case 5:
                    exitSection();
                    System.exit(0);
                default:
                    System.out.println("Invalid Input !!! Try Again...");
            }
        }
    }
}
