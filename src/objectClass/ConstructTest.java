package objectClass;

import java.util.Random;

/**
 * This program demonstrates object construction.
 * @version 1.02 2022-3-1
 * @author LLT
 */
public class ConstructTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        var staff=new EmployeeC[3];

        staff[0]=new EmployeeC("Harry",40000);
        staff[1]=new EmployeeC(60000);
        staff[2]=new EmployeeC();

        //print out information about all Employee objects
        for(EmployeeC e:staff)
        {
            System.out.println("name="+e.getName()+"salary="+e.getSalary()+"id= "+e.getId());
        }

    }

    static class EmployeeC
    {
      private static int nextId;
      private int id;
      private String name=" ";//instance field initialization
      private double salary;

      //static initialization block
      static
      {
          var generator=new Random();
          //set nextId to a random number between 0 and 9990
          nextId=generator.nextInt(10000);
      }
      //object initialization block
      {
          id=nextId;
          nextId++;
      }

      //three overloaded constructor
        public EmployeeC(String n,double s)
        {
            name=n;
            salary=s;
        }

        public EmployeeC(double s)
        {
            //calls the Employee(String,name)constructor
            this("EmployeeC#"+nextId,s);
        }

        //the default constructor
        public EmployeeC()
        {
            //name initialized to " "--see above
            //salary not explicitly set--initialized to 0
            //id initialized in initialization block
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
    }
}
