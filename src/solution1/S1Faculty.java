package solution1;

public class S1Faculty extends DawsonStaff {
    
    // They can have custom methods
    public double salaryWithTeachingBonus(double bonusPercentage){
        return (this.getSalary() * bonusPercentage);
        // this.salary * bonusPercentage; Why it won't work?
    }

    // public S1Faculty() {
        // super("A", 1.0);
    // }

    public S1Faculty() {
        super();
        System.out.println("Faculty");
        
    }


    public S1Faculty(String name, double salary) {
        super(name, salary);
    }

    public double calculate_tax() {
        System.out.println("Faculty method");
        // return super.calculate_tax();
        return this.getSalary() * 0.05;
    }
    
}
