package objectClass;

/**
 * This program demonstrates parameter passing in Java
 * @version 1.01 2022-3-1
 * @author LLT
 */

public class ParamTest {
    public static void main(String[] args)
    {
        /*
        *Test 1: Methods can't modify numeric parameters
         */
        System.out.println("Testing tripleValue:");
        double percent=10;
        System.out.println("Before: percent="+percent);
        tripleValue(percent);
        System.out.println("After: percent="+percent);

        /*
        *Testing 2: Method can change the state of object parameters
         */
        System.out.println("\nTesting tripleSalary: ");
        var harry=new EmployeeP("Harry",50000);
        System.out.println("Before: salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary="+harry.getSalary());

        /*
        *Testing 3:Method can't attach new objects to object parameters
         */
        System.out.println("\nTesting swap");
        var a=new EmployeeP("Alice",700000);
        var b=new EmployeeP("Bob",60000);
        System.out.println("Before: a="+a.getName());
        System.out.println("Before: b="+b.getName());
        swap(a,b);
        System.out.println("After: a="+a.getName());
        System.out.println("After: b="+b.getName());

    }
    public static void tripleValue(double x)//doesn't work
    {
        x=3*x;
        System.out.println("End of method: x="+x);
    }

    public static void tripleSalary(EmployeeP x)//works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary="+x.getSalary());
    }

    public static void swap(EmployeeP x,EmployeeP y)
    {
        EmployeeP temp=x;
        x=y;
        y=temp;
        System.out.println("End of method: x="+x.getName());
        System.out.println("End of method: y="+y.getName());
    }

    static class EmployeeP//simplified Employee class
    {
        private String name;
        private double salary;

        public EmployeeP(String n,double s)
        {
           this.name=n;
           this.salary=s;
        }

        public String getName()
        {
            return name;
        }

        public double getSalary()
        {
            return salary;
        }

        public void raiseSalary(double byPercent)
        {
            double raise=salary*byPercent/100;
            salary+=raise;
        }
    }
}
