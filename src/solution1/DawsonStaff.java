package solution1;

import java.util.List;

public class DawsonStaff {
    private String name;
    private double salary;
    private List schedule;


    public double calculate_tax() {
        if (salary <= 45105.00) {
            return salary*0.15;
        } else {
            return salary*0.2;
        }
    }

    // Getters and Setters
    
    public String getName() {
        return name;
    }
    public List getSchedule() {
        return schedule;
    }
    public void setSchedule(List schedule) {
        this.schedule = schedule;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
