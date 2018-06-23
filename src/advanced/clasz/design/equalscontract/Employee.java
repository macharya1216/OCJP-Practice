package advanced.clasz.design.equalscontract;

/*
Class shows how Employee class has
completely ignored the Object's equals
method and used an overriden version.
Had the @Override annotation been on top
of the equals() method, the compilation
would have failed.
*/

public class Employee {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;


    public boolean equals(Employee e){
        return this.employeeId == e.employeeId;
    }

    public static void main(String[] args){
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if(one.equals(two)) System.out.println("Success");
        else System.out.println("Failure");
    }
}
