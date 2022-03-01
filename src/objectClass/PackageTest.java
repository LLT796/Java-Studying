package objectClass;

/**
 * This program demonstrates the use of packages
 * @version 1.11 2022-3-1
 * @author LLT
 */

public class PackageTest {
    public static void main(String[] args) {
        //because of the import statement,we don't have to use
        var harry=new Employee("Harry Hacker",50000,1989,10,1);

        harry.raiseSalary(5);

        //because of the static import statement, we don't have to use System.
    }
}
