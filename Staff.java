
package Person;

public class Staff extends Employee{
    private String title;

    public Staff(String name,String title) {
        super(name);
        this.title = title;
    }
    public Staff(String name) {
        super(name);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+ "\ntitle =" + title;
    }
    
}
