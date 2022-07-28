package NonAssistedPractice.fixTheBug;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 28/07/22
 * Time: 00:01
 */


/** List of changes made by me :
 1. Created Sorting Method
 2. Created Searching Method using Linear Searching
 3. Resolved issue due to which every time list is not getting updated properly.
 */


public class Main {
    static ArrayList<Integer> arrlist = new ArrayList<Integer>();
   static ArrayList<Integer> expenses = new ArrayList<Integer>();

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        System.out.println("\n************************************\n");
        System.out.println("\t\tWelcome to TheDesk \n");
        System.out.println("***********************************");
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        expenses.addAll(arrlist);
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
        }


        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: ");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                            expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the expense you want to search: ");
        int targetExpenditure   = SC.nextInt();

        int arrSize = arrayList.size();

        for(int index = 0; index < arrSize; index++) {
            if(targetExpenditure == arrayList.get(index)) {
                System.out.println(targetExpenditure + " is present in your expenditures.\n");
                return;
            }
        }

        System.out.println(targetExpenditure + " is not present in your expenditures.\n");
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();

        for(int index1 = 0; index1 < arrlength; index1++) {
            for(int index2 = 0; index2 < (arrlength - index1 - 1); index2++) {
                if(arrayList.get(index2) > arrayList.get(index2 + 1)) {
                    arrayList.set(index2, (arrayList.get(index2) + arrayList.get(index2 + 1)));
                    arrayList.set((index2 + 1), (arrayList.get(index2) - arrayList.get(index2 + 1)));
                    arrayList.set(index2, (arrayList.get(index2) - arrayList.get(index2 + 1)));
                }
            }
        }

        System.out.println("Sorted expenditures -> " + arrayList + "\n");
    }

}