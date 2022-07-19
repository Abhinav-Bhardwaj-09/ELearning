package AssistedPractice.regularExpression;

import java.util.Scanner;
import java.util.regex.*;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 19:55
 */


public class RegularExpression {

    static boolean isValidEmail (String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";    // regex for email
        Pattern pattern = Pattern.compile(regex);   // creating a pattern using the above regex
        return pattern.matcher(email).matches();    // matching the email with the generated pattern
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        String email = SC.next();
        if(isValidEmail(email)) {
            System.out.println(email + " is a valid email.");
        }
        else {
            System.out.println(email + " is not a valid email.");
        }
    }
}
