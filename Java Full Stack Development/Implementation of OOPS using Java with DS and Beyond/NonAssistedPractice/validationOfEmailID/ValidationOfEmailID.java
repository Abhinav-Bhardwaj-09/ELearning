package NonAssistedPractice.validationOfEmailID;

import java.util.*;
import java.util.regex.*;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 17:55
 */


public class ValidationOfEmailID {

    static boolean isValidEmail (String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";    // regex for email
        Pattern pattern = Pattern.compile(regex);   // creating a pattern using the above regex
        return pattern.matcher(email).matches();    // matching the email with the generated pattern
    }

    static boolean checkEmailId(String [] arrEmail, String email) {
        for (int index = 0; index < arrEmail.length; index++) {
            if(arrEmail[index].equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String [] arrEmail = {"abc@gmail.com", "cde@yahoo.com", "efg@outlook.com"};

        Scanner SC = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            System.out.print("Please enter a valid email to be checked: ");
            String email = SC.next();
            if(isValidEmail(email)){    // to check whether the email is valid email or not
                if(checkEmailId(arrEmail, email)) {     // to check whether the email is present in the array or not
                    System.out.println("Email Id found in this array.");
                }
                else {
                    System.out.println("Email Id not found.");
                }
                flag = false;
            }
            else {
                System.out.print("Invalid Email ID, ");
            }
        }
    }

}
