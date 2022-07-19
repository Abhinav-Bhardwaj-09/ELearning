package AssistedPractice.accessModifiers;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 15/07/22
 * Time: 22:15
 */


public class AccessModifiers {

    public void accessModifiers1 () {
        System.out.println("Method with 'Public' as Access Modifiers.");
    }

    void accessModifiers2 () {
        System.out.println("Method with 'Default' as access Modifiers.");
    }

    private void accessModifiers3 () {
        System.out.println("Method with 'Private' as Access Modifiers.");
    }

    protected void accessModifiers4 () {
        System.out.println("Method with 'Protected' as Access Modifiers.");
    }


    public static void main(String[] args) {
        AccessModifiers Obj = new AccessModifiers();
        Obj.accessModifiers1();
        Obj.accessModifiers2();
        Obj.accessModifiers3();
        Obj.accessModifiers4();
    }

}
