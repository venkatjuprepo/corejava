import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {
   /* public Employee(String n, double s, int year, int month, int day)
    {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }
    */

    private double salary;
    private Date hireDay;

    public Employee(String n, double salary, Date hireDay) {
        super(n);
        this.salary = salary;
        this.hireDay = hireDay;
    }


    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f", salary);
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }
}
