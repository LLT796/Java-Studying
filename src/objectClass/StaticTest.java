package objectClass;

/**
 * This program demonstrates static methods
 * @version 1.02 2022-2-23
 * @author LLT
 */

public class StaticTest {
    public static void main(String[] args)
    {
        //fill the staff array with three Employee objects
        var staff=new Employee1[3];

        staff[0]=new Employee1("Tom",40000);
        staff[1]=new Employee1("Dick",60000);
        staff[2]=new Employee1("Harry",65000);

        //pick out information about all Employee objects
        for(Employee1 e:staff)
        {
            e.setId();
            System.out.println("name="+e.getName()+",Id="+e.getId()+",salary="+e.getSalary());
        }
        int n=Employee1.getNextId();//calls static method
        System.out.println("Next available id= "+n);
    }
}

class Employee1
{
    private static int nextId=1;
    private String name;
    private double salary;
    private int id;

    public Employee1(String n,double s)
    {
        name=n;
        salary=s;
        id=0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id=nextId;//set id to next available id
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;//return static field
    }

    public static void main(String[] args)
    {
        var e=new Employee1("Harry",50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
