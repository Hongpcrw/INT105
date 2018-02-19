
package Person;

public class Employee extends Person {
    protected String office;
    protected String salary;
    
    public Employee(String name){
        super(name);
    }

    public Employee(String name,String office, String salary) {
        super(name);
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name ,String address , String phoneNumber , String emailAddress,String office, String salary) {
        super(name,address,phoneNumber,emailAddress);
        this.office = office;
        this.salary = salary;
    }
    
    
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\noffice =" + office + "\nsalary =" + salary;
    }
    
}
