//ACCESS MODIFIERS
package datatypes;
public class AccessModifiers{
    public  String name;
    private double salary;
    protected int age;
    String department;

    public double getSalary(){
        return salary;
    }
}

class Example{
    public static void main(String[] args){
        AccessModifiers object= new AccessModifiers();
        object.name="John Doe"; //accessible
        object.getSalary();
        int number= 10;
        number= number +20;

        System.out.println(number>5);
    }
}